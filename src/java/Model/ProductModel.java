package Model;

import MyUltis.DBConnection;
import ObjectInfo.Product;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NhanNT
 */
public class ProductModel {

    //declare variable
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSetImpl rs;
    ArrayList<Product> products;
    public static int NUMBER_LINE_PAGE = 5;
    public static int NUMBER_LINE_PAGE_CLIENT = 9;

    /**
     * create a constructor
     */
    public ProductModel() {
        con = DBConnection.getConnection();
        pst = null;
        rs = null;
        st = null;
        products = new ArrayList<>();
    }

    /**
     * load all of products from DB
     *
     * @return a array that store all products
     */
    public ArrayList<Product> loadProduct() {
        try {
            st = (Statement) con.createStatement();
            rs = (ResultSetImpl) st.executeQuery("SELECT * FROM `products` WHERE 1");
            while (rs.next()) {
                int idProduct = rs.getInt("idProduct");
                String discript = rs.getString("discript");
                long price = rs.getLong("price");
                double square = rs.getDouble("square");
                int status = rs.getInt("status");
                int idType = rs.getInt("idType");
                int idDistricts = rs.getInt("idDistricts");
                String position = rs.getString("position");
                String shape = rs.getString("shape");
                String direction = rs.getString("direction");
                String juridical = rs.getString("juridical");
                double rigthOfWay = rs.getDouble("rightOfWay");
                Date publicTime = rs.getDate("publicTime");

                products.add(new Product(idProduct, position, shape, direction,
                        juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    /**
     * get list product by id district
     *
     * @param idDistrict
     * @return list product
     * @throws SQLException
     */
    public ArrayList<Product> getProductByDistrict(int idDistrict) throws SQLException {
        String strSql = "SELECT a.*, b.nameDistrict, "
                + " c.nameType FROM products as a, districts as b, "
                + " types as c WHERE a.idDistricts = b.idDistricts "
                + " and a.idType = c.idType and a.idDistricts = " + idDistrict + " ORDER BY idProduct DESC";
        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        products = new ArrayList<>();
        while (rs.next()) {
            int idProduct = rs.getInt("idProduct");
            String discript = rs.getString("discript");
            long price = rs.getLong("price");
            double square = rs.getDouble("square");
            int status = rs.getInt("status");
            int idType = rs.getInt("idType");
            int idDistricts = rs.getInt("idDistricts");
            String position = rs.getString("position");
            String shape = rs.getString("shape");
            String direction = rs.getString("direction");
            String juridical = rs.getString("juridical");
            double rigthOfWay = rs.getDouble("rightOfWay");
            Date publicTime = rs.getDate("publicTime");
            String nameType = rs.getString("nameType");
            String nameDistrict = rs.getString("nameDistrict");

            products.add(new Product(idProduct, position, shape, direction,
                    juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime));
            products.get(products.size() - 1).setNameDistrict(nameDistrict);
            products.get(products.size() - 1).setNameType(nameType);
        }
        return products;
    }

    public ArrayList<Product> getPaging(int page, int priceFrom, int priceTo, int district, int areaFrom, int areaTo) throws SQLException {
        String strSql = "SELECT a.*, b.nameDistrict, "
                + " c.nameType FROM products as a, districts as b, "
                + " types as c WHERE a.idDistricts = b.idDistricts "
                + " and a.idType = c.idType AND a.status = 1 ";
        if (priceTo != 0) {
            strSql += " AND (a.price >= " + priceFrom + " and a.price <= " + priceTo + " ) ";
        }
        if (district != 0) {
            strSql += " AND a.idDistricts = " + district + " ";
        }
        if (areaTo != 0) {
            strSql += " AND (a.square >= " + areaFrom + " AND a.square <= " + areaTo + ") ";
        }

        strSql += " ORDER BY idProduct DESC ";
        int index = (page - 1) * NUMBER_LINE_PAGE_CLIENT;
        strSql += " LIMIT " + index + " , " + NUMBER_LINE_PAGE_CLIENT;

        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        products = new ArrayList<>();
        while (rs.next()) {
            int idProduct = rs.getInt("idProduct");
            String discript = rs.getString("discript");
            long price = rs.getLong("price");
            double square = rs.getDouble("square");
            int status = rs.getInt("status");
            int idType = rs.getInt("idType");
            int idDistricts = rs.getInt("idDistricts");
            String position = rs.getString("position");
            String shape = rs.getString("shape");
            String direction = rs.getString("direction");
            String juridical = rs.getString("juridical");
            double rigthOfWay = rs.getDouble("rightOfWay");
            Date publicTime = rs.getDate("publicTime");
            String nameType = rs.getString("nameType");
            String nameDistrict = rs.getString("nameDistrict");

            products.add(new Product(idProduct, position, shape, direction,
                    juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime));
            products.get(products.size() - 1).setNameDistrict(nameDistrict);
            products.get(products.size() - 1).setNameType(nameType);
        }
        System.out.println(strSql);
        return products;

    }

    /**
     * get All product is delete
     *
     * @param page
     * @param search
     * @param sortColumn
     
     * @return
     * @throws SQLException
     */
    public ArrayList<Product> getPagingHide(int page, String search, String sortColumn) throws SQLException {
        String strSql = "SELECT a.*, b.nameDistrict, "
                + " c.nameType FROM products as a, districts as b, "
                + " types as c WHERE a.idDistricts = b.idDistricts "
                + " and a.idType = c.idType AND a.status = 2 ";

//        int numberOfProduct = getNumberOfProduct();
//        int numberOfPage = (int) Math.ceil(numberOfProduct / NUMBER_LINE_PAGE);
        if (search != null) {
            strSql += " AND (a.discript LIKE '%" + search + "%' OR b.nameDistrict LIKE '%" + search + "%' "
                    + " OR c.nameType LIKE '%" + search + "%') ";
        }

        strSql += " ORDER BY idProduct ASC ";
        int index = (page - 1) * NUMBER_LINE_PAGE;
        strSql += " LIMIT " + index + " , " + NUMBER_LINE_PAGE;

        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        products = new ArrayList<>();
        while (rs.next()) {
            int idProduct = rs.getInt("idProduct");
            String discript = rs.getString("discript");
            long price = rs.getLong("price");
            double square = rs.getDouble("square");
            int status = rs.getInt("status");
            int idType = rs.getInt("idType");
            int idDistricts = rs.getInt("idDistricts");
            String position = rs.getString("position");
            String shape = rs.getString("shape");
            String direction = rs.getString("direction");
            String juridical = rs.getString("juridical");
            double rigthOfWay = rs.getDouble("rightOfWay");
            Date publicTime = rs.getDate("publicTime");
            String nameType = rs.getString("nameType");
            String nameDistrict = rs.getString("nameDistrict");

            products.add(new Product(idProduct, position, shape, direction,
                    juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime));
            products.get(products.size() - 1).setNameDistrict(nameDistrict);
            products.get(products.size() - 1).setNameType(nameType);

        }

        return products;
    }

    /**
     * get product and paging
     *
     * @param page
     * @param search
     * @param sortColumn
     * @return
     * @throws SQLException
     */
    public ArrayList<Product> getPaging(int page, String search, String sortColumn) throws SQLException {
        String strSql = "SELECT a.*, b.nameDistrict, "
                + " c.nameType FROM products as a, districts as b, "
                + " types as c WHERE a.idDistricts = b.idDistricts "
                + " and a.idType = c.idType AND a.status = 1 ";

//        int numberOfProduct = getNumberOfProduct();
//        int numberOfPage = (int) Math.ceil(numberOfProduct / NUMBER_LINE_PAGE);
        if (search != null) {
            strSql += " AND (a.discript LIKE '%" + search + "%' OR b.nameDistrict LIKE '%" + search + "%' "
                    + " OR c.nameType LIKE '%" + search + "%') ";
        }

        strSql += " ORDER BY idProduct ASC ";
        int index = (page - 1) * NUMBER_LINE_PAGE;
        strSql += " LIMIT " + index + " , " + NUMBER_LINE_PAGE;

        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        products = new ArrayList<>();
        while (rs.next()) {
            int idProduct = rs.getInt("idProduct");
            String discript = rs.getString("discript");
            long price = rs.getLong("price");
            double square = rs.getDouble("square");
            int status = rs.getInt("status");
            int idType = rs.getInt("idType");
            int idDistricts = rs.getInt("idDistricts");
            String position = rs.getString("position");
            String shape = rs.getString("shape");
            String direction = rs.getString("direction");
            String juridical = rs.getString("juridical");
            double rigthOfWay = rs.getDouble("rightOfWay");
            Date publicTime = rs.getDate("publicTime");
            String nameType = rs.getString("nameType");
            String nameDistrict = rs.getString("nameDistrict");

            products.add(new Product(idProduct, position, shape, direction,
                    juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime));
            products.get(products.size() - 1).setNameDistrict(nameDistrict);
            products.get(products.size() - 1).setNameType(nameType);

        }

        return products;
    }

//<ul class="pagination">
//  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
//  <li class="page-item"><a class="page-link" href="#">1</a></li>
//  <li class="page-item active"><a class="page-link" href="#">2</a></li>
//  <li class="page-item"><a class="page-link" href="#">3</a></li>
//  <li class="page-item"><a class="page-link" href="#">Next</a></li>
//</ul>     
    public String getPagingString(int currentPage, String search, String sortColumn) throws SQLException {
        String str = "<ul class=\"pagination\">";
        int numberOfProduct = getNumberOfProduct(currentPage, search, sortColumn);
        int numberOfPage = (int) Math.ceil(numberOfProduct / (float) NUMBER_LINE_PAGE);
        for (int i = 1; i <= numberOfPage; i++) {
            if (search.trim().equals("")) {
                if (currentPage == i) {
                    str += " <li class=\"page-item active\"><a class=\"page-link\" href=?page=" + i + ">" + i + "</a></li> ";
                } else {
                    str += "<li class=\"page-item\"><a class=\"page-link\" href=?page=" + i + ">" + i + "</a></li>";
                }
            } else {
                if (currentPage == i) {
                    str += " <li class=\"page-item active\"><a class=\"page-link\" href=?page=" + i + "&s=" + search + ">" + i + "</a></li> ";
                } else {
                    str += "<li class=\"page-item\"><a class=\"page-link\" href=?page=" + i + "&s=" + search + ">" + i + "</a></li>";
                }
            }
        }
        return str;
    }
    /**
     * get string paging hide
     * @param currentPage
     * @param search
     * @param sortColumn
     * @return
     * @throws SQLException 
     */
    public String getPagingStringHide(int currentPage, String search, String sortColumn) throws SQLException {
        String str = "<ul class=\"pagination\">";
        int numberOfProduct = getNumberOfProductHide(currentPage, search, sortColumn);
        int numberOfPage = (int) Math.ceil(numberOfProduct / (float) NUMBER_LINE_PAGE);
        for (int i = 1; i <= numberOfPage; i++) {
            if (search.trim().equals("")) {
                if (currentPage == i) {
                    str += " <li class=\"page-item active\"><a class=\"page-link\" href=?page=" + i + ">" + i + "</a></li> ";
                } else {
                    str += "<li class=\"page-item\"><a class=\"page-link\" href=?page=" + i + ">" + i + "</a></li>";
                }
            } else {
                if (currentPage == i) {
                    str += " <li class=\"page-item active\"><a class=\"page-link\" href=?page=" + i + "&s=" + search + ">" + i + "</a></li> ";
                } else {
                    str += "<li class=\"page-item\"><a class=\"page-link\" href=?page=" + i + "&s=" + search + ">" + i + "</a></li>";
                }
            }
        }
        return str;
    }
    /**
     * get paging for client
     *
     * @param page
     * @param priceFrom
     * @param priceTo
     * @param district
     * @param areaFrom
     * @param areaTo
     * @return
     * @throws SQLException
     */
    public String getPagingString(int page, int priceFrom, int priceTo, int district, int areaFrom, int areaTo) throws SQLException {
        String str = "<ul class=\"pagination\">";
        String strCon;
        int numberOfProduct = getNumberOfProduct(page, priceFrom, priceTo, district, areaFrom, areaTo);
        int numberOfPage = (int) Math.ceil(numberOfProduct / (float) NUMBER_LINE_PAGE_CLIENT);
        for (int i = 1; i <= numberOfPage; i++) {
            strCon = "page=";
            strCon += i;
            if (district != 0) {
                strCon += "&d=" + district;
            }
            if (priceFrom != 0 && priceTo != 0) {
                strCon += "&pf=" + priceFrom + "&pt=" + priceTo;
            }
            if (areaFrom != 0 && areaTo != 0) {
                strCon += "&af=" + areaFrom + "&at=" + areaTo;
            }
            if (page == i) {
                str += " <li class=\"page-item active\"><a class=\"page-link\""
                        + " href=?" + strCon + ">" + i + "</a></li> ";
            } else {
                str += "<li class=\"page-item\"><a class=\"page-link\""
                        + " href=?" + strCon + ">" + i + "</a></li>";
            }
        }
        str += "</ul>";
        return str;
    }

    public int getNumberOfProduct(int page, int priceFrom, int priceTo, int district, int areaFrom, int areaTo) throws SQLException {
        String strSql = "SELECT COUNT(*) AS 'NumberOfProduct' FROM "
                + " products as a, types as c, districts as b "
                + " WHERE a.idType = c.idType and a.idDistricts = b.idDistricts AND a.status = 1";
        if (priceTo != 0) {
            strSql += " AND (a.price >= " + priceFrom + " and a.price <= " + priceTo + " ) ";
        }
        if (district != 0) {
            strSql += " AND a.idDistricts = " + district + " ";
        }
        if (areaTo != 0) {
            strSql += " AND (a.square >= " + areaFrom + " AND a.square <= " + areaTo + ") ";
        }
        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        rs.next();
        int numberOfProduct = rs.getInt("NumberOfProduct");

        return numberOfProduct;
    }

    /**
     * get number of product
     *
     * @param page
     * @param search
     * @param sortColumn
     * @return
     * @throws SQLException
     */
    public int getNumberOfProduct(int page, String search, String sortColumn) throws SQLException {
        String strSql = "SELECT COUNT(*) AS 'NumberOfProduct' FROM "
                + " products as a, types as c, districts as b "
                + " WHERE a.idType = c.idType and a.idDistricts = b.idDistricts AND a.status = 1";

        if (search != null) {
            strSql += " AND (a.discript LIKE '%" + search + "%' OR b.nameDistrict LIKE '%" + search + "%' "
                    + " OR c.nameType LIKE '%" + search + "%') ";
        }

        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        rs.next();
        int numberOfProduct = rs.getInt("NumberOfProduct");

        return numberOfProduct;
    }
    
    public int getNumberOfProductHide(int page, String search, String sortColumn) throws SQLException {
        String strSql = "SELECT COUNT(*) AS 'NumberOfProduct' FROM "
                + " products as a, types as c, districts as b "
                + " WHERE a.idType = c.idType and a.idDistricts = b.idDistricts"
                + " AND a.status = 2 ";

        if (search != null) {
            strSql += " AND (a.discript LIKE '%" + search + "%' OR b.nameDistrict LIKE '%" + search + "%' "
                    + " OR c.nameType LIKE '%" + search + "%') ";
        }

        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);
        rs.next();
        int numberOfProduct = rs.getInt("NumberOfProduct");

        return numberOfProduct;
    }

    /**
     * add new products to DB
     *
     * @param descript
     * @param price
     * @param square
     * @param status
     * @param idType
     * @param idDistrict
     * @param position
     * @param shape
     * @param direction
     * @param juridical
     * @param rightOfWay
     * @param publicTime
     * @return
     * @throws SQLException
     */
    public int addProduct(String descript, long price, double square, int status, int idType, int idDistrict,
            String position, String shape, String direction, String juridical, double rightOfWay, Date publicTime) throws SQLException {
        int idProduct = 0;

        String sql = "INSERT INTO `products`(`discript`, `price`, `square`, `status`,"
                + " `idType`, `idDistricts`, `position`, `shape`, "
                + "`direction`, `juridical`, `rightOfWay`, `publicTime`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        pst = (PreparedStatement) con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setString(1, descript);
        pst.setLong(2, price);
        pst.setDouble(3, square);
        pst.setInt(4, status);
        pst.setInt(5, idType);
        pst.setInt(6, idDistrict);
        pst.setString(7, position);
        pst.setString(8, shape);
        pst.setString(9, direction);
        pst.setString(10, juridical);
        pst.setDouble(11, rightOfWay);
        pst.setDate(12, publicTime);

        pst.executeUpdate();
        rs = (ResultSetImpl) pst.getGeneratedKeys();
        rs.next();
        return idProduct = rs.getInt(1);
    }

    /**
     * update a products in DB
     *
     * @param idProduct
     * @param descript
     * @param price
     * @param square
     * @param status
     * @param idType
     * @param idDistrict
     * @param position
     * @param shape
     * @param direction
     * @param juridical
     * @param rightOfWay
     * @param publicTime
     */
    public void updateProduct(int idProduct, String descript, long price, double square, int status, int idType, int idDistrict,
            String position, String shape, String direction, String juridical, double rightOfWay, Date publicTime) {
        try {
            String sql = "UPDATE `products` SET `discript`=?,`price`=?,`square`=?,`status`=?,`idType`=?,"
                    + "`idDistricts`=?,`position`=?,`shape`=?,`direction`=?,`juridical`=?,"
                    + "`rightOfWay`=?,`publicTime`=? WHERE `idProduct`=?";
            pst = (PreparedStatement) con.prepareStatement(sql);

            pst.setString(1, descript);
            pst.setLong(2, price);
            pst.setDouble(3, square);
            pst.setInt(4, status);
            pst.setInt(5, idType);
            pst.setInt(6, idDistrict);
            pst.setString(7, position);
            pst.setString(8, shape);
            pst.setString(9, direction);
            pst.setString(10, juridical);
            pst.setDouble(11, rightOfWay);
            pst.setDate(12, publicTime);
            pst.setInt(13, idProduct);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * delete a products in DB, just hide
     *
     * @param idProduct
     */
    public void softDelete(int idProduct) {
        try {
            String sql = "UPDATE `products` SET `status`= 2 WHERE idProduct = ?";
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setInt(1, idProduct);

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * get a product by id
     *
     * @param idProduct
     * @return Product
     * @throws java.sql.SQLException
     */
    public Product getProduct(int idProduct) throws SQLException {
        String strSql = "SELECT a.*, b.nameDistrict, "
                + " c.nameType FROM products as a, districts as b, "
                + " types as c WHERE a.idDistricts = b.idDistricts "
                + " and a.idType = c.idType AND a.idProduct = " + idProduct;
        st = (Statement) con.createStatement();
        rs = (ResultSetImpl) st.executeQuery(strSql);

        rs.next();
//        int idProduct = rs.getInt("idProduct");
        String discript = rs.getString("discript");
        long price = rs.getLong("price");
        double square = rs.getDouble("square");
        int status = rs.getInt("status");
        int idType = rs.getInt("idType");
        int idDistricts = rs.getInt("idDistricts");
        String position = rs.getString("position");
        String shape = rs.getString("shape");
        String direction = rs.getString("direction");
        String juridical = rs.getString("juridical");
        double rigthOfWay = rs.getDouble("rightOfWay");
        Date publicTime = rs.getDate("publicTime");
        String nameType = rs.getString("nameType");
        String nameDistrict = rs.getString("nameDistrict");

        Product p = new Product(idProduct, position, shape, direction,
                juridical, rigthOfWay, discript, price, square, status, idType, idDistricts, publicTime);
        p.setNameDistrict(nameDistrict);
        p.setNameType(nameType);

        return p;
    }

    public void sold(int idP) throws SQLException{
        String strSql = "UPDATE `products` SET `status`= 2 WHERE idProduct = " + idP;
        pst = (PreparedStatement) con.prepareStatement(strSql);
        pst.executeUpdate();
    }
    public static void main(String[] args) throws SQLException {
        ProductModel pm = new ProductModel();
        ArrayList<Product> p = pm.getPaging(1, 0, 0, 0, 5, 7);
        for (Product p1 : p) {
            System.out.println(p1.getDescript() + " " + p1.getNameDistrict());
        }

        String str = pm.getPagingString(1, 0, 0, 0, 0, 0);
        System.out.println(str);
        pm.sold(1);

    }

}

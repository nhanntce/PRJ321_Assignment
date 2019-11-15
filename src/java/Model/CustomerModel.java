package Model;

import MyUltis.DBConnection;
import MyUltis.GenerateData;
import ObjectInfo.Customer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CustomerModel {

    public static int SoDong_Trang = 10;
    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    ArrayList<Customer> list;

    public CustomerModel(Connection con) {
        this.con = con;
    }

    public CustomerModel() {
        con = DBConnection.getConnection();
    }

    /**
     * load paging function
     *
     * @param page
     * @param search
     * @return
     */
    public ArrayList<Customer> getPagingCustomer(int page, String search) {
        try {
            String sqlStr = "";
            sqlStr += " SELECT *";
            sqlStr += " FROM `customers` as a ";
            sqlStr += " WHERE a.status = 1 ";

            if (!"".equals(search)) {
                //search by name and mail
                sqlStr += " AND (a.nameCustomer like '%" + search + "%' OR a.mail like '%" + search + "%') ";
            }

            //paging
            int tongSoCus = getNumberOfProduct(page, search);
            int tongSoTrang = (int) Math.ceil(tongSoCus / (float) SoDong_Trang);
            int index = (page - 1) * SoDong_Trang;

            sqlStr += " LIMIT " + index + ", " + SoDong_Trang;

            //load in list
            this.st = this.con.createStatement();
            this.rs = this.st.executeQuery(sqlStr);
            list = new ArrayList<Customer>();
            while (rs.next()) {
                int idCus = rs.getInt("idCustomer");
                String nameCustomer = rs.getString("nameCustomer");
                String mailCustomer = rs.getString("mail");
                String phoneCustomer = rs.getString("phoneNumber");
                Date birthdayCus = rs.getDate("birthday");
                int genderCus = rs.getInt("gender");
                int statusCus = rs.getInt("status");

                list.add(new Customer(idCus, nameCustomer, mailCustomer, phoneCustomer, birthdayCus, genderCus, statusCus));

            }

            return this.list;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Customer> getPagingCustomerTrash(int page, String search) {
        try {
            String sqlStr = "";
            sqlStr += " SELECT *";
            sqlStr += " FROM `customers` as a ";
            sqlStr += " WHERE a.status = 2 ";

            if (!"".equals(search)) {
                //search by name and mail
                sqlStr += " AND (a.nameCustomer like '%" + search + "%' OR a.mail like '%" + search + "%') ";
            }

            //paging
            int tongSoCusTrash = getNumberOfProductTrash(page, search);
            int tongSoTrang = (int) Math.ceil(tongSoCusTrash / (float) SoDong_Trang);
            int index = (page - 1) * SoDong_Trang;

            sqlStr += " LIMIT " + index + ", " + SoDong_Trang;

            //load in list
            this.st = this.con.createStatement();
            this.rs = this.st.executeQuery(sqlStr);
            list = new ArrayList<Customer>();
            while (rs.next()) {
                int idCus = rs.getInt("idCustomer");
                String nameCustomer = rs.getString("nameCustomer");
                String mailCustomer = rs.getString("mail");
                String phoneCustomer = rs.getString("phoneNumber");
                Date birthdayCus = rs.getDate("birthday");
                int genderCus = rs.getInt("gender");
                int statusCus = rs.getInt("status");

                list.add(new Customer(idCus, nameCustomer, mailCustomer, phoneCustomer, birthdayCus, genderCus, statusCus));

            }

            return this.list;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getNumberOfProduct(int page, String search) throws SQLException {
        String sqlStr = "";
        sqlStr += " SELECT count(*) as soLuong ";
        sqlStr += " FROM `customers` as a ";
        sqlStr += " WHERE a.status = 1 ";

        if (!"".equals(search)) {
            //thuc hien tim kiem
            sqlStr += " AND (a.nameCustomer like '%" + search + "%' OR a.mail like '%" + search + "%') ";
        }

        this.st = this.con.createStatement();
        this.rs = this.st.executeQuery(sqlStr);
        rs.next();
        return rs.getInt("soLuong");
    }

    public int getNumberOfProductTrash(int page, String search) throws SQLException {
        String sqlStr = "";
        sqlStr += " SELECT count(*) as soLuong ";
        sqlStr += " FROM `customers` as a ";
        sqlStr += " WHERE a.status = 2 ";

        if (!"".equals(search)) {
            //thuc hien tim kiem
            sqlStr += " AND (a.nameCustomer like '%" + search + "%' OR a.mail like '%" + search + "%') ";
        }

        this.st = this.con.createStatement();
        this.rs = this.st.executeQuery(sqlStr);
        rs.next();
        return rs.getInt("soLuong");
    }

    public String getPagingString(int currentPage, String search) {
        String strPaging = "<ul class='pagination'>";
        try {
            int tongSoCus = getNumberOfProduct(currentPage, search);
            int tongSoTrang = (int) Math.ceil(tongSoCus / (float) SoDong_Trang);
            for (int stt_trang = 1; stt_trang <= tongSoTrang; stt_trang++) {
                if ("".equals(search)) {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?trang=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?trang=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    }
                } else {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?trang=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?trang=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    }
                }
            }
            strPaging += "</ul>";

        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strPaging;
    }

    public String getPagingStringTrash(int currentPage, String search) {
        String strPaging = "<ul class='pagination'>";
        try {
            int tongSoCus = getNumberOfProductTrash(currentPage, search);
            int tongSoTrang = (int) Math.ceil(tongSoCus / (float) SoDong_Trang);
            for (int stt_trang = 1; stt_trang <= tongSoTrang; stt_trang++) {
                if ("".equals(search)) {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?trang=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?trang=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    }
                } else {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?trang=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?trang=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    }
                }
            }
            strPaging += "</ul>";

        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strPaging;
    }

    public int insert(String nameCustomer, String gmai, String phoneCustomer, Date birthdayCustomer, int genderCustomer) throws SQLException {
        String sql = "INSERT INTO `customers`(`nameCustomer`, `mail`, `phoneNumber`, `birthday`, "
                + " `gender`, `status`) VALUES (?,?,?,?,?,?)";

        pst = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        pst.setString(1, nameCustomer);
        pst.setString(2, gmai);
        pst.setString(3, phoneCustomer);
        pst.setDate(4, birthdayCustomer);
        pst.setInt(5, genderCustomer);
        pst.setInt(6, 1);
        pst.executeUpdate();

        rs = pst.getGeneratedKeys();
        rs.next();
        return rs.getInt(1);
    }

    public void update(int idCustomer, String nameCustomer, String mail,
            String phoneCustomer, Date birthdayCustomer, int genderCustomer, int statusCustomer) throws SQLException {
        String sql = "UPDATE `customers` SET `nameCustomer`=?,`mail`=?,`phoneNumber`=?,"
                + "`birthday`=?,`gender`=?,`status`=? WHERE `idCustomer` = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, nameCustomer);
        pst.setString(2, mail);
        pst.setString(3, phoneCustomer);
        pst.setDate(4, birthdayCustomer);
        pst.setInt(5, genderCustomer);
        pst.setInt(6, statusCustomer);
        pst.setInt(7, idCustomer);

        pst.executeUpdate();
    }

    public void delete1(int id) throws SQLException {
        String sqlStr = "UPDATE `customers` SET `status`=2 WHERE `idCustomer`=?";
        pst = con.prepareStatement(sqlStr);
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public void returnCus(int id) throws SQLException {
        String sqlStr = "UPDATE `customers` SET `status`=1 WHERE `idCustomer`=?";
        pst = con.prepareStatement(sqlStr);
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public void deleteforever(int id) throws SQLException {
        String sqlStr = "";
        sqlStr = "DELETE FROM `customers` WHERE `idCustomer`=?";
        pst = con.prepareStatement(sqlStr);
        pst.setInt(1, id);
        pst.executeUpdate();
    }

    public void returnAllCus() throws SQLException {
        String sqlStr = "UPDATE `customers` SET `status`=1 WHERE `status`=2";
        pst = con.prepareStatement(sqlStr);
        pst.executeUpdate();
    }

    public void deleteforeverAll() throws SQLException {
        String sqlStr = "";
        sqlStr = "DELETE FROM `customers` WHERE `status`= 2";
        pst = con.prepareStatement(sqlStr);
        pst.executeUpdate();
    }

    public int getLastPage(int p, String s) throws SQLException {
        int tongSoCus = getNumberOfProduct(p, s);
        int tongSoTrang = (int) Math.ceil(tongSoCus / (float) SoDong_Trang);
        return tongSoTrang;
    }

    public Customer getCustomerbyId(int id) throws SQLException {
        String sqlStr = "";
        sqlStr = "SELECT `idCustomer`, `nameCustomer`, `mail`, `phoneNumber`, `birthday`, `gender`, `status` FROM `customers` WHERE `idCustomer` =" + id;
        this.st = this.con.createStatement();
        this.rs = this.st.executeQuery(sqlStr);
        rs.next();
        int idCus = rs.getInt("idCustomer");
        String nameCustomer = rs.getString("nameCustomer");
        String mailCustomer = rs.getString("mail");
        String phoneCustomer = rs.getString("phoneNumber");
        Date birthdayCus = rs.getDate("birthday");
        int genderCus = rs.getInt("gender");
        Customer cus = new Customer(idCus, nameCustomer, mailCustomer, phoneCustomer, birthdayCus, genderCus, 1);
        return cus;
    }

    public Customer getCustomerByPhone(String phone) throws SQLException {
        String sqlStr = "SELECT * FROM `customers` WHERE phoneNumber = " + phone;
        this.st = this.con.createStatement();
        this.rs = this.st.executeQuery(sqlStr);
        Customer cus = null;
        if (rs.next()) {
            int idCus = rs.getInt("idCustomer");
            String nameCustomer = rs.getString("nameCustomer");
            String mailCustomer = rs.getString("mail");
            String phoneCustomer = rs.getString("phoneNumber");
            Date birthdayCus = rs.getDate("birthday");
            int genderCus = rs.getInt("gender");
            cus = new Customer(idCus, nameCustomer, mailCustomer, phoneCustomer, birthdayCus, genderCus, 1);
        }
        return cus;
    }

    public static void main(String[] args) throws SQLException, ParseException {
        CustomerModel cm = new CustomerModel();
        GenerateData gd = new GenerateData();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(cm.getCustomerByPhone("0329938049").getMail());
//        ArrayList<Customer> c = cm.getAllCustomer();
//        System.out.println(cm.getCustomerByPhone(phone));
//        for(int i = 0; i < 30; i++){
//            String ten = gd.getNameMale();
//            String mail = gd.getMail(ten).toLowerCase();
//            String phone = gd.getPhone();
//            Date date = gd.getDate();
//            System.out.println();
//            System.out.println(mail + "" + ten);
//            System.out.println(date);
//            cm.insert(ten, mail, phone, date, 1);
//            
//        }
    }
}

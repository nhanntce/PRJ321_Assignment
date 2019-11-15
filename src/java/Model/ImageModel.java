package Model;

import MyUltis.DBConnection;
import ObjectInfo.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NhanNT
 */
public class ImageModel {

    //declare variable
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    ArrayList<Image> image;
    public static int NUMBER_OF_IMAGE = 10;

    /**
     * create a constructor
     */
    public ImageModel() {
        con = DBConnection.getConnection();
        pst = null;
        rs = null;
        st = null;
        image = new ArrayList<>();
    }

    /**
     * load all of image's path for DB input: null output: a array that store
     * image object
     *
     * @return
     */
    public ArrayList<Image> loadImage() {
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `image` WHERE 1");

            while (rs.next()) {
                image.add(new Image(rs.getInt("idImage"), rs.getString("image"), rs.getInt("idProduct")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImageModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return image;
    }

    public ArrayList<Image> getPaging(int page, String search) throws SQLException {
        image = new ArrayList<>();
        String strSql = "SELECT * FROM `image` ";
        if (!search.trim().equals("")) {
            strSql += " idProduct LIKE '%" + search + "%' ";
        }

        strSql += " ORDER BY idProduct ASC";

        int index = (page - 1) * NUMBER_OF_IMAGE;
        strSql += " LIMIT " + index + ", " + NUMBER_OF_IMAGE;

        st = con.createStatement();
        rs = st.executeQuery(strSql);

        while (rs.next()) {
            image.add(new Image(rs.getInt("idImage"), rs.getString("image"), rs.getInt("idProduct")));
        }

        return image;
    }

    public int getNumberOfImage(int page, String search) throws SQLException {
        String strSql = "SELECT count(*) AS number FROM `image` ";
        if (!search.trim().equals("")) {
            strSql += " WHERE idProduct LIKE '%" + search + "%' ";
        }

        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        int number = rs.getInt("number");

        return number;
    }

    /**
     * add new image to DB input:
     *
     * @param image is path of image
     * @param idProduct is id product (foreign key) output: null
     *
     */
    public void addImage(String image, int idProduct) {
        try {
            String sql = "INSERT INTO `image`(`image`, `idProduct`) VALUES (?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, image);
            pst.setInt(2, idProduct);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * update image in DB input
     *
     * @param idImage is id of image(primary key)
     * @param image is path of image
     * @param idProduct is id of product (foreign key) output: null
     */
    public void updateImage(int idImage, String image, int idProduct) {
        try {
            String sql = "UPDATE `image` SET `image`=?,"
                    + "`idProduct`=? WHERE `idImage` = ? AND `idProduct` = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, image);
            pst.setInt(2, idProduct);
            pst.setInt(3, idImage);
            pst.setInt(4, idProduct);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * delete image from DB input
     *
     * @param idImage is id of image(primary key) output: null
     */
    public void deleteImage(int idImage) {
        try {
            String sql = "DELETE FROM `image` WHERE `idImage` = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idImage);

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ImageModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * get a image by image id
     * @param idImage
     * @return 
     */
    public Image getImageById(int idImage){
        try {
            String strSql = "SELECT * FROM `image` WHERE idImage = " + idImage;
            st = con.createStatement();
            rs = st.executeQuery(strSql);
            rs.next();
            
            return new Image(rs.getInt("idImage"), rs.getString("image"), rs.getInt("idProduct"));
        } catch (SQLException ex) {
            Logger.getLogger(ImageModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param idProduct
     * @return
     */
    public ArrayList<Image> getImageByIdProduct(int idProduct) throws SQLException {
        image = new ArrayList<>();
        String strSql = "SELECT * FROM `image` WHERE idProduct = " + idProduct;
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        while (rs.next()) {
            image.add(new Image(rs.getInt("idImage"), rs.getString("image"), rs.getInt("idProduct")));
        }
        return image;
    }

    public static void main(String[] args) throws SQLException {
        ImageModel im = new ImageModel();
//        ArrayList<Image> img = im.getPaging(1, "");
//        for (int i = 0; i < img.size(); i++) {
//            System.out.println(img.get(i).getImage());
//        }
        
//        System.out.println(im.getImage(1).getImage());
    }
}

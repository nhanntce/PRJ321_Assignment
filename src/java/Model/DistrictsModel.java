package Model;

import MyUltis.DBConnection;
import ObjectInfo.District;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DistrictsModel {
    //Stores name of table "Districts"
    private String tableDistricts = "districts";
    
    //Stores list of Districts
    private ArrayList<District> Districts;

    //Stores connection
    private Connection conn;
    
    //Stores statement object
    private Statement st;
    
    //Stores prepared statment
    private PreparedStatement pst;
    
    //Stores result set object
    private ResultSet rs;
    
    //Stores sql statment
    private String sqlStr;
    
    /*
        Constructor for DistrictsModel
    */
    public DistrictsModel() throws SQLException {
        try {
            conn = DBConnection.getConnection();
            st = conn.createStatement();
            pst = null;
            rs = null;
            sqlStr = "";
            Districts = new ArrayList<>();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
    /*
        Function to load all districst in database to an arrayList
        Input: N/A
        Output: Load all districts to arrayList
        SQLException, Exception
    */
    public ArrayList<District> loadDistricts() throws SQLException{
        try {
            sqlStr = "SELECT * FROM " + tableDistricts;
            rs = st.executeQuery(sqlStr);
            if (rs.isBeforeFirst()) {
                Districts.clear();
            }
            while (rs.next()) {
                int IdDistricts = rs.getInt("idDistricts");
                String nameDistrict = rs.getString("nameDistrict");
                int status = rs.getInt("status");
                if(status == 1 ) {
                    Districts.add(new District(IdDistricts, nameDistrict, status));
                }
            }
        } catch (SQLException e) {
            throw e;
        } 
        return Districts;
    }
    /*
        Function to get districts with given districts name
        Input: name (String)
        Output: return an districts compatible with given name if found, return null if not found
    */
    public District searchDistricts(String nameDistrict){
        for(District districts : Districts){
            if(districts.getNameDistrict().equals(nameDistrict) && districts.getStatus()==1){
                return districts;
            }
        }
        return null;
    }
    
    /*
        Function to add new districts to database
        Input: a districts to add (String) and an id of districts
        Output: Status customer is added successful or not
    */
    public boolean adddistricts(String Name) throws SQLException {
        try {
            sqlStr = "INSERT INTO `Districts` VALUES (?, 1)";
            pst = conn.prepareStatement(sqlStr);
            pst.setString(1, Name);
            pst.executeUpdate();
//            Districts.add(new District(IdDistricts, Name,1));
            return true;
        } catch (SQLException e) {
            throw e;
        } finally {
            return false;
        }
    }
    
     /*
        Function to edit a districts exist in database 
        Input: a districts to look up in database, an id of districts
        Output: Status districts is updated successful or not
    */
    public boolean updateDistricts(int Id, String Name) throws SQLException {
        sqlStr = "UPDATE `Districts` SET `nameDistrict`=?, `status`=1 WHERE `idDistricts`=?";
        try {
            pst = conn.prepareStatement(sqlStr);
            pst.setString(1, Name);
            pst.setInt(2, Id);
            pst.executeUpdate();
            for (int i = 0; i < Districts.size(); i++) {
                if (Districts.get(i).getIdDistrict()==Id) {
                    Districts.set(i, new District(Id, Name,1));
                    break;
                }
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    /*
        Function to change status to 2 of a districts exist in database 
        Input: an id of districts
        Output: Status districts is delete successful or not
    */
    public boolean deleteDistricts(int id) throws SQLException {
        sqlStr = "UPDATE `districts` SET `status`=2 WHERE `idDistricts`=?";
        try {
            pst = conn.prepareStatement(sqlStr);
            pst.setInt(1, id);
            pst.executeUpdate();
            for (int i = 0; i < Districts.size(); i++) {
                if (Districts.get(i).getIdDistrict()==id) {
                    Districts.set(i, new District(id, Districts.get(i).getNameDistrict(),2));
                    break;
                }
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static void main(String[] args) throws SQLException {

            DistrictsModel dm = new DistrictsModel();
            ArrayList<District> arr = new ArrayList<>();
            arr = dm.loadDistricts();
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i).getNameDistrict());
        }
            
            
        
    }
    
}

package Model;

import MyUltis.DBConnection;
import ObjectInfo.Typee;
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
public class TypesModel {
    //Stores name of table "Types"
    private String tableTypes = "Types";
    
    //Stores list of accounts
    private ArrayList<Typee> Types;

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
        Constructor for TypesModel
    */
    public TypesModel() throws SQLException {
        try {
            conn = DBConnection.getConnection();
            st = conn.createStatement();
            pst = null;
            rs = null;
            sqlStr = "";
            Types = new ArrayList<>();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }
    /*
        Function to load all type in database to an arrayList
        Input: N/A
        Output: Load all type to arrayList
        SQLException, Exception
    */
    public ArrayList<Typee> loadTypes() throws SQLException {
        try {
            sqlStr = "SELECT * FROM " + tableTypes;
            rs = st.executeQuery(sqlStr);
            if (rs.isBeforeFirst()) {
                Types.clear();
            }
            while (rs.next()) {
                int IdTypes = rs.getInt("idType");
                String nameType = rs.getString("nameType");
                int status = rs.getInt("status");
                if(status == 1 ) {
                    Types.add(new Typee(IdTypes, nameType, status));
                }
            }
        } catch (SQLException e) {
            throw e;
        } 
        return Types;
    }
    /*
        Function to get types with given type name
        Input: name (String)
        Output: return an type compatible with given name if found, return null if not found
    */
    public Typee searchTypes(String nameType){
        for(Typee Type:Types){
            if(Type.getNameType().equals(nameType) && Type.getStatus()==1){
                return Type;
            }
        }
        return null;
    }
    
    /*
        Function to add new Typee to database
        Input: a type to add (String) and an id of type
        Output: Status customer is added successful or not
    */
    public boolean addTypes(int IdType, String Name) throws SQLException {
        try {
            sqlStr = "INSERT INTO `Types` VALUES (?, ?, 1)";
            pst = conn.prepareStatement(sqlStr);
            pst.setInt(1, IdType);
            pst.setString(2, Name);
            pst.executeUpdate();
            Types.add(new Typee(IdType, Name,1));
            return true;
        } catch (SQLException e) {
            throw e;
        } finally {
            return false;
        }
    }
    
     /*
        Function to edit a type exist in database 
        Input: a type to look up in database, an id of type
        Output: Status types is updated successful or not
    */
    public boolean updateTypes(int Id, String Name) throws SQLException {
        sqlStr = "UPDATE `Types` SET `nameType`=? WHERE `idType`=?";
        try {
            pst = conn.prepareStatement(sqlStr);
            pst.setString(1, Name);
            pst.setInt(2, Id);
            pst.executeUpdate();
            for (int i = 0; i < Types.size(); i++) {
                if (Types.get(i).getIdType()==Id) {
                    Types.set(i, new Typee(Id, Name,1));
                    break;
                }
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    /*
        Function to change status to 2 of a types exist in database 
        Input: an id of type
        Output: Status type is delete successful or not
    */
    public boolean deleteTypes(int id) throws SQLException {
        sqlStr = "UPDATE `Types` SET `status`=2 WHERE `idType`=?";
        try {
            pst = conn.prepareStatement(sqlStr);
            pst.setInt(1, id);
            pst.executeUpdate();
            for (int i = 0; i < Types.size(); i++) {
                if (Types.get(i).getIdType()==id) {
                    Types.set(i, new Typee(id, Types.get(i).getNameType(),2));
                    break;
                }
            }
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static void main(String[] args) throws SQLException {
        TypesModel tm = new TypesModel();
        ArrayList<Typee> t = new ArrayList<>();
        t = tm.loadTypes();
        
        for(int i = 0; i < t.size(); i++)
            System.out.println(t.get(i).getNameType());
    }
}

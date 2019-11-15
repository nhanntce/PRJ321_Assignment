/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import MyUltis.DBConnection;
import ObjectInfo.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RoleModel {
    ArrayList<Role> role;
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public RoleModel() {
        con = DBConnection.getConnection();
    }
    
    public ArrayList<Role> getRole() throws SQLException{
        role = new ArrayList<>();
        st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM `role` WHERE 1");
    
        while(rs.next()){
            int idRole = rs.getInt("idRole");
            String roleName = rs.getString("roleName");
            int status = rs.getInt("status");
            
            role.add(new Role(idRole, roleName, status));
        }
        
        return role;
    }

}

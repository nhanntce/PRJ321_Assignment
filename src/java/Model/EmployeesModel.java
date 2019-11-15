/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import MyUltis.DBConnection;
import MyUltis.Tool;
import ObjectInfo.Employees;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployeesModel {

    public static int SoDong_Trang = 10;
    ArrayList<Employees> list;
    Connection con;
    ResultSet rs;
    Statement st;
    PreparedStatement pst;

    public EmployeesModel() {
        this.con = DBConnection.getConnection();
    }

    public ArrayList<Employees> getPaging(int page, String search, String sortColumn) {
        try {
            String sqlStr = "";
            sqlStr += " SELECT a.* , b.roleName ";
            sqlStr += " FROM `employees` as a, `role` as b ";
            sqlStr += " WHERE a.idRole = b.idRole ";

            if (search != "") {
                sqlStr += " AND (a.nameEmployee LIKE '%" + search + "%' OR b.roleName LIKE '%" + search + "%')";
            }

            if (sortColumn != "") {
                //thuc hien sap xep
            }

            //phan trang
            int totalList = getNumberOfEmployee(page, search, sortColumn);
            int totalPage = (int) Math.ceil((float) totalList / SoDong_Trang);
            int index = (page - 1) * SoDong_Trang;

            sqlStr += " LIMIT " + index + ", " + SoDong_Trang;

            this.st = this.con.createStatement();
            this.rs = this.st.executeQuery(sqlStr);
            list = new ArrayList<Employees>();
            while (rs.next()) {
                int idEmployees = rs.getInt("idEmployee");
                String nameEmployees = rs.getString("nameEmployee");
                int genderEmployees = rs.getInt("gender");
                String addressEmployees = rs.getString("address");
                String mailEmployees = rs.getString("mail");
                String phoneEmployees = rs.getString("phone");
                Date birthdayEmployees = rs.getDate("birthday");
                String accountEmployees = rs.getString("account");
                String passworkEmployees = rs.getString("password");
                int statusEmployees = rs.getInt("status");
                int idRole = rs.getInt("idRole");
                String roleName = rs.getString("roleName");

                list.add(new Employees(idEmployees, nameEmployees, genderEmployees,
                        addressEmployees, mailEmployees, phoneEmployees, birthdayEmployees,
                        accountEmployees, passworkEmployees, statusEmployees, idRole, roleName));
                list.get(list.size() - 1).setRoleName(roleName);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeesModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.list;
    }

    public int getNumberOfEmployee(int page, String search, String sortColumn) throws SQLException {
        String sqlStr = "";
        sqlStr += " SELECT count(*) as soLuong ";
        sqlStr += " FROM `employees` as a, `role` as b ";
        sqlStr += " WHERE a.idRole = b.idRole ";
        if (search != "") {
            sqlStr += " AND (a.nameEmployee LIKE '%" + search + "%' OR b.roleName LIKE '%" + search + "%')";
        }

        this.st = this.con.createStatement();
        this.rs = this.st.executeQuery(sqlStr);
        rs.next();
        return rs.getInt("soLuong");
    }
    public int totalpage (int currentPage, String search, String sortColumn) throws SQLException {
            int totalList = getNumberOfEmployee(currentPage, search, sortColumn);
            int totalPage = (int) Math.ceil((float) totalList / SoDong_Trang);
            return totalPage;
    }
    public String getPagingString(int currentPage, String search, String sortColumn) {
        String strPaging = "<ul class='pagination'>";
        try {
            int totalList = getNumberOfEmployee(currentPage, search, sortColumn);
            int totalPage = (int) Math.ceil((float) totalList / SoDong_Trang);
            for (int stt_trang = 1; stt_trang <= totalPage; stt_trang++) {
                if (search == "") {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?page=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?page=" + stt_trang + "'>" + stt_trang + "</a></li>";
                    }
                } else {
                    if (stt_trang == currentPage) {
                        strPaging += "<li class='active'><a href='?page=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    } else {
                        strPaging += "<li><a href='?page=" + stt_trang + "&s=" + search + "'>" + stt_trang + "</a></li>";
                    }
                }

            }
            strPaging += "</ul>";
        } catch (SQLException ex) {
            Logger.getLogger(EmployeesModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strPaging;
    }

    public void softDelete(int idEmployee) throws SQLException {
        String strSql = "UPDATE `employees` SET `status`= 2 WHERE `idEmployee` = ?";
        pst = con.prepareStatement(strSql);
        pst.setInt(1, idEmployee);

        pst.executeUpdate();

    }

    public Employees getEmployees(int id) throws SQLException {
        String strSql = "SELECT a.*, b.roleName FROM `employees` as a, role as b "
                + " WHERE `idEmployee` = " + id + " AND a.idRole = b.idRole";
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        int idEmployees = rs.getInt("idEmployee");
        String nameEmployees = rs.getString("nameEmployee");
        int genderEmployees = rs.getInt("gender");
        String addressEmployees = rs.getString("address");
        String mailEmployees = rs.getString("mail");
        String phoneEmployees = rs.getString("phone");
        Date birthdayEmployees = rs.getDate("birthday");
        String accountEmployees = rs.getString("account");
        String passworkEmployees = rs.getString("password");
        int statusEmployees = rs.getInt("status");
        int idRole = rs.getInt("idRole");
        String roleName = rs.getString("roleName");
        Employees ele = new Employees(idEmployees, nameEmployees, genderEmployees, addressEmployees, mailEmployees, phoneEmployees, birthdayEmployees, accountEmployees, passworkEmployees, statusEmployees, idRole, roleName);
        ele.setRoleName(roleName);

        return ele;
    }

//    public static void main(String[] args) throws SQLException {
//        EmployeesModel em = new EmployeesModel();
//        int a = em.getNumberOfEmployee(1, "", "");
//        System.out.println(a);
//    }
    public void insert(String nameEmployee, int gender, String address, String mail,
            String phone, Date birthday, String account, String password,int status, int idRole) throws SQLException{
        String strSql = "INSERT INTO `employees`(`nameEmployee`, `gender`, `address`, `mail`, `phone`, "
                + "  `birthday`, `account`, `password`,`status`, `idRole`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        pst = con.prepareStatement(strSql);
        
        pst.setString(1, nameEmployee);
        pst.setInt(2, gender);
        pst.setString(3, address);
        pst.setString(4, mail);
        pst.setString(5, phone);
        pst.setDate(6, birthday);
        pst.setString(7, account);
        pst.setString(8, password);
        pst.setInt(9, status);
        pst.setInt(10, idRole);
        
        pst.executeUpdate();
        
    }
    
//    public static void main(String[] args) throws SQLException {
//        EmployeesModel em = new EmployeesModel();
//        em.insert("linh ml", 1, "st", "aa", "aaaa", new Date(System.currentTimeMillis()), "aa", "aa",1, 1);
//    }
    public void update(String nameEmployee, int gender, String address, String mail,
            String phone, Date birthday, String account, String password,int status, int idRole,int idEmployee) throws SQLException{
        String strSql = "UPDATE `employees` SET `nameEmployee`=?,`gender`=?,`address`=?, "
                + " `mail`=?,`phone`=?,`birthday`=?, `account`=?, `password`=? "
                + " `status`=?,`idRole`=? WHERE `idEmployee` = ?";
        pst = con.prepareStatement(strSql);
        
        pst.setString(1, nameEmployee);
        pst.setInt(2, gender);
        pst.setString(3, address);
        pst.setString(4, mail);
        pst.setString(5, phone);
        pst.setDate(6, birthday);
        pst.setString(7, account);
        pst.setString(8, password);
        pst.setInt(9, status);
        pst.setInt(10, idRole);
        pst.setInt(11, idEmployee);
        
        pst.executeUpdate();
        
    }
    public void updatePassword (String password, int idEmployee) throws SQLException {
        String strSql = "UPDATE `employees` SET `password`=? WHERE `idEmployee` = ?";
        pst = con.prepareStatement(strSql);
        
        pst.setString(1, password);
        pst.setInt(2, idEmployee);
        
        pst.executeUpdate();
    }
    
    public boolean checkLogin(String username, String pass) throws SQLException{
        String strSql = "SELECT COUNT(*) AS 'number' FROM `employees` WHERE account = '" + username + "' AND password = '" + Tool.getMd5(pass) + "'";
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        int num = rs.getInt("number");
        return num != 0;
    }
}

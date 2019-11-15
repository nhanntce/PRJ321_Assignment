package Model;

import MyUltis.DBConnection;
import MyUltis.GenerateData;
import MyUltis.Tool;
import ObjectInfo.Employees;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Hai
 */
public class EmployeeModel {

    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    private String query;
    ArrayList<Employees> employee;
    public static int SoDong_Trang = 10;

    public EmployeeModel() throws SQLException {
        con = null;
        pst = null;
        st = null;
        rs = null;
        employee = new ArrayList<>();
        con = DBConnection.getConnection();
        st = con.createStatement();
    }

//    public ArrayList<Employees> loademployee() {
//        employee = new ArrayList<>();
//        query = "SELECT * FROM `employees` WHERE 1";
//        try {
//            rs = st.executeQuery(query);
//            if (rs.isBeforeFirst()) {
//                while (rs.next()) {
//                    int idEmployee = rs.getInt("idEmployee");
//                    String nameEmployee = rs.getString("nameEmployee");
//                    int gender = rs.getInt("gender");
//                    String address = rs.getString("address");
//                    String mail = rs.getString("mail");
//                    String phone = rs.getString("phone");
//                    Date birthday = rs.getDate("birthday");
//                    String account = rs.getString("account");
//                    String password = rs.getString("password");
//                    int status = rs.getInt("status");
//                    int idRole = rs.getInt("idRole");
//                    employee.add(new Employees(idEmployee, nameEmployee, gender, address, mail, phone, birthday, account, password, status, idRole, ));
//                }
//            }
//        } catch (SQLException ex) {
//
//        } catch (Exception e) {
//
//        }
//
//        return employee;
//    }
//    public void insertEmployee(String nameEmployee, int gender, String address, String mail, String phone, Date birthday, String account, String password, int status, int idRole) throws SQLException {
//        try {
//            String sql = "INSERT INTO `employees`(`nameEmployee`, `gender`, `address`, `mail`, "
//                    + "`phone`, `birthday`, `account`, `password`, `status`, `idRole`) VALUES (?,?,?,?,?,?,?,?,?,?)";
//            ps = con.prepareStatement(sql);
//
//            ps.setString(1, nameEmployee);
//            ps.setInt(2, gender);
//            ps.setString(3, address);
//            ps.setString(4, mail);
//            ps.setString(5, phone);
//            ps.setDate(6, birthday);
//            ps.setString(7, account);
//            ps.setString(8, password);
//            ps.setInt(9, status);
//            ps.setInt(10, idRole);
//
//            ps.executeUpdate();
//            rs = ps.getGeneratedKeys();
//            rs.next();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//    public void UpdateEmployee(int idEmployee, String nameEmployee, int gender, String address,
//            String mail, String phone, Date birthday, String account, String password, int status, int idRole) throws SQLException {
//        try {
//            String sql = "UPDATE `employees` SET `nameEmployee`=?,`gender`=?,`address`=?,"
//                    + "`mail`=?,`phone`=?,`birthday`=?,`account`=?,`password`=?,`status`=?,`idRole`=? WHERE `idEmployee` = ? ";
//            ps = con.prepareStatement(sql);
//
//            ps.setString(1, nameEmployee);
//            ps.setInt(2, gender);
//            ps.setString(3, address);
//            ps.setString(4, mail);
//            ps.setString(5, phone);
//            ps.setDate(6, birthday);
//            ps.setString(7, account);
//            ps.setString(8, password);
//            ps.setInt(9, status);
//            ps.setInt(10, idRole);
//            ps.setInt(11, idEmployee);
//            ps.executeUpdate();
//            rs = ps.getGeneratedKeys();
//            rs.next();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public void dateleEmployee(int idEmployee, boolean status) throws SQLException {
//        String sql = "UPDATE `employees` SET `status` = ? WHERE `idEmployee` = ?";
//        ps = con.prepareStatement(sql);
//
//        ps.setInt(2, idEmployee);
//        ps.setBoolean(1, status);
//
//        ps.executeUpdate();
//    }
    public void insert(String nameEmployee, int gender, String address, String mail,
            String phone, Date birthday, String account, String password, int status, int idRole) throws SQLException {
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

//    public boolean checkLogin(String username, String pass) throws SQLException {
//        String strSql = "SELECT COUNT(*) AS 'number' FROM `employees` WHERE status = 1 AND account = '" + username + "' AND password = '" + Tool.getMd5(pass) + "'";
//        st = con.createStatement();
//        rs = st.executeQuery(strSql);
//        rs.next();
//        int num = rs.getInt("number");
//        return num != 0;
//    }
    
    public boolean checkLogin(String username, String pass) throws SQLException {
        boolean result = false;
        String strSql = "SELECT COUNT(*) AS 'number' , `account`, `password` FROM `employees` WHERE status = 1 AND account = '" + username + "' AND password = '" + Tool.getMd5(pass) + "'";
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        int num = rs.getInt("number");
        String account = rs.getString("account");
        String password = rs.getString("password");
        if(num != 0){
            if(account.equals(username) && password.equals(Tool.getMd5(pass))){
                result = true;
            }
        }
        return result;
    }

    public int getID(String username, String pass) throws SQLException {
        String strSql = "SELECT  idEmployee FROM `employees` WHERE account = '" + username + "' AND password = '" + Tool.getMd5(pass) + "'";
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        int num = rs.getInt("idEmployee");
        return num;
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
            employee = new ArrayList<Employees>();
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

                employee.add(new Employees(idEmployees, nameEmployees, genderEmployees,
                        addressEmployees, mailEmployees, phoneEmployees, birthdayEmployees,
                        accountEmployees, passworkEmployees, statusEmployees, idRole, roleName));
                employee.get(employee.size() - 1).setRoleName(roleName);
            }
        } catch (SQLException ex) {

        }
        return this.employee;
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

    public int totalpage(int currentPage, String search, String sortColumn) throws SQLException {
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

        }
        return strPaging;
    }

    public void softDelete(int idEmployee) throws SQLException {
        String strSql = "UPDATE `employees` SET `status`= 2 WHERE `idEmployee` = ?";
        PreparedStatement pst = con.prepareStatement(strSql);
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

    public void update(String nameEmployee, int gender, String address, String mail,
            String phone, Date birthday, int status, int idEmployee) throws SQLException {
        String strSql = "UPDATE `employees` SET `nameEmployee`=?,`gender`=?,`address`=?, "
                + " `mail`=?,`phone`=?,`birthday`=?,`status`=? WHERE idEmployee = ? ";
        pst = con.prepareStatement(strSql);

        pst.setString(1, nameEmployee);
        pst.setInt(2, gender);
        pst.setString(3, address);
        pst.setString(4, mail);
        pst.setString(5, phone);
        pst.setDate(6, birthday);
        pst.setInt(7, status);
        pst.setInt(8, idEmployee);

        pst.executeUpdate();

    }

    public void updatePassword(String password, int idEmployee) throws SQLException {
        String strSql = "UPDATE `employees` SET `password`=? WHERE `idEmployee` = ?";
        pst = con.prepareStatement(strSql);

        pst.setString(1, password);
        pst.setInt(2, idEmployee);

        pst.executeUpdate();
    }

    public static void main(String[] args) throws SQLException, ParseException {
        EmployeeModel cm = new EmployeeModel();
        GenerateData gd = new GenerateData();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(cm.checkLogin("truongthithucoanh", "78766cd6f42389428a808c69b2abbdc5"));
        System.out.println(cm.getID("nhannt", "nhannt"));
//        cm.update("Truong Thi Thuc Oanh", 2, "Can Tho", "truongthithucoanh@fpt.edu.vn", "0846990822", new Date(System.currentTimeMillis()), 1, 61);

        cm.insert("Nguyen Thanh Nhan", 1, "65 so 5 street", "nhanntce130377@fpt.edu.vn", "0965689617", new Date(System.currentTimeMillis()), "nhanntce", Tool.getMd5("nhannt"), 1, 1);
//        for(int i = 0; i < 50; i++){
//            String ten = gd.getNameMale();
//            String mail = gd.getMail(ten).toLowerCase();
//            String phone = gd.getPhone();
//            String username = gd.getAccount(ten);
//            String pass = gd.getPassword();
//            Date date = gd.getDate();
//            System.out.println();
//            cm.insertEmployee(ten, 1, gd.getAddress(), mail, phone, date, username, Tool.getMd5(pass), 1, 2);
//            System.out.println(date);
//            
//            
//        }
    }
}

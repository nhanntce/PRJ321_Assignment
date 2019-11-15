package Model;

import MyUltis.DBConnection;
import ObjectInfo.CusEmpPro;
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
public class CusEmProModel {

    private Connection con;
    private PreparedStatement pst;
    private Statement st;
    private ResultSet rs;
    ArrayList<CusEmpPro> CusEmPro;
    public static int NUMBER = 5;

    public CusEmProModel() {
        this.con = DBConnection.getConnection();
        this.pst = null;
        this.st = null;
        this.rs = null;
        this.CusEmPro = new ArrayList<>();
    }

    /**
     * get paging
     *
     * @param page
     * @param search
     * @param idEmp
     * @return
     * @throws SQLException
     */
    public ArrayList<CusEmpPro> getPaging(int page, String search, int idEmp) throws SQLException {
        String strSql = "SELECT a.*, b.nameCustomer FROM  cusemppro AS a,  customers "
                + " AS b WHERE a.idCustomer = b.idCustomer ";

        if (idEmp != 0) {
            strSql += "AND (idEmployee IS NULL OR idEmployee = " + idEmp + ") ";
        }

        if (!search.trim().equals("")) {
            strSql += " AND b.nameCustomer LIKE '%" + search + "%' ";
        }
        strSql += " ORDER BY idCusEmpPro DESC ";
        int index = (page - 1) * NUMBER;
//        System.out.println(index);
        strSql += "LIMIT " + index + ", " + NUMBER;
        CusEmPro = new ArrayList<>();
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        while (rs.next()) {
            CusEmPro.add(new CusEmpPro(rs.getInt("idCusEmpPro"), rs.getInt("status"), rs.getString("discript"),
                    rs.getInt("idProduct"), rs.getInt("idCustomer"), rs.getInt("idEmployee")));
            CusEmPro.get(CusEmPro.size() - 1).setCusName(rs.getString("nameCustomer"));
        }
        return CusEmPro;
    }

    /**
     * get number of row
     *
     * @param page
     * @param search
     * @param idEmp
     * @return
     * @throws SQLException
     */
    public int getNumber(int page, String search, int idEmp) throws SQLException {
        String strSql = "SELECT COUNT(*) AS 'number' FROM  cusemppro AS a,  customers "
                + " AS b WHERE a.idCustomer = b.idCustomer ";

        if (idEmp != 0) {
            strSql += "AND (idEmployee IS NULL OR idEmployee = " + idEmp + ") ";
        }

        if (!search.trim().equals("")) {
            strSql += " AND b.nameCustomer LIKE '%" + search + "%' ";
        }
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        return rs.getInt("number");
    }

    //<ul class="pagination">
//  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
//  <li class="page-item"><a class="page-link" href="#">1</a></li>
//  <li class="page-item active"><a class="page-link" href="#">2</a></li>
//  <li class="page-item"><a class="page-link" href="#">3</a></li>
//  <li class="page-item"><a class="page-link" href="#">Next</a></li>
//</ul>  
    public String getPagingString(int page, String search, int id) throws SQLException {
        String str = "<ul class=\"pagination\"> ";
        String strCon;
        int number = getNumber(page, search, id);
        int numberOfPage = (int) Math.ceil((float) number /  NUMBER);
        for (int i = 1; i <= numberOfPage; i++) {
            strCon = "?page=" + i;
            if (!search.trim().equals("")) {
                strCon += "&s=" + search;
            }
            if (page == i) {
                str += "<li class=\"page-item active\"><a class=\"page-link\" href=" + strCon + ">" + i + "</a></li>";
            } else {
                str += "<li class=\"page-item\"><a class=\"page-link\" href=" + strCon + ">" + i + "</a></li>";
            }
        }
        return str;
    }

    public void insert(int statusCusEmpPro, String Description, int idProduc, int idCustomer, int idEmployees) throws SQLException {
        String sql = "INSERT INTO `cusemppro`(`status`, `discript`, `idProduct`, `idCustomer`, `idEmployee`) "
                + "VALUES (?,?,?,?,?)";
        pst = con.prepareStatement(sql);
        pst.setInt(1, statusCusEmpPro);
        pst.setString(2, Description);
        pst.setInt(3, idProduc);
        pst.setInt(4, idCustomer);
        pst.setInt(5, idEmployees);
        pst.executeUpdate();
    }
    
    public void insertFromClient(int idProduct, int idCustomer) throws SQLException {
        String sql = "INSERT INTO `cusemppro`(`status`, `idProduct`, `idCustomer`) "
                + "VALUES (?,?,?)";
        pst = con.prepareStatement(sql);
        pst.setInt(1, 1);
        
        pst.setInt(2, idProduct);
        pst.setInt(3, idCustomer);
        pst.executeUpdate();
    }

    public void update(int statusCusEmpPro, String Description, int idCusEmpPro) throws SQLException {
        String sql = "UPDATE `cusemppro` SET `status`=?,`discript`=? WHERE idCusEmpPro = ?";
        pst = con.prepareStatement(sql);
        
        pst.setInt(1, statusCusEmpPro);
        pst.setString(2, Description);
        pst.setInt(3, idCusEmpPro);
        pst.executeUpdate();
    }

    public void updateEmployee(int idEmployee, int idCusEmpPro) throws SQLException {
        String sql = "UPDATE `cusemppro` SET `idEmployee`=? WHERE idCusEmpPro = ?";
        pst = con.prepareStatement(sql);
        
        pst.setInt(1, idEmployee);
        pst.setInt(2, idCusEmpPro);
//        pst.setInt(3, idCusEmpPro);
        pst.executeUpdate();
    }

        
    public void delete(int statusCusEmpPro, int idProduc) throws SQLException {
        String sql = "UPDATE `cusemppro` SET `status`= ? WHERE `idProduct` = ?";
        pst = con.prepareStatement(sql);
        pst.setInt(2, statusCusEmpPro);
        pst.executeUpdate();
    }

    public CusEmpPro getCusEmpPro(int idCusEmpPro) throws SQLException{
        String strSql = "SELECT a.*, b.nameCustomer FROM  cusemppro AS a,  customers "
                + " AS b WHERE a.idCustomer = b.idCustomer AND idCusEmpPro = " + idCusEmpPro;
        st = con.createStatement();
        rs = st.executeQuery(strSql);
        rs.next();
        CusEmpPro cep = new CusEmpPro(rs.getInt("idCusEmpPro"), rs.getInt("status"), rs.getString("discript"),
                    rs.getInt("idProduct"), rs.getInt("idCustomer"), rs.getInt("idEmployee"));
            cep.setCusName(rs.getString("nameCustomer"));
        return cep;
    }
    
    public void already(int idCEP) throws SQLException{
        String strSql = "UPDATE `cusemppro` SET `status`= 2 WHERE idCusEmpPro = " + idCEP;
        pst = con.prepareStatement(strSql);
        pst.executeUpdate();
    }
    
    public static void main(String[] args) throws SQLException {
        CusEmProModel cm = new CusEmProModel();
        ArrayList<CusEmpPro> cp = cm.getPaging(1, "", 0);
        System.out.println(cp.get(0).getCusName());
        System.out.println(cp.size());
        System.out.println(cm.getPagingString(1, "", 1));
        for (int i = 0; i < cp.size(); i++) {
            System.out.println(cp.get(i).getIdEmployees() + " " + cp.get(i).getCusName());
            if(cp.get(i).getDescription() == null){
                System.out.println("nhan");
            }
        }
        cm.already(2);
        
//        cm.updateEmployee(1, );
    }
}

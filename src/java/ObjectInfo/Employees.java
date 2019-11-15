package ObjectInfo;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Employees {
    private int idEmployees;
    private String nameEmployees;
    private int genderEmployees;
    private String addressEmployees;
    private String mailEmployees;
    private String phoneEmployees;
    private Date birthdayEmployees;
    private String accountEmployees;
    private String passworkEmployees;
    private int statusEmployees;
    private int idRole;
    private String roleName;
    
    public Employees(){
        
    }

    public Employees(int idEmployees, String nameEmployees, int genderEmployees, String addressEmployees, String mailEmployees, String phoneEmployees, Date birthdayEmployees, String accountEmployees, String passworkEmployees, int statusEmployees, int idRole,String roleName) {
        this.idEmployees = idEmployees;
        this.nameEmployees = nameEmployees;
        this.genderEmployees = genderEmployees;
        this.addressEmployees = addressEmployees;
        this.mailEmployees = mailEmployees;
        this.phoneEmployees = phoneEmployees;
        this.birthdayEmployees = birthdayEmployees;
        this.accountEmployees = accountEmployees;
        this.passworkEmployees = passworkEmployees;
        this.statusEmployees = statusEmployees;
        this.idRole = idRole;
        this.roleName = roleName;
    }

    

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public String getNameEmployees() {
        return nameEmployees;
    }

    public void setNameEmployees(String nameEmployees) {
        this.nameEmployees = nameEmployees;
    }

    public int getGenderEmployees() {
        return genderEmployees;
    }

    public void setGenderEmployees(int genderEmployees) {
        this.genderEmployees = genderEmployees;
    }

    public String getAddressEmployees() {
        return addressEmployees;
    }

    public void setAddressEmployees(String addressEmployees) {
        this.addressEmployees = addressEmployees;
    }

    public String getMailEmployees() {
        return mailEmployees;
    }

    public void setMailEmployees(String mailEmployees) {
        this.mailEmployees = mailEmployees;
    }

    public String getPhoneEmployees() {
        return phoneEmployees;
    }

    public void setPhoneEmployees(String phoneEmployees) {
        this.phoneEmployees = phoneEmployees;
    }

    public String getAccountEmployees() {
        return accountEmployees;
    }

    public void setAccountEmployees(String accountEmployees) {
        this.accountEmployees = accountEmployees;
    }

    public String getPassworkEmployees() {
        return passworkEmployees;
    }

    public void setPassworkEmployees(String passworkEmployees) {
        this.passworkEmployees = passworkEmployees;
    }

    public int getStatusEmployees() {
        return statusEmployees;
    }

    public void setStatusEmployees(int statusEmployees) {
        this.statusEmployees = statusEmployees;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public Date getBirthdayEmployees() {
        return birthdayEmployees;
    }

    public void setBirthdayEmployees(Date birthdayEmployees) {
        this.birthdayEmployees = birthdayEmployees;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
            
    
    
}

package ObjectInfo;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private String mail;
    private String phoneCustomer;
    private Date birthdayCustomer;
    private int genderCustomer;
    private int statusCustomer;

    /**
     * create a constructor
     * @param idCustomer
     * @param nameCustomer
     * @param mail
     * @param phoneCustomer
     * @param birthdayCustomer
     * @param genderCustomer
     * @param statusCustomer 
     */
    public Customer(int idCustomer, String nameCustomer, String mail, String phoneCustomer, 
            Date birthdayCustomer, int genderCustomer, int statusCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.mail = mail;
        this.phoneCustomer = phoneCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.statusCustomer = statusCustomer;
    }
    
    

    /**
     * get value for id Customer
     * @return 
     */
    public int getIdCustomer() {
        return idCustomer;
    }
    /**
     * set value for id Customer
     * @param idCustomer 
     */
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    /**
     * get value for name Customer
     * @return 
     */
    public String getNameCustomer() {
        return nameCustomer;
    }
    /**
     * set value for name Customer
     * @param nameCustomer 
     */
    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }
    /**
     * get value for phone Customer
     * 
     * @return 
     */
    public String getPhoneCustomer() {
        return phoneCustomer;
    }
    /**
     * set value for phone Customer
     * @param phoneCustomer 
     */
    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }
    /**
     * get value for Birthday Customer
     * @return 
     */
    public Date getBirthdayCustomer() {
        return birthdayCustomer;
    }
    /**
     * set value for Birthday Customer 
     * @param birthdayCustomer 
     */
    public void setBirthdayCustomer(Date birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }
    /**
     * get value for gender Customer
     * @return 
     */
    public int getGenderCustomer() {
        return genderCustomer;
    }
    /**
     * set value for gender Customer
     * @param genderCustomer 
     */
    public void setGenderCustomer(int genderCustomer) {
        this.genderCustomer = genderCustomer;
    }
    /**
     * get value for status Customer
     * @return 
     */
    public int getStatusCustomer() {
        return statusCustomer;
    }
    /**
     * set value for status Customer
     * @param statusCustomer 
     */
    public void setStatusCustomer(int statusCustomer) {
        this.statusCustomer = statusCustomer;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    

}

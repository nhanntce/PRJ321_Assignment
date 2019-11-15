
package ObjectInfo;

/**
 *
 * @author Admin
 */
public class CusEmpPro {
    private int idCusEmpPro;
    private int statusCusEmpPro;
    private String Description;
    private int idProduct;
    private int idCustomer;
    private int idEmployees;
    private String cusName;
    

    /**
     * create constructor
     * @param idCusEmpPro
     * @param statusCusEmpPro
     * @param Description
     * @param idProduct
     * @param idCustomer
     * @param idEmployees 
     */
    public CusEmpPro(int idCusEmpPro, int statusCusEmpPro, String Description, int idProduct, int idCustomer, int idEmployees) {
        this.idCusEmpPro = idCusEmpPro;
        this.statusCusEmpPro = statusCusEmpPro;
        this.Description = Description;
        this.idProduct = idProduct;
        this.idCustomer = idCustomer;
        this.idEmployees = idEmployees;
    }
    /**
     * get value for status customer-employees-product
     * @return 
     */
    public int getStatusCusEmpPro() {
        return statusCusEmpPro;
    }
    /**
     * set value for status customer-employees-product
     * @param statusCusEmpPro 
     */
    public void setStatusCusEmpPro(int statusCusEmpPro) {
        this.statusCusEmpPro = statusCusEmpPro;
    }
    /**
     * get value for Description
     * @return 
     */
    public String getDescription() {
        return Description;
    }
    /**
     * set value for Description
     * 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * get value for id Product
     * @return 
     */
    public int getIdProduct() {
        return idProduct;
    }
    
    /**
     * set value for id Product
     * @param idProduct 
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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
     * get value for id Employees
     * @return 
     */
    public int getIdEmployees() {
        return idEmployees;
    }
    /**
     * set value for id Employees
     * @param idEmployees 
     */
    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getIdCusEmpPro() {
        return idCusEmpPro;
    }

    public void setIdCusEmpPro(int idCusEmpPro) {
        this.idCusEmpPro = idCusEmpPro;
    }
    
    
            
}

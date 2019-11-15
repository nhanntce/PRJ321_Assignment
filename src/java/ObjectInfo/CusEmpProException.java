package ObjectInfo;

/**
 *
 * @author NhanNT
 */
public class CusEmpProException extends Exception{
    /**
     * create a new Customer, Employee and Product exception
     * @param message 
     */
    public CusEmpProException(String message) {
        super("CusEmpPro: " + message);
    }
    
}

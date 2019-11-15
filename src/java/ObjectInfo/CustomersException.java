package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class CustomersException extends Exception{

    /**
     * create a new customers exception
     * @param message 
     */
    public CustomersException(String message) {
        super("Customers: " + message);
    }
    
}

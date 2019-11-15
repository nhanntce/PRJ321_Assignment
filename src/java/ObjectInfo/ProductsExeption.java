package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class ProductsExeption extends Exception{
    /**
     * create a new product exception 
     * @param message 
     */
    public ProductsExeption(String message) {
        super("Product: " + message);
    }
    
    
}

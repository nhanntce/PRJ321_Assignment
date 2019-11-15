package ObjectInfo;

/**
 *
 * @author NhanNT
 */
public class TypesException extends Exception{
    /**
     * create a new type exception
     * @param message 
     */
    public TypesException(String message) {
        super("Type: " + message);
    }
    
}

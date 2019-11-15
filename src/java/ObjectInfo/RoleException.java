package ObjectInfo;

/**
 *
 * @author NhanNT
 */
public class RoleException extends Exception{

    /**
     * create a new Role exception
     * @param message 
     */
    public RoleException(String message) {
        super("Role: " + message);
    }
    
}

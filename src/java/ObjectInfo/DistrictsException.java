package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class DistrictsException extends Exception{

    public DistrictsException(String message) {
        super("District: " + message);
    }
    
}

package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class ImagesException extends Exception{
    /**
     * create a new image exception
     * @param message 
     */
    public ImagesException(String message) {
        super("Image: " + message);
    }
    
}

package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class EmployeesException extends Exception{
    /**
     * create a new employee exception
     * @param message 
     */
    public EmployeesException(String message) {
        super("Employees: " + message);
    }
    
    
}

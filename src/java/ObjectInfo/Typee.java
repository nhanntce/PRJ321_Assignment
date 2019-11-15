package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class Typee {
    private int idType;         //id of type
    private String nameType;    //name of type
    private int status;         //status of type

    /**
     * create a constructor
     * @param idType
     * @param nameType
     * @param status 
     */
    public Typee(int idType, String nameType, int status) {
        this.idType = idType;
        this.nameType = nameType;
        this.status = status;
    }
    /**
     * get status of image
     * @return 
     */
    public int getStatus() {
        return status;
    }
    /**
     * set status of image
     * @param status 
     */
    public void setStatus(int status) {
        this.status = status;
    }
    /**
     * get id type
     * @return 
     */
    public int getIdType() {
        return idType;
    }
    /**
     * set id type
     * @param idType 
     */
    public void setIdType(int idType) {
        this.idType = idType;
    }
    /**
     * get name type
     * @return 
     */
    public String getNameType() {
        return nameType;
    }
    /**
     * set name type
     * @param nameType 
     */
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
    
    
}

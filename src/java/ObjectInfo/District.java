package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class District {
    private int idDistrict;         //id of district
    private String nameDistrict;    //name of district
    private int status;             //status of district
    
    /**
     * create a constructor
     * @param idDistrict
     * @param nameDistrict
     * @param status 
     */
    public District(int idDistrict, String nameDistrict, int status) {
        this.idDistrict = idDistrict;
        this.nameDistrict = nameDistrict;
        this.status = status;
    }
    /**
     * get status
     * @return 
     */
    public int getStatus() {
        return status;
    }
    /**
     * set status 
     * @param status 
     */
    public void setStatus(int status) {
        this.status = status;
    }
    /**
     * get id district
     * @return 
     */
    public int getIdDistrict() {
        return idDistrict;
    }
    /**
     * set id district
     * @param idDistrict 
     */
    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }
    /**
     * get name of district
     * @return 
     */
    public String getNameDistrict() {
        return nameDistrict;
    }
    /**
     * set name of district
     * @param nameDistrict 
     */
    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }
    
    
}

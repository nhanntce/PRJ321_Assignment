package ObjectInfo;

import java.sql.Date;

/**
 *
 * @author NhanNT
 */
public class Product {
    private int idProduct;          // id of product
    private String descript;        //descript product
    private long price;             //price of product
    private double square;          //square of product
    private int status;             //status of product
    private int idType;             //foreign key type 
    private int idDistrict;         //foreign key district
    private String position;
    private String shape;
    private String direction;
    private String juridical;
    private double rightOfWay;
    private Date publicTime;
    private String nameType;
    private String nameDistrict;
    

    
    
    
    

    public Product(int idProduct, String position, String shape, String direction, String juridical, double rightOfWay, String descript,
            long price, double square, int status, int idType, int idDistrict, Date publicTime) {
        this.idProduct = idProduct;
        this.position = position;
        this.shape = shape;
        this.direction = direction;
        this.juridical = juridical;
        this.rightOfWay = rightOfWay;
        this.descript = descript;
        this.price = price;
        this.square = square;
        this.status = status;
        this.idType = idType;
        this.idDistrict = idDistrict;
        this.publicTime = publicTime;
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
     * get id product
     * @return 
     */
    public int getIdProduct() {
        return idProduct;
    }
    /**
     * set id product
     * @param idProduct 
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    /**
     * get descript
     * @return 
     */
    public String getDescript() {
        return descript;
    }
    /**
     * set descript 
     * @param descript 
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }
    /**
     * get price of product
     * @return 
     */
    public long getPrice() {
        return price;
    }
    /**
     * set price of product
     * @param price 
     */
    public void setPrice(long price) {
        this.price = price;
    }
    /**
     * get square of product
     * @return 
     */
    public double getSquare() {
        return square;
    }
    /**
     * set square of product
     * @param square 
     */
    public void setSquare(double square) {
        this.square = square;
    }
    /**
     * get status of product
     * @return 
     */
    public int getStatus() {
        return status;
    }
    /**
     * set status of product
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getJuridical() {
        return juridical;
    }

    public void setJuridical(String juridical) {
        this.juridical = juridical;
    }

    public double getRightOfWay() {
        return rightOfWay;
    }

    public void setRightOfWay(double rightOfWay) {
        this.rightOfWay = rightOfWay;
    }

    public Date getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(Date publicTime) {
        this.publicTime = publicTime;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }
    
    
}

package ObjectInfo;
/**
 *
 * @author NhanNT
 */
public class Image {
    int idImage;            //id of image
    String image;           //path of image
    int idProduct;          //id of product
    
    /**
     * create a constructor
     * @param idImage
     * @param image
     * @param idProduct 
     */
    public Image(int idImage, String image, int idProduct) {
        this.idImage = idImage;
        this.image = image;
        this.idProduct = idProduct;
    }

    /**
     * get id image
     * @return 
     */
    public int getIdImage() {
        return idImage;
    }
    /**
     * get id product
     * @return 
     */
    public int getIdProduct() {
        return idProduct;
    }
    /**
     * get path ò image
     * @return 
     */
    public String getImage() {
        return image;
    }
    /**
     * set id image
     * @param idImage 
     */
    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }
    /**
     * set id product
     * @param idProduct 
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    /**
     * set path of image
     * @param image 
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    
}

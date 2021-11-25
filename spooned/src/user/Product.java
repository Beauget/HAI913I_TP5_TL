package user;
public class Product {
    private int productID;

    private double productPrice;

    private java.lang.String productName;

    private java.lang.String expirationDate;

    public Product(int id, java.lang.String name, double price, java.lang.String date) {
        System.out.println("Enter in the method <init> from class Product");
        this.setProductID(id);
        this.setProductName(name);
        this.setProductPrice(price);
        this.setExpirationDate(date);
    }

    public java.lang.String toString() {
        System.out.println("Enter in the method toString from class Product");
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(((((((("Product with ID : " + this.getProductID()) + "\nProduct Name : ") + this.getProductName()) + "\nProduct price : ") + this.getProductPrice()) + "\nExpiration date : ") + this.getExpirationDate()) + "\n");
        builder.append("\n");
        return builder.toString();
    }

    /**
     *
     *
     * @return the productPrice
     */
    public double getProductPrice() {
        System.out.println("Enter in the method getProductPrice from class Product");
        return productPrice;
    }

    /**
     *
     *
     * @return productPrice the productPrice to sert
     */
    public void setProductPrice(double productPrice) {
        System.out.println("Enter in the method setProductPrice from class Product");
        this.productPrice = productPrice;
    }

    /**
     *
     *
     * @return the productName
     */
    public java.lang.String getProductName() {
        System.out.println("Enter in the method getProductName from class Product");
        return productName;
    }

    /**
     *
     *
     * @param productName
     * 		the productName to set
     */
    public void setProductName(java.lang.String productName) {
        System.out.println("Enter in the method setProductName from class Product");
        this.productName = productName;
    }

    /**
     *
     *
     * @return the expirationDate
     */
    public java.lang.String getExpirationDate() {
        System.out.println("Enter in the method getExpirationDate from class Product");
        return expirationDate;
    }

    /**
     *
     *
     * @param expirationDate
     * 		the expirationDate to set
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        System.out.println("Enter in the method setExpirationDate from class Product");
        this.expirationDate = expirationDate;
    }

    /**
     *
     *
     * @return the productID
     */
    public int getProductID() {
        System.out.println("Enter in the method getProductID from class Product");
        return productID;
    }

    /**
     *
     *
     * @return productID the productID to set
     */
    public void setProductID(int productID) {
        System.out.println("Enter in the method setProductID from class Product");
        this.productID = productID;
    }
}
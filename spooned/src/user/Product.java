package user;
public class Product {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(Product.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638619064779;

    public static logger.OurFormatter of;

    private int productID;

    private double productPrice;

    private java.lang.String productName;

    private java.lang.String expirationDate;

    public Product(int id, java.lang.String name, double price, java.lang.String date) {
        ;
        this.setProductID(id);
        this.setProductName(name);
        this.setProductPrice(price);
        this.setExpirationDate(date);
        of = new OurFormatter();
        		tx =  new FileHandler("loggingRepository.json");
        		
        		tx.setFormatter(of);
        		
        		LOGGER.addHandler(tx);;
    }

    public java.lang.String toString() {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"toString");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"getProductPrice");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productPrice;
    }

    /**
     *
     *
     * @return productPrice the productPrice to sert
     */
    public void setProductPrice(double productPrice) {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"setProductPrice");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productPrice = productPrice;
    }

    /**
     *
     *
     * @return the productName
     */
    public java.lang.String getProductName() {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"getProductName");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productName;
    }

    /**
     *
     *
     * @param productName
     * 		the productName to set
     */
    public void setProductName(java.lang.String productName) {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"setProductName");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productName = productName;
    }

    /**
     *
     *
     * @return the expirationDate
     */
    public java.lang.String getExpirationDate() {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"getExpirationDate");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return expirationDate;
    }

    /**
     *
     *
     * @param expirationDate
     * 		the expirationDate to set
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"setExpirationDate");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.expirationDate = expirationDate;
    }

    /**
     *
     *
     * @return the productID
     */
    public int getProductID() {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"getProductID");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productID;
    }

    /**
     *
     *
     * @return productID the productID to set
     */
    public void setProductID(int productID) {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"setProductID");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productID = productID;
    }
}
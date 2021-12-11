import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import logger.Lps;
import logger.OurFormatter;
public class Product {
    private static final Logger LOGGER = Logger.getLogger(Product.class.getName());

    public static FileHandler tx;

    private IOException e1639241310013;

    public static OurFormatter of;

    private String productID;

    private double productPrice;

    private String productName;

    private String expirationDate;

    public Product(String id, String name, double price, String date) {
        ;
          of = new OurFormatter();
                try {
                	tx =  new FileHandler("loggingRepository.json");
        		} catch (SecurityException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        		} catch (IOException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
                		
                tx.setFormatter(of);
                		
                LOGGER.addHandler(tx);;
        this.setProductID(id);
        this.setProductName(name);
        this.setProductPrice(price);
        this.setExpirationDate(date);
    }

    public String toString() {
        Lps lps = new Lps(this.getClass().toString() +".toString",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        StringBuilder builder = new StringBuilder();
        builder.append((((((("Product with ID : " + this.getProductID()) + " Product Name : ") + this.getProductName()) + " Product price : ") + this.getProductPrice()) + " Expiration date : ") + this.getExpirationDate());
        return builder.toString();
    }

    /**
     *
     *
     * @return the productPrice
     */
    public double getProductPrice() {
        Lps lps = new Lps(this.getClass().toString() +".getProductPrice",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
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
        Lps lps = new Lps(this.getClass().toString() +".setProductPrice",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(productPrice));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productPrice = productPrice;
    }

    /**
     *
     *
     * @return the productName
     */
    public String getProductName() {
        Lps lps = new Lps(this.getClass().toString() +".getProductName",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
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
    public void setProductName(String productName) {
        Lps lps = new Lps(this.getClass().toString() +".setProductName",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(productName));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productName = productName;
    }

    /**
     *
     *
     * @return the expirationDate
     */
    public String getExpirationDate() {
        Lps lps = new Lps(this.getClass().toString() +".getExpirationDate",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
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
    public void setExpirationDate(String expirationDate) {
        Lps lps = new Lps(this.getClass().toString() +".setExpirationDate",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(expirationDate));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.expirationDate = expirationDate;
    }

    /**
     *
     *
     * @return the productID
     */
    public String getProductID() {
        Lps lps = new Lps(this.getClass().toString() +".getProductID",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productID;
    }

    /**
     *
     *
     * @return productID the productID to set
     */
    public void setProductID(String productID) {
        Lps lps = new Lps(this.getClass().toString() +".setProductID",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(productID));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productID = productID;
    }
}
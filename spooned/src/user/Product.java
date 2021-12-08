import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import logger.Lps;
import logger.OurFormatter;

public class Product {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(Product.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638963177736;

    public static logger.OurFormatter of;

    private java.lang.String productID;

    private double productPrice;

    private java.lang.String productName;

    private java.lang.String expirationDate;

    public Product(java.lang.String id, java.lang.String name, double price, java.lang.String date) {
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

    public java.lang.String toString() {
        Lps lps = new Lps(this.getClass().toString() +".toString",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
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
    public java.lang.String getProductName() {
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
    public void setProductName(java.lang.String productName) {
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
    public java.lang.String getExpirationDate() {
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
    public void setExpirationDate(java.lang.String expirationDate) {
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
    public java.lang.String getProductID() {
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
    public void setProductID(java.lang.String productID) {
        Lps lps = new Lps(this.getClass().toString() +".setProductID",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(productID));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productID = productID;
    }
}
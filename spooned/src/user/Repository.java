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

public class Repository {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(Repository.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638963177736;

    public static logger.OurFormatter of;

    private java.util.ArrayList< Product> productList;

    public Repository() {
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
        this.productList = new java.util.ArrayList< Product>();
         
    }

    /**
     *
     *
     * @param p
     * 		is added if no product with same id already exist
     * @throws ProductException
     * 		
     */
    public void addProduct( User u,  Product p) throws  ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString() +".addProduct",String.valueOf(new Date(System.currentTimeMillis())),p.toString());
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        System.out.println("OH JE SUIS LA CONNARD" + lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.Boolean dontAdd = false;
        try {
            for ( Product pList : this.productList) {
                if (pList.getProductID().equals(p.getProductID())) {
                    dontAdd = true;
                    throw new  ProductException("Sorry,Product with same ID already exist");
                }
            }
            if (!dontAdd) {
                this.productList.add(p);
                java.lang.System.out.println("Product successfully added to our Repository");
            }
        } catch ( ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    /**
     *
     *
     * @param p
     * 		product to remove
     * @throws ProductException
     * 		
     */
    public void removeProduct( User u, java.lang.String ID) throws  ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString() +".removeProduct",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(ID));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
         Product toRemove = null;
        java.lang.Boolean dontRemove = false;
        try {
            for ( Product pList : this.productList) {
                if (pList.getProductID().equals(ID)) {
                    toRemove = pList;
                    dontRemove = true;
                    java.lang.System.out.println("Product successfully removed !");
                }
            }
            this.productList.remove(toRemove);
            if (!dontRemove) {
                throw new  ProductException("Sorry, No Product with this ID in our Repository we cant delete this Product");
            }
        } catch ( ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    /**
     *
     *
     * @param p
     * 		product to fetch if exist in our Repository
     * @throws ProductException
     * 		
     */
    public void fetchProduct( User u, java.lang.String ID) throws  ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString() +".fetchProduct",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(ID));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.Boolean dontFetch = false;
        try {
            for ( Product pList : this.productList) {
                if (pList.getProductID().equals(ID)) {
                    java.lang.System.out.println("We found your product !\n");
                    java.lang.System.out.println(pList.toString());
                    dontFetch = true;
                }
            }
            if (!dontFetch) {
                throw new  ProductException("Sorry, No Product with this ID in our Repository");
            }
        } catch ( ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    /**
     *
     *
     * @param user
     * 		
     * @throws ProductException
     * 		
     */
    public void fetchProductByPrice( User u, double price) throws  ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString() +".fetchProductByPrice",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(price));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.Boolean dontFetch = false;
        try {
            for ( Product pList : this.productList) {
                if (pList.getProductPrice() >= price) {
                    java.lang.System.out.println("We found your product !\n");
                    java.lang.System.out.println(pList.toString());
                    dontFetch = true;
                }
            }
            if (!dontFetch) {
                throw new  ProductException("Sorry, There is no product above your given price in our Repository");
            }
        } catch ( ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    public void updateProduct( User u, java.lang.String ID, java.lang.String name, double price, java.lang.String date) throws  ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString() +".updateProduct",String.valueOf(new Date(System.currentTimeMillis())),ID);
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.Boolean dontUpdate = false;
        try {
            for ( Product pList : this.productList) {
                if (pList.getProductID().equals(ID)) {
                    java.lang.System.out.println("Before update : \n");
                    java.lang.System.out.println(pList.toString());
                    pList.setProductName(name);
                    pList.setProductPrice(price);
                    pList.setExpirationDate(date);
                    java.lang.System.out.println("After update : \n");
                    java.lang.System.out.println(pList.toString());
                    dontUpdate = true;
                    java.lang.System.out.println("Product successfully updated !");
                }
            }
            if (!dontUpdate) {
                throw new  ProductException("Sorry, No Product with this ID in our Repository");
            }
        } catch ( ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    /**
     *
     *
     * @return the productList
     */
    public java.util.ArrayList< Product> getProductList() {
        Lps lps = new Lps(this.getClass().toString() +".getProductList",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productList;
    }

    /**
     *
     *
     * @param productList
     * 		the productList to set
     */
    public void setProductList(java.util.ArrayList< Product> productList) {
        Lps lps = new Lps(this.getClass().toString() +".setProductList",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(productList));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productList = productList;
    }

    public java.lang.String showAllProduct() {
        Lps lps = new Lps(this.getClass().toString() +".showAllProduct",String.valueOf(new Date(System.currentTimeMillis())),"no parameters");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        for ( Product p : this.productList) {
            builder.append(p.toString());
        }
        return builder.toString();
    }
}
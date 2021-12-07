package user;

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
	
	private static final Logger LOGGER = Logger.getLogger(Repository.class.getName());
	
	private ArrayList<Product> productList;
	public static Handler ch;
	public static FileHandler tx;
	public static OurFormatter of;


	public Repository() throws SecurityException, IOException {
		this.productList = new ArrayList<Product>();
		
		of = new OurFormatter();
		ch = new ConsoleHandler();
		tx =  new FileHandler("loggingRepository.json");
		
		ch.setFormatter(of);
		tx.setFormatter(of);
		
		LOGGER.addHandler(ch);
		LOGGER.addHandler(tx);
		
		
	}
	
	
	/**
	 * 
	 * @param p is added if no product with same id already exist
	 * @throws ProductException
	 */
	public void addProduct(User u, Product p) throws ProductException {
		
		/**
		 * manual logging part
		 */
		Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"addProduct");		
		LogRecord rec = new LogRecord(Level.ALL,lps.toString());
		LOGGER.info(of.format(rec));
		
		
		
		Boolean dontAdd = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == p.getProductID()) {
				dontAdd = true;
				throw new ProductException("Sorry,Product with same ID already exist");
				}			
			}
			if(!(dontAdd)) {
				this.productList.add(p);
				System.out.println("Product successfully added to our Repository");
			}
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
	
	/**
	 * 
	 * @param p product to remove 
	 * @throws ProductException
	 */
	public void removeProduct(User u,int ID) throws ProductException {
		
		Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"removeProduct");
		LogRecord rec = new LogRecord(Level.ALL,lps.toString());
		LOGGER.info(of.format(rec));
		
		Product toRemove = null;
		Boolean dontRemove = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == ID) {
					toRemove = pList;
					dontRemove = true;
					System.out.println("Product successfully removed !");
				}
				
			}
			this.productList.remove(toRemove);
			if(!(dontRemove)) {
				throw new ProductException("Sorry, No Product with this ID in our Repository we cant delete this Product");
			}
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
	
	
	/**
	 * 
	 * @param p product to fetch if exist in our Repository
	 * @throws ProductException
	 */
	public void fetchProduct(int ID) throws ProductException {
		Boolean dontFetch = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == ID) {
					System.out.println("We found your product !\n");
					System.out.println(pList.toString());
					dontFetch = true;
				}
			}
			if(!(dontFetch)) {
				throw new ProductException("Sorry, No Product with this ID in our Repository");
			}
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
	
	
	/**
	 * 
	 * @param price
	 * @throws ProductException
	 */
	public void fetchProductByPrice(double price) throws ProductException {
		Lps lps = new Lps(this.getClass().toString() +"fetchProductByPrice",String.valueOf(new Date(System.currentTimeMillis())),String.valueOf(price));
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));
        
        
		Boolean dontFetch = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductPrice() >= price) {
					System.out.println("We found your product !\n");
					System.out.println(pList.toString());
					dontFetch = true;
				}
			}
			if(!(dontFetch)) {
				throw new ProductException("Sorry, There is no product above your given price in our Repository");
			}
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
	
	public void updateProduct(int ID,String name, double price, String date) throws ProductException {
		Boolean dontUpdate = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == ID) {
					System.out.println("Before update : \n");
					System.out.println(pList.toString());
					pList.setProductName(name);
					pList.setProductPrice(price);
					pList.setExpirationDate(date);
					System.out.println("After update : \n");
					System.out.println(pList.toString());
					dontUpdate = true;
					System.out.println("Product successfully updated !");
				}
			}
			if(!(dontUpdate)) {
				throw new ProductException("Sorry, No Product with this ID in our Repository");
			}
		} catch (ProductException e) {
			System.out.println(e);
		}
	}
	
	

	/**
	 * @return the productList
	 */
	public ArrayList<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
	
	public String showAllProduct() {
		StringBuilder builder = new StringBuilder();
		for(Product p : this.productList) {
			builder.append(p.toString());
		}
		return builder.toString();
	}

}

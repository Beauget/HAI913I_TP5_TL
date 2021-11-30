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
	Handler ch = new ConsoleHandler();
	
	
/*	public static void setup() {
		//Création du handler console et .json 
		Handler ch = new ConsoleHandler();
		FileHandler json = null;
		try {
			 json = new FileHandler("loggingRepository.json");
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
        ch.setFormatter(new OurFormatter());
        json.setFormatter(new OurFormatter());
        LOGGER.addHandler(ch);
        LOGGER.addHandler(json);
	}*/
	
	public Repository() {
		this.productList = new ArrayList<Product>();
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
		OurFormatter of = new OurFormatter();
		ch.setFormatter(of);
		LOGGER.addHandler(ch);
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
	public void removeProduct(int ID) throws ProductException {
		Boolean dontRemove = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == ID) {
					this.productList.remove(pList);
					dontRemove = true;
					System.out.println("Product successfully removed !");
				}
				
			}
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

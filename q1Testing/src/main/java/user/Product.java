
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import logger.Lps;
import logger.OurFormatter;


public class Product {
	
	private String productID;
	private double productPrice;
	private String productName;
	private String expirationDate;
	
	
	public Product(String id, String name, double price, String date) {

		this.setProductID(id);
		this.setProductName(name);
		this.setProductPrice(price);
		this.setExpirationDate(date);
		
		
		
	}
	

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product with ID : " + this.getProductID() + 
				   "\nProduct Name : " + this.getProductName() +
				   "\nProduct price : " + this.getProductPrice() +
				   "\nExpiration date : " + this.getExpirationDate() + "\n");
		builder.append("\n");
		return builder.toString();
	}


	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	
	/**
	 * @return  productPrice the productPrice to sert
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}



	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}



	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}


	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}



	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}
	
	/**
	 * @return productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}
	
	

}

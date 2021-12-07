package user;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import logger.Lps;

public class Repository {
	
	private ArrayList<Product> productList;
	
	
	
	
	public Repository() {
		this.productList = new ArrayList<Product>();
	}
	
	
	/**
	 * 
	 * @param p is added if no product with same id already exist
	 * @throws ProductException
	 */
	public void addProduct(User u,Product p) throws ProductException {
		Boolean dontAdd = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID().equals(p.getProductID())) {
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
	public void removeProduct(User u,String ID) throws ProductException {			
			Product toRemove = null;
			Boolean dontRemove = false;
			try {
				for(Product pList : this.productList) {
					if(pList.getProductID().equals(ID)) {
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
	public void fetchProduct(User u,String ID) throws ProductException {
		Boolean dontFetch = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID().equals(ID)) {
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
	
	public void updateProduct(User u,String ID,String name, double price, String date) throws ProductException {
		Boolean dontUpdate = false;
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID().equals(ID)) {
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

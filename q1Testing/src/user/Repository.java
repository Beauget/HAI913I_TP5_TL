package user;

import java.util.ArrayList;

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
	public void addProduct(Product p) throws ProductException {
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == p.getProductID()) {
					
				throw new ProductException("Sorry,Product with same ID already exist");
				}
				else {
					this.productList.add(p);
					System.out.println("Product successfully added to our Repository");
				}
			}
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @param p product to remove 
	 * @throws ProductException
	 */
	public void removeProduct(Product p) throws ProductException {
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == p.getProductID()) {
					this.productList.remove(pList);
					System.out.println("Product successfully removed !");
				}
				else {
					throw new ProductException("Sorry, No Product with this ID in our Repository we cant delete this Product");
				}
			}
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @param p product to fetch if exist in our Repository
	 * @throws ProductException
	 */
	public void fetchProduct(Product p) throws ProductException {
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == p.getProductID()) {
					System.out.println("We found your product !\n");
					System.out.println(p.toString());
				}
				else {
					throw new ProductException("Sorry, No Product with this ID in our Repository");
				}
			}
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void updateProduct(Product p,String name, double price, String date) throws ProductException {
		try {
			for(Product pList : this.productList) {
				if(pList.getProductID() == p.getProductID()) {
					pList.setProductName(name);
					pList.setProductPrice(price);
					pList.setExpirationDate(date);
					System.out.println("Product succefully updated !");
				}
				else {
					throw new ProductException("Sorry, No Product with this ID in our Repository");
				}
			}
		} catch (ProductException e) {
			System.out.println(e.getMessage());
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
			builder.append("Product with ID : " + p.getProductID() + 
						   "\n Product Name : " + p.getProductName() +
						   "\n Product price : " + p.getProductPrice() +
						   "\n Expiration date : " + p.getExpirationDate() + "\n");
		}
		return builder.toString();
	}

}

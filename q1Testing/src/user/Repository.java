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

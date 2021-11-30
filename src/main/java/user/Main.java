package user;

import java.util.Scanner;
import java.util.logging.Logger;


public class Main {
	

	public static void main(String args[]) throws ProductException {
		
	User testUser = new User("DNS", 23, "jetest@gmail.com", "unpassword");
		
	/**
	 * Some testing content
	 */
	Repository ourRepo = new Repository();
	Product p1 = new Product(1,"Eggs",3.50,"25/11/2021");
	Product p2 = new Product(2,"Chicken",6.50,"22/11/2021");
	Product p3 = new Product(3,"Eggs",3.50,"25/11/2021");
	Product p4 = new Product(3,"Eggs2",3.50,"25/11/2021");
	ourRepo.addProduct(testUser,p1);
	ourRepo.addProduct(testUser,p2);
	ourRepo.addProduct(testUser,p3);
	
	System.out.println(p1.toString());
	
	
	
	
	System.out.println(testUser.toString());
	
	
	
	StringBuilder builder = new StringBuilder();
	
	Scanner sc = new Scanner(System.in);
	
	builder.append("\n1 : Display every product of our repository");
	builder.append("\n2 : Fetch a product by provided ID");
	builder.append("\n3 : Add a new product to our repository");
	builder.append("\n4 : Delete a product by provided ID");
	builder.append("\n5 : Update a product info");
	builder.append("\n0 : To quit application");
	
	
	int cpt = 999;
	
	while(cpt != 0) {
		System.out.println(builder.toString());
		cpt = sc.nextInt();
		switch(cpt) {
		
		case 1 : 
			System.out.println("All product in our repository : \n");
			System.out.println(ourRepo.showAllProduct());
			break;
		case 2 : 
			System.out.println("Give us the ID of the product you need to see");
			int toFetch = sc.nextInt();
			ourRepo.fetchProduct(toFetch);
			break;
		case 3 :
			System.out.println("For add a new product to our repository we need to know some info about your product");
			System.out.println("ID of your product : \n");
			int toID = sc.nextInt();
			System.out.println("Price of your product : ");
			int toPrice = sc.nextInt();
			System.out.println("Name of your product : \n");
			String toName = sc.next();
			System.out.println("Expiration date of your product : ");
			String toDate = sc.next();
			
			Product toAdd = new Product(toID, toName,toPrice,toDate);
			ourRepo.addProduct(testUser,toAdd);
			break;
		case 4 : 
			System.out.println("For delete a product you need to provide the ID of this product");
			int toRemove = sc.nextInt();
			ourRepo.removeProduct(toRemove);
			break;
		case 5 : 
			System.out.println("For update a product you need to provide the ID of this product");
			System.out.println("ID of your product : \n");
			 toID = sc.nextInt();
			System.out.println("Price of your product : ");
			toPrice = sc.nextInt();
			System.out.println("Name of your product : \n");
			 toName = sc.next();
			System.out.println("Expiration date of your product : ");
			 toDate = sc.next();
			ourRepo.updateProduct(toID, toName, toPrice, toDate);
			break;
		case 0 : 
			System.out.println("Thanks for visit, have a good day !");
			break;
			
		}
	}
	
	
	}
}

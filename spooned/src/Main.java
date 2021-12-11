import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import logger.OurFormatter;
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static FileHandler tx;

    private IOException e1639241310013;

    public static OurFormatter of;

    public static void main(String[] args) throws ProductException, SecurityException, IOException {
        ;
        /**
         * Here start testing content for log generator.
         * This part is here only for logging part, CLI and global application steel be use without this testing part
         * like normal java app.
         */
        // Here the initial repository
        Repository ourRepo = new Repository();
        // Some product to test functionnality
        /**
         * Scenario : 10 products and 4 user, some add product, remove and fetch to see some output logging
         * before parse result
         */
        Product p1 = new Product("1", "Eggs", 3.5, "25/11/2021");
        Product p2 = new Product("2", "Chicken", 6.5, "22/12/2021");
        Product p3 = new Product("3", "Sausage", 3.5, "25/12/2021");
        Product p4 = new Product("4", "Bacon", 17.5, "25/12/2021");
        Product p5 = new Product("5", "Chair", 47, "no expiration date");
        Product p6 = new Product("6", "Desk", 717, "no expiration date");
        Product p7 = new Product("7", "computer", 1800, "no expiration date");
        Product p8 = new Product("8", "chocolate", 1.5, "25/12/2022");
        Product p9 = new Product("9", "Pasar", 2.5, "25/12/2022");
        Product p10 = new Product("10", "tablet", 217, "no expiration date");
        User testUser = new User("DNS", 23, "jetest@gmail.com", "unpassword");
        User richUser = new User("ToRich", 55, "imRich@gmail.com", "richNoHack");
        User muchContent = new User("tooMuch", 45, "tooMuch@gmail.com", "123456");
        User someContent = new User("someThings", 18, "Some@gmail.com", "idontcare");
        ourRepo.addProduct(testUser, p1);
        ourRepo.addProduct(testUser, p2);
        ourRepo.addProduct(someContent, p3);
        ourRepo.addProduct(someContent, p4);
        ourRepo.addProduct(richUser, p5);
        ourRepo.addProduct(richUser, p6);
        ourRepo.addProduct(richUser, p7);
        ourRepo.addProduct(muchContent, p8);
        ourRepo.addProduct(muchContent, p9);
        ourRepo.addProduct(muchContent, p10);
        ourRepo.removeProduct(muchContent, "9");
        ourRepo.removeProduct(muchContent, "10");
        ourRepo.addProduct(muchContent, p10);
        ourRepo.addProduct(muchContent, p9);
        ourRepo.fetchProductByPrice(someContent, 4);
        ourRepo.fetchProductByPrice(richUser, 40);
        ourRepo.fetchProduct(someContent, "4");
        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        builder.append("\n1 : Display every product of our repository");
        builder.append("\n2 : Fetch a product by provided ID");
        builder.append("\n3 : Add a new product to our repository");
        builder.append("\n4 : Delete a product by provided ID");
        builder.append("\n5 : Update a product info");
        builder.append("\n0 : To quit application");
        int cpt = 999;
        while (cpt != 0) {
            System.out.println(builder.toString());
            cpt = sc.nextInt();
            switch (cpt) {
                case 1 :
                    System.out.println("All product in our repository : \n");
                    System.out.println(ourRepo.showAllProduct());
                    break;
                case 2 :
                    System.out.println("Give us the ID of the product you need to see");
                    String toFetch = sc.next();
                    ourRepo.fetchProduct(testUser, toFetch);
                    break;
                case 3 :
                    System.out.println("For add a new product to our repository we need to know some info about your product");
                    System.out.println("ID of your product : \n");
                    String toID = sc.next();
                    System.out.println("Price of your product : ");
                    int toPrice = sc.nextInt();
                    System.out.println("Name of your product : \n");
                    String toName = sc.next();
                    System.out.println("Expiration date of your product : ");
                    String toDate = sc.next();
                    Product toAdd = new Product(toID, toName, toPrice, toDate);
                    ourRepo.addProduct(testUser, toAdd);
                    break;
                case 4 :
                    System.out.println("For delete a product you need to provide the ID of this product");
                    String toRemove = sc.next();
                    ourRepo.removeProduct(testUser, toRemove);
                    break;
                case 5 :
                    System.out.println("For update a product you need to provide the ID of this product");
                    System.out.println("ID of your product : \n");
                    String toIDup1 = sc.next();
                    System.out.println("Price of your product : ");
                    toPrice = sc.nextInt();
                    System.out.println("Name of your product : \n");
                    toName = sc.next();
                    System.out.println("Expiration date of your product : ");
                    toDate = sc.next();
                    ourRepo.updateProduct(testUser, toIDup1, toName, toPrice, toDate);
                    break;
                case 0 :
                    System.out.println("Thanks for visit, have a good day !");
                    break;
            }
        } 
    }
}
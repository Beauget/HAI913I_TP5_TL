package user;
public class Main {
    public static void main(java.lang.String[] args) throws user.ProductException {
        System.out.println("Enter in the method main from class Main");
        /**
         * Some testing content
         */
        user.Repository ourRepo = new user.Repository();
        user.Product p1 = new user.Product(1, "Eggs", 3.5, "25/11/2021");
        user.Product p2 = new user.Product(2, "Chicken", 6.5, "22/11/2021");
        user.Product p3 = new user.Product(3, "Eggs", 3.5, "25/11/2021");
        user.Product p4 = new user.Product(3, "Eggs2", 3.5, "25/11/2021");
        ourRepo.addProduct(p1);
        ourRepo.addProduct(p2);
        ourRepo.addProduct(p3);
        java.lang.System.out.println(p1.toString());
        user.User testUser = new user.User("DNS", 23, "jetest@gmail.com", "unpassword");
        java.lang.System.out.println(testUser.toString());
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        builder.append("\n1 : Display every product of our repository");
        builder.append("\n2 : Fetch a product by provided ID");
        builder.append("\n3 : Add a new product to our repository");
        builder.append("\n4 : Delete a product by provided ID");
        builder.append("\n5 : Update a product info");
        builder.append("\n0 : To quit application");
        int cpt = 999;
        while (cpt != 0) {
            java.lang.System.out.println(builder.toString());
            cpt = sc.nextInt();
            switch (cpt) {
                case 1 :
                    java.lang.System.out.println("All product in our repository : \n");
                    java.lang.System.out.println(ourRepo.showAllProduct());
                    break;
                case 2 :
                    java.lang.System.out.println("Give us the ID of the product you need to see");
                    int toFetch = sc.nextInt();
                    ourRepo.fetchProduct(toFetch);
                    break;
                case 3 :
                    java.lang.System.out.println("For add a new product to our repository we need to know some info about your product");
                    java.lang.System.out.println("ID of your product : \n");
                    int toID = sc.nextInt();
                    java.lang.System.out.println("Price of your product : ");
                    int toPrice = sc.nextInt();
                    java.lang.System.out.println("Name of your product : \n");
                    java.lang.String toName = sc.next();
                    java.lang.System.out.println("Expiration date of your product : ");
                    java.lang.String toDate = sc.next();
                    user.Product toAdd = new user.Product(toID, toName, toPrice, toDate);
                    ourRepo.addProduct(toAdd);
                    break;
                case 4 :
                    java.lang.System.out.println("For delete a product you need to provide the ID of this product");
                    int toRemove = sc.nextInt();
                    ourRepo.removeProduct(toRemove);
                    break;
                case 5 :
                    java.lang.System.out.println("For update a product you need to provide the ID of this product");
                    java.lang.System.out.println("ID of your product : \n");
                    toID = sc.nextInt();
                    java.lang.System.out.println("Price of your product : ");
                    toPrice = sc.nextInt();
                    java.lang.System.out.println("Name of your product : \n");
                    toName = sc.next();
                    java.lang.System.out.println("Expiration date of your product : ");
                    toDate = sc.next();
                    ourRepo.updateProduct(toID, toName, toPrice, toDate);
                    break;
                case 0 :
                    java.lang.System.out.println("Thanks for visit, have a good day !");
                    break;
            }
        } 
    }
}
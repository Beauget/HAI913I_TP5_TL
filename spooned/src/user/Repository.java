package user;
public class Repository {
    private java.util.ArrayList<user.Product> productList;

    public Repository() {
        System.out.println("Enter in the method <init> from class Repository");
        this.productList = new java.util.ArrayList<user.Product>();
    }

    /**
     *
     *
     * @param p
     * 		is added if no product with same id already exist
     * @throws ProductException
     * 		
     */
    public void addProduct(user.Product p) throws user.ProductException {
        System.out.println("Enter in the method addProduct from class Repository");
        java.lang.Boolean dontAdd = false;
        try {
            for (user.Product pList : this.productList) {
                if (pList.getProductID() == p.getProductID()) {
                    dontAdd = true;
                    throw new user.ProductException("Sorry,Product with same ID already exist");
                }
            }
            if (!dontAdd) {
                this.productList.add(p);
                java.lang.System.out.println("Product successfully added to our Repository");
            }
        } catch (user.ProductException e) {
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
    public void removeProduct(int ID) throws user.ProductException {
        System.out.println("Enter in the method removeProduct from class Repository");
        java.lang.Boolean dontRemove = false;
        try {
            for (user.Product pList : this.productList) {
                if (pList.getProductID() == ID) {
                    this.productList.remove(pList);
                    dontRemove = true;
                    java.lang.System.out.println("Product successfully removed !");
                }
            }
            if (!dontRemove) {
                throw new user.ProductException("Sorry, No Product with this ID in our Repository we cant delete this Product");
            }
        } catch (user.ProductException e) {
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
    public void fetchProduct(int ID) throws user.ProductException {
        System.out.println("Enter in the method fetchProduct from class Repository");
        java.lang.Boolean dontFetch = false;
        try {
            for (user.Product pList : this.productList) {
                if (pList.getProductID() == ID) {
                    java.lang.System.out.println("We found your product !\n");
                    java.lang.System.out.println(pList.toString());
                    dontFetch = true;
                }
            }
            if (!dontFetch) {
                throw new user.ProductException("Sorry, No Product with this ID in our Repository");
            }
        } catch (user.ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    public void updateProduct(int ID, java.lang.String name, double price, java.lang.String date) throws user.ProductException {
        System.out.println("Enter in the method updateProduct from class Repository");
        java.lang.Boolean dontUpdate = false;
        try {
            for (user.Product pList : this.productList) {
                if (pList.getProductID() == ID) {
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
                throw new user.ProductException("Sorry, No Product with this ID in our Repository");
            }
        } catch (user.ProductException e) {
            java.lang.System.out.println(e);
        }
    }

    /**
     *
     *
     * @return the productList
     */
    public java.util.ArrayList<user.Product> getProductList() {
        System.out.println("Enter in the method getProductList from class Repository");
        return productList;
    }

    /**
     *
     *
     * @param productList
     * 		the productList to set
     */
    public void setProductList(java.util.ArrayList<user.Product> productList) {
        System.out.println("Enter in the method setProductList from class Repository");
        this.productList = productList;
    }

    public java.lang.String showAllProduct() {
        System.out.println("Enter in the method showAllProduct from class Repository");
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        for (user.Product p : this.productList) {
            builder.append(p.toString());
        }
        return builder.toString();
    }
}
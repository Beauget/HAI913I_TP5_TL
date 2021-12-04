package user;
public class Repository {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(Repository.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638619064780;

    public static logger.OurFormatter of;

    private java.util.ArrayList<user.Product> productList;

    public Repository() {
        ;
        this.productList = new java.util.ArrayList<user.Product>();
        of = new OurFormatter();
        		tx =  new FileHandler("loggingRepository.json");
        		
        		tx.setFormatter(of);
        		
        		LOGGER.addHandler(tx);;
    }

    /**
     *
     *
     * @param p
     * 		is added if no product with same id already exist
     * @throws ProductException
     * 		
     */
    public void addProduct(user.User u, user.Product p) throws user.ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"addProduct");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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
    public void removeProduct(user.User u, int ID) throws user.ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"removeProduct");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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
    public void fetchProduct(user.User u, int ID) throws user.ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"fetchProduct");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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

    public void updateProduct(user.User u, int ID, java.lang.String name, double price, java.lang.String date) throws user.ProductException {
        Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"updateProduct");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
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
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"getProductList");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        return productList;
    }

    /**
     *
     *
     * @param productList
     * 		the productList to set
     */
    public void setProductList(java.util.ArrayList<user.Product> productList) {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"setProductList");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        this.productList = productList;
    }

    public java.lang.String showAllProduct() {
        Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"showAllProduct");
        LogRecord rec = new LogRecord(Level.ALL,lps.toString());
        LOGGER.info(of.format(rec));;
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        for (user.Product p : this.productList) {
            builder.append(p.toString());
        }
        return builder.toString();
    }
}
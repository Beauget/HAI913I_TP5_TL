public class ProductException extends java.lang.Exception {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(ProductException.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638964630218;

    public static logger.OurFormatter of;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ProductException(java.lang.String s) {
        super(s);
        ;
          of = new OurFormatter();
                try {
                	tx =  new FileHandler("loggingRepository.json");
        		} catch (SecurityException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        		} catch (IOException e) {
        		// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
                		
                tx.setFormatter(of);
                		
                LOGGER.addHandler(tx);;
    }
}
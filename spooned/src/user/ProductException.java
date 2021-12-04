package user;
public class ProductException extends java.lang.Exception {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(ProductException.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638627320666;

    public static logger.OurFormatter of;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ProductException(java.lang.String s) {
        super(s);
        ;
        of = new OurFormatter();
        		tx =  new FileHandler("loggingRepository.json");
        		
        		tx.setFormatter(of);
        		
        		LOGGER.addHandler(tx);;
    }
}
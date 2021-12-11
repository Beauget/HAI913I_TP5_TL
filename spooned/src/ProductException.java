import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import logger.OurFormatter;
public class ProductException extends Exception {
    private static final Logger LOGGER = Logger.getLogger(ProductException.class.getName());

    public static FileHandler tx;

    private IOException e1639241310013;

    public static OurFormatter of;

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ProductException(String s) {
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
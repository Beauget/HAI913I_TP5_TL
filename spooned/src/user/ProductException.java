import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import logger.Lps;
import logger.OurFormatter;

public class ProductException extends java.lang.Exception {
    private static final java.util.logging.Logger LOGGER = Logger.getLogger(ProductException.class.getName());

    public static java.util.logging.FileHandler tx;

    private java.io.IOException e1638963177736;

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
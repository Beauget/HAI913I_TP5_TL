package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class OurFormatter extends Formatter {


    @Override
    public String format(LogRecord record) {
    	  return record.getMessage();
    }
    	
    	
    	//vas y hayaat donne tout
    	
    	/* ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(record);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(OurLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jsonInString;
            }*/
}

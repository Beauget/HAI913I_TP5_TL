package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class OurFormatter extends Formatter {

    	
    
	@Override
	public String getHead(Handler h) {
		return "[";
	}


    @Override
    public String format(LogRecord record) {
    	  return record.getMessage();
    }
   
    
    @Override
    public String getTail(Handler h) {
    	return "{}]";
    }
}

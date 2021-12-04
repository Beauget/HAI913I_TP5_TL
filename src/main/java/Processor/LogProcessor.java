package Processor;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import logger.Lps;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtParameter;

public class LogProcessor extends AbstractProcessor<CtExecutable<?>> {
	

	public void process(CtExecutable<?> element) {
		// TODO Auto-generated method stub
		
		CtCodeSnippetStatement log = getFactory().Core().createCodeSnippetStatement();
		
		StringBuilder logToAdd = new StringBuilder();
		
		List parameters = element.getParameters();
		
		if(!(imAConstructor(element))) {
		
			if(parameters.size() == 0) {
				logToAdd.append("Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"+ "\"" + element.getSimpleName() + "\""+");\r\n"
						+ "LogRecord rec = new LogRecord(Level.ALL,lps.toString());\r\n"
						+ "LOGGER.info(of.format(rec));");
			}
			else if(parameters.size() > 0){
					if(imAUserParameter(parameters.get(0))) {
						logToAdd.append("Lps lps = new Lps(u.toString(),this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis())),"+ "\"" + element.getSimpleName() + "\""+");\r\n"
								+ "LogRecord rec = new LogRecord(Level.ALL,lps.toString());\r\n"
								+ "LOGGER.info(of.format(rec));");
					}
					else {
						logToAdd.append("Lps lps = new Lps(this.getClass().toString(),String.valueOf(new Date(System.currentTimeMillis()))," + "\"" + element.getSimpleName() + "\"" +");\r\n"
								+ "LogRecord rec = new LogRecord(Level.ALL,lps.toString());\r\n"
								+ "LOGGER.info(of.format(rec));");
					}
				}
			}

		
		final String toAdd = logToAdd.toString();
		
		log.setValue(toAdd);
		
		
		if(element.getBody() != null) {
			element.getBody().insertBegin(log);
		}

	}

	
	
	public boolean imAConstructor(CtExecutable<?> toTest) {
		if(toTest.getClass().getSimpleName().equals("CtConstructorImpl")) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean imAUserParameter(Object p) {
			if(p.toString().equals("user.User u")) {
				return true;
			}
			else {
				return false;
			}
	}
	
	
	
}

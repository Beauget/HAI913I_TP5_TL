package Processor;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;

import logger.OurFormatter;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtConstructor;

public class SetupProcessor extends AbstractProcessor<CtConstructor<?>> {

	public void process(CtConstructor<?> element) {
		/**
		 * add initialize handler/formatter/
		 */
		
		String constructor = "  of = new OurFormatter();\r\n"
				+ "        try {\r\n"
				+ "        	tx =  new FileHandler(\"loggingRepository.json\");\r\n"
				+ "		} catch (SecurityException e) {\r\n"
				+ "		// TODO Auto-generated catch block\r\n"
				+ "					e.printStackTrace();\r\n"
				+ "		} catch (IOException e) {\r\n"
				+ "		// TODO Auto-generated catch block\r\n"
				+ "					e.printStackTrace();\r\n"
				+ "				}\r\n"
				+ "        		\r\n"
				+ "        tx.setFormatter(of);\r\n"
				+ "        		\r\n"
				+ "        LOGGER.addHandler(tx);";
		final CtCodeSnippetStatement constructorSnipper = getFactory().Code().createCodeSnippetStatement(constructor);
		element.getBody().addStatement(1, constructorSnipper);
		
	}

}

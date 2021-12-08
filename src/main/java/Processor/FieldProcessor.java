package Processor;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import logger.OurFormatter;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetExpression;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;

public class FieldProcessor extends AbstractProcessor<CtClass<?>> {


	@SuppressWarnings("unchecked")
	public void process(CtClass<?> element) {
		
		/**
		 * we need to add some stuff for every class (logger/consoleHandler/fileHandler)
		 */
		
		/**
		 * logger
		 */
		
		final CtTypeReference<Logger> logger = getFactory().Code().createCtTypeReference(Logger.class);
		final CtField<Logger> loggerField = getFactory().Core().<Logger>createField();
		final CtTypeReference<IOException> exception = getFactory().Code().createCtTypeReference(IOException.class);
		
		loggerField.setType(logger);
		loggerField.addModifier(ModifierKind.PRIVATE);
		loggerField.addModifier(ModifierKind.STATIC);
		loggerField.addModifier(ModifierKind.FINAL);
		loggerField.setSimpleName("LOGGER");
		
		
		String toAdd = "Logger.getLogger(" + element.getSimpleName() + ".class.getName())";
		
		final CtCodeSnippetExpression<Logger> toAddLogger = getFactory().Code().createCodeSnippetExpression(toAdd);
		loggerField.setDefaultExpression(toAddLogger);
		
		
		/**
		 * handler
		 */
		
		final CtTypeReference<FileHandler> handler = getFactory().Code().createCtTypeReference(FileHandler.class);
		final CtField<FileHandler> handlerField = getFactory().Core().<FileHandler>createField();
		
		handlerField.setType(handler);
		handlerField.addModifier(ModifierKind.PUBLIC);
		handlerField.addModifier(ModifierKind.STATIC);
		handlerField.setSimpleName("tx");
		
		
		/**
		 * ourFormatter
		 */
		
		final CtTypeReference<OurFormatter> formatter = getFactory().Code().createCtTypeReference(OurFormatter.class);
		final CtField<OurFormatter> formatterField = getFactory().Core().<OurFormatter>createField();
		
		formatterField.setType(formatter);
		formatterField.addModifier(ModifierKind.PUBLIC);
		formatterField.addModifier(ModifierKind.STATIC);
		formatterField.setSimpleName("of");
		
		/**
		 * IOException
		 */
		final CtField<IOException> exceptionField = getFactory().Core().<IOException>createField();
		exceptionField.<CtField>setType(exception);
		exceptionField.<CtField>addModifier(ModifierKind.PRIVATE);
		exceptionField.setSimpleName("e"+System.currentTimeMillis());

		
		element.addFieldAtTop(formatterField);
		element.addFieldAtTop(exceptionField);
		element.addFieldAtTop(handlerField);
		element.addFieldAtTop(loggerField);

	}


}

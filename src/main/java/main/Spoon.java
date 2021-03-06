package main;
import Processor.*;
import spoon.Launcher;

public class Spoon {
	public static void main(String[] args) {
		Launcher ourLauncher = new Launcher();
		
		ourLauncher.addInputResource("C:\\Users\\azent\\Desktop\\M2\\Evo-restru\\HAI913I_TP5_TL\\q1Testing\\src");
		ourLauncher.setSourceOutputDirectory("C:\\Users\\azent\\Desktop\\M2\\Evo-restru\\HAI913I_TP5_TL\\spooned\\src");
		ourLauncher.getEnvironment().setSourceClasspath(new String[] {
		"C:\\Users\\azent\\Desktop\\M2\\Evo-restru\\HAI913I_TP5_TL\\q1Testing\\bin" });
		ourLauncher.setBinaryOutputDirectory("C:\\Users\\azent\\Desktop\\M2\\Evo-restru\\HAI913I_TP5_TL\\spooned\\bin");
		ourLauncher.getEnvironment().setAutoImports(true);

		
		
		/*
		ourLauncher.addInputResource("/home/hayaat/Desktop/Master/M2/Git/HAI913I_TP5_TL/q1Testing/src");
		ourLauncher.setSourceOutputDirectory("/home/hayaat/Desktop/Master/M2/Git/HAI913I_TP5_TL/spooned/src");
		ourLauncher.getEnvironment().setSourceClasspath(new String[] {"/home/hayaat/Desktop/Master/M2/Git/HAI913I_TP5_TL/q1Testing/bin" });
		ourLauncher.setBinaryOutputDirectory("/home/hayaat/Desktop/Master/M2/Git/HAI913I_TP5_TL/spooned/src/bin");
		*/
		 
		FieldProcessor ourFieldProcessor = new FieldProcessor();
		SetupProcessor ourSetupProcessor = new SetupProcessor();
		LogProcessor ourLogProcessor = new LogProcessor();
		ourLauncher.addProcessor(ourFieldProcessor);
		ourLauncher.addProcessor(ourSetupProcessor);
		ourLauncher.addProcessor(ourLogProcessor);
		ourLauncher.run();
	}
	

}

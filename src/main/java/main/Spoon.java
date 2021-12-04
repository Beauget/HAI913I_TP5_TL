package main;
import Processor.*;
import spoon.Launcher;

public class Spoon {
	public static void main(String[] args) {
		Launcher ourLauncher = new Launcher();
		ourLauncher.addInputResource("C:\\Users\\beaug\\Desktop\\M2\\M2\\Evo-restru\\TP5\\HAI913I_TP5_TL\\q1Testing\\src");
		ourLauncher.setSourceOutputDirectory("C:\\Users\\beaug\\Desktop\\M2\\M2\\Evo-restru\\TP5\\HAI913I_TP5_TL\\spooned\\src");
		ourLauncher.getEnvironment().setSourceClasspath(new String[] {
		"C:\\Users\\beaug\\Desktop\\M2\\M2\\Evo-restru\\TP5\\HAI913I_TP5_TL\\q1Testing\\bin" });
		ourLauncher.setBinaryOutputDirectory("C:\\Users\\beaug\\Desktop\\M2\\M2\\Evo-restru\\TP5\\HAI913I_TP5_TL\\spooned\\bin");
		FieldProcessor ourFieldProcessor = new FieldProcessor();
		SetupProcessor ourSetupProcessor = new SetupProcessor();
		LogProcessor ourLogProcessor = new LogProcessor();
		ourLauncher.addProcessor(ourFieldProcessor);
		ourLauncher.addProcessor(ourSetupProcessor);
		ourLauncher.addProcessor(ourLogProcessor);
		ourLauncher.run();
	}
	

}

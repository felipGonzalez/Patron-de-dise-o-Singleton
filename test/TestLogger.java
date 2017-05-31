package test;

import model.*;

public class TestLogger {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		Logger logger1 = Logger.getInstance();
		System.out.println(logger);
		System.out.println(logger1);
		logger.setValue("soy yo");
		System.out.println(logger1.getValue());
		
	}
	
	
	
	
	
}

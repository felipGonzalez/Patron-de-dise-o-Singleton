package model;

public class Logger {

	private static Logger log;
	private String value;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(log == null){
			log = new Logger();
		}
		return log;
	}
	
	public void logMessage() {
		
		System.out.println("esta greado");
	}
	
	public void setValue(String msg){
		value = msg;
	}
	
	public String getValue() {
		return value;
	}
}

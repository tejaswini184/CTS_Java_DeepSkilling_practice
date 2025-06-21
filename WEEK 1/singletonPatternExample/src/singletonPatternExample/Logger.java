package singletonPatternExample;

public class Logger {
	//single object
	private static Logger instance = new Logger();
	//constructor
	private Logger() {
		System.out.println("Logger Initialized");
	}
	public static Logger getInstance() {
		return instance;	
	}
	public void print(String message) {
		System.out.println("Message: "+message);
	}

}

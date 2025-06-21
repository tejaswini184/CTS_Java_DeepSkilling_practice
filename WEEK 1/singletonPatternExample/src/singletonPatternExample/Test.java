package singletonPatternExample;

public class Test {
	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		logger1.print("Singleton Design Pattern");
		
		Logger logger2=Logger.getInstance();
		logger2.print("Implemented");
		
		if(logger1==logger2) {
			System.out.println("one instance used");
		}else {
			System.out.println("two instance used");
		}
	}

}

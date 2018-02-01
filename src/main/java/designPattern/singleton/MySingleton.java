package designPattern.singleton;

public class MySingleton {
	private static MySingleton mySingleton = new MySingleton();
	private MySingleton() {
		System.out.println("This is my Singleton private construction method.");
	}
	
	public static MySingleton getInstance() {
		return mySingleton;
	}
	
	public static void show() {
		System.out.println("My Singleton static show method.");
	}
	
}

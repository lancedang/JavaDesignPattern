package designPattern.singleton;

public class MyLazySingleton {

    private static MyLazySingleton myLazySingleton = null;

    private MyLazySingleton() {
        System.out.println("This is My LazySingleton construction method.");
    }

    public static synchronized MyLazySingleton getInstance() {
        if (myLazySingleton == null) {
            myLazySingleton = new MyLazySingleton();
        }
        return myLazySingleton;
    }

    public static void show() {
        System.out.println("My Lazy Singleton static show method.");
    }

}

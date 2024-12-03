package Singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    // Public method to get the instance, with synchronized keyword
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null) instance = new ThreadSafeSingleton();
        return instance;
    }
}

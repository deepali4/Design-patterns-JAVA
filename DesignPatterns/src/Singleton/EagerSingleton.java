package Singleton;

public class EagerSingleton {
    public static final  EagerSingleton instace = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton(){}

    // Public method to get the instance
    public EagerSingleton getInstace() {
        return  instace;
    }
}

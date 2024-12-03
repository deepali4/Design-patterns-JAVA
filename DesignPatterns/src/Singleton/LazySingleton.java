package Singleton;

public class LazySingleton {
    // The single instance, initially null
    private static LazySingleton intance ;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(intance == null) intance = new LazySingleton();
        return intance;
    }

}

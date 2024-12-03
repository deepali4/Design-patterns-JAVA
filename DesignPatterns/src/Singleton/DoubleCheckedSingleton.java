package Singleton;

public class DoubleCheckedSingleton {
    public static DoubleCheckedSingleton instance ;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        // First check (not synchronized)
        if(instance == null){
            synchronized (DoubleCheckedSingleton.class){
                if(instance == null)
                    instance = new DoubleCheckedSingleton();
            }
        }
        return  instance;
    }
}

package Singleton;

public enum EnumSingleton {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Singleton instance = Singleton.INSTANCE;
//        instance.showMessage();
//    }
//}

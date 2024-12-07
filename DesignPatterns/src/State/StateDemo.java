package State;

public class StateDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertMoney();
        vendingMachine.dispense();

        System.out.println("----");

        vendingMachine.insertMoney();
        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();
        vendingMachine.dispense();

        System.out.println("----");

        vendingMachine.insertMoney();
        vendingMachine.dispense();
        vendingMachine.ejectMoney();
    }
}

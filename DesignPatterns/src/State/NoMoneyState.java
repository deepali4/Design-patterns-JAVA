package State;

public class NoMoneyState implements State{

    @Override
    public void insertMoney(VendingMachine context) {
        System.out.println("Dollar inserted");
        context.setCurrentState(new HasMoneyState());
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("No money to return");
    }

    @Override
    public void dispense(VendingMachine context) {
        System.out.println("Payment required");
    }
}

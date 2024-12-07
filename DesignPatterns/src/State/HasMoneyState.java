package State;

public class HasMoneyState implements State{
    @Override
    public void insertMoney(VendingMachine context){
        System.out.println("Already have a dollar");
    }

    @Override
    public void dispense(VendingMachine context) {
        System.out.println("Releasing product");
        context.setCurrentState(new NoMoneyState());
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("Releasing product");
        context.setCurrentState(new NoMoneyState());
    }
}

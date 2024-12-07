package State;

public interface State {
    void insertMoney(VendingMachine context);
    void ejectMoney(VendingMachine context);
    void dispense(VendingMachine context);
}

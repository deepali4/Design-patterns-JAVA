package State;

public class VendingMachine {

    private State currentState;

    public VendingMachine(){
        this.currentState = new NoMoneyState();
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }
    public void insertMoney(){
        currentState.insertMoney(this);
    }
    public void ejectMoney(){
        currentState.ejectMoney(this);
    }
    public void dispense(){
        currentState.dispense(this);
    }
}

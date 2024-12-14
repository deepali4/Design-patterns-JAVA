package Decorator;

public class PepperonDecorator extends Decorator {

    public PepperonDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDiscription() {
        return decoratedPizza.getDiscription() + "+ pepper";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 50.0;
    }
}

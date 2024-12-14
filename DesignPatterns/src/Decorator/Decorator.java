package Decorator;

public abstract class Decorator implements Pizza {
    protected Pizza decoratedPizza;

    public Decorator(Pizza pizza){
        this.decoratedPizza =pizza;
    }

    @Override
    public String getDiscription() {
        return decoratedPizza.getDiscription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}

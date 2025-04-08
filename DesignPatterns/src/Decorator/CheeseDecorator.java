package Decorator;



public class CheeseDecorator implements Cloneable Decorator {

    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDiscription() {
        return decoratedPizza.getDiscription() + "+ chees";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost() + 100.0;
    }


}

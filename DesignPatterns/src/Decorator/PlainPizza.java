package Decorator;

public class PlainPizza implements Pizza {
    @Override
    public String getDiscription() {
        return "Pain Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}

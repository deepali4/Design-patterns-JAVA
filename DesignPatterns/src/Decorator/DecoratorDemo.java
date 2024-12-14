package Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getCost());

        pizza = new PepperonDecorator(pizza);
        System.out.println(pizza.getCost());
    }

}

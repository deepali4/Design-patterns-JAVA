package Prototype;

public class Client  {

    public static void main(String[] args) {
        Shape circle = new Circle(15);
        Shape clonedCircle = circle.clone();
        clonedCircle.setRadius(18);
    }
}

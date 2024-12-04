package AbstractFactory;

public class EuropeSpec implements CarSpecification{
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}

package AbstractFactory;

public class AmericanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new AmericanSpec();
    }
}

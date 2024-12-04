package AbstractFactory;

public class AbstractFactoryClient {

        public static void main(String[] args) {
            // Creating cars for North America
            CarFactory americanCarFactory = new AmericanCarFactory();
            Car northAmericaCar = americanCarFactory.createCar();
            CarSpecification northAmericaSpec = americanCarFactory.createCarSpecification();

            northAmericaCar.assemble();
            northAmericaSpec.display();

            // Creating cars for Europe
            CarFactory europeFactory = new EuropeCarFactory();
            Car europeCar = europeFactory.createCar();
            CarSpecification europeSpec = europeFactory.createCarSpecification();

            europeCar.assemble();
            europeSpec.display();
        }
}

package AbstractFactory;

public class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car.");
    }
}
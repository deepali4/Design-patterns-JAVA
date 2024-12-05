package Template;

public class SandwichMeal extends Meal{
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing bread, vegetables, and fillings.");
    }

    @Override
    protected void cook() {
        System.out.println("Assembling the sandwich.");
    }
}

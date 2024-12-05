package Template;

public class PastaMeal extends Meal{
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing pasta, sauce, and spices.");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking pasta and mixing it with sauce.");
    }
}

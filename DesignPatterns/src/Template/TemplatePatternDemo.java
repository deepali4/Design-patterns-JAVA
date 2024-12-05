package Template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        // Prepare a pasta meal
        Meal pastaMeal = new PastaMeal();
        System.out.println("Preparing Pasta Meal:");
        pastaMeal.prepareMeal();

        // Prepare a sandwich meal
        Meal sandwichMeal = new SandwichMeal();
        System.out.println("\nPreparing Sandwich Meal:");
        sandwichMeal.prepareMeal();
    }
}

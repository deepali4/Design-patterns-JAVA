package Template;

abstract class Meal {
        // Template method
        public final void prepareMeal() {
            prepareIngredients();
            cook();
            serve();
        }

        // Steps to be implemented by subclasses
        protected abstract void prepareIngredients();
        protected abstract void cook();

        // Common step
        private void serve() {
            System.out.println("Serving the meal.");
        }
}

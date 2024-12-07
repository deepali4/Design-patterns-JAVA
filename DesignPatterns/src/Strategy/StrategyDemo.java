package Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "786", "12/25"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "mypwd"));
        cart.checkout(200);

        cart.setPaymentStrategy(new BitCoinPayment("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2"));
        cart.checkout(300);
    }

}

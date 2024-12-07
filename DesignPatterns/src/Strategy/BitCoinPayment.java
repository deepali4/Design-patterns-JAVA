package Strategy;

public class BitCoinPayment implements PaymentStrategy{
    private String bitcoinAddress;

    public BitCoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Bitcoin");
    }
}

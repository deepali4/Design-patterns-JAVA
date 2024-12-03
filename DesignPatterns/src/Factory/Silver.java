package Factory;

public class Silver implements Subscription{
    @Override
    public String subscriptionType() {
        return "";
    }

    @Override
    public boolean addSubscription(Customer customer) {
        return false;
    }

    @Override
    public boolean removeSubscription(Customer customer) {
        return false;
    }

    @Override
    public boolean updateSubscription() {
        return false;
    }
}

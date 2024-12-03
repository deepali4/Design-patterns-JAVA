package Factory;

public class Customer {
    String customerId;
    Subscription subscription = null;

    public Customer(String customerId){
        this.customerId= customerId;
    }
    public void SubscribePlan(Subscription subscription){
        this.subscription= subscription;
        subscription.addSubscription(this);
    }
    public  void unSubscriptionPlan(Subscription subscription){
        this.subscription = subscription;
        subscription.removeSubscription(this);
    }
    public void updateSubscriptionPlan(Subscription subscription){
        subscription.removeSubscription(this);
        this.subscription = subscription;
        subscription.addSubscription(this);
    }

}

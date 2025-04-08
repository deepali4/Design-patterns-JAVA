package Factory;

public class SubscriptionsDemo {

    public static void main(String[] args) {
        SubscriptionFactory subscriptionFactory = new SubscriptionFactory();
        Subscription goldsubscription = subscriptionFactory.createSubscription("GOLD");
        Subscription platinumsubscription = subscriptionFactory.createSubscription("PLATINUM");
        Subscription silversubscription = subscriptionFactory.createSubscription("SILVER");

        Customer c1 = new Customer("1");
        Customer c2 = new Customer("2");

        c1.SubscribePlan(goldsubscription);

    }
}

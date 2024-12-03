package Factory;

public class SubscriptionFactory {
    public static final String GOLD = "GOLD";
    public static final String PLATINUM = "PLATINUM";
    public static final String SILVER = "SILVER";
    public Subscription createSubscription(String Type){
        if(Type==null || Type.isEmpty())
            return  null;
        else{
            switch (Type.toUpperCase()){
                case GOLD:
                    return new Gold();
                case PLATINUM:
                    return new Platinum();
                case SILVER:
                    return new Silver();
                default:
                    throw new IllegalArgumentException("Unknown Subscription Type received");
            }
        }
    }
}

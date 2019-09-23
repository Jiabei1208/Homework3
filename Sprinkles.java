public class Sprinkles extends ToppingsDecorator {
    private IceCream iceCream;

    public Sprinkles(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }

    public String toString() //implements method toString
    {
        return iceCream.toString()+"+ sprinkles";
    }

    public double getCost() //implements method getCost
    {
        return iceCream.getCost()+0.2;
    }
}

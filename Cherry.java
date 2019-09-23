public class Cherry extends ToppingsDecorator {
    private IceCream iceCream;

    public Cherry(IceCream iceCream)
    {
        this.iceCream=iceCream;
    }
    public String toString() //implements method toString
    {
        return iceCream.toString()+"+ a cherry on top";
    }
    public double getCost() //implements method toString
    {
        return iceCream.getCost()+0.4;
    }
}

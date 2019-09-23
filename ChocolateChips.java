public class ChocolateChips extends ToppingsDecorator {
   private IceCream iceCream;

   public ChocolateChips(IceCream iceCream)
   {
       this.iceCream=iceCream;
   }
   public String toString()
   {
       return iceCream.toString()+"+ chocolate chips "; //implements method toString
   }
   public double getCost()
   {
       return iceCream.getCost()+0.3; // implements method getCost
   }
}

package lab1.solution;

public class DiscountFifteenStrategy implements DiscountStrategy {

    private double percentage = 0.15;
   

    @Override
    public double getDiscountinDollars(double price) {
        return price * percentage;  
    }
}

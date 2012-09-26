package lab1.solution;

public class DiscountTenStrategy implements DiscountStrategy {

    private double percentage = 0.10;
 

    @Override
    public double getDiscountinDollars(double price) {
        return price * percentage;
    }
}

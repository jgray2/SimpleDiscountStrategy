
package lab1.solution;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double getDiscountinDollars(double price) {
        return 0;
        // no discount
    }
    
}

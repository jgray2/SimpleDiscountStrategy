/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author jgray2
 */
public class DiscountTenStrategy implements DiscountStrategy {

    private double percentage = 0.10;
 

    @Override
    public double getDiscountinDollars(double price) {
        return price * percentage;
    }
}

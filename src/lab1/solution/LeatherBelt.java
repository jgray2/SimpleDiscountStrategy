package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class LeatherBelt extends Product{
    

    public LeatherBelt() {
        
    }

    public LeatherBelt(String partName, String partNumber, double price,
            DiscountFifteenStrategy discount) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(discount);
    }
}

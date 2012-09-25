package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class Socks extends Product {

    
    public Socks() {
     
    }

    public Socks(String partName, String partNumber, double price, NoDiscountStrategy
            discount) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscountStrategy(discount);
    }
    
}

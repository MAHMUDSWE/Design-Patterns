 
package decoratorPattern;

/**
 *
 * @author Mahmud
 */
public class EspressoCoffee implements Food {
    double espressoCoffePrice = 150;
    @Override
    public String prepareFood() {
         return "Espresso";
    }

    @Override
    public double foodPrice() {
         return espressoCoffePrice;
    }
    
}

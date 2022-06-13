
package decoratorPattern;

/**
 * @author Mahmud
 */
public class EspressoCoffee implements Food {
    private double espressoCoffePrice = 150;

    @Override
    public String prepareFood() {
        return "Espresso";
    }

    @Override
    public double foodPrice() {
        return espressoCoffePrice;
    }

}

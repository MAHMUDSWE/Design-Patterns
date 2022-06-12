 
package decoratorPattern;

/**
 *
 * @author Mahmud
 */
public class CappuccinoCoffee implements Food {
    double CappucinoPrice = 90;
    @Override
    public String prepareFood()
    {
        return "Cappucino";
    }
    @Override
    public double foodPrice()
    {
        return CappucinoPrice;
    }
}

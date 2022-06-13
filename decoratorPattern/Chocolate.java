
package decoratorPattern;

/**
 * @author Mahmud
 */
public class Chocolate extends FoodDecorator {
    double chocolatePrice = 150;

    public Chocolate(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with extra chocolate";
    }

    @Override
    public double foodPrice() {
        return chocolatePrice;
    }
}

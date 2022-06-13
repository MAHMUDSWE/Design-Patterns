
package decoratorPattern;

/**
 * @author Mahmud
 */
public class Milk extends FoodDecorator {
    private double foodPrice = 50.0;

    public Milk(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with extra milk";
    }

    @Override
    public double foodPrice() {
        return foodPrice;
    }

}

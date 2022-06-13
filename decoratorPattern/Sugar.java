
package decoratorPattern;

/**
 * @author Mahmud
 */
public class Sugar extends FoodDecorator {
    private double sugarPrice = 30;

    public Sugar(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with extra sugar";
    }

    @Override
    public double foodPrice() {
        return sugarPrice;
    }

}

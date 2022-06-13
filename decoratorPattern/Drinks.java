package decoratorPattern;

/**
 * @author Mahmud
 */
public class Drinks implements Food {

    double nescafePrice = 15;

    @Override
    public String prepareFood() {
        hi();
        return "Nescafe";
    }

    @Override
    public double foodPrice() {
        return nescafePrice;
    }

    public void hi() {
        System.out.println("Hello");
    }


}

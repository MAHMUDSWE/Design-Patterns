package DiningDeecoratorPattern;

public class MashedPotatoes extends FoodDecorator {
    private double foodPrice = 5;

    public MashedPotatoes(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With extra Mashed Potatoes";
    }

    @Override
    public double foodPrice() {
        return foodPrice;
    }
}

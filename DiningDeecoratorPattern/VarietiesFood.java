package DiningDeecoratorPattern;

public class VarietiesFood implements Food {
    @Override
    public String prepareFood() {
        return "Varieties";
    }

    @Override
    public double foodPrice() {
        return 30;
    }
}

package strategyPattern;

/**
 *
 * @author Mahmud
 */
public class Nagad implements Gateway {

    @Override
    public int pay(int amount) {
        return amount;
    }
}

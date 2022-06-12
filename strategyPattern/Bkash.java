 
package strategyPattern;

/**
 *
 * @author Mahmud
 */
public class Bkash implements Gateway {
    @Override
    public int pay(int amount)
    {
        return amount;
    }
}

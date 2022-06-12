 
package strategyPattern;

/**
 *
 * @author Mahmud
 */
public class Card implements Gateway {
    
    @Override
    public int pay(int amount)
    {
        return amount;
    }
}

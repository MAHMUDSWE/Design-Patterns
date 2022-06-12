 
package strategyPattern;

/**
 *
 * @author Mahmud
 */
public class Context {
    private Gateway gateway;
    
    public Context(Gateway gateway)
    {
        this.gateway = gateway;
    }
    
    public int executeGateway(int amount)
    {
        return gateway.pay(amount);
    }
}

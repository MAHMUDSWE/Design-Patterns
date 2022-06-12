  
package decoratorPattern;

/**
 *
 * @author Mahmud
 */
public class BlackCoffee implements Food {
    double blackCoffeePrice = 10;
     
    @Override
    public String prepareFood()
    {
        return "Black_Coffee";
    }
    
    @Override
    public double foodPrice()
    {
        
        return blackCoffeePrice;
    } 
          
}


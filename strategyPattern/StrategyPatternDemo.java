 
package strategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mahmud
 */
public class StrategyPatternDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter amount to pay: ");
        int amount = Integer.parseInt(br.readLine());
        
        System.out.println("Press 1 to pay through bkash, 2 for card, 3 for Nagad.");
        System.out.print("press: ");
        
        int choose = Integer.parseInt(br.readLine());
        
        switch (choose) {
            case 1:
                Context context1 = new Context(new Bkash());
                System.out.println("Payment through Bkash = "+ context1.executeGateway(amount) + " done.");
                break;
            case 2:
                Context context2 = new Context((Gateway) new Card());
                System.out.println("Payment through Card = " + context2.executeGateway(amount) + " done.");
                break;
            default:
                Context context3 = new Context((Gateway) new Card());
                System.out.println("Payment through Nagad = " + context3.executeGateway(amount) + " done.");
                break;
        }
     
        
        
        
    }
}

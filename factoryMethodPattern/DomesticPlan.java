 
package factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class DomesticPlan extends Plan{

    @Override
    void getRate() {
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the bills per unit: ");
        try {
             billPerUnit = Double.parseDouble(br.readLine());
                        
        } catch (IOException ex) {
            Logger.getLogger(DomesticPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

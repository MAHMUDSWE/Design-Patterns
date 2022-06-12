 
package factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class CommercialPlan extends Plan {
    
    @Override
    public void getRate()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
             billPerUnit = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(CommercialPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

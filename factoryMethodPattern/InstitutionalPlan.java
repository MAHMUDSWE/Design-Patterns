 
package factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class InstitutionalPlan extends Plan {
    
    @Override
    public void getRate()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
             billPerUnit = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(InstitutionalPlan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

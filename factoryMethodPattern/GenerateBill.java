package factoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the plan for which the bill will be generated: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //String planName = br.readLine();
         
        System.out.println("1. for DomesticPlan");
        System.out.println("2. for CommercialPlan");
        System.out.println("3. for InstitutionalPlan");
        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(br.readLine());

        
        String planName = null;
        switch (choice) {
            case 1:
                planName = "DomesticPlan";
                break;
            case 2:
                 planName = "CommercialPlan";
                break;

            case 3:
                 planName = "InstitutionalPlan";
                break;
            default:
                break;
        }

        Plan p = planFactory.getPlan(planName);
        System.out.print("Enter the number of units for which the bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        //System.out.println("Bill amount for " + planName + " of "+units +" units is : ");
        p.getRate();

        p.calculateBill(units, planName);

    }
}

 
package factoryMethodPattern;

 
public abstract class Plan {
    
    protected double billPerUnit;
    abstract void getRate();
    
    public void calculateBill(int units, String planName)
    {
        System.out.print("Bill amount for " + planName + " of "+units +" units is : ");
        System.out.println(billPerUnit * units);
    }
}

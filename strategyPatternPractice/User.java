package strategyPatternPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first value: ");
        float num1 = Float.parseFloat(br.readLine());
        System.out.print("Enter the second value: ");
        float num2 = Float.parseFloat(br.readLine());

        Context context = new Context(new Addition());
        System.out.println("Addition = " + context.executeMethod(num1, num2));

        context = new Context(new Subtraction());
        System.out.println("Subtraction = " + context.executeMethod(num1, num2));

        context = new Context(new Multiplication());
        System.out.println("Multiplication = " + context.executeMethod(num1, num2));
    }
}

package abstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of the bank where you want to take loan from: ");
        String bankName = br.readLine();

        System.out.print("Enter the name of the loan you want to take: ");
        String loanName = br.readLine();

        Factory bankFactory = FactoryCreator.getFactory("BANK");
        Bank bank = bankFactory.getBank(bankName);
        Factory loanFactory = FactoryCreator.getFactory("LOAN");
        Loan loan = loanFactory.getLoan(loanName);

        System.out.println("You are taking loan from: " + bank.getBankName() + " and your loan type is " + loan.getLoanName());

        System.out.print("Enter the interest rate: ");
        double interestRate = Double.parseDouble(br.readLine());
        System.out.print("Enter the amount you want to take: ");
        double loanAmount = Double.parseDouble(br.readLine());
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());

        loan.getInterestRate(interestRate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}

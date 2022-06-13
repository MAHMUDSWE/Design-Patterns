package adapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCards {
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter bank Name: ");
            String bankName = br.readLine();

            System.out.print("Enter Bank account holder Name: ");
            String accHolderName = br.readLine();

            System.out.print("Enter Bank account Number: ");
            long accNumber = Long.parseLong(br.readLine());

            setBankName(bankName);
            setAccHolderName(accHolderName);
            setAccNumber(accNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getCreditCards() {
        String bankName = getBankName();
        String accHolderName = getAccHolderName();
        long accNumber = getAccNumber();

        return ("The Account number " + accNumber + " of " + accHolderName + " in " + bankName + "bank is valid and authenticated for issuing the credit card.");

    }
}

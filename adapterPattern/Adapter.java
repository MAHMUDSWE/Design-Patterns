package adapterPattern;

public class Adapter {
    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer();

        bankCustomer.giveBankDetails();
        String creditCards = bankCustomer.getCreditCards();

        System.out.println(creditCards);
    }
}

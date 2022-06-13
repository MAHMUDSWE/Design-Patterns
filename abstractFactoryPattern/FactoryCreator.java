package abstractFactoryPattern;

public class FactoryCreator {
    public static Factory getFactory(String choice) {

        if (choice.equalsIgnoreCase("BANK")) {
            return new BankFactory();
        } else if (choice.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }
        return null;
    }
}

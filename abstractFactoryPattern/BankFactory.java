package abstractFactoryPattern;

public class BankFactory extends Factory {
    @Override
    Bank getBank(String bank) {

        if (bank == null) {
            return null;
        } else if (bank.equalsIgnoreCase("SONALI")) {
            return new SONALI();
        } else if (bank.equalsIgnoreCase("JANA_TA")) {
            return new JANA_TA();
        } else if (bank.equalsIgnoreCase("AGRANI")) {
            return new AGRANI();
        }
        return null;
    }

    @Override
    Loan getLoan(String Loan) {
        return null;
    }
}

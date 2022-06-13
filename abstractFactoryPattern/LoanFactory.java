package abstractFactoryPattern;

public class LoanFactory extends Factory {
    @Override
    Bank getBank(String bank) {
        return null;
    }

    @Override
    Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        } else if (loan.equalsIgnoreCase("HOME lOAN")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("BUSINESS lOAN")) {
            return new BusinessLoan();
        } else if (loan.equalsIgnoreCase("EDUCATIONAL lOAN")) {
            return new EducationalLoan();
        }
        return null;
    }
}

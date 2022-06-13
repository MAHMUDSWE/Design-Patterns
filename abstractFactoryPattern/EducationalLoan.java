package abstractFactoryPattern;

public class EducationalLoan extends Loan{
    @Override
    String getLoanName() {
        return "EducationalLoan";
    }

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}

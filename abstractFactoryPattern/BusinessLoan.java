package abstractFactoryPattern;

public class BusinessLoan extends Loan{
    @Override
    String getLoanName() {
        return "BusinessLoan";
    }

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}

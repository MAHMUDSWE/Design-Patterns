package abstractFactoryPattern;

public class HomeLoan extends Loan{

    @Override
    String getLoanName() {
        return "HomeLoan";
    }

    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}

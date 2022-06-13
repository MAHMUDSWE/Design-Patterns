package abstractFactoryPattern;

public abstract class Factory {
    abstract Bank getBank(String bank);
    abstract Loan getLoan(String loan);
}

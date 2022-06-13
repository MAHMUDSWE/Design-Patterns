package abstractFactoryPattern;

public class SONALI implements Bank{
    private final String bankName;

    public SONALI() {
        bankName = "SONALI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

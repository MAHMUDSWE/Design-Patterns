package abstractFactoryPattern;

public class AGRANI implements Bank{
    private final String bankName;
    public AGRANI() {
        bankName = "AGRANI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

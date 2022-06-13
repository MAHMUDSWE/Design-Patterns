package abstractFactoryPattern;

public class JANA_TA implements Bank{
    private final String bankName;
    public JANA_TA() {
        bankName = "JANA_TA BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}

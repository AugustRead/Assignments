package Task2;

public class CalculateVAT {

    private int PRCVAT;

    public CalculateVAT(int PRCVAT) {
        this.PRCVAT = PRCVAT;
    }

    public double doVAT(double number) {
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}

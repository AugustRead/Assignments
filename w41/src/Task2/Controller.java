package Task2;

public class Controller {

    private Dialog dialog;
    private View view;
    private CalculateVAT VAT;
    private String MSG;

    public Controller() {
        this.dialog = new Dialog();
        this.view = new View("Kr");
        this.VAT = new CalculateVAT(25);
        MSG = "MOMS";
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = VAT.doVAT(userIn);
        view.doView(moms,MSG);
    }
}

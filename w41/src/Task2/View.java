package Task2;

public class View {

    private String CURRENCY;

    public View(String CURRENCY){
        this.CURRENCY = CURRENCY;
    }


    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,typeOfResult);
    }
}

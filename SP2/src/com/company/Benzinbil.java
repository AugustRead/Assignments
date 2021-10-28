package com.company;

public class Benzinbil extends Bil{

    private float oktantal;
    private float kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, float oktantal, float kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }
    public float getOktantal() {
        return oktantal;
    }

    public void setOktantal(float oktantal) {
        this.oktantal = oktantal;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                ", regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                '}';

    }

    @Override
    double beregnGrønEjerafgift() {
        if(kmPrL < 5){
            return 10470;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return 5500;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return 2340;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return 1050;
        }
       return 330;
    }
}

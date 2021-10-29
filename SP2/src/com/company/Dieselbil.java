package com.company;

public class Dieselbil extends Bil{

    private boolean harPartikelfilter;
    private float kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, float kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL =kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }

    @Override
    double beregnGrønEjerafgift() {


     double total = harPartikelfilter ? 1000:0;

        if(kmPrL < 5){
            return total +10470+15260;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            return total+5500+2770;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            return total+2340+1850;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            return total+1050+1390;
        }
        return total+330+130;
    }
}

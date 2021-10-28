package com.company;

public class Elbil extends Bil {

    private float batterikapacitetKwh;
    private int maxKm;
    private float whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, float batterikapacitetKwh, int maxKm, float whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKwh = batterikapacitetKwh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public float getBatterikapacitetKwh() {
        return batterikapacitetKwh;
    }

    public void setBatterikapacitetKwh(float batterikapacitetKwh) {
        this.batterikapacitetKwh = batterikapacitetKwh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(float whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "regNr=" + regNr +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", årgang=" + årgang +
                ", antalDøre=" + antalDøre +
                ", batterikapacitetKwh=" + batterikapacitetKwh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
    @Override
    double beregnGrønEjerafgift() {

        float kmPrL = (float) (100/(whPrKm/91.25));

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

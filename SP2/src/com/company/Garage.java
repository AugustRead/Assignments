package com.company;

import java.util.ArrayList;

public class Garage {

    private String navn;
    private ArrayList<Bil> biler;

    public Garage(String navn) {
        this.navn = navn;
        this.biler = new ArrayList<>();
    }

    public void tilføjBilTilGarage(Bil bil) {
        biler.add(bil);
    }


    @Override
    public String toString() {
        String s = "";
        s += navn + " har følgende biler parkeret: ";
        for (Bil bil : biler) {
            s += "\n" + bil + "\n";
        }
        return s;
    }

    public void beregnGrønAfgiftForBilpark(){

        double samletAfgift = 0;

        for (Bil bil : biler) {

            samletAfgift += bil.beregnGrønEjerafgift();

        }

        System.out.println("Den samlede ejerafgift på bilerne er: "+samletAfgift+",-");
    }
}




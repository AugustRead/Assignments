package com.company;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage("August's garage");

        Bil benzinbil = new Benzinbil(123, "BMW", "Z4", 2021, 3, 20, 74);
        Bil elbil  = new Elbil(1234, "Volvo", "XC40 Recharge", 2022, 5, 78,340, 220);
        Bil dieselbil = new Dieselbil(12345, "Skoda", "Octavia", 2004, 5, true, 4);

        //green tax for each car seperately.
        System.out.println("Ejerafgiften på din benzinbil er beregnet til at være: "+benzinbil.beregnGrønEjerafgift()+",-");
        System.out.println("Ejerafgiften på din elbil er beregnet til at være: "+elbil.beregnGrønEjerafgift()+",-");
        System.out.println("Ejerafgiften på din dieselbil er beregnet til at være: "+dieselbil.beregnGrønEjerafgift()+",-");

        garage.tilføjBilTilGarage(benzinbil);
        garage.tilføjBilTilGarage(elbil);
        garage.tilføjBilTilGarage(dieselbil);

        //list of cars parked in the garage.
        System.out.println("\n"+garage.toString());

        //total green tax for all cars in the garage.
        garage.beregnGrønAfgiftForBilpark();

    }
}
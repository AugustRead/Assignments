package Task1;
/*
FORMÅL: At kunne redesigne ved at skifte standard datatyper ud med egne klasser
OPGAVEN: Der er fem delopgaver.
1) I main skal man lave et hundeobjekt med navn og ejer
2) Skriv en klasse, Dog med en boolean attribut - isHungry - som skal initialiseres til true.
Lav en metode - feedDog - som tager hensyn til om hunden er sulten.
Husk at sætte isHungry til false, når den er blevet fodret.
3) Modificér hunde-klassen så den kan få hvalpe. Dvs indfør en attribut a la:
private ArrayList<String> offSpring;
Konstruktøren skal initialisere offSpring.
4) Tilføj nu en getter og en setter. Setter-metoden skal sørge for at fylde
offSpring til Dog klassen.
5) Modificer  Dog klassen så ejeren ikke længere er type String men typen Owner
(som altså er en klasse der skal laves fra bunden). Dvs flg skal skiftes:
private String ejer;
så det bliver til:
private Owner ejer;
Når det er ændret vil man også skulle ændre i getter og setter samt i main.
Flg skal kunne virke fra main:
System.out.println("hunden " + getDogName() + " er ejet af " + myDog.getOwner());
6) Gør det samme for offSpring. Dvs
private ArrayList<String> offSpring; bliver til
private ArrayList <Dog> offSpring;
7) lav en metode der kan printe navnene på en hund's hvalpe.
*/
import java.util.ArrayList;
import java.util.Arrays;

public class DogKennel {

    public static void main(String[] args) {


        Owner owner = new Owner("August");

        Dog myDog = new Dog("Woodie", owner);


        Dog offSpring1 = new Dog("Fuddi", owner);
        Dog offSpring2 = new Dog("Ludwig", owner);


        ArrayList<Dog> offsprings = new ArrayList<>(Arrays.asList(offSpring1, offSpring2));
        myDog.setOffSpring(offsprings);

        printOffspring(myDog);
        System.out.println();

        System.out.println("min hund er ejet af " + myDog.getOwner());

        myDog.feedDog();
        myDog.feedDog();


    }

    public static void printOffspring(Dog dog) {
        System.out.println(dog.getName() + "'s offsprings are: ");
        for (Dog dogs : dog.getOffSpring()) {
            System.out.println(dogs.getName());
        }
    }
}

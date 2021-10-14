package Task1;

import java.util.ArrayList;

public class Dog {

    private String dogName;
    private Boolean isHungry;
    private Owner owner;
    private ArrayList<Dog> offSpring;

    public Dog(String dogName, Owner owner) {
        this.dogName = dogName;
        this.owner = owner;
        this.isHungry = true;
        this.offSpring = new ArrayList<>();
    }

    public void setOwner(Owner owner) {

        this.owner = owner;
    }

    public void feedDog() {
        if (isHungry) {
            System.out.println(dogName+" take some food");
            isHungry = false;
        } else {
            System.out.println(dogName+" is not hungry");
        }


    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(ArrayList<Dog> offSpring) {
        this.offSpring = offSpring;
    }


    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return dogName;
    }


}
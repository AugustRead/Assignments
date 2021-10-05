package Task3;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main (String[] args) {



        customers.add(new Customer("August", "Rathsach", "AugustR"));
        customers.add(new Customer("Mette", "Vin Poulsen", "MVP"));
        customers.add(new Customer("Lars", "Tyndskidsmark", "Herharmanikkelysttilatvære"));
        customers.add(new Customer("Hans", "Hänsel", "HH"));
        customers.add(new Customer("Grete", "Gretel", "GG"));
        customers.add(new Customer("Peter", "Pan", "PP"));

        printCustomers();
    }

    static void printCustomers() {

        for(Customer customer : customers) {
            System.out.println(customer.toString());
        }

    }

}

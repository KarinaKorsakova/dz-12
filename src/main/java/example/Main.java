package example;

public class Main {

    public static void main(String[] args) {

        Man ivan = new Man("Ivan", "Ivanov", 65);
        Woman anna = new Woman("Anna", "Petrenko", 59);

        System.out.println(ivan.getFirstName() + " " + ivan.getLastName() + " and " + anna.getFirstName() + " " + anna.getLastName() + " meet each other");

        System.out.println(ivan.getFirstName() + " is retired = " + ivan.isRetired() );
        System.out.println(anna.getFirstName() + " is retired = " + anna.isRetired() );

        ivan.registerPartnership(anna);

        // print partnership information
        System.out.println(ivan.getFirstName() + " " + ivan.getLastName() + " and " + anna.getFirstName() + " " + anna.getLastName() + " are partners");

        // deregister partnership between man and woman
        ivan.deregisterPartnership(true);

        // print partnership information
        System.out.println(ivan.getFirstName() + " " + ivan.getLastName() + " and " + anna.getFirstName() + " " + anna.getLastName() + " are not a partners");
    }
}

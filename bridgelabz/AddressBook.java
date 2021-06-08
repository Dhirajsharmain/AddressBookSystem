package bridgelabz;

import bridgelabz.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * this is the main method, Here is the starting point of the program.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program");
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        boolean isExit = false;

        while (!isExit) {
            System.out.println("\n\t\tAddress Book System");
            System.out.println("\n\t\tEnter 1 to Add Person ");
            System.out.println("\t\tEnter 2 to Delete Person");
            System.out.println("\t\tEnter 3 to Edit Person");
            System.out.println("\t\tEnter 4 to Show Person Detail");
            System.out.println("\t\tEnter 5 to Quit ");
            System.out.print("\t\tPlease Select One Option : ");
            //char userInput = scanner.nextLine().toUpperCase().charAt(0);
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    //add
                    System.out.print("Enter First Name : ");
                    person.setFirstName(scanner.next());
                    System.out.print("Enter Last Name : ");
                    person.setLastName(scanner.next());
                    System.out.print("Enter Address : ");
                    scanner.nextLine();
                    person.setAddress(scanner.nextLine());
                    System.out.print("Enter City : ");
                    person.setCity(scanner.next());
                    System.out.print("Enter ZipCode : ");
                    person.setZip(scanner.next());
                    System.out.print("Enter State : ");
                    person.setState(scanner.next());
                    System.out.print("Enter Mobile Number : ");
                    person.setMobileNumber(scanner.next());
                    personList.add(person);
                    break;
                case 4:
                    //Show
                    System.out.println("\n\t\t"+personList.get(personList.size() - 1).toString());
                    break;
                case 5:
                    //Show
                    isExit = true;
                    break;
                default:
                    System.out.println("Please select correct option");
            }
        }

    }
}

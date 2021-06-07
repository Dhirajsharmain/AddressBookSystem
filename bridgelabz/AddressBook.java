package bridgelabz;

import bridgelabz.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * this is the main method, Here is the starting point of the program.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program");

        List<Person> personList = new ArrayList<>();
        boolean isExit = false;
        int userInput = 0;
        while (!isExit) {
            userInput = scanner.nextInt();
        }
            switch (userInput){
                case 1:
                    //add
                    Person person = new Person();
                    System.out.print("Enter First Name : ");
                    personList.add(person);
                    person.setFirstName(scanner.next());
                    break;
                case 2:
                    //delete
                    break;
                default:
                    System.out.println("Please select correct option");
            }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor to initialize name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for isDog
    public boolean isDog() {
        return isDog;
    }

    // toString method to print the animal details
    @Override
    public String toString() {
        return "Animal Name: " + name + ", Is Dog: " + (isDog ? "Yes" : "No");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the animal (or press Enter to finish):");
            String name = scanner.nextLine();

            // Break the loop if the user enters nothing
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is this animal a dog? (true/false):");
            boolean isDog = scanner.nextBoolean();
            scanner.nextLine(); // Consume the newline character left by nextBoolean()

            // Create a new Animal object and add it to the list
            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        // Print the details of all animals in the list
        System.out.println("List of animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}


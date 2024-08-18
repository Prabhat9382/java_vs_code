import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // this will create a scanner object and will take the input from the user and will store it in the scanner variable and system.in is the input stream and it is used to take the input from the user
        try {
            System.out.println("What is your name? ");
            String name = scanner.nextLine();
            System.out.println("How old are you? ");
            int age = 0;
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // this will just clear the scanner
            } else {
                System.out.println("Invalid input for age. Please enter an integer.");
                return;
            }
            System.out.println("What is your favorite food? ");
            String food = scanner.nextLine();

            System.out.println("Hello " + name);
            System.out.println("You are " + age + " years old");
            System.out.println("You like " + food);
        }
        finally {
            scanner.close();
        }
    }
}
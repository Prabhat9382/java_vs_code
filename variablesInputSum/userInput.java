import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        int age = input.nextInt();
        System.out.println("You are " + age + " years old");
        input.close();
    }
}

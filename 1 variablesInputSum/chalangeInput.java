import java.util.Scanner;
public class chalangeInput {
    public static void main(String[] args){
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to JAVA coding.");

        System.out.print("Enter your math marks: ");
        int mathMarks = input.nextInt();
        System.out.print("Enter you science marks: ");
        int scienceMarks = input.nextInt();

        int total = mathMarks + scienceMarks;
        System.out.println("Total marks: " + total);
        input.close();
    }
}

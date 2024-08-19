import java.util.Scanner;
public class Relational_LogicalOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you Male or not: ");
        Boolean isMale = input.nextBoolean();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age <= 5){
            System.out.println("can have a discount of 75%.");
        } else if (age > 60 && !isMale){ //here NOT operator is used;
            System.out.println("can have a discount of 25%.");
        }else if (!isMale){
            System.out.println("can have a discount of 50%.");
        } else {
            System.out.println("Paisa dena padega vau :)");
        }
        input.close();
    }
}
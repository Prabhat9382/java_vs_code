import java.util.Scanner;
public class if_else {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Is a male or not...: ");
        boolean isMale = input.nextBoolean();
        String name = "Kajal";
        if(isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Ms. " + name);
        }
        input.close();

        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;

        if(isSeniorCitizen){
            System.out.print("He is a senior citizen.");
        } else if(isAnAdult){
            System.out.print("He is an adult.");
        } else {
            System.out.print("He is a child.");
        }
    }
}

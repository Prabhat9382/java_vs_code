import java.util.Scanner;
public class posNeg_oddEven_biggestNum_leapYear_marksGrades_PeopleAge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Select your operation: ");
        int p = input.nextInt();
        switch(p) {
            case 1: System.out.println("Checking if the number is positive or negative...");
                System.out.print("Enter a number: ");
                int n = input.nextInt();
                if(n > 0) {
                    System.out.println(n + " is a positive number");
                } else if(n < 0) {
                    System.out.println(n + " is a negative number");
                } else {
                    System.out.println(n + " is neither positive nor negative");
                }
                break;
            case 2: System.out.println("Checking if the number is even or odd...");
                int m = input.nextInt();
                if(m % 2 == 0) {
                    System.out.println(m + " is an aven number");
                } else {
                    System.out.println(m + " is an odd number");
                }
                break;
            case 3: System.out.println("Checking which is the biggest number...");
                System.out.print("Enter three numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();
                if(a >= b && b >= c){
                    System.out.println(a + " is the biggest number");
                } else if(b >= a && b >= c) {
                    System.out.println(b + " is the biggest number");
                } else {
                    System.out.println(c + " is the biggest number");
                }
                break;
            case 4: System.out.println("Checking if the year is leap year or not...");
            System.out.print("Enter the year: ");
                int year = input.nextInt();
                if((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
                break;
            case 5: System.out.println("Grades for marks...");
                System.out.print("Enter your marks: ");
                int marks = input.nextInt();
                System.out.print("You have got ");
                if (marks >= 0 && marks <= 100){
                    if(marks <= 30){
                    System.out.println("Grade F");
                    } else if(marks > 30 && marks <= 60){
                        System.out.println("Grade D");
                    } else if(marks > 60 && marks <=  75){
                        System.out.println("Grade C");
                    } else if(marks > 75 && marks <= 90){
                        System.out.println("Grade B");
                    } else {
                        System.out.println("Grade A");
                    }
                } else {
                    System.out.println("Enter right marks.");
                }
                break;
            case 6: System.out.println("Catergotrize a person into different age groups...");
                System.out.print("Enter your age: ");
                int age = input.nextInt();
                System.out.print("You are ");
                if(age > 0 && age < 13){
                    System.out.print("a child");
                } else if(age >= 13 && age < 20){
                    System.out.print("a Teen");
                } else if(age >= 20 && age < 60) {
                    System.out.print("an Adult");
                } else if(age >= 60) {
                    System.out.print("a Senior");
                } else {
                    System.out.print("messed");
                }
                break;
        }
        input.close();
    }
}

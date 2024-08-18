import java.util.Scanner;
public class calculator_productFloatingNumbers_perimeterOfRectangle_areaTriangle_simpleInterest_compoundInterest_fahrenheitToCelsius {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.err.print("prefer your operation: ");
        int n = input.nextInt();
        switch(n){
            case 1: System.out.println("Printing calculator...");
                System.out.print("Enter two numbers: ");
                int a = input.nextInt();
                System.out.print("Enter another number: ");
                int i = input.nextInt();
                System.out.println("a + b = " + (a+i));
                break;
            
            case 2: System.out.println("Printing the Product of two floating point numbers...");
                System.out.print("Enter two floating point numbers: ");
                float c = input.nextFloat();
                float d = input.nextFloat();
                System.out.println("c * d = " + (c*d));
                break;

            case 3: System.out.println("Perimeter of a rectangle...");
                System.out.print("Enter the sides of the the rectangle in meter: ");
                int e = input.nextInt();
                int f = input.nextInt();
                int g = input.nextInt();
                int j = input.nextInt();
                System.out.print("The perimeter of the rectangle is: " + (e+f+g+j) + "m");
                break;

            case 4: System.out.println("Area of a triangle...");
                System.out.print("Enter base: ");
                float b = input.nextFloat();
                System.out.print("Enter height: ");
                float h = input.nextFloat();
                System.out.println("Area of the triangle is: " + (0.5*b*h) + "m^2");
                break;

            case 5: System.out.println("Simple interest...");
                System.out.print("Enter p: ");
                int p = input.nextInt();
                System.out.print("Enter t: ");
                int t = input.nextInt();
                System.out.print("Enter r: ");
                int r = input.nextInt();
                System.out.println("Simple interest is: " + (p*t*r/100));
                break;

            case 6: System.out.println("Compound interest...");
                System.out.print("Enter q:");
                int P = input.nextInt();
                System.out.print("Enter r: ");
                int R = input.nextInt();
                System.out.print("Enter t:");
                int T = input.nextInt();
                System.out.print("Compound interest is: " + (P*(1 + (R*0.01))*T));
                break;

            case 7: System.out.println("Fahrenheit to Celsius...");
                System.out.print("Enter temperature in Fahrenheit: ");
                float fahrenheit = input.nextFloat();
                System.out.println("Temperature in Celsius is: " + ((fahrenheit - 32)*5/9));
                break;
        }
        input.close();
    }
    
}

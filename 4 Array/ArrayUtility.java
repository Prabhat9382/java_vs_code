import java.util.Scanner;
public class ArrayUtility {
    public static int[] ScanningArray(){
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size]; // Initialize the array with size n
        System.out.println("Enter the elements: ");

        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        //ekhane input.close() dile onno java file a eta use korle...
        //...jodi eta use korar por input.nextInt() dile error dekhabe.
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows; i++){ // row-wise input nebe
            for(int j = 0; j < cols; j++){
                System.out.print("The element at row " + (i+1) + " & column " + (j+1) + " : ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    public static void display2DArray(int[][] array, int rows, int cols){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }// row-wise print hobe
    }
    
}

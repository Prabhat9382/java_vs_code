import java.util.Scanner;
class SearchElement_in2Darray {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Create a 2D array...");
        int arr[][] = ArrayUtility.input2DArray();

        ArrayUtility.display2DArray(arr, arr.length, arr[0].length );
        System.out.print("Enter the search element: ");
        int k = input.nextInt();
        input.close();
        isFound(arr, arr.length, arr[0].length, k);
    }
    public static void isFound(int[][] arr, int r, int c, int key){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] == key){
                    System.out.println("Element found at row " + (i+1) + " & column " + (j+1));
                    return;
                }
            }
        }
        System.out.println("Element not found!");
    }

}

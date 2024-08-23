import java.util.Scanner;

class OccurrencesOfAnElement_inAnArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = ArrayUtility.ScanningArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();

        input.close();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        // Print the result
        System.out.println("Number of occurrences of " + num + ": " + count);
    }
    
}

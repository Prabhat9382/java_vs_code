import java.util.Scanner;
class NewArray_withoutSpecificElement {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Return a new Array deleting a specific element from an existing Array...");
        int arr[] = ArrayUtility.ScanningArray();
        System.out.println("Before deleting the element...");
        ArrayUtility.displayArray(arr);
        System.out.print("\nEnter the element to delete: ");
        int key = input.nextInt();
        input.close();
        int[] brr = deleteElement(arr, key);
        System.out.println("After deleting the element...");
        ArrayUtility.displayArray(brr);
    }
    public static int[] deleteElement(int[] a, int k){
        int[] brr = new int[a.length-1];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == k){
                continue;
            }
            brr[index++] = a[i];
        }
        return brr;
    }
    
}

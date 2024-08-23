class ReverseAnArray {

    public static void main(String[] args){

        int[] arr = ArrayUtility.ScanningArray();
        System.out.println("Before reversing the array...");
        ArrayUtility.displayArray(arr);
        reverseArray(arr);
        System.out.println("After reversing the array...");
        ArrayUtility.displayArray(arr);
    }
    public static void reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            swapArray(arr, i);
        }
    }
    public static void swapArray(int[] array, int i){
        int temp = array[i];
        array[i] = array[array.length-i-1];
        array[array.length-i-1] = temp;
    }
    /* Direct Array Modification: The swapArray method takes the array and an index i as parameters. It swaps the elements at positions i and array.length - i - 1 directly within the array.
Correct Swapping: By using the array reference and indices, the method modifies the actual elements of the array, not just local copies. This ensures that the changes are reflected in the original array. */

    /**public static void swapArray(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }*/
    /* Local Variables: In the swapArray method, a and b are local variables. When you pass arr[i] and arr[arr.length-i-1] to swapArray, the values are copied into a and b. Any changes to a and b do not affect the original array elements.
No Effect on Array: The swapArray method swaps the values of a and b, but since these are just local copies, the original array remains unchanged.*/ 

    
}

class arrayPalindromeOrNot {

    public static void main(String[] args){

        int[] a = ArrayUtility.ScanningArray();
        System.out.println("Printing the array: ");
        ArrayUtility.displayArray(a);

        if(isPalindrome(a)){
            System.out.println("The array is Palindrome.");
        } else {
            System.out.println("The array is not Palindrome.");
        }
    }
    public static boolean isPalindrome(int[] array){
        
        for(int i = 0; i < array.length/2; i++){
            if(array[i] != array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }
    
}

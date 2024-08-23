class Array_SortedOrNot {
    
    public static void main(String[] args){
        int[] arr = ArrayUtility.ScanningArray();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        if(isInc || isDec){
            System.out.println("\nArray is sorted");
        } else {
            System.out.println("\nArray is not sorted");
        }
    }
    public static boolean isIncreasing(int[] array){

        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDecreasing(int[] array){

        for(int i = 0; i < array.length-1; i++){
            if(array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }       
}

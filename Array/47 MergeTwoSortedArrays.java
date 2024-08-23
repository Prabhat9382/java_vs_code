class MergeTwoSortedArrays {
    
    public static void main(String[] args){

        System.out.println("Enter the first Sorted array...");
        int[] arr = ArrayUtility.ScanningArray();
        System.out.println("Enter the second Sorted array...");
        int[] brr = ArrayUtility.ScanningArray();
        int[] crr = merge(arr, brr);
        System.out.println("The Merged Sorted array is...");
        ArrayUtility.displayArray(crr);
    }
    public static int[] merge(int[] a, int[] b){
        int newSize = a.length + b.length;
        int[] c = new int[newSize];

        int i = 0, j = 0, k = 0;
        while(i < a.length || j < b.length){

            if(j == b.length || (i < a.length && a[i] < b[j])){
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        return c;
    }
}

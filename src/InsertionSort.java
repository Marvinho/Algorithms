import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a, int n){
        for(int i=1;i<n;i++){
            int value = a[i];
            int j = i;
            while(j > 0 && value<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=value;
        }
    }
    public static void main(String [ ] args)
    {
        int[] arr = {3,8,5,4,1,9,-2};
        int n = arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}

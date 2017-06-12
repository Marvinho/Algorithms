import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a, int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int value = a[i];
            a[i] = a[min];
            a[min]=value;
        }
    }
    public static void main(String [ ] args)
    {
        int[] arr = {3,8,5,4,1,9,-2};
        int n = arr.length;
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}

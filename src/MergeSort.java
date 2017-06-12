import java.util.Arrays;

public class MergeSort {
   // int[] a = {3,8,5,4,1,9,-2};
    public static void mergeSort(int[] a,int[] b, int low, int high) {
        if (low == high) {
            return;
        }
        int middle = low+ (high-low) / 2;
        mergeSort(a,b,low, middle);
        mergeSort(a,b,middle + 1, high);
        merge(a, b , low, middle, high);
    }

    public static void merge(int[] a,int[] b, int low, int middle, int high) {
        System.arraycopy(a, low, b, low, high + 1 - low);
        int k = low;
        int i = low;
        int j = middle+1;
        while(i<= middle && j<= high){
            if(b[i]<b[j]){
                a[k]= b[i];
                i++;
            }
            else{
                a[k]=b[j];
                j++;
            }
            //System.out.println(a[k]);
            k++;
        }
        while(i<=middle){
            a[k]=b[i];
            i++;
            k++;
        }
    }
    public static void main(String [ ] args)
    {
        int[] arr = {3,8,5,4,1,9,-2};
        int n = arr.length-1;
        int [] b = new int[n+1];
        mergeSort(arr,b,0,n);
        System.out.println(Arrays.toString(arr));
    }
}
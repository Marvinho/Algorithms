import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            boolean flag = true;
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int value=a[j+1];
                    a[j+1]=a[j];
                    a[j]=value;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static void main(String [ ] args)
    {
        int[] arr = {3,8,5,4,1,9,-2};
        int n = arr.length;
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}

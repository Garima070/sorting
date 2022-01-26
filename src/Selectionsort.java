import java.util.*;
public class Selectionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[]{5,6,4,7,2,76};
        int small;
        for (int i = 0; i < arr.length; i++) {
             small=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]>arr[j])
                    small=j;
            }
            int t=arr[small];
            arr[small]=arr[i];
            arr[i]=t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

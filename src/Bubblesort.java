import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[]{6,5,7,8,3,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

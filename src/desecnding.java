import java.util.Scanner;

public class desecnding {
    public static void sort(int arr[])
    {
        int n=arr.length;
        for (int  i = 0; i<n;i++) {
            for (int j=0;j <n-1-i; j++) {
                if(arr[j]<arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void print(int arr[])
    {
        int n=arr.length;
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        desecnding obj=new desecnding();
        obj.sort(arr);
        obj.print(arr);
    }
}

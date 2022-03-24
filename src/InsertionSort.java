import java.util.Scanner;

public class InsertionSort {
    public static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int pos=i-1;
            while(pos>=0 && arr[pos]>temp)
            {
                arr[pos+1]=arr[pos];
                pos=pos-1;
            }
            arr[pos+1]=temp;
            print(arr,i);
            System.out.println();
        }
    }
    public static void print(int arr[],int k)
    {
        int n=arr.length;
        System.out.print("pass "+k+" ->");
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
        InsertionSort obj=new InsertionSort();
        obj.sort(arr);
       // obj.print(arr);
    }
}

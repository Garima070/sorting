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
        int arr[]={56,45,32,78,52,1};
        InsertionSort obj=new InsertionSort();
        obj.sort(arr);
        obj.print(arr);
    }
}

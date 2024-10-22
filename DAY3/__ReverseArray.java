package DAY3;
public class __ReverseArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n=5;
        int temp=0;
        for(int i=0;i<n/2 ;i++)
        {
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++)
    {
        System.out.println( arr[i]);
    }
    }
    
    
}

package DAY3;

public class OptimizedScndLargest {
public static void main(String[] args) {
    int [] arr={10,20,4,45,99};//103,9,97,99===>O(N)space complexity
    int n=5;
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>max1)
        {
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i]>max2 && arr[i]<max1)
        {
            max2=arr[i];
        }
    }
    System.out.println("max2 =" + max2);
}
}

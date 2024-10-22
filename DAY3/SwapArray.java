package DAY3;
import java.util.*;
public class SwapArray {
    public static void main(String[] args) {
        //TIME COMPLEXITY ==>O(N) ==>SC
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n= scan.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        arr[0] = arr[0] + arr[n-1];
        arr[n-1] = arr[0]  - arr[n-1];
        arr[0] = arr[0] - arr[n-1];//OR
        //instead of temp=arr[0];arr[0]=arr[n-1];arr[n-1]=temp;
        System.out.println("after Swapping: ");

        for(int i=0;i<n;i++)
        {
            System.out.print(">" + arr[i] +" " );
        }
        scan.close();
    }
}

package DAY3;
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("SIZE :");
        int n=scan.nextInt();
        int [] arr = new int [n];
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
            if(arr[i]>max1)
            {
                max1=arr[i]; 
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max2 && arr[i]!=max1)
            {
                max2=arr[i];
            }
        }
        System.out.println("Second Largest Element is : " + max2);
        scan.close();
    }
    
}

package DAY3;
import java.util.*;
//TC ==> O(N)
//SC ==> O(N)
public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SIZE = ");
        int n= scan.nextInt();
        int [] arr= new int [n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("Array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Span = " + (max-min));
        scan.close();
    }
}

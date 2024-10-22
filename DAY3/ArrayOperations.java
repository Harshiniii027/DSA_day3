package DAY3;
import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n= scan.nextInt();
        int sum=0,mult=1;
        double avg;

        int [] arr = new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)                       //==>O(N)
        {
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
            mult=mult*arr[i];
        }
        avg=sum/n;
        System.out.println("Sum= " + sum);
        System.out.println("Product= " + mult);
        System.out.println("Average= " + avg);
        scan.close();
    }
    
}

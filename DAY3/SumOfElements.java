package DAY3;
import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = scan.nextInt();
        int [] arr = new int [n];
        int sum=0;
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
            sum= sum+arr[i];
        }
        System.out.println("Sum of elements is :" + sum);
        scan.close();
    }
    
}

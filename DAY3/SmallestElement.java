package DAY3;
import java.util.*;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = scan.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }


        int min=arr[0];


        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Largest Element is: " + min );
        scan.close();
    }
    
}

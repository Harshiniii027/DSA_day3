package DAY3;
import java.util.*;
public class EvenNumbersInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = scan.nextInt();
        int count=0;
        int [] arr = new int [n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scan.nextInt();
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of Even Numbers = " + count);
        scan.close();
    }
}

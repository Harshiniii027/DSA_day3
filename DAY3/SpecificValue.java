package DAY3;
import java.util.*;
public class SpecificValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = {3,5,2,8,1};
        int n=5;
        int flag=0,search;
        System.out.println("Enter Search element: ");
        search = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                flag=1;
                System.out.println("Value found");
                break;
            }
        }
        if(flag!=1)
        {
            System.out.println("Element Not Found");
        }
        scan.close();


        // TIME COMPLEXITY ==> O(N) ==>SPACE COMPLEXITY
    }
}

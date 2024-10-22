package DAY3;
import java.util.*;
public class Duplicate {
    //complexity  time==>O(N^2)  space==>O(N)  ==> optimized version after few days
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n, flag=1;
        System.out.println("Enter array size: ");
        n= scan.nextInt();
        int [] arr = new int [n];


        for(int i=0;i<n-1;i++)  ///(n-1)
        {
            arr[i]=scan.nextInt();
        }

        
        for (int i=0;i<n;i++)
        {
            int j=i+1;
            while(j<n)
            {
                if(arr[i]==arr[j])
                {
                    flag=0;
                    break;
                }
                j++;
            }
        }
        if(flag==0)
        {
            System.out.println("Duplicate Found");
        }
        else 
        {
            System.out.println("Duplicate not Found");
        }
        scan.close();
    }
    
}

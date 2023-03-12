
import java.util.*;

public class problem3_CombinationSort 
{
    // using bubble-sort we sorted the strings with a little modification 
    public static String[] ascend_sort(String[] arr) 
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length - i -1; j++)
            {
                // while comparing we are comparing first charecters only but if found true we are swapping the entire strings
                if(arr[j].charAt(0) > arr[j+1].charAt(0))
                {
                    // swapping
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            

        }
        return arr;
    }
    
    // using bubble-sort we sorted the strings with a little modification 
    public static String[] decend_sort(String[] arr) 
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length - i -1; j++)
            {
                // we will consider the strings if and only their first characters are same
                if(arr[j].charAt(0) == arr[j+1].charAt(0))
                {
                    // we are slicing the string except the first charecter and converting in to integer
                    int temp1 = Integer.parseInt(arr[j].substring(1,arr[j].length()));
                    int temp2 = Integer.parseInt(arr[j+1].substring(1,arr[j+1].length()));
                    // integer comparision
                    if(temp1<temp2)
                    {
                        // swapping
                        String temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
            
                    }
        
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // input Size and input array
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] inp_Arr = new String[size]; 

        for(int i =0; i<size;i++)
        {
            inp_Arr[i] = scan.next();
        }
        // calling the functions and printing the o/p
        String[] L1_Arr = ascend_sort(inp_Arr);
        System.out.println("L1_Arr is : " + Arrays.toString(L1_Arr));
        String[] L2_Arr = decend_sort(L1_Arr);
        System.out.println("L2_Arr is : " + Arrays.toString(L2_Arr));
        scan.close();
    }
}
// Sample Input 1
// 9
// d34 g54 d12 b87 g1 c65 g40 g5 d77
// Output
// L1_Arr is : [b87, c65, d34, d12, d77, g54, g1, g40, g5]
// L2_Arr is : [b87, c65, d77, d34, d12, g54, g40, g5, g1]
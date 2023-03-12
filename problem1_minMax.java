// Problem-1: Swapping Min Max

import java.util.*;

public class problem1_minMax
{
	public static void main(String[] args) {
		// input size, arr1 and arr2
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		for(int i =0; i<size; i++)
		{
		    arr1[i] = scan.nextInt();
		}
		for(int i =0; i<size; i++)
		{
		    arr2[i] = scan.nextInt();
		}
		
		//operation
		int max1 =Integer.MIN_VALUE;// it will store the maximum value of arr1
		int max2 =Integer.MIN_VALUE;// it will store the maximum value of arr2
		for(int i =0; i<size; i++)
		{
		    int temp1 = arr1[i];
		    int temp2 = arr2[i];
		    // we will store the maximum value between temp1 and temp2 in arr1 and smaller one in arr2
		    if(temp2>temp1 )// temp2 is larger then swap otherwise not needed
		    {
		        arr1[i] = temp2;
		        arr2[i] = temp1;
		    }
		// meanwhile we are keep storing maximum value of arr1 and arr2 in max1 and max2 respectively
		  if(i == 0)
		  {
		      max1 = arr1[i];
		      max2 = arr2[i];
		  }
		  else
		  {
		      if(arr1[i]>max1)
		      {
		          max1 = arr1[i];
		      }
		      if(arr2[i]>max2)
		      {
		          max2 = arr2[i];
		      }
		  }
		}
		System.out.println(max1*max2);
		scan.close();
	}
}

// Sample Input 1
// 6
// 1 2 6 5 1 2
// 3 4 3 2 2 5
// Output
//18

// Sample Input 2
// 25
// 8 7 9 6 5 6 6 5 6 4 6 7 8 5 4 3 2 1 4 5 6 7 8 7 8
// 2 4 5 6 7 6 7 8 9 8 7 6 7 6 5 4 3 2 3 4 5 5 5 4 5
// Output
// 63
import java.util.*;

public class problem5_perfectNum {
    public static boolean func(int num)
    {
        // divisum variable will store the sum of divisors of the number
        int diviSum =0;
        //iterating from 1 to number-1 to findout all divisors except itself
        for(int i=1; i<num;i++)
        {
            // if reminder is zero then it is a divisor
            if(num%i == 0)
            {
                // adding all divisors
                diviSum += i;
            }
        }
        // if sum of all divisors are equal to the number, than it is a perfect number else not 
        if (diviSum == num)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // taking input
        int inp = scan.nextInt();
        // calling the function and printing the output
        System.out.println(func(inp));

    }
}
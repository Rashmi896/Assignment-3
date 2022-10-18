import java.util.*;
public class fourthProgram {
    static int c;
 
  
    static int HailstoneNumbers(int N)
    {
        System.out.print(N + " ");
 
        if (N == 1 && c == 0) {// n is 1
 
            
            return c;
        }
        else if (N == 1 && c != 0) {
 
           
            c++;
            return c;
        }
        else if (N % 2 == 0) {//n is even
 
            
            c++;
            HailstoneNumbers(N / 2);
        }
        else if (N % 2 != 0) {// n is odd
 
           
            c++;
            HailstoneNumbers(3 * N + 1);
        }
        return c;
    }
 
 
    public static void main(String[] args)
    {
        int N = 7;
        int x;
 
       
        x = HailstoneNumbers(N); // Call hailstone function
 
       
        System.out.println();
        System.out.println("Number of Steps: " + x);// print the result
    }
}
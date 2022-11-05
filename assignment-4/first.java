import java.io.*;
import java.util.*;
public class first {
 public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in); // Create object for input
    System.out.println("Enter vector Size");

    int vectorSize = input.nextInt();  // Get size of vector
    System.out.println("Enter User Input Size");// Output user input
    System.out.println("Input size is: " + vectorSize);  //Get number of Inputs
    Vector<Integer> v = new Vector<Integer>(vectorSize); // Create vector
    
    int s = input.nextInt();

   int finalSize = Math.min(vectorSize, s); // Get minimum of vector size and user input
   for(int i=0;i<finalSize;i++)
   {
    System.out.println("Enter value:");
    int value = input.nextInt(); // Get input
    v.add(value);
   }
    
 }
}
    

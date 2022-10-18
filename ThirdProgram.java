import java.util.Arrays;
 
public class ThirdProgram {
 

 

    public static void main(String[] args) {
        String s = "My name is Rashmi Sharma ";
        char temp[] = s.toCharArray();// string is changed to Char Array
 
        
        Arrays.sort(temp); // Sorting the char array
 
        // Returning new sorted string acc to ASCI value
        System.out.println(new String(temp));
    }
}
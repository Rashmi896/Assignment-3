public class FirstProgram
{
     public static void main(String[] args) 
        
     {
     String firstString = " My name is Rashmi";
     String secondString = " My name is Sharma";

     for(int i=0;i<firstString.length() && i<secondString.length();i++)
     {
         if((int)firstString.charAt(i)==(int)secondString.charAt(i))// compare ASCII values of each character in array
         {
            continue;
         }
         else { 
            System.out.println((int)firstString.charAt(i) - (int)secondString.charAt(i)); // Print the difference if present
        } 
     }

        
    }
}
package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {

   public static void main(String args[]) {
      FileReader fr = null;		
      try {
         File file = new File("file.txt");
       
         fr = new FileReader(file); 
         
         char [] a = new char[50];
        System.out.println(fr.read());
         fr.read(a);   // reads the content to the array
         for(char c : a)
         System.out.print(c);   // prints the characters one by one
      } catch (IOException e) {
         e.printStackTrace();
         
      }
      finally {
    		 
         try {
        	 System.out.println("Finally executed");
            fr.close();
         } catch (IOException ex) {		
        
            ex.printStackTrace();
            
         }
      }
   }
}

import java.util.Scanner;

public class LabProgram {

Scanner scnr = new Scanner(System.in); 
      String userText;
      int Amount = 0;
      
      userText = scnr.nextLine();
      
      for (int i = 0; i < userText.length(); i++) {
         if ((userText.charAt(i)) != ' ' && (userText.charAt(i) != '.') && (userText.charAt(i) != ',') && (userText.charAt(i) != '!')){
         Amount++;
         }
      }
       System.out.println(Amount);
}

import java.util.Scanner;

/**
* This class tests if the person is Hawaiian based on their name.
* If the person is not Hawaiian, a new Hawaiian name is assigned.
* @methodClass: Hawaii.java
* @author: Yuen Han Chan
*/

public class HawaiiDriver
{
   public static void main (String[] args)
   {
      String response;
      do
      {
      String possName,newNameYay;
      boolean result1;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your possible Hawaiian name");
      possName = scan.nextLine();
      
      
      Hawaii newName = new Hawaii(possName);
      result1 = newName.isName();
      if (result1==true)                                                   //If the name is a Hawaiian name, proceed and print one of the 3 statments.
      {
         newName.welcome();      
      }
      else
      {
         System.out.println("Sorry " + possName +", you aren't Hawaiian enough to come!");
         newNameYay = newName.changeName();
         System.out.println("Let's make your name... " + newNameYay);
         newName.welcome();
      }
      
      System.out.println("Would you like to try again? (y/n)");
      response = scan.nextLine();
      }while(response.charAt(0)=='y');                                           //Do the whole thing again if the user enters 'y'                                    
   }
}  
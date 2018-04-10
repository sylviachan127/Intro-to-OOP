import java.util.Random;

/**
* This class tests if the person is Hawaiian based on their name.
* If the person is not Hawaiian, a new Hawaiian name is assigned.
* @mainClass: HawaiiDriver.java
* @author: Yuen Han Chan
*/

public class Hawaii
{ 
   public String name;
    
   public Hawaii(String yourName)
   {
      name = yourName;
   }
   
   /**
   * This method tests if the user input Name is a Hawaiian name or not
   * @return a boolean if the name is a Hawaiian name or not
   */
   
   public boolean isName()
   {
      int start;
      boolean result = true;
      int nameNum = name.length();
      
      for (start = 0; start<nameNum ; start++)
         {
            char letter = name.charAt(start);
            if(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u' && letter!='k' && letter!='l' && letter!='h' && letter!='m' && letter!='n')
            {
               result = false;
            }
         }
         return result;
   }   
   
   /**
   * This method randomly generate an interger from 1-10.
   * Each number represents a certain percentage than print 1 of the 3 statment
   */

   public void welcome()
   {
      int randomNum;
      Random rand = new Random();
      randomNum = rand.nextInt(11);
      if (randomNum<=5)
      {
         System.out.println("Aloha, " + name);
      }
      else if (randomNum>5 && randomNum<9 )
      {  
         System.out.println("Welcome to Hawaii " + name);
      }
      else
      {  
         System.out.println("E komo mai, " + name);
      }
   }
   
   /**
   * This method change the a non-Hawaiian name into a Hawaiian name
   * @return: the new Name
   */
   public String changeName()
   {
      int start;
      int nameNum = name.length();
      String newHawaiianName = "";
      
      for (start = 0; start<nameNum ; start++)
         {
            char letter = name.charAt(start);
            if(letter!='a' && letter!='e' && letter!='i' && letter!='o' && letter!='u' && letter!='k' && letter!='l' && letter!='h' && letter!='m' && letter!='n')
            {
               newHawaiianName = newHawaiianName;
            }
            else
            {
               newHawaiianName += letter;
            }
         }
      name = newHawaiianName;
      return name;                 
   }
      

}
        
      
      
import java.util.Scanner;

/**
* This class tests how many babies each couples has to
* born in order to have one girl and one boy.
* The the total number of boys and girls and average babies
* numbers are display.
* @methodClass: Family.java
* @author: Yuen Han Chan
*/


public class FamilyPlanning {
   public static void main(String[] args) {
      String response;
      do {

      int numFam, count, girls;
      int maxGender = 0;
      int beginNum = 0;
      int[] genderArray = {};
      int girlsTotal = 0;
      int boysTotal = 0;
      String xx;

      Scanner scan = new Scanner(System.in);

      System.out.print("Ready to run a family simulation. ");
      System.out.println("Enter the number of families: ");

      numFam = scan.nextInt();
      while (!(numFam > beginNum)) {
         System.out.print("That's not a valid number, please ");
         System.out.println("enter an integer bigger than 0");
         numFam = scan.nextInt();
      }

      Family trail = new Family(numFam);

      System.out.println("Stimulating Familes");
      for (count = 1; count <= numFam; count++) {
         xx = trail.makeBabies();
         System.out.println(count + " - " + xx);
         genderArray = trail.genderCounters(xx);
         girlsTotal += genderArray[1];
         boysTotal += genderArray[0];

         if (maxGender < xx.length()) {
            maxGender = xx.length();
            }
      }

      trail.averageGender(girlsTotal, boysTotal, maxGender);

      System.out.println("Would you like to try again? (y/n)");
      response = scan.nextLine();
      response = scan.nextLine();
      } while(response.charAt(0) == 'y');
   }
}
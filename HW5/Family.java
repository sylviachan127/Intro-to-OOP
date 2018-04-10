import java.util.Random;

/**
* This class tests how many babies each couples has
* to born in order to have one girl and one boy.
* The the total number of boys and girls and average babies numbers are display.
* @methodClass: FamilyPlanning.java
* @author: Yuen Han Chan
*/

public class Family {
   private int familyNums;

   public Family(int x) {
      familyNums = x;
   }

   /**
   * This method generate the babies the couples will born
   * @return a String that include the combination of boys
   ¡Á and girls couples born
   */

   public String makeBabies() {
      int boyOrGirls;
      int boyCount = 0;
      int girlCount = 0;
      String childCombo = "";
      String child;

         Random rand = new Random();

         do {
         boyOrGirls = rand.nextInt(2);
         if (boyOrGirls == 0) {
            child = "G";
            girlCount += 1;
         } else {
            child = "B";
            boyCount += 1;
            }

         childCombo += child; } while (!(girlCount >= 1) || !(boyCount >= 1));

      return childCombo;
   }

   /**
   * This method prints the babies combo born by each couples
   */

   public void babiesResult(String pp) {
      for (int y = 1; y <= familyNums; y++) {
         System.out.println(y + " - " + pp);
      }
   }

   /**
   * This method tests the total amount of boys and girls born by each couples
   * @return an interger array containing the number of boys and girls
   */

   public int[] genderCounters(String yy) {
      int gg = 0;
      int bb = 0;

      for (int counter = 0; counter < yy.length(); counter++) {
         if (yy.charAt(counter) == 'G') {
            gg += 1;
         } else {
            bb += 1;
            }
      }

      int gender[] = new int [2];
      gender[0] = bb;
      gender[1] = gg;
      return gender;
   }

   /**
   * This method prints the result of babies born and
   * total babies averages on the screen
   */

   public void averageGender(float ggTotal, float bbTotal, int maxG) {
      float totalBabies, averageBabies;
      int genderMax;

      totalBabies = ggTotal + bbTotal;
      averageBabies = totalBabies / familyNums;
      genderMax = maxG;
      String averageB = String.format("%.3g%n", averageBabies);

      System.out.print("The average number of children was ");
      System.out.println(averageB + " and maximum was " + genderMax + ".");
      System.out.print("A total of " + (int) bbTotal);
      System.out.println(" boys and " + (int) ggTotal + " girls were born.");
}
}
//***************************************
//  GPA.java      Author: Yuen Han Chan
//
//***************************************

import java.util.Scanner;

public class GPA
{
   public static void main(String[] args)
   {
      int gradeA,gradeB,gradeC,gradeD,gradeF;
      int weight,sum;
      Scanner scan = new Scanner (System.in);
      
      System.out.println("How many A's did you get?");
      gradeA = scan.nextInt();
      System.out.println("How many B's did you get?");
      gradeB = scan.nextInt();
      System.out.println("How many C's did you get?");
      gradeC = scan.nextInt();
      System.out.println("How many D's did you get?");
      gradeD = scan.nextInt();
      System.out.println("How many F's did you get?");
      gradeF = scan.nextInt();
      
      weight=(4*gradeA)+(3*gradeB)+(2*gradeC)+(1*gradeD)+(0*gradeF);
      sum=gradeA+gradeB+gradeC+gradeD+gradeF;
      double GPA= ((double)(weight)/(double)(sum));
      String newGPA = String.format("%.3g%n", GPA);
      System.out.println("A: "+gradeA);
      System.out.println("B: "+gradeB);
      System.out.println("C: "+gradeC);
      System.out.println("D: "+gradeD);
      System.out.println("F: "+gradeF);
      System.out.println("GPA: "+newGPA);
   }
}
      
      
import java.util.Scanner;

public class CrazyCipher
{
   public static void main(String[] args)
   {
      String encode,decode;
      char a,b,c,d,e;
      char aa,bb,cc,dd,ee;
      System.out.println("Encode? \nPlease enter your choice of 5-letters word.");
      Scanner scan = new Scanner (System.in);
      encode = scan.nextLine();
      a = encode.charAt(0);
      b = encode.charAt(1);
      c = encode.charAt(2);
      d = encode.charAt(3);
      e = encode.charAt(4);
      aa = a;
      bb = (char)(b+4);
      cc = (char)(c-4);
      dd = e;
      ee = d;
      
      System.out.print("Your encoded word is: ");
      System.out.print(aa);
      System.out.print(bb);
      System.out.print(cc);
      System.out.print(dd);
      System.out.print(ee);
      System.out.println();
      
      System.out.println("Decode? \nPlease enter your choice of 5-letters word.");
      decode = scan.nextLine();
      a = decode.charAt(0);
      b = decode.charAt(1);
      c = decode.charAt(2);
      d = decode.charAt(3);
      e = decode.charAt(4);
      
      aa = a;
      bb = (char)(b-4);
      cc = (char)(c+4);
      dd = e;
      ee = d;
      
      System.out.print(aa);
      System.out.print(bb);
      System.out.print(cc);
      System.out.print(dd);
      System.out.print(ee);
      System.out.println();
   }
}
      
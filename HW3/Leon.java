import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Leon extends JApplet
{
   public void paint(Graphics snow)
   {
   
   final int XX = 1000;
   final int YY = 800;
   
   setSize(XX,YY);
   
   snow.setColor(Color.black);
   snow.fillRect(0,0,XX,YY);
   
   int width,height,building,r,g,b;
   int buildW;
   int count,xx;
   
   Random rand = new Random();
   
   building = 10; //numbers of building
   buildW = XX/8;      //width of each building
   
   xx=0;
   
   
   for(count=0; count<=building; count++)
   {
      //set the random Color
      r = rand.nextInt(256);
      b = rand.nextInt(256);
      g = rand.nextInt(256);

      Color randC = new Color(r,b,g);
      snow.setColor(randC);

      height = rand.nextInt(501)+100;   //height of the building

      snow.fillRect(xx,YY-height,buildW,height);
      xx+=buildW;
   }
      
   int snowAmount,snowSize,sx,sy;
   snowAmount = rand.nextInt(40)+40; 
   
   
   snow.setColor(Color.white);
   for(count=0; count<=snowAmount; count++)
   {
      sx = rand.nextInt(XX);
      sy = rand.nextInt(YY);
      snowSize = rand.nextInt(11)+10;
      snow.fillOval(sx,sy,snowSize,snowSize);
   }
   
   snow.setFont(new Font("Monotype Corsiva", Font.PLAIN, 50)); 
   snow.drawString("Sylvia Chan", 20,700);
  
   }
}

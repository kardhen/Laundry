import greenfoot.*;
import java.awt.Color;

public class PranieKrotkie extends Pralka
{
    private static final String JAKIE_PRANIE = "Pranie krótkie";
  
   public void act() 
   {
     setImage(new GreenfootImage(JAKIE_PRANIE, 50, Color.RED, Color.BLACK));
   }     
}

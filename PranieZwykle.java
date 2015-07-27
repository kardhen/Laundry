import greenfoot.*;
import java.awt.Color;

public class PranieZwykle extends Pralka
{
  private static final String JAKIE_PRANIE = "Pranie zywkłe";
  
   public void act() 
   {
     setImage(new GreenfootImage(JAKIE_PRANIE, 50, Color.RED, Color.BLACK));
   }    
}

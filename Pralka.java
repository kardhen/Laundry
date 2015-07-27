import greenfoot.*;
import java.awt.Color;

public class Pralka extends Actor
{
    int temperatura = 40;
    int obroty = 1200;
    int czas = 30;
  
    public void pranie() {
        
        if(Greenfoot.mousePressed(this)){
            
            if(czas >= 60){
             
            PranieZwykle praniezwykle = new PranieZwykle();
            getWorld().addObject(praniezwykle, 200, 200);
            }
            else {
            PranieKrotkie praniekrotkie = new PranieKrotkie();
            getWorld().addObject(praniekrotkie, 200, 200);
        }
     }
    }
   
     public void act(){
        pranie();
    }
}




        



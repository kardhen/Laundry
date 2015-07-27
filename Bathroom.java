import greenfoot.*;
import java.awt.Color;

public class Bathroom extends World
{   
    public void prepareWorld(){
        
        Pralka pralka = new Pralka();
        addObject(pralka, 100, 100);
    }
        
    public Bathroom(){   
        
        super(600, 400, 1); 
        prepareWorld();
    } 
}

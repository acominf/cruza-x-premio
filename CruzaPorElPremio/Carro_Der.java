import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Carro_Der extends Actor
{
    @Override
    public void act() 
    {
        // Add your action code here.
    }
    
    public void muevete(int incx)
    {
       int posx = this.getX();
       
       int nuevox = posx - incx;
        
       World mundo = this.getWorld();
       
       if(nuevox < 0)
        {
            nuevox = 575;
        }
       
       this.setLocation(nuevox, this.getY());
    }
}

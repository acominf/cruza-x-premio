import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    
    public void act()
    {
        BotonPlay boton = new BotonPlay();
        
        addObject(boton, 300, 300);
        this.showText("Oprima el boton para iniciar el juego", 300,200);
        
    }
    
}

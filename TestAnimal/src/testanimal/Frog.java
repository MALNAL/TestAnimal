/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testanimal;

/**
 *
 * @author S
 */
public class Frog extends Animal implements Water, Land{

    private final int numberOfLegs = 4;
    
    
    public Frog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }       

    @Override
    public void sayHello(int mood) {
         if(mood == MOOD_HAPPY) 
        {
            System.out.println("quack quack quack");            
        }            
        if(mood == MOOD_SCARE) 
        {
            System.out.println("plop into the water");                      
        }
    }

    @Override 
    public boolean hasGills() { 
        return true;
    }

    @Override
    public boolean hasLayesEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    
}

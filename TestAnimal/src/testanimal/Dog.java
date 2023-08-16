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
public class Dog extends Animal implements Land{

    private final int numberOfLegs = 4;
    
    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello() 
    {
        System.out.println("wagging their tails");        
    }
  
    @Override
    public void sayHello(int mood) {
        if(mood == MOOD_HAPPY) 
        {
            System.out.println("will bark loudly");
        }            
        if(mood == MOOD_SCARE) 
        {
            System.out.println("whooping");                     
        }            
    }
    
    @Override
    public int getNumberOfLegs()  {        
        return this.numberOfLegs;
    }
    
     
    
}

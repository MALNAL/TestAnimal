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
public class Cat extends Animal implements Land{
    
    private final int numberOfLegs = 4;
    
    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }    
    
    @Override
    public void sayHello() {
        System.out.println("meow~");
    }
  
    @Override
    public void sayHello(int mood) {
        if(mood == MOOD_HAPPY) 
        {
            System.out.println("purr, purr");            
        }            
        else if(mood == MOOD_SCARE) 
        {
            System.out.println("hiss");            
        }            
    }
    
    @Override
    public int getNumberOfLegs()  {        
        return this.numberOfLegs;
    }
}

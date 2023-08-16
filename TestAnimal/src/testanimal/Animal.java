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
public abstract class Animal {
    protected boolean mammals; 
    protected boolean carnivorous;
    
    public final int MOOD_HAPPY = 1; 
    public final int MOOD_SCARE = 0; 
    
    protected int mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;    
        this.mood = mood;        
    }
    
    public  void sayHello()
    {        
    } 
    
    public abstract void sayHello(int mood);
    
    public  boolean isMammals()
    {
        return this.mammals;
    }
    
    public  void setMammals(boolean mammals)
    { 
        this.mammals = mammals;
    }
    
    public  boolean isCarnivorous()
    {
        return this.carnivorous;
    }
    
    public  void setCarnivorous(boolean carnivorous)
    {
        this.carnivorous = carnivorous;
    }
    
    
}

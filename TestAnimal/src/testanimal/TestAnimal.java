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
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c1 = new Cat(true, true, 1);
        Dog d1 = new Dog(true, true, 0);
        Frog f1 = new Frog(true, true, 1);
        
        Animal [] animals = {new Cat(true, true, 1) , new Dog(true, true, 1)};
        for(int i= 0; i<animals.length; i++)
        {
            animals[i].sayHello();
        }
        
        c1.sayHello(1);
        c1.sayHello(0);
        System.out.println("NumberOfLegs = " + d1.getNumberOfLegs());
        System.out.println("hasGills  = " + f1.hasGills());
        
    }    
}
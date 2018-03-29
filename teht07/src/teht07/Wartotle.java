/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht07;

/**
 *
 * @author Jerry Hällfors
 */
public class Wartotle implements Evolution {
     private static Wartotle INSTANCE = null;
    
    private Wartotle () {}
    
    public static Wartotle getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Wartotle();
        } 
        return INSTANCE;
    }

    @Override
    public void attack() {
        System.out.println("Water stream!");
    }

    @Override
    public void escape() {
        System.out.println("Run away!");
    }

    @Override
    public void speak() {
        System.out.println("Wartotle!");
    }
    
}

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
public class Squirtle implements Evolution{
private static Squirtle INSTANCE = null;
    
    private Squirtle () {}
    
    public static Squirtle getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Squirtle();
        } 
        return INSTANCE;
    }
    
    @Override
    public void attack() {
       System.out.println("Water bubble!"); 
    }

    @Override
    public void escape() {
        System.out.println("Crawl away!");
    }

    @Override
    public void speak() {
        System.out.println("Squirtle!");
    }
    
}

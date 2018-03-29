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
public class Pokemon {
    Evolution state;
    
    public Pokemon() {
        this.state = Squirtle.getInstance();
    }
    
    
    public void evolve() {
        if (state instanceof Squirtle) {
            state = Wartotle.getInstance();
            System.out.println("Squirtle evolved to Wartotle!");
            
        } else if (state instanceof Wartotle) {
            state = Blastoise.getInstance();
            System.out.println("Wartotle evolved to Blastoise!");
        }
    }
    
    public void attack() {
        state.attack();
    }
    
    public void escape() {
       state.escape();
    }
    
    public void speak() {
       state.speak();
    }
}

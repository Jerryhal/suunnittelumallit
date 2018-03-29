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
public class Blastoise implements Evolution {
    private static Blastoise INSTANCE = null;
    
    private Blastoise () {}
    
    public static Blastoise getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Blastoise();
        } 
        return INSTANCE;
    }

    @Override
    public void attack() {
        System.out.println("WATER BLAST!");
    }

    @Override
    public void escape() {
        System.out.println("SURFS UP!");
    }

    @Override
    public void speak() {
        System.out.println("BLASTOISE!");

    }
}

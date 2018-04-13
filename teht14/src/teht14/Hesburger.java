/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht14;

/**
 *
 * @author User
 */ 
//-------- Nää vois toteuttaa kans builderissa, jos haluttais vaikuttaa ainesosiin..
//Tässä voisi myös käyttää tehtaita

public class Hesburger implements Builder {
    private static Hesburger INSTANCE = null;
    Hamburger hamburger = new StringBurger();
    
    private Hesburger() {}
    
    public static Builder getBuilder() {
        if (INSTANCE == null) {
            INSTANCE = new Hesburger();
        }
        return INSTANCE;
    }

    @Override
    public void makeSteak() {
        Steak s = new Steak("Beef");
        hamburger.addFilling(s);
    }

    @Override
    public void makeSalad() {
        Salad s = new Salad("Lettuce");
        hamburger.addFilling(s);
    }

    @Override
    public void makeBuns() {
        Buns b = new Buns("Seasam-bread");
        hamburger.addFilling(b);
    }

    @Override
    public Hamburger getBurger() {
        makeSteak();
        makeSalad();
        makeBuns();
        return hamburger;
    } 
}

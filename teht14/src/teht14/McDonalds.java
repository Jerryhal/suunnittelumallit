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
public class McDonalds implements Builder {
    private static McDonalds INSTANCE = null;
    Hamburger hamburger = new ObjectBurger();

    private McDonalds() {
        
    }
    
    public static Builder getBuilder() {
        if (INSTANCE == null) {
            INSTANCE = new McDonalds();
        }
        return INSTANCE;
    }
    
    @Override
    public void makeSteak() {
        Steak s = new Steak("Chicken");
        hamburger.addFilling(s);
    }

    @Override
    public void makeSalad() {
        Salad s = new Salad("Tomato");
        hamburger.addFilling(s);
    }

    @Override
    public void makeBuns() {
        Buns b = new Buns("Rye-bread");
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

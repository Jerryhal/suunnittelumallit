/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ObjectBurger extends Hamburger {
    List<Filling> fillings = new ArrayList();
    
    public ObjectBurger() {}
    
      @Override
    void addFilling(Filling filling) {
        fillings.add(filling);
    }
    
    @Override
    String getFillings() {
        String s = "";
        for (Filling f : fillings) {
            s += f.getIngredient() + " ";
        }
        return s;
    }
}

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
public class StringBurger extends Hamburger {
    StringBuilder ingredients = new StringBuilder();
    
    @Override
    String getFillings() {
        return ingredients.toString();
    }    
    
    @Override
    void addFilling(Filling filling) {
        ingredients.append(filling.getIngredient() + " ");
    }
}

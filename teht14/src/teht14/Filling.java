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
public abstract class Filling {
    String ingredient;
    
    public Filling(String ingredient) {
        this.ingredient = ingredient;
    }
    
    String getIngredient() {
        return ingredient;
    }
}

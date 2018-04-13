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
public class Director {
    Builder builder;
    
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public Hamburger getHamburger() {
        Hamburger hamburger = builder.getBurger();
        return hamburger;
    }
}

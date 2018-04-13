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
public abstract class Hamburger {
    Filling fillings[];
    abstract void addFilling(Filling filling);
    abstract String getFillings();
}

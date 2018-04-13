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
public class Teht14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       //Eroaako tämä oikeastaan hirveästi tehtaasta?
       //
        Director d = new Director();
        
        d.setBuilder(McDonalds.getBuilder());
        Hamburger burger = d.getHamburger();
        System.out.println("Here is your " +burger.getFillings()+ "Burger");
        
        d.setBuilder(Hesburger.getBuilder());
        burger = d.getHamburger();
        System.out.println("Here is your " +burger.getFillings()+ "Burger");

    }
    
}

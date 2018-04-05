/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht10;

/**
 *
 * @author User
 */
public class Toimitusjohtaja extends Esimies {
    
    public Toimitusjohtaja(Esimies esimies, int korotusKatto) {
        super(esimies, korotusKatto);
    }
    
     public void hyvaksyKorotus(int korotus) {
        System.out.println(this + " hyväksyi palkankorotuksen");
    }
}

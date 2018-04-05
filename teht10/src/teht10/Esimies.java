/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht10;

/**
 *
 * @author Jerry
 */
public abstract class Esimies {
    Esimies esimies; //Toisaalta toimitusjohtajalla ei varmaan ole Esimiestä...
    int korotusKatto;
    
    public Esimies(Esimies esimies, int korotusKatto) {
        this.esimies = esimies;
        this.korotusKatto = korotusKatto;
    }
    
      public void hyvaksyKorotus(int korotus) {
        if (korotus > korotusKatto) {
            esimies.hyvaksyKorotus(korotus);
        } else {
            System.out.println(this + " hyväksyi palkankorotuksen");
        }
    }
}

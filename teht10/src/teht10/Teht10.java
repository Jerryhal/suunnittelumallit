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
public class Teht10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int korotus;
        Esimies toimitusjohtaja = new Toimitusjohtaja(null, 100);
        Esimies aluepaallikko = new YksikonPaallikko(toimitusjohtaja, 5);
        Esimies lahiesimies = new Lahiesimies(aluepaallikko, 2);
        
        korotus = 100;
        lahiesimies.hyvaksyKorotus(korotus);
    }
    
}

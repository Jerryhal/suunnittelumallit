/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht11;

/**
 *
 * @author User
 */
public class Teht11 {
    
    public static void main(String[] args) {
        Arvuuttaja a = new Arvuuttaja();
       
        for (int i = 0; i < 5; i++) {
           Asiakas as = new Asiakas(a);
           Thread t = new Thread(as);
           t.start();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Asiakas implements Runnable {
    private Object obj;
    Arvuuttaja a;
    
    public Asiakas(Arvuuttaja a) {
        this.a = a;
        this.obj = a.liityPeliin(this);
        
    }
    
    public Object getObject() {
        return obj;
    }
    
    @Override
    public void run() {
        boolean stop = false;
        while(!stop) {
            int arvaus = (int)(Math.random() * 10);
            stop = a.arvaa(this, arvaus);
            System.out.println(this+ " arvasi " +arvaus);
            try {
                
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(Asiakas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(this + " arvasi oikein!");
    }
}

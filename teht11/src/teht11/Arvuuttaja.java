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
public class Arvuuttaja {
    
    public Memento liityPeliin(Asiakas asiakas) {
        int numero = (int)(Math.random() * 10);
        System.out.println(asiakas+ " sai numeron " +numero);
        return new Memento(numero);
    }
    
    
    
    private class Memento {
        private int numero;
        
        public Memento(int numero) {
            this.numero = numero;
        }
        
        public int getNumero() {
            return numero;
        }
    }
    
    public boolean arvaa(Asiakas asiakas, int arvaus) {
        Memento memento = (Memento)asiakas.getObject();
        if (arvaus == memento.getNumero()) {
            return true;
        }else 
            return false;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht06;

/**
 *
 * @author Jerry Hällfors
 */
public class Teht06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackIF stack = new Stack();
        stack = new ValvottuStack(stack, "salasana");
        
        stack.push("Uusi node");
        System.out.println( stack.pop() .getData());
    }
}

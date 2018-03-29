/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teht06;

import java.util.Scanner;

/**
 *
 * @author Jerry Hällfors
 */
public class ValvottuStack extends Decorator {
    String password;
    
    public ValvottuStack(StackIF stack, String password) {
        super(stack);
        this.password = password;
    }
    
    @Override
    public void push(String data) {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter password: ");
        String input = reader.nextLine();
        if (input.equals(password)) {
            super.push(data);
        } 
    }

    @Override
    public Node pop() {
        Scanner reader = new Scanner(System.in);  
        System.out.println("Enter password: ");
        String input = reader.nextLine();
        if (input.equals(password)) {
            return super.pop();
        } 
        return null;
    }
}

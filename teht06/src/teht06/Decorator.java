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
public abstract class Decorator implements StackIF {
    StackIF stack;
    
    public Decorator(StackIF stack) {
        this.stack = stack;
    }

    @Override
    public void push(String data) {
        stack.push(data);
    }

    @Override
    public Node pop() {
        return stack.pop();
    }
}

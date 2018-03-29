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
public class Stack implements StackIF {
    Node top;
    int size = 0;
    
    @Override
    public void push(String data) {
        Node node = new Node(data);
        if (top != null) {
            node.setNext(top);
        } 
        top = node;
        size++;
    }
    
    @Override
    public Node pop() {
        if (size > 0) { 
            Node pop = top;
            top = top.getNext();
            size--;
            return pop;
        }
    return null;
    }
}

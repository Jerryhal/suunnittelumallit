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
public class Node {
    String data;
    Node next;
    
    public Node(String data){
        this.data = data;
    }
    
    public void setNext(Node nextNode) {
        next = nextNode;
    }
    
    public Node getNext() {
        return next;
    }
    
    public String getData() {
        return data;
    }
}

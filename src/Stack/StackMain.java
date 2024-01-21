/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author HD-PC
 */
public class StackMain {
    public static void main (String [] args) {
        StrukturStack stack = new StrukturStack(3);
        System.out.println("Size:" + stack.size());
	System.out.println("Empty: " + stack.isEmpty());
	System.out.println("Full: " + stack.isFull());
	System.out.println("Top: " + stack.top());
        
        stack.push(2);
	stack.push(4);
	stack.push(1);
	
	System.out.println("Size:" + stack.size());
	System.out.println("Empty: " + stack.isEmpty());
	System.out.println("Full: " + stack.isFull());
	System.out.println("Top: " + stack.top());
	stack.displayElement();
    }
}

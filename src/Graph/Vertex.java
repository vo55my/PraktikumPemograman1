/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author HD-PC
 */
public class Vertex {
    private char label;
    private boolean wasVisited;
    
    public Vertex(char lab) {
        label = lab;
        wasVisited = false;
    }
    
    public void setLabel(char label) {
        this.label = label;
    }
    
    public char getLabel() {
        return label;
    }
    
    public void setData(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
    
    public boolean getData() {
        return wasVisited;
    }
}

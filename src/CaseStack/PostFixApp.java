/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStack;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HD-PC
 */
public class PostFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        
        while(true){
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if(input.equals(""))
                break;
            
            ParsePost eParser = new ParsePost(input);
            output = eParser.doParse();
            System.out.println("Hasil operasi: " + output);
        }
    }
    
    public static String getString() throws IOException{
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    
}

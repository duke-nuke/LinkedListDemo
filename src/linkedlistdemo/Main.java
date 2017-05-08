/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;



/**
 *
 * @author Khurram.Shahzad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList n = new LinkedList(0);
        
        //fill the list
        for(int i = 1; i<10; i++){
            n.append(i);
        }
        //print the content
        n.print();
        
        //remove last element
        n.remove();
        System.out.println();
        
        n.print();
        System.out.println();
        
        
        //remove further elements
        n.remove();
        n.remove();
        
        
        n.print();
        System.out.println();
        
      
        n.removeGreaterThan(3);
        
        System.out.println();
        n.print();
        System.out.println();
        
    }
    
    
    
}

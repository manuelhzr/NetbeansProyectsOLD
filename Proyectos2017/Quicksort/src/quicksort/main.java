/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quick obj=new Quick();
        
        int ele= Integer.parseInt(JOptionPane.showInputDialog("elemenos"));
        obj.setElm(ele);
        
        for(int i=0; i<ele; i++){
            int val= Integer.parseInt(JOptionPane.showInputDialog("valor "+i));
            obj.setVec(i, val);
        }
        obj.Quicksort(0, ele-1);       
       
        JOptionPane.showMessageDialog(null, Arrays.toString(obj.getVec()));
        
        
            
        
    }
    
}

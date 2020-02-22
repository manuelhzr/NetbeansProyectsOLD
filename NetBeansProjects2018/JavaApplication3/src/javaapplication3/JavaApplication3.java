
package javaapplication3;

import java.awt.Graphics;
import java.applet.Applet;

public class JavaApplication3 extends Applet{

   
    
    public void paint (Graphics g) {
        
        int A[][]= new int [4][4];
        int B[][]= new int [4][4];
        int C[][]= new int [4][4];
        
        metodos ob=new metodos();
        
        ob.llenar(A);
        ob.mostrar(A, g, 100, 150);
        
        ob.llenar(B);
ob.mostrar(B, g, 200, 150);


ob.sumar(A, B, C);
    ob.mostrar(C, g, 300, 150);
 
    
    
    ob.diagonal_prinA(A, g);
    ob.diagonal_prinB(B, g);
    ob.diagonal_prinC(C, g);
    
    ob.diagonal_SecA(A, g);
    ob.diagonal_SecB(B, g);
   ob.diagonal_SecC(C, g);
   
   ob.MultiplicarA(A, 2, g);
   ob.MultiplicarB(B, 2, g);
   ob.MultiplicarC(C, 2, g);
   
   ob.TraspuestaA(A, g);
   ob.TraspuestaB(B, g);
   ob.TraspuestaC(C, g);
        
    }
    
}

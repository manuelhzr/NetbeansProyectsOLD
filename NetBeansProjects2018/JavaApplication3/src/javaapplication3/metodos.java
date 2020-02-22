
package javaapplication3;

import java.awt.Graphics;

public class metodos {


    
    public void llenar(int M[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double num=Math.random()*10;
                M[i][j]= (int)num;
            }
        }
    }
    
    
    public void sumar(int A[][], int B[][], int C[][]){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                C[i][j]= A[i][j]+B[i][j];
            }
        }
        
    }
    
    public void mostrar(int X[][], Graphics g, int fil, int col){
        int col2=col;
        
        g.drawString("Matriz A", 100, 100);
        g.drawString("Matriz B", 200, 100);
        g.drawString("Matriz C", 300, 100);
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.drawString(" "+X[i][j], fil, col);
                col+=20;
            }
            col=col2;
            fil+=20;
        }
    }
    public void diagonal_prinA (int Y[][], Graphics g){
        
       int fil=400, col=150;
       g.drawString("diagonal principal A ",400, 100);
        for (int i = 0; i < 4; i++) {
            
            g.drawString(" "+Y[i][i],fil, col);
            col+=20;
            fil+=20;
            
            
            
            
        }
       
        
        
        
        
        
    }
     public void diagonal_prinB (int Y[][], Graphics g){
        
       int fil=600, col=150;
       g.drawString("diagonal principal B ",600, 100);
        for (int i = 0; i < 4; i++) {
            
            g.drawString(" "+Y[i][i],fil, col);
            col+=20;
            fil+=20;
    
    
    
    
    
    
}
     }
     
      public void diagonal_prinC (int Y[][], Graphics g){
        
       int fil=800, col=150;
       g.drawString("diagonal principal C ",800, 100);
        for (int i = 0; i < 4; i++) {
            
            g.drawString(" "+Y[i][i],fil, col);
            col+=20;
            fil+=20;
}
      }
      
public void diagonal_SecA(int Y[][], Graphics g){
    int c=3;
    int fil=1010, col=200;
    g.drawString("Diagonal secundaria A", 1000, 100);
    for (int i = 0; i < 4; i++) {
        g.drawString(""+Y[i][c], fil, col);
        c--;
        fil+=20;
        col-=20;
    }
}      
   public void diagonal_SecB(int Y[][], Graphics g){
    int c=3;
    int fil=1210, col=200;
    g.drawString("Diagonal secundaria B", 1200, 100);
    for (int i = 0; i < 4; i++) {
        g.drawString(""+Y[i][c], fil, col);
        c--;
        fil+=20;
        col-=20;
    }
}  
   
   public void diagonal_SecC(int Y[][], Graphics g){
    int c=3;
    int fil=110, col=400;
    g.drawString("Diagonal secundaria C", 100, 300);
    for (int i = 0; i < 4; i++) {
        g.drawString(""+Y[i][c], fil, col);
        c--;
        fil+=20;
        col-=20;
    }
}
   
   public void MultiplicarA(int Y[][], int num, Graphics g){
       int fil=250,col= 350;
       g.drawString("Multiplicacion de A", 250, 300);
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+(Y[i][j]*num), fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
   public void MultiplicarB(int Y[][], int num, Graphics g){
       int fil=400,col= 350;
       g.drawString("Multiplicacion de B", 400, 300);
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+(Y[i][j]*num), fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
   public void MultiplicarC(int Y[][], int num, Graphics g){
       int fil=550,col= 350;
       g.drawString("Multiplicacion de C", 550, 300);
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+(Y[i][j]*num), fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
   public void TraspuestaA(int Y[][], Graphics g){
       int fil= 700, col= 350;
       g.drawString("Traspuesta de A", 700, 300);
       
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+Y[j][i], fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
   public void TraspuestaB(int Y[][], Graphics g){
       int fil= 850, col= 350;
       g.drawString("Traspuesta de B", 850, 300);
       
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+Y[j][i], fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
   public void TraspuestaC(int Y[][], Graphics g){
       int fil= 1000, col= 350;
       g.drawString("Traspuesta de C", 1000, 300);
       
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               g.drawString(""+Y[j][i], fil, col);
               col+=20;
           }
           col=350;
           fil+=20;
       }
   }
   
}
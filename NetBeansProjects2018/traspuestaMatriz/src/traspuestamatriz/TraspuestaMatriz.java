/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traspuestamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class TraspuestaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mat[][]=new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double val=Math.random()*10;
                mat[i][j]=(int) val;
            }
        }
        
        int mat2[][]=new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    mat2[i][j]=mat[j][i];
                      
            }
        }
        
        String mat1="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat1+=" "+mat[i][j];
            }
            mat1+="\n";
        }
        
        String matt2="";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matt2+=" "+mat2[i][j];
            }
            matt2+="\n";
        }
        
        JOptionPane.showMessageDialog(null, mat1+"\n"+matt2);
        
        
    }
    
}

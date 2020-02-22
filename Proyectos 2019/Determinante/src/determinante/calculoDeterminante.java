/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinante;

/**
 *
 * @author manue
 */
public class calculoDeterminante {

    private int matriz[][];
    private int matrizAux[][];

    public calculoDeterminante() {
        this.matriz = new int[3][3];
        this.matrizAux = new int[5][3];
    }

    public int getMatriz(int f, int c) {
        return matriz[f][c];
    }

    public void setMatriz(int f, int c, int matriz) {
        this.matriz[f][c] = matriz;
    }

    private void llenarAux() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAux[i][j] = matriz[i][j];
                if (i < 2) {
                    matrizAux[i + 3][j] = matriz[i][j];
                }
            }
        }
    }
    


    private int principal() {
        int inicio = 0;
        int filas;
        int resultado = 0;
        int aux;
        for (int i = 0; i < 3; i++) {
            filas = inicio++;
            aux = 1;
            for (int columnas = 0; columnas < 3; columnas++) {
                aux = aux * matrizAux[filas][columnas];
                filas++;
            }
            resultado += aux;
            
        }
        return resultado;
    }

    private int secundaria() {
        int inicio = 2;
        
        int filas;
        int resultado = 0;
        int aux;
        for (int i = 0; i < 3; i++) {
            filas = inicio++;
            aux = 1;
            for (int columnas = 0; columnas < 3; columnas++) {
                aux *= matrizAux[filas][columnas];
                filas--;
            }
            
            resultado += aux;
        }
        return resultado;
    }

    public int Determinante() {
        llenarAux();
        return principal() - secundaria();
    }

}

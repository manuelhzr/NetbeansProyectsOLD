package contadorpalabras;

import javax.swing.JOptionPane;

public class ContadorPalabras {

    public static void main(String[] args) {
        String cad = "";
        int cont;
        cad = JOptionPane.showInputDialog("Ingrese una frase o palabra");
        cont = cad.length();
        if (cont > 100) {
            JOptionPane.showMessageDialog(null, "La frase o palabra supera el limete de caracteres");
        } else {
            int pal = 1, voc = 0, cons = 0;
            for (int i = 0; i < cont; i++) {
                if (cad.charAt(i) == ' ') {
                    pal++;
                } else {
                    if (cad.charAt(i) == 'a' || cad.charAt(i) == 'e' || cad.charAt(i) == 'i' || cad.charAt(i) == 'o' || cad.charAt(i) == 'u') {
                        voc++;
                    } else {
                        cons++;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "numero de palabras: " + pal);
            JOptionPane.showMessageDialog(null, "numero de consonantes: " + cons);
            JOptionPane.showMessageDialog(null, "numero de vocales: " + voc);
        }

    }

}

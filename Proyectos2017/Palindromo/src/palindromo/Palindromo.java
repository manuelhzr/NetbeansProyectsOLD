package palindromo;

import javax.swing.JOptionPane;

public class Palindromo {

    public static void main(String[] args) {
        String frase = "";
        int cont;

        frase = JOptionPane.showInputDialog("Ingrese una frase para saber si es un palindromo");
        cont = frase.length();
        if (cont > 30) {
            JOptionPane.showMessageDialog(null, "La frase supera el limete de caracteres");
        } else {
            String inversa = "";
            for (int i = cont - 1; i >= 0; i--) {
                if (frase.charAt(i) != ' ') {
                    inversa += frase.charAt(i);
                }
            }
            String aux = "";
            for (int i = 0; i < cont; i++) {
                if (frase.charAt(i) != ' ') {
                    aux += frase.charAt(i);
                }
            }

            if (aux.equals(inversa)) {
                JOptionPane.showMessageDialog(null, "La frase es un palindromo");
            } else {
                JOptionPane.showMessageDialog(null, "La frase no es un palindromo");
            }
        }

    }

}


package menucursomatematica;

import javax.swing.JOptionPane;


public class MenuCursoMatematica {

    
    public static void main(String[] args) {
        float NotasMatematica[]=new float[10];
        
        int Seleccion;
        for (int i = 0; i < 10; i++) {
            NotasMatematica[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + (i + 1)));
        }
        
        do {
                Seleccion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                        + "1: Mostrar promedio de notas\n"
                        + "2: Mostrar la mayor nota\n"
                        + "3: Motrar la menor nota\n"
                        + "4: Cantidad de alumnos con la asigantura aprobada\n"
                        + "5: Cantidad de alumnos con la asignatura perdida\n"));
            if (Seleccion == 1) {
                float promedio = 0;
                for (int i = 0; i < 10; i++) {
                    promedio += NotasMatematica[i];
                }
                promedio = promedio / 10;

                JOptionPane.showMessageDialog(null, "El promedio del curso es: " + promedio);
            } else {
                if (Seleccion == 2) {
                    float mayor = 0;
                    for (int i = 0; i < 10; i++) {
                        if (NotasMatematica[i] >= mayor) {
                            mayor = NotasMatematica[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La nota mayor es: " + mayor);
                } else {
                    if (Seleccion == 3) {
                        float menor = NotasMatematica[0];
                        for (int i = 0; i < 10; i++) {
                            if (NotasMatematica[i] <= menor) {
                                menor = NotasMatematica[i];
                            }
                        }
                        JOptionPane.showMessageDialog(null, "La nota menor es: " + menor);
                    } else {
                        if (Seleccion == 4) {
                            int aprobados = 0;
                            for (int i = 0; i < 10; i++) {
                                if (NotasMatematica[i] >= 3) {
                                    aprobados++;
                                }
                            }
                            JOptionPane.showMessageDialog(null, "La lumnos aprovados son: " + aprobados);
                        } else {
                            if (Seleccion == 5) {
                                int perdidos = 0;
                                for (int i = 0; i < 10; i++) {
                                    if (NotasMatematica[i] < 3) {
                                        perdidos++;
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "Los alumnos perdidos son: " + perdidos);
                            }
                        }
                    }
                }
            }
            
        } while (Seleccion>=1 && Seleccion<=5);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica_municipal;

import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("=== CLINICA MUNICIPAL - MENÚ PRINCIPAL === \n\n"
                    + "1. Agregar Pacientes a la lista de espera \n"
                    + "2. Atencion de Pacientes \n"
                    + "3. Registro historico de las citas \n"
                    + "4. Orden de Atencion \n"
                    + "5. Informe con la cantidad de citas diarias y Especialidad mas usada \n"
                    + "6. Vaciar la Cola \n"
                    + "7. Salir"
                    + "\n \n Seleccione una opción del 1 al 7"));
        } while (opcion <= 0 || opcion > 7);
        return opcion;
    }

    public static void llenar(Nodo nod) {
        int Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Identificacion del Paciente: "));
        nod.setIdentificacion_Paciente(Id);
        String nom = JOptionPane.showInputDialog("Ingrese el Nombre del Paciente: ");
        nod.setNombre_Paciente(nom);
        String correo = JOptionPane.showInputDialog("Ingrese el Correo del Paciente: ");
        nod.setCorreo_Paciente(correo);
        String Fe = JOptionPane.showInputDialog(null, "Digite la fecha de la cita: \n"
                + "Formato(DD/MM/AAAA)");
        nod.setFecha(Fe);
        String Med = JOptionPane.showInputDialog("Ingrese el Nombre del Medico Tratante:");
        nod.setNombre_Medico(Med);
        String espe[] = {"Cardiologo", "Otorrino", "Gastroenterologo"};
        String esp = (JOptionPane.showInputDialog(null, "Escoja la especialidad del Medico que atendera al Paciente: ", "Especialidad", 3, null, espe, espe[0]).toString());
        nod.setTipo_Especialidad(esp);
    }

    public static void mostrarCola(DeclararCola cola) {
        DeclararCola temp = new DeclararCola();
        String verDatosCola = "";
        while (!cola.colaVacia()) {
            verDatosCola = verDatosCola + String.valueOf("---- " + cola.valorFrente().getNombre_Paciente() + "\n"
                    + cola.valorFrente().getIdentificacion_Paciente() + "\n"
                    + cola.valorFrente().getCorreo_Paciente() + "\n"
                    + cola.valorFrente().getFecha() + "\n"
                    + cola.valorFrente().getNombre_Medico() + "\n"
                    + cola.valorFrente().getTipo_Especialidad() + "\n");
            temp.agregar(cola.valorFrente());
            cola.quitar();
        }
        JOptionPane.showMessageDialog(null, "=== ELEMENTOS DE LA DE COLA ===" + "\n" + verDatosCola + "\n");
        while (!temp.colaVacia()) {
            cola.agregar(temp.valorFrente());
            temp.quitar();
        }
    }

    public static void ordenAtencion(DeclararCola cola, String esp) {
        DeclararCola temp = new DeclararCola();
        String verDatosCola = "";
        while (!cola.colaVacia()) {
            if (cola.valorFrente().getTipo_Especialidad().equals(esp)) {
                verDatosCola = verDatosCola + String.valueOf("---- " + cola.valorFrente().getNombre_Paciente() + "\n"
                        + cola.valorFrente().getIdentificacion_Paciente() + "\n"
                        + cola.valorFrente().getCorreo_Paciente() + "\n"
                        + cola.valorFrente().getFecha() + "\n"
                        + cola.valorFrente().getNombre_Medico() + "\n"
                        + cola.valorFrente().getTipo_Especialidad() + "\n");
            }

            temp.agregar(cola.valorFrente());
            cola.quitar();
        }
        JOptionPane.showMessageDialog(null, "=== ELEMENTOS DE LA DE COLA ===" + "\n" + verDatosCola + "\n");
        while (!temp.colaVacia()) {
            cola.agregar(temp.valorFrente());
            temp.quitar();
        }
    }

    public static void main(String[] args) {
        DeclararCola cola = new DeclararCola();
        DeclararCola registro = new DeclararCola();
        Nodo aux;
        int opcion;
        int contCa = 0, contOt = 0, contGa = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    if (!cola.colaLlena()) {
                        aux = new Nodo();
                        llenar(aux);
                        if (aux.getTipo_Especialidad().equals("Cardiologo") && contCa < 20) {
                            cola.agregar(aux);
                            registro.agregar(aux);
                            JOptionPane.showMessageDialog(null, "Los datos del paciente fueron agregados correctamente");
                            contCa++;
                        }else if (aux.getTipo_Especialidad().equals("Otorrino") && contOt < 20) {
                            cola.agregar(aux);
                            registro.agregar(aux);
                            JOptionPane.showMessageDialog(null, "Los datos del paciente fueron agregados correctamente");
                            contOt++;
                        }else if (aux.getTipo_Especialidad().equals("Gastroenterologo") && contGa < 20) {
                            cola.agregar(aux);
                            registro.agregar(aux);
                            JOptionPane.showMessageDialog(null, "Los datos del paciente fueron agregados correctamente");
                            contGa++;
                        } else {
                            JOptionPane.showMessageDialog(null, "=== CLINICA MUNICIPAL ===" + "\n\n"
                                    + "El Numero de citas de esta especialidad a llegado a su limite \n\n");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Se alcanzo el limite de pacientes diarios");
                    }
                    break;
                case 2:
                    if (!cola.colaVacia()) {
                        cola.quitar();
                        JOptionPane.showMessageDialog(null, "=== CLINICA MUNICIPAL ===" + "\n\n"
                                + "--- Se eliminó el paciente de la cola");
                        mostrarCola(cola);
                    } else {
                        JOptionPane.showMessageDialog(null, "=== CLINICA MUNICIPAL ===" + "\n\n"
                                + "La cola está vacía, No pueden quitar datos \n\n");
                    }
                    break;
                case 3:
                    mostrarCola(registro);
                    break;
                case 4:
                    ordenAtencion(cola, "Cardiologo");
                    ordenAtencion(cola, "Otorrino");
                    ordenAtencion(cola, "Gastroenterologo");
                    break;
                case 5:
                    int card = registro.NumeroCitas("Cardiologo");
                    int otorrino = registro.NumeroCitas("Otorrino");
                    int gastro = registro.NumeroCitas("Gastroenterologo");
                    JOptionPane.showMessageDialog(null, "Numero de citas de Cardiologia: " + card + "\n"
                            + "Numero de citas de Otorrinologia: " + otorrino + "\n"
                            + "Numero de citas de Gastroenterologia: "  + gastro);
                    if (card > otorrino && card > gastro) {
                        JOptionPane.showMessageDialog(null, "La Especialidad con mayor atencion fue Cardiologia");
                    } else {
                        if (otorrino > card && otorrino > gastro) {
                            JOptionPane.showMessageDialog(null, "La Especialidad con mayor atencion fue Otorrinologia");
                        } else {
                            if (gastro > card && gastro > otorrino) {
                                JOptionPane.showMessageDialog(null, "La Especialidad con mayor atencion fue Gastroenterologia");
                            }
                        }
                    }
                    break;
                case 6:
                    cola.limpiarCola();
                    JOptionPane.showMessageDialog(null, "=== CLINICA MUNICIPAL ===" + "\n\n"
                            + "La cola está vacía, No pueden quitar datos \n\n");
                    mostrarCola(cola);
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);

    }

}

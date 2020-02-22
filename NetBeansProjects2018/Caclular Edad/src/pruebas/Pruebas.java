/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author manue
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        DateTimeFormatter form= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoy= LocalDate.now();
        LocalDate fecha= LocalDate.parse("30/01/2000", form);
        int edad = hoy.getYear()-fecha.getYear();
        
        System.out.println(edad);
        System.out.println(fecha.getMonth());
        
        
        Date h= new Date();
        LocalDate d=h.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        System.out.println(d.getYear()+" "+d.getMonth());
    }
    
}

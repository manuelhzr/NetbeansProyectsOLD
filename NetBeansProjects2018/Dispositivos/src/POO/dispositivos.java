/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.awt.Button;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author manue
 */
public class dispositivos {
    public static void main(String [ ]y){
        Disp not = new Disp ("Sistema de Notas");

        not.setSize(1000,1000);
        not.setVisible(true);    
    }
}

class Disp extends Frame implements // Agregar Cajas, Etiquetas, Botones y Areas de Texto y captura de datos
      java.awt.event.ItemListener 
  {
      
      int n, e1, u2;
      
      Label etiqueta1 = new Label("ID Dispositivo");
      Label etiqueta2 = new Label("Nombre del dispositivo");
      Label etiqueta3 = new Label("Tipo de dispositivo");
      
      TextField caja1 = new TextField(10);
      TextField caja2 = new TextField(10);
      TextField caja3 = new TextField(10);
      
      Button guardar = new Button("Guardar");
      Button buscar = new Button("Buscar");
      Button Limpiar =  new Button("Limpiar");
      TextArea Datos = new TextArea(10,60);
      
      
      Disp (String Nom){
          
          super(Nom);
          setLayout(new FlowLayout());
          
          add(etiqueta1); add(caja1);
          add(etiqueta2); add(caja2);
          add(etiqueta3); add(caja3);
          
          
          add(guardar); add(Datos);
          add(buscar);
          caja1.requestFocus();
          add(Limpiar);
          
          
      }
      
      public void itemStateChanged(ItemEvent ev){
      }
      
      public boolean action(Event e, Object o){ // Para Crear el Archivo donde se guardaran los datos de Entrada
          
          
          if(e.target==guardar){
              RandomAccessFile archi;
              
              try {
                  
                 File ff = new File ("Notas.dat"); 
                 
                 if (ff.exists()== false){
                     
                     archi = new RandomAccessFile("Notas.dat","rw");
                     
                 }
                 else{
                     archi = new RandomAccessFile("Notas.dat","rw");
                     archi.seek(archi.length());
                     
                 }
                 
                 String code = caja1.getText();
                 int L1 = code.length();
                 byte [ ]x1 = new byte  [5];
                 code.getBytes(0,L1,x1,0);
                 
                 String name = caja2.getText();
                 int L2 = name.length();
                 byte [ ]x2 = new byte  [10];
                 name.getBytes(0,L2,x2,0);
                 
                 int tipo=Integer.parseInt(caja3.getText());
                 String pc="";
                 
                  if (tipo==1) {
                      pc="Computadores";
                  }else{
                      if (tipo==2) {
                          pc="Audiovisuales";
                      }else{
                          if (tipo==3) {
                              pc="Moviles";
                          }else{
                              pc="No valido";
                          }
                      }
                  }
                 
                 int L3 = pc.length();
                 byte [ ]x3 = new byte  [13];
                 pc.getBytes(0,L3,x3,0);
                 
                 
                 archi.write(x1,0,5);
                 archi.write(x2,0,10);
                 archi.write(x3,0,13);
                 
                 caja1.setText("");
                 caja2.setText("");
                 caja3.setText("");
                 
                 archi.close();
                 return true;
              }//
              catch(IOException q){
              }
              
              return true;
              
          }
              if(e.target==buscar){ //Para mostrar los Datos y/o Resultados
                  RandomAccessFile archi;
                  try{
                      
                      archi = new RandomAccessFile("Notas.dat","rw");
                      
                      byte []h1 = new byte[5];
                      byte []h2= new byte[10];
                      byte []h3 = new byte[13];
                      Datos.setText("");
                   
                      archi.length();
                      Datos.appendText("       "+"    ID dispositivo    "+"       Nombre del Dispositivo       "+"   Tipo de Dispositivo   "+"\n");
                      for(int i=0; i<archi.length()/28;i++){
                      archi.seek(28*i);
                      
                      archi.read(h1,0,5);
                      String id =new String(h1);
                      
                      archi.read(h2,0,10);
                      String Name = new String(h2);
                      
                      archi.read(h3,0,13);
                      String TP = new String(h3);
                     
                      Datos.appendText("                                       "+id);
                      Datos.appendText("                                       "+Name);
                      Datos.appendText("                                       "+TP);
                      Datos.appendText("\n");
                      }
                  
                  
                  
                  }
                      catch(IOException q){}
                      return true;
              }
                   
                  
       if(e.target==Limpiar){
       Datos.setText("");
       return true;
       }
       return true;
   //Cierre del Public...
      }
  public boolean handleEvent(Event wq){
	if (wq.id==Event.WINDOW_DESTROY){
	dispose();
	}
	return super.handleEvent(wq);
	}
}


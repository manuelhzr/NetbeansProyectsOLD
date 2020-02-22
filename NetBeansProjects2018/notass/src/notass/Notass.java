package notass;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Notass {
     
    public static void main(String [ ]y){
        Note not = new Note ("Sistema de Notas");

        not.setSize(1000,1000);
        not.setVisible(true);    
    }
    
}
  class Note extends Frame implements // Agregar Cajas, Etiquetas, Botones y Areas de Texto y captura de datos
      java.awt.event.ItemListener 
  {
      
      int n, e1, u2;
      
      Label etiqueta1 = new Label("Codigo del Estudiante");
      Label etiqueta2 = new Label("Nombre");
      Label etiqueta3 = new Label("Nota del Primer Corte");
      Label etiqueta4 = new Label("Nota del Segundo Corte");
      Label etiqueta5 = new Label("Nota del Tercer Corte");
      Label Regis = new Label ("Registro");
      
      TextField caja1 = new TextField(5);
      TextField caja2 = new TextField(26);
      TextField caja3 = new TextField(4);
      TextField caja4 = new TextField(4);
      TextField caja5 = new TextField(4);
      TextField regis = new TextField(5);
      TextField codigo = new TextField(5);
      
      Button guardar = new Button("Guardar");
      Button buscarcod = new Button("Buscar Cod");
      Button buscar = new Button("Buscar");
      Button Limpiar =  new Button("Limpiar");
      TextArea Datos = new TextArea(10,60);
      
      
      Note (String Nom){
          
          super(Nom);
          setLayout(new FlowLayout());
          
          add(etiqueta1); add(caja1);
          add(etiqueta2); add(caja2);
          add(etiqueta3); add(caja3);
          add(etiqueta4); add(caja4);
          add(etiqueta5); add(caja5);
          
          
          add(guardar); add(Datos);
          add(buscar);add(Regis); 
          add(regis);
          caja1.requestFocus();
          add(Limpiar);add(codigo);
          add(buscarcod);
          
          
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
                 byte [ ]x1 = new byte  [4];
                 code.getBytes(0,L1,x1,0);
                 
                 String name = caja2.getText();
                 int L2 = name.length();
                 byte [ ]x2 = new byte  [25];
                 name.getBytes(0,L2,x2,0);
                 
                 String pc = caja3.getText();
                 int L3 = pc.length();
                 byte [ ]x3 = new byte  [3];
                 pc.getBytes(0,L3,x3,0);
                 
                 String sc = caja4.getText();
                 int L4 = sc.length();
                 byte [ ]x4 = new byte  [3];
                 sc.getBytes(0,L4,x4,0);
                 
                 String tc = caja5.getText();
                 int L5 = tc.length();
                 byte [ ]x5 = new byte  [3];
                 tc.getBytes(0,L5,x5,0);
                 
                 archi.write(x1,0,4);
                 archi.write(x2,0,25);
                 archi.write(x3,0,3);
                 archi.write(x4,0,3);
                 archi.write(x5,0,3);
                 
                 caja1.setText("");
                 caja2.setText("");
                 caja3.setText("");
                 caja4.setText("");
                 caja5.setText("");
                 
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
                      
                      byte []h1 = new byte[4];
                      byte []h2= new byte[25];
                      byte []h3 = new byte[3];
                      byte []h4 = new byte[3];
                      byte []h5 = new byte[3];
                      
                      //String aux1 = regis.getText();
                      //Integer P = new Integer(aux1);
                      //int P1;
                      
                      archi.length();
                      //P1=P.intValue();
                      
                      Datos.appendText("       "+"    Codigo del Estudiante    "+"       Nombre del Estudiante       "+"   Nota Del primer Corte   "+"    Nota del Segundo Corte   "+"  Nota del tercer Corte     "+"      Definitiva   "+"\n");
                      for(int i=0; i<archi.length()/38;i++){
                      archi.seek(38*i);
                      
                      archi.read(h1,0,4);
                      String code =new String(h1);
                      
                      archi.read(h2,0,25);
                      String Name = new String(h2);
                      
                      archi.read(h3,0,3);
                      String pc = new String(h3);
                      double pcc =Double.parseDouble(pc);
                      
                      
                      archi.read(h4,0,3);
                      String sc = new String(h4);
                      double scc =Double.parseDouble(sc);
                      
                      archi.read(h5,0,3);
                      String tc = new String(h5);
                      double tcc =Double.parseDouble(tc);
                      
                      Double nd = (pcc*0.35)+(scc*0.35)+(tcc*0.30);
                      DecimalFormat df = new DecimalFormat("0.0");
                      
                      
                      
                      
                      Datos.appendText("                                       "+code);
                      Datos.appendText("                                       "+Name);
                      Datos.appendText("                                       "+pcc);
                      Datos.appendText("                                       "+scc);
                      Datos.appendText("                                       "+tcc);
                      Datos.appendText("                                       "+df.format(nd));
                      Datos.appendText("\n");
                      }
                  
                  
                  
                  }
                      catch(IOException q){}
                      return true;
              }
              
              if(e.target==buscarcod){
                      RandomAccessFile archi;
                      try{
                      
                      archi = new RandomAccessFile("Notas.dat","rw");
                      
                      byte []h1 = new byte[4];
                      byte []h2= new byte[25];
                      byte []h3 = new byte[3];
                      byte []h4 = new byte[3];
                      byte []h5 = new byte[3];
                      
                      archi.length();
                      
                      Datos.appendText("       "+"    Codigo del Estudiante    "+"       Nombre del Estudiante       "+"   Nota Del primer Corte   "+"    Nota del Segundo Corte   "+"  Nota del tercer Corte     "+"      Definitiva   "+"\n");
                      for(int i=0; i<archi.length()/38;i++){
                      archi.seek(38*i);
                      archi.read(h1,0,4);
                      
                      String code =new String(h1);
                      int codd = Integer.parseInt(code);
                      
                      archi.read(h2,0,25);
                      String Name = new String(h2);
                      
                      archi.read(h3,0,3);
                      String pc = new String(h3);
                      double pcc =Double.parseDouble(pc);
                      
                      
                      archi.read(h4,0,3);
                      String sc = new String(h4);
                      double scc =Double.parseDouble(sc);
                      
                      archi.read(h5,0,3);
                      String tc = new String(h5);
                      double tcc =Double.parseDouble(tc);
                      
                      Double nd = (pcc*0.35)+(scc*0.35)+(tcc*0.30);
                      DecimalFormat df = new DecimalFormat("0.0");
                      
                      String aux2 = codigo.getText();
                      int codig = Integer.parseInt(aux2);
                       
                      while(codd==codig){
                      Datos.appendText("                                       "+code);
                      Datos.appendText("                                       "+Name);
                      Datos.appendText("                                       "+pcc);
                      Datos.appendText("                                       "+scc);
                      Datos.appendText("                                       "+tcc);
                      Datos.appendText("                                       "+df.format(nd));
                      Datos.appendText("\n");
                                               
                       n++;
                      break;
                      }
                      
                      }
                      if(n==1){
                          Datos.append("Hay un solo codigo");
                      }
                      else{
                      Datos.append("           "+"Hay "+n+" codigos iguales");}
                      
                     
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

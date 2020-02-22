
package zodiaco;


public class Signos {

    public Signos() {
    }
    
    private int dia;
    private String Mes;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }
    
    public String Signo(){
        String Signo="";

        switch(Mes){
            case "ENERO":
                if(dia<=20){
                    Signo="Capricornio";
                }else{
                    Signo="Acuario";
                }
                break;
            case "FEBRERO":                 
                if(dia >=1 && dia <=19){
                    Signo="Acuario";
                }else{
                    Signo="Picis";
                }
                break;
            case "MARZO":
                if(dia<=20){
                    Signo="Picis";
                }else{
                    Signo="Aries";
                }
                break;
            case "ABRIL":
                if(dia<=20){
                    Signo="Aries";
                }else{
                    Signo="Tauro";
                }
                break;
            case "MAYO":
                if(dia<=20){
                    Signo="Tauro";
                }else{
                    Signo="Geminis";
                }
                break;
            case "JUNIO":
                if(dia<=22){
                    Signo="Geminis";
                }else{
                    Signo="Cancer";
                }
                break;
            case "JULIO":
                if(dia<=22){
                    Signo="Cancer";
                }else{
                    Signo="Leo";
                }
                break;
            case "AGOSTO":
                if(dia<=22){
                    Signo="Leo";
                }else{
                    Signo="Virgo";
                }
                break;
            case "SEPTIEMBRE":
                if(dia<=22){
                    Signo="Virgo";
                }else{
                    Signo="Libra";
                }
                break;
            case "OCTUBRE":
                if(dia<=22){
                    Signo="Libra";
                }else{
                    Signo="Escorpion";
                }
                break;
            case "NOVIEMBRE":
                if(dia<=22){
                    Signo="Escorpion";
                }else{
                    Signo="Sagitario";
                }
                break;
            case "DICIEMBRE":
                if(dia<=20){
                    Signo="Sagitario";
                }else{
                    Signo="Capricornio";
                }
                break;
        }
        return Signo;
    }
}

package Peliculas;

public class Arreglo {
    private String[] Titulo;
    private int[] Puntuacion;

    public Arreglo() {
        this.Titulo=null;
        this.Puntuacion=null;
    }

    public String getTitulo(int i) {
        return Titulo[i];
    }

    public void setTitulo(int i, String Titulo) {
        this.Titulo[i] = Titulo;
    }

    public int getPuntuacion(int i) {
        return Puntuacion[i];
    }

    public void setPuntuacion(int i, int Puntuacion) {
        this.Puntuacion[i] = Puntuacion;
    }
    
    public String[] Titulo(){
        return this.Titulo;
    }
    
    public int[] Puntuacion(){
        return this.Puntuacion;
    }
    
    public void CrearArreglos(){
        
        this.Titulo=new String[]{"La Rosa púrpura del Cairo",
                                "Blade Runner",
                                "E.T. El extraterrestre",
                                "Berlin Alexanderplatz",
                                "Mi tío de América",
                                "Toro salvaje",
                                "La Guerra de las Galaxias",
                                "Taxi Driver",
                                "Barry Lyndon",
                                "Chinatown",
                                "La noche americana",
                                "El Padrino",
                                "Aguirre, la cólera de Dios",
                                "El discreto encanto de la burguesía",
                                "A touch of Zen",
                                "Érase una vez en América",
                                "Bonnie and Clide",
                                "Mouchette",
                                "Trenes rigurosamente vigilados",
                                "El bueno, el feo y el malo",
                                "Persona",
                                "Bande à part",
                                "Teléfono rojo, volamos hacia Moscú",
                                "Qué noche la de aquel día",
                                "Charada",
                                "8 y ½",
                                "Lawrence de Arabia",
                                "El mensajero del miedo",
                                "Yoyimbo",
                                "Psicosis",
                                "Los cuatrocientos golpes",
                                "Con faldas y a lo loco",
                                "Pyassa",
                                "Chantaje en Broadway",
                                "La invasión de los ladrones de cuerpos",
                                "Centauros del desierto",
                                "La trilogía de Apu",
                                "Sonrisas de una noche de verano",
                                "La ley del silencio",
                                "Cuentos de Tokio",
                                "Historias de la luna pálida de agosto",
                                "Vivir",
                                "Cantando bajo la lluvia",
                                "Umberto D",
                                "Un tranvía llamado deseo",
                                "En un lugar solitario",
                                "Ocho sentencias de muerte",
                                "Al rojo vivo",
                                "Retorno al pasado",
                                "Qué bello es vivir"};
        this.Puntuacion=new int[50];
        for (int i = 0; i < 50; i++) {
            setPuntuacion(i, (int)(Math.random()*5) );
        }
        
    }
    
    public boolean VectoresExisten(){
        if (this.Titulo!=null && this.Puntuacion!=null) {
            return true;
        }else{
            return false;
        }
    }
    
    
}

package puntuacionpeliculas;


public class Peliculas {
    private String[] Nombres;
    private int[] Puntuaciones;
    private NodoLista Inicio;

    public Peliculas() {
        Nombres=null;
        Puntuaciones=null;
        Inicio=null;
    }

    public String getNombres(int pos) {
        return Nombres[pos];
    }

    public void setNombres(int pos, String Nombres) {
        this.Nombres[pos] = Nombres;
    }

    public int getPuntuaciones(int pos) {
        return Puntuaciones[pos];
    }

    public void setPuntuaciones(int pos, int Puntuaciones) {
        this.Puntuaciones[pos] = Puntuaciones;
    }

    public NodoLista getInicio() {
        return Inicio;
    }

    public void setInicio(NodoLista Inicio) {
        this.Inicio = Inicio;
    }
    
    public void crearArreglos(){
        Nombres=new String[50];
        Puntuaciones=new int[50];
        
        String peliculas[]=new String[]{"La Rosa púrpura del Cairo",
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
        "Las tres noches de Eva",
        "Luna nueva"};
        Nombres=peliculas;
        for (int i = 0; i < 50; i++) {
            setPuntuaciones(i, (int) (Math.random()*5));
        }
        
    }
    public boolean vectorcreado(){
        return this.Nombres != null;
    }
    
    public boolean listaCreada(){
        return this.Inicio != null;
    }
    
    
    private NodoLista Ultimo(){
        NodoLista temp= Inicio;
        while(temp != null){
            if(temp.getSiguiente()==null){
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public void agregar(NodoLista nuevo){
        if(Inicio==null){
            setInicio(nuevo);
        }else{
            Ultimo().setSiguiente(nuevo);
        }
    }
    
    public String toString () {
		NodoLista aux2 = null;
		String cad = "";
		aux2 = Inicio;
		while (aux2 != null) {
			cad = cad + aux2.getNombre() + " -> "+aux2.getPuntuacion()+" -> "+aux2.getIndice()+"\n";
			aux2 = aux2.getSiguiente();
		}
		cad = cad +"\nFIN";
                return cad;
	}
    
}

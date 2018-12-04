package Ejercicio2_multihilo;

public class Cola {
    private String texto;
    private boolean disponible = false;//inicialmente cola vacia

    public String get() {
	    if(disponible) {      //hay número en la cola
	    	disponible = false; //se pone cola vacía
            return texto;      //se devuelve
	    }
	    return "-1";	//no hay número disponible, cola vacía	
    }

    public void put(char c) {
    	texto=""+c;    //coloca c en la cola 
        disponible = true; //disponible para consumir, cola llena	
    }
}
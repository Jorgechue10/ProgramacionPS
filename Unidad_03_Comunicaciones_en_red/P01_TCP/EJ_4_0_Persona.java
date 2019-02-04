package P01_TCP;

import java.io.Serializable;

public class EJ_4_0_Persona implements Serializable{

	String nombre;
	int edad;
	
	public EJ_4_0_Persona(String n, int e) {
		this.nombre = n;
		this.edad = e;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}	
}
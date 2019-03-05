package P02_Servidor_Ficheros_FTP;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CambioDirectorio implements Serializable {
	String ruta;

	public String getNombreDirectorio() {
		return ruta;
	}

	public CambioDirectorio(String ruta) {
		this.ruta = ruta;
	}
}
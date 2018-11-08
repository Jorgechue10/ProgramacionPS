package P01_Procesos_Java;

public class lanzadorProceso {

	public void ejecutar(String ruta){

        ProcessBuilder pb;
        try {
        	pb = new ProcessBuilder(ruta);
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
	public static void main(String[] args) {
	        String ruta = "C:\\Program Files (x86)\\Notepad++\\notepad++.exe";
	        lanzadorProceso lp=new lanzadorProceso();
	        lp.ejecutar(ruta);
	        System.out.println("Finalizado");
	}
}
package P02_Procesos_Java;

public class EJ_2_lanzadorProceso {

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
	        String ruta = "C:\\Program Files\\Notepad++\\notepad++.exe";
	        EJ_2_lanzadorProceso lp=new EJ_2_lanzadorProceso();
	        lp.ejecutar(ruta);
	        System.out.println("Finalizado");
	}
}
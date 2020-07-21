package P02_Procesos_Java;

public class EJ_3_2_Lanzador {

	public void lanzarSumador(Integer n1, Integer n2){
		String clase = "P02_Procesos_Java.EJ_3_1_Sumador";
	    ProcessBuilder pb;
	    try {
	        pb = new ProcessBuilder("java", clase, n1.toString(), n2.toString());	        
	        pb.start();
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Exception");
	    }
	}
	
	public static void main(String[] args){
		EJ_3_2_Lanzador l = new EJ_3_2_Lanzador();
	    l.lanzarSumador(1, 51);
	    l.lanzarSumador(51, 100);
	    System.out.println("Sumas realizadas con éxito");
	}
}
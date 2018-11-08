package P01_Procesos_Java;

public class EJ_3_1_Sumador {

	/**
	 * Dado dos valores, empieza a sumar todos los n�meros siguientes 
	 * al primer par�metro hasta llegar al segundo par�metro
	 * @param n1 Integer. Valor inicial para realizar la suma
	 * @param n2 Integer. N�mero con el que se va a terminar la suma
	 * @return Integer. Devuelve el resultado de la operaci�n
	 */
	public int sumar(int n1, int n2){
        int resultado=0;
        for (int i=n1;i<=n2;i++){
                resultado=resultado+i;
        }
        // System.out.println(resultado);
        return resultado;
	}

	public static void main(String[] args){
        EJ_3_1_Sumador s=new EJ_3_1_Sumador();
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int resultado=s.sumar(n1, n2);
        System.out.println(resultado);
	}
}
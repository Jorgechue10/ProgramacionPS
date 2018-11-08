package P01_Procesos_Java;

public class Sumador {

	/**
	 * Dado dos valores, empieza a sumar todos los números siguientes 
	 * al primer parámetro hasta llegar al segundo parámetro
	 * @param n1 Integer. Valor inicial para realizar la suma
	 * @param n2 Integer. Número con el que se va a terminar la suma
	 * @return Integer. Devuelve el resultado de la operación
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
        Sumador s=new Sumador();
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        int resultado=s.sumar(n1, n2);
        System.out.println(resultado);
	}
}
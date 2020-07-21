package P02_Procesos_Java;

public class Actividad_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Si el número de argumentos es menor que 1  
		if(args.length<1) {
			System.out.println("primer if");
			System.exit(1);//Devuelve 1
		}
		
		//Si el argumento es una cadena debe devolver 2 
		if((args.length==1)&&(args[0] instanceof String)) {
			System.out.println("segundo if");
			System.exit(2);//Devuelve 2
		}
		
		//Si el argumento es un número entero menor que 0 debe devolver 3.
		if((args.length==1)&&(args[0].charAt(0)=='-')&&(esNumero(args[0].charAt(1)))) {
			System.out.println("tercer if");
			System.exit(3);//Devuelve 3
		}
		System.out.println("cuarto if");
		System.exit(0);//En cualquier otra situaci�n debe devolver 0.		
	}
	
	public static boolean esNumero(char c) {
		String numeros="1234567890";
		if (numeros.indexOf(c)== -1) {
				return false;
		}
		return true;
	}	
}
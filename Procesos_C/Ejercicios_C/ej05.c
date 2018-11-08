/*Escribir un programa que pida por teclado un número (dato entero) del 1 al 10.
Muestre por pantalla su equivalente en letras (dato cadena).
Nota: si el número introducido es menor que 1 ó mayor que 10,
se mostrará el mensaje: "ERROR: El número debe ser >= 1 y <= 10.".
Ejemplo: Entrada 1, Salida “uno”.*/

#include <stdio.h>

int main(){

  int n;

	printf("Introduce el número\r\n");
	scanf("%d",&n);

  if((n>=1)&&(n<=10)){
    switch (n) {
      case 1: printf("UNO");break;
      case 2: printf("DOS");break;
      case 3: printf("TRES");break;
      case 4: printf("CUATRO");break;
      case 5: printf("CINCO");break;
      case 6: printf("SEIS");break;
      case 7: printf("SIETE");break;
      case 8: printf("OCHO");break;
      case 9: printf("NUEVE");break;
      case 10: printf("DIEZ");break;
    }
  }else{
    printf("ERROR: El número debe ser >= 1 y <= 10.");
  }

	return 0;
}

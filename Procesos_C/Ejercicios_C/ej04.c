/*Escribir un programa que pida por teclado un número (dato entero).
Muestre por pantalla: "ES PAR", en el caso de que el número sea divisible entre 2.
"ES IMPAR", en el caso de que el número no sea divisible entre 2.*/

#include <stdio.h>

int main(){

	int n;

	printf("Introduce el número\r\n");
	scanf("%d",&n);

  if((n%2)==0){
    	printf("ES PAR");
  }else{
    printf("ES IMPAR");
  }

	return 0;
}

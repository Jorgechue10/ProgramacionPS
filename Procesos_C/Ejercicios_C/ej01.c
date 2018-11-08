/*Escribir un programa que pida por teclado dos números (datos enteros).
Calcule la suma y multiplicación de los dos números introducidos.*/

#include <stdio.h>

int main(){

	int a,b,suma,multiplicacion;
	printf("Introduce dos números\r\n");

	scanf("%d",&a);
	scanf("%d",&b);

	suma=a+b;
	multiplicacion=a*b;

	printf("La suma de los dos números es: %i, y la multiplicacion es: %i",suma,multiplicacion);


	return 0;
}

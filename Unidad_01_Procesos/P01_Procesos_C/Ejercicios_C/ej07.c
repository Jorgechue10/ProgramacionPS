/*Escribir un programa que pida por teclado la arista (dato real) de un cubo.
En el caso de que la arista sea menor o igual que 0,
muestre por pantalla el mensaje: "ERROR: La arista debe ser mayor que cero."
Repita los pasos anteriores mientras que, la arista introducida sea incorrecta.
Muestre por pantalla: "El volumen de un cubo de arista es: <área>." Nota: utilizar un bucle while.*/

#include <stdio.h>

int main(){

	int arista,volumen;
	printf("Introduce la arista de un cubo\r\n");
	scanf("%d",&arista);

	while(arista<=0){
		printf("ERROR: La arista debe ser mayor que cero\r\n");
		printf("Introduce la arista de un cubo\r\n");
		scanf("%d",&arista);
		}
		volumen=arista*arista*arista;
		printf("El volumen de un cubo de arista %d es: %d",arista,volumen);

	return 0;
}

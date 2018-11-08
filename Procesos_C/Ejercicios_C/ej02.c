/*Escribir un programa que pida por teclado una hora en horas, minutos y segundos (datos enteros).
Calcule cuántos segundos han pasado desde las 0:0:0 horas. Muestre por pantalla el resultado (dato entero).*/

#include <stdio.h>

int main(){

	int h,m,s,tiempo_total;

	printf("Introduce las horas\r\n");
	scanf("%d",&h);

	printf("Introduce los minutos\r\n");
	scanf("%d",&m);

	printf("Introduce los segundos\r\n");
	scanf("%d",&s);

	tiempo_total=h*3600+m*60+s;

	printf("El tiempo que ha pasado desde las 0:0:0 es: %i segundos",tiempo_total);

	return 0;
}

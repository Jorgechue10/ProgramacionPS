/*Escribir un programa que pida por teclado tres números (datos enteros).
Muestre el mayor de los tres números introducidos.*/

#include <stdio.h>

int main(){

  int a,b,c,mayor=0;

	printf("Introduce tres números\r\n");
	scanf("%d",&a);
  scanf("%d",&b);
  scanf("%d",&c);

  if(mayor<a){
    mayor=a;
  }
  if(mayor<b){
    mayor=b;
  }
  if(mayor<c){
    mayor=c;
  }

  printf("El mayor es: %d",mayor);

	return 0;
}

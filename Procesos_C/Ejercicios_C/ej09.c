/*Escribir un programa que muestre por pantalla todos los números
múltiplos de 4 que hay entre el 64 y el 44, ambos inclusive.*/

#include <stdio.h>

int main(){

  int i;

  for (i = 64; i >= 44; i--) {
    if((i%4)==0){
      	printf("%d\n", i);
    }
  }

	return 0;
}

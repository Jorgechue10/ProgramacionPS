/*Hacer lo mismo que el ejercicio anterior, pero modificacndo estos aspectoss:
a) El padre envía 2 señales con un manejador diferente.
b) El padre NO recibe señal del hijo_pid.
c) El hijo SÓLO recibe señales.
d) El hijo NO envía señal al padre.*/

#include <stdio.h>
#include <signal.h>
#include <stdlib.h>
#include <fcntl.h>

void manejador_padre1 (int senial){
  printf("El PADRE recibe señal1... %d\n", senial);
}

void manejador_padre2 (int senial){
  printf("El PADRE recibe señal2... %d\n", senial);
}

int main() {
  int pid_padre, pid_hijo;

  pid_padre = getpid();
  pid_hijo = fork();

  switch (pid_hijo) {

    case -1:
      printf("No se ha podido crear el proceso hijo....\n");
      exit(-1);

    case 0: // Hijo
      while(1){
        pause();
      }
      signal(SIGUSR1, manejador_padre1);
      sleep(1);
      signal(SIGUSR1, manejador_padre2);
      break;

    default:// Padre

      kill(pid_hijo, SIGUSR1); // Envio de señal al HIJO
      sleep(1);
      kill(pid_hijo, SIGUSR1);
      break;
  }
}

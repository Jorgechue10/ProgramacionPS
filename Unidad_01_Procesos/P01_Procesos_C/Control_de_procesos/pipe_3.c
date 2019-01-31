/*Realizar lo mismo que el ejercicio anterior, pero esta vez al revés, es decir,
que el hijo le envie la información al padre y que el padre la lea*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main(){
	int fd[2];
	pid_t pid;
	char saludoHijo[]="Hola papá";
	char buffer[80];


	pipe(fd);

	pid=fork();

	switch(pid){
		case -1: //error
			printf("no se ha podido crear el hijo\n");
			exit(-1);
		case 0:
      close (fd[0]);
      write (fd[1],saludoHijo, strlen(saludoHijo));
      printf("el hijo envia un mensaje al pipe...\n");
			break;
		default:
      wait(NULL); // espero a que termine el proceso hijo
      close (fd[1]);//siempre hay que cerrar el canal que no voy a usar
      read (fd[0],buffer,sizeof(buffer));
      printf("el padre recibe un mensaje del pipe %s \n", buffer);
			break;
	}
}

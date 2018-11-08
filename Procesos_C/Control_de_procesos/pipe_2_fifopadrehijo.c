/*         |-> padre cierra fd[0] |
PADRE->HIJO|-> hijo cierra fd[1]  | fd[0] LECTURA
                                  |
HIJO->PADRE|->padre cierra fd[1]  | fd[1] ESCRITURA
           |->hijo cierra fd[0]   |
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main(){
	int fd[2];
	pid_t pid;
	char saludoPadre[]="Pequeño saltamontes";
	char buffer[80];


	pipe(fd);

	pid=fork();

	switch(pid){
		case -1: //error
			printf("no se ha podido crear el hijo\n");
			exit(-1);
		case 0:
			close (fd[1]);//siempre hay que cerrar el canal que no voy a usar
			read (fd[0],buffer,sizeof(buffer));
			printf("el hijo recibe un mensaje del pipe %s \n", buffer);
			break;
		default:
			close (fd[0]);
			write (fd[1],saludoPadre, strlen(saludoPadre));
			printf("el padre envia un mensaje al pipe...\n");
			wait(NULL); // espero al proceso hijo
			break;
	}
}

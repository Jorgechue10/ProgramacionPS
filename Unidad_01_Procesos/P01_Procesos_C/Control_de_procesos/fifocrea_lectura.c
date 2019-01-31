/*
mkfifo (char * pathname, mode_t modo) -> Devuelve 0 si todo ha ido BIEN y devuelve -1 si NO todo ha ido bien

Los parametros que se meten en mode_t son:
S_IFREG -> Normal
S_IFCHAR -> Caracteres
S_IFBLK -> Bloques
S_IFIFO -> Crear FIFO
*/

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h> //Parametros de mkfifo
#include <sys/stat.h> //Librerias que necesita mkfifo
#include <fcntl.h> //Librerias que necesita mkfifo

int main(void){

  int fp;
  int p, bytesleidos;
  char buffer[10];

  p=mkfifo("FIFO", S_IFIFO|0666); //permiso de lectura y escritura

  if (p==-1){
    printf("ERROR al crear el FIFO...)\n");
    exit(0);
  }

  while(1){
    fp=open("FIFO",0);
    bytesleidos= read(fp,buffer,1);
    printf("Recogindo datos del pipe...");
    while(bytesleidos != 0){
      printf("%1c", buffer[0]);
      bytesleidos= read(fp,buffer,1);
    }
    close(fp);
  }
  return 0;
}

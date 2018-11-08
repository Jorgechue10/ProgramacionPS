#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){

  int fp;
  char saludo[] = "Un saludo!!!\n", buffer[10];

  fp=open("FIFO",1);

  if (fp==-1){
    printf("ERROR al abrir el FIFO...)\n");
    exit(0);
  }

  printf("Enviando datos al FIFO...");
  write(fp, saludo, strlen(saludo));
  close(fp);

  return 0;
}

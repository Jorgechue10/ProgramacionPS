## Control de proceso en GNU/Linux

### Creación y ejecución
- [execl](execl.c)

###### Actividad

Realiza un programa en C para ver el PID del proceso actual y el proceso padre.
Utiliza las funciones _getpid y getppid_.

- [fork](fork.c)
- [fork1](fork1.c)

###### Actividad

Realiza un programa en C que cree un proceso. El programa definirá una variable
entera y le dará el valor 10. El proceso padre incrementará el valor en 4 y el hijo
restará 4. Se deben mostrar los valores en pantalla.

### Comunicación entre procesos
- [ficheros](fichero.c)
- [pipe](pipe_1.c)
- [pipe](pipe_2_fifopadrehijo.c) Comunicación padre a hijo

###### Actividad

Realiza un programa en C en el que el proceso hijo envia información al proceso padre.

- Pipe con nombre (FIFO)
  - [Lectura](fifocrea_lectura.c)
  - [Escritura](fifoescribe.c)

### Sincronización

- [Envio de señales](signal.c)
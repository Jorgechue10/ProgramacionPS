# Clases para la creación de Hilos

**Definición:** Un hilo es una secuencia de código en ejecución dentro del contexto de un proceso. Los hilos no pueden ejecutarse ellos solos, necesitan la supervisión de un proceso padre para ejecutarse. Dentro de cada proceso hay varios hilos ejecutandose.

#### Thread

- [Hilo0](EJ_0_Hilo_thread.java)
- [Mi primer hilo](EJ_1_Hilo_thread.java)
- [Mi segundo hilo](EJ_2_Hilo_thread.java)
- [Métodos](EJ_3_Hilo_thread_metodos.java)
- [Grupos de hilos](EJ_4_Hilo_thread_grupos_de_hilos.java)

#### Runnable

- [Hilo Runnable](EJ_5_Hilo_Runnable.java)
- [Reloj](EJ_6_Reloj.java)
- [Contador](EJ_7_Applet_contador.java)

### Ejercicios Thread

1. **Hola Mundo:** Crea una clase para visualizar el mensaje "Hola Mundo!". A continuación, crea un programa que visualice el mensaje anterior cinco veces creando para ello cinco hilos diferenes usando la clase anterior. Modifica el mensaje "Hola mundo!" en el hilo para incluir el identificador de hilo. **Solución:** [Actividad_1](Actividad_1.java)

2. **TIC TAC:** Crea dos clases(hilos) Java. Uno de los hilos debe visualizar en pantalla en un bucle infinito la palabra TIC y el otro la palabra TAC. Dentro del bucle utiliza el método sleep() para que de tiempo a ver las palabras que se visualizan cuando lo ejecutemos. Añade un bloque try-catch(InterruptedException). Crea la función main() que haga uso de los hilos anteriores. ¿Se visualiza de forma ordena TIC TAC TIC TAC ...? **Solución:** [Clase_Tic](Actividad_2_1_Clase_Tic.java) [Clase_Tac](Actividad_2_2_Clase_Tac.java) [Clase_main](Actividad_2_3_Clase_main.java)

3. **Ficheros:** Crea una aplicación que reciba a través de sus argumentos una lista de ficheros de texto y cuente el número de caracteres que hay en cada fichero. Modifica el programa para que se cree un hilo para cada fichero a contar. En ambos casos muestra el tiempo que tarda en contar todos los ficheros. **Solución:** [Actividad_3](Actividad_3.java) [Actividad_3_Secuencial](Actividad_3_Secuencial.java)
```
long t_inicio, t_fin;
t_inicio = System.currentTimeMillis(); // tiempo en milisegundos
// Tarea a realizar
t_fin = System.currentTimeMillis();
long tiempo_total = t_fin - t_inicio
```
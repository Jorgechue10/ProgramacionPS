# Manejo de procesos con Java

- [Ejecutar una aplicación](EJ_1_ejecutarApp.java)
- [Lanzar un proceso-aplicación](EJ_2_lanzadorProceso.java)
- [Sumador](EJ_3_1_Sumador.java) Clase para sumar valores enteros consecutivos.
- [Lanzador](EJ_3_2_Lanzador.java) Se ejecuta un proceso que utiliza la clase anterior.
- [Leer Stream](EJ_3_3_LanzadorStreamSalida.java) Lee el stream de salida del proceso.

**Actividad:** Crea un programa que admita argumentos desde el main y devuelva con  ```System.exit()``` los siguientes valores:
- Sí el número de argumentos es menor que 1 debe devolver 1.
- Si el argumento es una cadena debe devolver 2.
- Sí el argumento es un número entero menor que 0 debe devolver 3.
- En cualquier otra situación debe devolver 0.
	
A continuación, crea otro programa que ejecute al anterior. Deberá mostrar en pantalla lo que pasa dependiendo del valor devuelto al ejecutar el programa anterior.

**Solución:** [Actividad_1_1](Actividad_1_1.java) [Actividad_1_2](Actividad_1_2.java)

#### Enviar datos al stream de entrada del proceso

- [Enviar datos](EJ_4_EnviarDatos.java).

#### Redireccionando la salida

- [Redireccionar](EJ_5_RedireccionarSalida.java)
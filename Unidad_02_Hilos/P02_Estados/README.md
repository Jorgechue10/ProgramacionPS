# Estados de un hilo

1. **NEW:** Se crea el objeto, pero no se ejecuta. Queda a la espera de lanzar el método ```run()```.
2. **RUNNABLE:** Al llamar al método ```start()``` el hilo pasa a este estado.
3. **DEAD:** Se entra a este estado cuando finaliza el método ```run()```
4. **BLOCKED:** Debe ocurrir una de las siguientes circunstancias para que se llegue a este estado:
	- Llamada al método ```sleep()```.
	- EL hilo espera a una operación de entrada/salida.
	- Llamada al método ```wait()```. El hilo no volverá a ejecutarse hasta que reciba los mensajes ```notify()``` o ```notifyAll()```
	- Llamada al método ```suspend()```. No se volverá ejecutable hasta que reciba el mensaje ```resume()```.
	
	
Ejemplo: _[HiloDead](HiloDead.java)_


El método ``getState()`` devuelve una constante con el estado del hilo:

- **NEW:** Sin iniciar.
- **RUNNABLE:** Ejecutandose.
- **BLOCKED:** Bloquedado.
- **WAITING:** Esperando indefinidamente, a que un evento le active.
- **TIMED_WAITING:** Espera limitada por tiempo.
- **TERMINATED:** Finalizado.
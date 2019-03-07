package Ejercicio2;

public class SystemProperties {
	public static void main(String[] args) {	
		String t[] = { "os.name", "os.version",  "os.arch",
					"line.separator", "path.separator",
					"user.dir", "user.home", "user.name",
					"java.class.path", "java.home", 
					"java.vendor", "java.version" };
        
		for (int i = 0; i < t.length; i++) {
			System.out.print("Property:" + t[i]);
			try {
				String s = System.getProperty(t[i]);
				System.out.println("\t==> " + s);
			} catch (Exception e) {
				System.err.println("\n\tException " + e.toString());
			}
		}
	}
}

/*Ejemplo llamada por línea de comandos para ejecutar con SecurityManager.

java -classpath "C:/Users/ifc/git/ProgramacionPS/bin/Ejercicio2/"
	-Djava.security.manager -Djava.security.policy="C:/Users/ifc/git/ProgramacionPS/bin/Ejercicio2/politica.policy" SystemProperties2
	-Dfile.encoding=UTF-8 -classpath "C:/Users/ifc/git/ProgramacionPS/bin/Ejercicio2/" SystemProperties*/

/*

 
 */
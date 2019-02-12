//-Djava.security.manager
package P01_Seguridad_en_Java;

public class EJ_1_PropiedadesSistema {
	public static void main(String[] args) {	
		String t[] = { "os.name", "os.version", 
					"user.dir", "user.home", "user.name",
					"java.class.path", "java.home", 
					"java.vendor", "java.version"};
        
		for (int i = 0; i < t.length; i++) {
			System.out.printf("Propiedad: %16s", t[i]);
			try {
				String s = System.getProperty(t[i]);
				System.out.println("==> " + s);
			} catch (Exception e) {
				System.err.println("\n\tExcepción " + e.toString());
			}
		}
	}
}
import java.util.Scanner;

public class Persona { //Clase padre de Ciente y EmpleadoGeneral
	
	//Atributos de la clase Persona
	
	public String Nombre;
	private String Apellido;
	private String Documento;

	//Setters y Getters
	
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return this.Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public String getDocumento() {
		return this.Documento;
	}

	public void setDocumento(String documento) {
		this.Documento = documento;
	}

	//Metodos
	
	public void Hablar(Persona persona) {
		System.out.println("Hola mi nombre es " + persona.Nombre);
	}

	public void IngresarDatos(){
		
		    Scanner lectura = new Scanner (System.in);
			
			System.out.println("Ingrese su nombre: ");

			String Nombre = lectura.next();
			
			setNombre(Nombre);

			System.out.println("Ingrese su Apellido: ");

			String Apellido = lectura.next();
			
			setApellido(Apellido);
			
			System.out.println("Ingrese su Documento: ");
			
			String Documento = lectura.next();
			
			setDocumento(Documento);
		

	}

    public void VerDatos() {
    	System.out.println("Nombre: "+getNombre());
    	System.out.println("Apellido: "+getApellido());
    	System.out.println("Documento: "+getDocumento());
    }
}

   
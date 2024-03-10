import java.util.Scanner;
public class EmpleadoGeneral extends Persona { //Clase hija de Persona
	
	//Atributos de la clase EmpleadoGeneral
	
	private int NumeroDeEmpleado;
	private int Sueldo;
	private int AñosDeServicio;
	private static int Total;

	//Constructor
	
	public EmpleadoGeneral(int NumeroDeEmpleado) {
		if (NumeroDeEmpleado >= 0) {
			this.NumeroDeEmpleado = NumeroDeEmpleado;
			Total++;
			System.out.println("se crearon en total " + Total + " cuentas");
		} else {
			this.NumeroDeEmpleado = 0;
			System.out.println("su cuenta no se pudo crear");
		}

	}

	//Setters y Getters

	public int getNumeroDeEmpleado() {
		return NumeroDeEmpleado;
	}

	public void setNumeroDeEmpleado(int numeroDeEmpleado) {
		NumeroDeEmpleado = numeroDeEmpleado;
	}

	public int getSueldo() {
		return Sueldo;
	}

	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}

	public int getAñosDeServicio() {
		return AñosDeServicio;
	}

	public void setAñosDeServicio(int añosDeServicio) {
		AñosDeServicio = añosDeServicio;
	}

	
	//Metodos 
	
	public double GenerarBonificacion() {
		return (getSueldo() * 0.1);
	}
	
	public void IngresarDatos(EmpleadoGeneral empleado){
		
		    empleado.IngresarDatos(empleado);
		
		    Scanner lectura = new Scanner (System.in);
			
		    System.out.println("Ingrese su Sueldo: ");

			int Sueldo = lectura.nextInt();
			
			setSueldo(Sueldo);

			System.out.println("Ingrese sus Años de Servicio: ");

			int AñosDeServicio = lectura.nextInt();
			
			setAñosDeServicio(AñosDeServicio);
		
	
	}

    public void VerDatos(EmpleadoGeneral empleado) {
		 empleado.VerDatos();
		 System.out.println("Sueldo: "+getSueldo());
		 System.out.println("Años de Servicio: "+getAñosDeServicio());
		 
	 }
}

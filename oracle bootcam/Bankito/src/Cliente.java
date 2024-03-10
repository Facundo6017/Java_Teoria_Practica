

public class Cliente extends Persona{ //Clase padre de Inversor 
	
	//Atributos de la clase Cliente
	
	private int NumeroDeCliente;
	private int Saldo;
 	
	private static int Total=0;
	
	//Constructor
	
	public Cliente(int NumeroDecliente) {
		if (NumeroDecliente>= 0) {
			this.NumeroDeCliente= NumeroDecliente ;
			Total++;
			System.out.println("se crearon en total "+Total+" cuentas");
		}else {
			this.NumeroDeCliente = 0;
			System.out.println("su cuenta no se pudo crear");
		}
	
		
	}
	
	//Seters y Getters

	public int getSaldo() {
		return Saldo;
	}
	
    public void setSaldo(int saldo) {
		Saldo = saldo;
	}

    public int getNumeroDeCliente() {
		return NumeroDeCliente;
	}

	public void setNumeroDeCliente(int numeroDeCliente) {
		NumeroDeCliente = numeroDeCliente;
	}
    
	//Metodos 
	
	public void Depositar(int valor) {
		if(NumeroDeCliente != 0) {
		this.Saldo = this.Saldo + valor;
		System.out.println("Se deposito exitosamente "+valor+"$");
		}else {
			System.out.println("no se puede depositar por que no se asigno un numero de cliente");
		}
	}

	public void Retirar(int valor) {
		if (NumeroDeCliente != 0) {
			if (this.Saldo >= valor) {
				this.Saldo -= valor;
				System.out.println("Se retiro exitosamente "+valor+"$");
			} else {
				System.out.println("No se puede retirar saldo insuficiente");
			}
		} else {
			System.out.println("no se puede retirar por que no se asigno un numero de cliente");
		}

	}

	public void Transferir(int valor, Cliente cuenta) {
		if (NumeroDeCliente != 0) {
			if (this.Saldo >= valor) {
				cuenta.Saldo += valor;
				this.Saldo -= valor;
				System.out.println("Se transfirio exitosamente " + valor + "$ a " + cuenta.getNombre());
			} else {
				System.out.println("No se pudo transferir a " + cuenta.getNombre() + " Saldo insuficiente");
			}
		} else {
			System.out.println("no se puede Transferir por que no se asigno un numero de cliente");
		}
	}

	public void VerSaldo() {
		if (NumeroDeCliente != 0) {
			System.out.println("Su saldo es " + this.Saldo +"$");
		} else {
			System.out.println("no se puede ver el saldo por que no se asigno un numero de cliente");
		}
	}

}   

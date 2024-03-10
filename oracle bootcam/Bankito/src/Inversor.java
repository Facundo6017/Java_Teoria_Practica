
public class Inversor extends Cliente {  //clase hija de Cliente
    
	//Atributos de la clase Inversor
	
	private int DineroInvertido;

	//Constructor 

	public Inversor(int NumeroDecliente) {
		super(NumeroDecliente);
	}

	//Setters y Getters

	public int getDineroInvertido() {
		return DineroInvertido;
	}

	public void setDineroInvertido(int dineroInvertido) {
		DineroInvertido = dineroInvertido;
	}

	//Metodos
	
	public void InvertirDinero(int Dinero) {
		if (super.getNumeroDeCliente() > 0) {
			if (super.getSaldo() > Dinero) {
				this.DineroInvertido = Dinero;
				super.setSaldo(super.getSaldo() - Dinero);
				System.out.println("se invirtieron " + Dinero + "$ en el Mercado.");
			} else {
				System.out.println("No tiene el saldo suficiente para invertir");
			}

		} else {
			System.out.println("no se puede invertir por que no se asigno un numero de cliente");
		}

	}

	public void VerDineroInvertido() {
		System.out.println("El dinero invertido es " + this.getDineroInvertido() + "$");
	}
}


public class Operaciones {
        public static void main(String[]args) {
        	
        	Cliente pepe = new Cliente(1);
        	pepe.setNombre("pepe");
        	pepe.setApellido("Argento");
        	pepe.setDocumento("4021230");
            
            Inversor paola = new Inversor(2);
            paola.setNombre("paola");
            paola.setApellido("Argento");
            paola.setDocumento("2441244");
            
            Cliente coqui = new Cliente(3);
            coqui.setNombre("coqui");
            coqui.setApellido("Argento");
            coqui.setDocumento("2399302");
          
            System.out.println(paola.getNumeroDeCliente());
            paola.Depositar(1000);
            paola.Retirar(200);
            paola.Transferir(100, coqui);
            paola.InvertirDinero(100);
            paola.VerSaldo();
            paola.VerDineroInvertido();
            
            EmpleadoGeneral facundo = new EmpleadoGeneral(1);
            facundo.IngresarDatos();
            facundo.VerDatos();
            facundo.Hablar(facundo);
        }
        //en este codigo solo se prueban los metodos y se instancian las clases a modo de prueba
}

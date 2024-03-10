import javax.swing.*;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {

        //entrada de datos mediante cuadros de dialogos
        int numero = 0;
        String dialogo = JOptionPane.showInputDialog(null,"ingrese un entero:") ;
        try {
            numero = Integer.parseInt(dialogo);
        } catch(NumberFormatException e) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numero = " + numero);

        //entrada de datos por la consola
        int numero2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar un numero:");
        String numeroStr = scanner.nextLine();

        try {
            numero2 = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e) {
            System.out.println("Error debe ingresar un numero entero");
            System.exit(02);
        }
        System.out.println("numero = " + numero2);


    }
}

public class Primitivos {
    public static void main(String[] args) {
         //tipo de dato int


        byte numeroByte = 127;// tipo de dato primitivo int
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("typo byte corresponde en byte a:"+Byte.BYTES);
        System.out.println("typo byte corresponde en bites:"+Byte.SIZE);
        System.out.println("typo byte valor maximo:"+Byte.MAX_VALUE);
        System.out.println("typo byte valor minimo:"+Byte.MIN_VALUE);


        short numeroShort = 128; //tipo de dato primitivo int
        System.out.println("tipo short corresponde byte a:"+Short.BYTES);
        System.out.println("tipo short corresponde bites a:"+Short.SIZE);
        System.out.println("tipo short valor maximo:"+Short.MAX_VALUE);
        System.out.println("tipo short valor minimo:"+Short.MIN_VALUE);


        int numeroInt = 32768; //tipo de dato primitivo int
        System.out.println("tipo int corresponde byte a:"+Integer.BYTES);
        System.out.println("tipo int corresponde bites a:"+Integer.SIZE);
        System.out.println("tipo int valor maximo:"+Integer.MAX_VALUE);
        System.out.println("tipo int valor minimo:"+Integer.MIN_VALUE);


        long numeroLong = 2147483648L; //tipo de dato primitivo int
        System.out.println("tipo long corresponde byte a:"+Long.BYTES);
        System.out.println("tipo long corresponde bites a:"+Long.SIZE);
        System.out.println("tipo long valor maximo:"+Long.MAX_VALUE);
        System.out.println("tipo long valor minimo:"+Long.MIN_VALUE);


        //typo var


        var numeroVar = 1;//es una variable dinamica
        var numeroVar1 = 1L;
        var numeroVar2 = 1.5f;
        var numeroVar3 = 2.0d;
        var numeroVar4 = 'a';
        var numeroVar5 = "hola";


        //tipo float o punto flotante


        float numeroReal = 10.5F;
        System.out.println("tipo float corresponde byte a:"+Float.BYTES);
        System.out.println("tipo float corresponde bites a:"+Float.SIZE);
        System.out.println("tipo float valor maximo:"+Float.MAX_VALUE);
        System.out.println("tipo float valor minimo:"+Float.MIN_VALUE);


        double numeroRealDoblePrecicion = 15.6D;
        System.out.println("tipo double corresponde byte a:"+Double.BYTES);
        System.out.println("tipo double corresponde bites a:"+Double.SIZE);
        System.out.println("tipo double valor maximo:"+Double.MAX_VALUE);
        System.out.println("tipo double valor minimo:"+Double.MIN_VALUE);


        //tipo char


        char caracter = 'a';
        System.out.println("tipo char corresponde byte a:"+Character.BYTES);
        System.out.println("tipo char corresponde bites a:"+Character.SIZE);
        System.out.println("tipo char valor maximo:"+Character.MAX_VALUE);
        System.out.println("tipo char valor minimo:"+Character.MIN_VALUE);


    }

}

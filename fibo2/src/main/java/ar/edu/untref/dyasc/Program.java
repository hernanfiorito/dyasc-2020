package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
    	int[] secuencia;
    	if(args.length == 1) {
    		try{
    			secuencia = Fibonacci.calcularKNumerosDeSerie(Integer.parseInt(args[0]));
    			Fibonacci.orientacionSecuencia(secuencia, 'h');
    		}catch(Exception NumberFormatException) {
    			System.out.println("Opciones no validas.");
    		}
    	}else if(args[0].matches("-o=[v || h][i || d]")){
    		secuencia = Fibonacci.calcularKNumerosDeSerie(Integer.parseInt(args[1]));
    		char opcionOrientacion = args[0].charAt(3);
    		char opcionDireccion = args[0].charAt(4);
    	    secuencia = Fibonacci.direccionSecuencia(secuencia, opcionDireccion);
    	    Fibonacci.orientacionSecuencia(secuencia, opcionOrientacion);
        }else{
        	System.out.println("Opciones no validas.");
        }
    	System.out.println();
    }
}

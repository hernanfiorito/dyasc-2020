package ar.edu.untref.dyasc;

public class Fibonacci {
	
	public static int[] direccionSecuencia(int secuencia[], char opcion) {
		if(opcion == 'i') {
			int[] resultado = new int[secuencia.length];
			for(int i = 0; i < secuencia.length; i++){
				resultado[i] = secuencia[(secuencia.length - i) - 1];
			}
			return resultado;
		}else{
			return secuencia;
		}
	}
	
	public static void orientacionSecuencia(int secuencia[], char opcion) {
		System.out.print("fibo<" + secuencia.length + ">: ");
		if(opcion == 'h') {
			for(int i = 0; i < secuencia.length; i++) {
				System.out.print(secuencia[i] + " ");
			}
			System.out.println();
		}else if(opcion == 'v') {
			System.out.println();
			for(int i = 0; i < secuencia.length; i++) {
				System.out.println(secuencia[i]);
			}
		}
	}
	
	public static int[] calcularKNumerosDeSerie(int k){
		int[] secuenciaFinal = new int[k];
		int resultadoActual = 1;
		int resultadoAnterior = 0;
		for(int i = 0; i < k; i++) {
			if(i <= 1) {
				secuenciaFinal[i] = i; //System.out.print(resultadoAnterior + i + " ");
			}else{
				int resultadoAnteriorAuxiliar = resultadoAnterior;
				secuenciaFinal[i] = resultadoActual + resultadoAnterior; //System.out.print(resultadoActual + resultadoAnterior + " ");
				resultadoAnterior = resultadoActual;
				resultadoActual += resultadoAnteriorAuxiliar;
			}
		}
		return secuenciaFinal;
	}
}

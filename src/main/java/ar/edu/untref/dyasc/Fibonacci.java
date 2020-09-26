package ar.edu.untref.dyasc;

public class Fibonacci {
	
	public static void calcularKNumerosDeSerie(int k){
		int resultadoActual = 1;
		int resultadoAnterior = 0;
		for(int i = 0; i < k; i++) {
			if(i <= 1) {
				System.out.print(resultadoAnterior + i + " ");
			}else{
				int resultadoAnteriorAuxiliar = resultadoAnterior;
				System.out.print(resultadoActual + resultadoAnterior + " ");
				resultadoAnterior = resultadoActual;
				resultadoActual += resultadoAnteriorAuxiliar;
			}
		}
		System.out.println();
	}
}

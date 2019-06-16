package exercicios.lacos.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ArrayList1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba dez números aleatórios na linha de comando e
		 * coloque-os em um ArrayList de forma desordenada, em seguida crie um segundo
		 * ArrayList que será populado com os valores do primeiro de forma ordenada.
		 * Mostre na tela os valores dos dois arrays.
		 */
	 
		int numeros = 0  ;
		
		Random numAleatorio = new Random(10);
	   // List<String> listaDesordenada = new ArrayList<String>();
		
	   	   
		for (int i = 10; i > numeros ; i--) {
			
			List<String> listaDesordenada = new ArrayList<String>();
			//listaDesordenada.add(numAleatorio);
			
			System.out.println(listaDesordenada);
			
		 }		
		
		
		
		
	}
}

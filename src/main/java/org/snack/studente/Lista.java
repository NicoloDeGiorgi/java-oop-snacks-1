package org.snack.studente;
import java.util.ArrayList;
import java.util.Collections;
//Snack 3: Lista 
//Creare un ArrayList di 10 nomi (stringhe) in maniera non ordinata
//A - Ordinare l'array manualmente in ordine alfabetico (cioe' senza l'ausilio di un metodo)
//B - Ordinarlo con l'ausilio di un metodo apposito

public class Lista {
	public static void main(String[] args) {
		
ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Federico");
		lista.add("Lucia");
		lista.add("Tony");
		lista.add("Albeto");
		lista.add("Patric");
		lista.add("Giovanni");
		lista.add("Vanessa");
		lista.add("Sara");
		lista.add("Chiara");
		
		System.out.println (lista);
		
		//A - Ordinare l'array manualmente in ordine alfabetico
		//(cioe' senza l'ausilio di un metodo)
		boolean scambiato = false;
		int lunghezza = lista.size();
		
		do {
			scambiato = false;
			for ( int i =1; i <= lunghezza -1; i++){
				String elementoPrecedente = lista.get(i-1);
				String elementoSuccessivo = lista.get(i);
				if (elementoPrecedente.compareTo(elementoSuccessivo) < 0) {
					lista.set (i, elementoPrecedente);
					lista.set(i- 1, elementoSuccessivo);
					scambiato = true;
			 }
		  }
			
		} while (scambiato);
	
		//B - Ordinarlo con l'ausilio di un metodo apposito
		Collections.sort(lista);
		System.out.println(lista);
	}
	
}
	

				
			
		
			
			
	



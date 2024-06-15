package org.snack.studente;

//Snack 2: Gestione di un Conto
//Crea una classe ContoBancario con attributi per numero di conto e saldo. 
//Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
//Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

public class GestioneConto {
	private int numeroConto;
	private int saldo;
	
	public GestioneConto(int numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public void deposito(int numeroDeposito){
		this.saldo += numeroDeposito;
	}
	public void prelievo(int numeroPrelievo) {
		int saldoPossibile = this.saldo - numeroPrelievo;
		if (saldoPossibile < 0) {
			this.saldo = saldoPossibile;
		}
	}
	
	
	
	public static void main(String[] args) {
	
	}

}


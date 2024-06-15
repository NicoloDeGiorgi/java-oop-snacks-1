package org.snack.studente;

//Snack 3: Registro Studenti
//Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
//Utilizza un array privato per memorizzare oggetti Studente. 
//Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro.
//Aggiungi un metodo che stampi la lista degli studenti.

public class RegistroStudenti {
	private Studente [] studenti;
	
	public RegistroStudenti () {
		this.studenti = new Studente[0];
	}
	public Studente[] getStudenti() {
		return this.studenti;
	}
	
	public void aggiungiStudente( Studente nuovoStudente) {
		Studente[] nuoviStudenti = new Studente [this.studenti.length +1];
	
		
		for (int index = 0; index < this.studenti.length ; index++) {
			nuoviStudenti [index]= this.studenti [index];
		}
	nuoviStudenti[nuoviStudenti.length - 1] = nuovoStudente;
	this.studenti = nuoviStudenti;
	
}
	public static void main (String [] args) {
		RegistroStudenti registro = new RegistroStudenti();
		System.out.println(registro.getStudenti().length);
		registro.aggiungiStudente(new Studente ("Nicolò", "De Giorgi", 24));
		System.out.println(registro.getStudenti().length);
		System.out.println(registro.getStudenti()[registro.getStudenti().length -1].getInfoStudente());
		registro.aggiungiStudente(new Studente ("Antonio", "Rossi", 45));
		System.out.println(registro.getStudenti().length);
		System.out.println(registro.getStudenti()[registro.getStudenti().length -1].getInfoStudente());
	}

}


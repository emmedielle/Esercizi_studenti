//Ficarra Adriano 3°G 19/02/22

//Si scriva un algoritmo che calcoli mese per mese il saldo del conto corrente. Si supponga di poter eseguire  una transazione al mese, deposito o prelievo. 
//Gli interessi vengono accreditati sul conto all’inizio di ogni  mese. Il tasso di interesse mensile corrisponde a quello annuo diviso per 12. 

import java.util.Scanner ;
public class Ficarra_ContoCorrente {

	public static void main(String[] args) {
		 //Attestazione dello Scanner di input
		 Scanner input = new Scanner (System.in) ;
		 
		 //Dichiarazione variabili
		 int Saldo ; //Saldo 
		 int TasseA ; //Tassazione annuale
		 int TasseM ; //Tassazione mensile
		 int Interessi ; //Interessi mensili
		 int Scelta ; //Scelta che fara l'utente nei mesi
		 int Deposito ;//Quanto deposita l'utente
		 int Prelievo ;//Quanto prelieva l'utente
		 int mesi = 12 ;
		 
		 //Aquisizione variabili
		System.out.println("Quant'è il tuo saldo iniziale?") ;
		Saldo = input.nextInt() ;
		
		System.out.println("Quant'è la tassazione annua?");
		TasseA = input.nextInt() ;
		
		TasseM = TasseA/12 ;
				
		 //Calcolatore del tasso mensile
		 for (int i=0; i<=mesi; i++) {
			 
			 System.out.println("Il tuo saldo attuale è " + Saldo + " Vuoi prelevere o depositare? Digitare 1 per prelevare, digitare 2 per depositare, altrimenti digitare 3") ;
			 Scelta = input.nextInt() ;
			 
			 switch (Scelta) {
			 
			 //Prelievo
			 case 1: System.out.println("Quanto vuoi prelevare?") ;
			 		 Prelievo = input.nextInt() ;
			 		 Saldo -= Prelievo ;
			 		 break ;
			 //Deposito
			 case 2: System.out.println("Quanto vuoi depositare?") ;
			         Deposito = input.nextInt() ;
			         Saldo += Deposito ;
			         break ;
			 //Nessuna delle precedenti
			 case 3: System.out.println("Non hai prelevato ne depositato, ci vediamo tra un mese!") ;
			         break ;
			 }
			 
			 Interessi = (Saldo * TasseM)/100 ; 
			 Saldo = Saldo + Interessi ;
			 
			 System.out.println("Il tuo saldo a fine mese con interessi inclusi è: " + Saldo ) ;
			 
		 }
		 
		 System.out.println("Il tuo saldo a fine anno con interessi inclusi è: " + Saldo ) ;
		 System.out.println("Grazie è arrivederci!") ;
		

	}

}

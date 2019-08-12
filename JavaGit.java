import java.util.Scanner;

public class JavaGit {

	static Scanner notiz =new Scanner(System.in);
	static Scanner seite =new Scanner(System.in);

	static String befehl="";																						//Variable für Benutzereingabe

	public static void main (String[] args){

		
		System.out.println("this program can store information like a notebook");									//Begrüßung
		
		

		while (!befehl.equals("stop")){				
			befehl= javax.swing.JOptionPane.showInputDialog("Geben sie 'save' um eine Notiz zu speichern "+ 
			"oder 'call' um eine Seite im Buch aufzurufen oder 'stop' zum beenden"); 


			if (befehl.equals("save")) {

				System.out.println("Bitte geben Sie ihre Notiz ein: ");

				Notizblock.speichern(notiz.next());

			} 																											//ende save
				if (befehl.equals("call")) {

					System.out.println("Auf welcher Seite möchten Sie nachschlagen? ");
					int seitenzahl;

					do {

					System.out.println("Bitte wählen Sie eine Seitenzahl zwischen 1 und "+Notizblock.notizen.size()+": ");
					seitenzahl= seite.nextInt();

					} while (seitenzahl>Notizblock.notizen.size() || seitenzahl<1);

					System.out.println(Notizblock.abrufen(seitenzahl));
					

				} 																										// ende call
			
		}  																												// ende while
				


		

		


	} 																													//main

} 																														//class
import java.util.Scanner;

public class JavaGit {

	static Scanner notiz =new Scanner(System.in);
	static Scanner seite =new Scanner(System.in);

	static String befehl="";																						//Variable für Benutzereingabe

	public static void main (String[] args){

		
		System.out.println("this program can store information like a notebook");									//Begrüßung
		
		

		while (!befehl.equals("stop")){																				// überspringt den gesamten folgenden Code, sobald der Benutzer "stop" eingibt

			befehl= javax.swing.JOptionPane.showInputDialog("Geben Sie 'save', um eine Notiz zu speichern "+ 		//öffnet ein Dialogfenster und wartet auf Eingabe des Benutzers
			"oder 'call', um eine Seite im Buch aufzurufen oder 'stop' zum beenden"); 


			if (befehl.equals("save")) {																				

				System.out.println("Bitte geben Sie ihre Notiz ein: ");
				Notizblock.speichern(notiz.next());																		// Notiz wird gespeichert

			} 																											//ende save
			
			if (befehl.equals("call")) {

					System.out.println("Auf welcher Seite möchten Sie nachschlagen? ");
					int seitenzahl;

					do {

					System.out.println("Bitte wählen Sie eine Seitenzahl zwischen 1 und "+Notizblock.notizen.size()+": ");		
					seitenzahl= seite.nextInt();

					} while (seitenzahl>Notizblock.notizen.size() || seitenzahl<1);									// Diese do-while-Schleife stellt sicher, dass der Benutzer keine Zahl eingibt, die außerhalb der Arraygrenzen liegt, um eine Exception zu vermeiden

					System.out.println(Notizblock.abrufen(seitenzahl));												// Die Methode abrufen leifert den String zurück, der an der Indexstelle von seitenzahl gespeichert ist und wird hier direkt ausgegeben
					

				} 																										// ende call
			
		}  																												// ende while
				


		

		


	} 																													//main

} 																														//class
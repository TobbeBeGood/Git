import java.util.Scanner;
import javax.swing.*;

public class JavaGit {

	static Scanner notiz =new Scanner(System.in);
	static Scanner seite =new Scanner(System.in);

	static int befehl;

	public static void main (String[] args){

		
		
		String[] options = {"Speichern", "Abruf", "Beenden"};
		

		while (befehl!=2){																				// überspringt den gesamten folgenden Code, sobald der Benutzer "stop" eingibt

			befehl= JOptionPane.showOptionDialog(null, "Bitte waehlen Sie eine Funktion","Notizbuch Optionen", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,options,options[0]); 
			

			if (befehl==0) {																						//Speichern

				String eingabe=JOptionPane.showInputDialog("Bitte Notiz eingeben");
				Notizblock.speichern(eingabe);																		// Notiz wird gespeichert

			} 																											

			if (befehl==1) {																						//Abruf

					int seitenzahl;

					do {
						seitenzahl= Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte Seitenzahl zwischen 1 und "+Notizblock.notizen.size()+" eingeben"));

					} while (seitenzahl>Notizblock.notizen.size() || seitenzahl<1);									// Diese do-while-Schleife stellt sicher, dass der Benutzer keine Zahl eingibt, die außerhalb der Arraygrenzen liegt, um eine Exception zu vermeiden

					JOptionPane.showMessageDialog(null,"Auf Seite "+seitenzahl+" befindet sich folgende Notiz:  "+Notizblock.abrufen(seitenzahl));												// Die Methode abrufen leifert den String zurück, der an der Indexstelle von seitenzahl gespeichert ist und wird hier direkt ausgegeben
					

				} 																										// ende call
			
		}  																												// ende while
				


		

		


	} 																													//main

} 																														//class
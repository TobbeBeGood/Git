import java.util.ArrayList;
import javax.swing.*;
	
	

public class Notizblock{



	static int speicherplatz=0;
	static ArrayList<String> notizen = new ArrayList<String>();

	public static void speichern(String abl){

		notizen.add(speicherplatz, abl);

		speicherplatz++;

		JOptionPane.showMessageDialog(null,"Ihre Notiz wurde gespeichert auf Seite: "+speicherplatz+"!");

	}	

	public static String abrufen(int Seite){

		
		return notizen.get(Seite-1);

	}
}
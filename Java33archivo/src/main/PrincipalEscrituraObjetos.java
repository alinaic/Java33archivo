package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PrincipalEscrituraObjetos {

	public static void main(String[] args) {

		Jugador alina = new Jugador("Alina", 1412);
		try {
			FileOutputStream fos = new FileOutputStream("datos.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(alina);
			oos.close();
			fos.close();
			System.out.println("escritura de objeto ok");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

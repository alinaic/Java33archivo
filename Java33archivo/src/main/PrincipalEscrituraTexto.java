package main;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrincipalEscrituraTexto {

	public static void main(String[] args) {
		// el tema del procesamiento de archivos en java al igual
		// que cualquier otra tecnologia de desarrollo clasifica los archivos
		// por dos tipos: 1. de texto y 2. binario

		
		//para archivos de texto podemos usar la siguientes clases: 
		try {
			
			//en java cuando he conseguido crear un objeto y estoy listo para escribir o
			//leer de un destino se dice, que he abierto un flujo de datos
			FileWriter fw = new FileWriter("miarchivo.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			//un print write es algo que nos va a permitir escribir con
			//formato sobre un flujo de datos
			pw.println("primera linea");
			pw.println("segunda linea");
			
			//los flujos hay que cerrarlos siempre
			pw.close();
			fw.close();
			System.out.println("ESCRITURA OK");
			
		} catch (IOException e) {
			System.out.println("NO PUDE ACCEDER O CREAR miarchivo.txt");
			e.printStackTrace();
		}
		
		
	}// end main
}// end class

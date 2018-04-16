package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class PrincipalLecturaEscrituraArchivo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("original.jpg");
			FileOutputStream fos = new FileOutputStream("destino.jpg");

			byte[] leido = new byte[1024];
			int bytesLeidos = 0;

			//while (bytesLeidos != -1) {
				//bytesLeidos = fis.read(leido);// vuelca en leido 1024 bytes de original.jpg								
				//System.out.println("bytes leido: " + bytesLeidos);
				//if(bytesLeidos != -1){
				//fos.write(leido);//
				//}
			//}
			
			//lo que simpre vamos a ver es esto:
			//el siguiente codigo es identico al anterior
			while ((bytesLeidos = fis.read(leido)) !=-1){
				fos.write(leido);
			}
			fos.close();
			fis.close();
			
			System.out.println("lectura/escritura bytes ok");

		} catch (FileNotFoundException e) {
			System.out.println("archivo no encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("no pude leer bytes");
			e.printStackTrace();
		}

	}// end main

}// end class

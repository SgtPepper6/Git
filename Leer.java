//import java.util.*;
import java.io.*;



public class Leer {
	
	Leer (String ruta){
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			f = new File(ruta);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String linea;
			
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			
		}catch(Exception e){
			System.out.println("ERROR: El archivo no existe!");
		}
		finally{
			try{
				fr.close();
				br.close();
			}catch(Exception ee){
				System.out.println("ERROR 2.0!");
			}
		}
	}
	
	public static void main(String [] args){
		
		Leer leer = new Leer("/home/rico/Documentos/Archivo.txt");
		
	}
}

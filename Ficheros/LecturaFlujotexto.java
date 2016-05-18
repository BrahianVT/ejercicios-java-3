import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class LecturaFlujotexto{
	public LecturaFlujotexto(){
		super();
	}
	private void ejecuta (String camino){
		File fichero = new File(camino);
		FileReader flujoLectura;
		BufferedReader flujobuffer = null;
		try{
			try{
				flujoLectura = new FileReader(fichero);
				flujobuffer = new BufferedReader(flujobuffer);
				String linea;
				while((linea = flujobuffer.readLine()) != null){
					System.out.println(linea);
				}
			} finally{
				if (flujobuffer == null)
					flujobuffer.close();
			  } 
		} catch (FileNotFoundException e){
			e.printStackTrace();
		  } catch(IOException eE){
			eE.printStackTrace();
		  }
	}
	
	public static void main(String[] args){
		new LecturaFlujotexto().ejecuta(args[0]);
	}
}
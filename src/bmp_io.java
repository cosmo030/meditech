package vorlage.bild;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class bmp_io {
	
	public static void main(String[] args) throws IOException {
		if (args.length < 1) {
			System.out.println("At least one filename specified  (" + args.length + ")"); 
			System.exit(0);
		}
		
		try {
			String inFilename = args[0];
			InputStream in = new FileInputStream(inFilename);		
			
			// Klasse RGB-Pixel
			PixelColor pc = null;		

			//Setzen eines Pixels mit bmp.image.setRgbPixel(x, y, pc);
			BmpImage bmp = BmpReader.read_bmp(in);
			
			int height = bmp.image.getHeight();
			int width = bmp.image.getWidth();
			
			
			// Implementierung *******************************************************************************************
			
		
		
			// Speicherung der Ausgabebildes (2.Argument) 
			if(args.length == 2) 
				BmpWriter.write_bmp(new FileOutputStream(args[1]), bmp);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

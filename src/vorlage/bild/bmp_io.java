package vorlage.bild;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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

			// Setzen eines Pixels mit bmp.image.setRgbPixel(x, y, pc);
			BmpImage bmp = BmpReader.read_bmp(in);

			int height = bmp.image.getHeight();
			int width = bmp.image.getWidth();

			// Implementierung
			// *******************************************************************************************
			PrintWriter writeRgbFile = new PrintWriter("farbbild_gruppe02.txt");
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {
					pc = bmp.image.getRgbPixel(i, j);
					PixelColor rbg = new PixelColor(pc.r, pc.g, pc.g);
					writeRgbFile.write(rbg.r + " " + rbg.g + " " + rbg.b);
					writeRgbFile.write("\n");
				}
			}
			writeRgbFile.close();

			// Speicherung der Ausgabebildes (2.Argument)
			if (args.length == 2)
				BmpWriter.write_bmp(new FileOutputStream(args[1]), bmp);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package font;

import java.awt.Font;
import java.io.InputStream;

public class CustomFont {

	private Font font = null;

	public CustomFont(String fontName) {
		try {
			InputStream is = getClass().getResourceAsStream(fontName);
			font = Font.createFont(Font.TRUETYPE_FONT, is);
		} catch (Exception ex) {
			System.err.println(fontName + " No se cargo la fuente");
			font = new Font("Arial", Font.PLAIN, 14);
		}
	}

	// Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2, dimension = float
	public Font MyFont(int estilo, float tamanio) {
		Font tfont = font.deriveFont(estilo, tamanio);
		return tfont;
	}

}

package utiles;

public class Utiles {

	public static int generarNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min)) + min;
	}
}

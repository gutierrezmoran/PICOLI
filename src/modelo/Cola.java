package modelo;

import java.util.ArrayDeque;

public class Cola {
	
private ArrayDeque<Colores> cola;

public Cola() {
	
}

public ArrayDeque<Colores> getCola() {
	return cola;
}


public void encolar(Colores color) {
	cola.add(color);
}
public Colores desencolar() {
	return cola.pop();
}
}

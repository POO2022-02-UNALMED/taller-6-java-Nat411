package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		ArrayList<Integer> cantidad = new ArrayList<Integer>();
		for (int i = 0; i < listado.size();i++ ) {
		    cantidad.add(0);
			for (int j =0; j< Vehiculo.listado.size(); j++) {
				if (Vehiculo.listado.get(j).fabricante.getPais().getNombre() == listado.get(i).getNombre()) {
					cantidad.set(i, cantidad.get(i)+1);
				}
				
			}
			
		}
		int maximoIndex = cantidad.indexOf(Collections.max(cantidad));
		return listado.get(maximoIndex);
		
	}
	
}

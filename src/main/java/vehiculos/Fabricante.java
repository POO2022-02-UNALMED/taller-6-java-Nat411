package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre= nombre;
		this.pais = pais;
		listado.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	public static Fabricante fabricaMayorVentas() {
	    ArrayList<Integer> cantidad = new ArrayList<Integer>();
        for (int i = 0; i < listado.size();i++ ) {
            cantidad.add(0);
            for (int j =0; j< Vehiculo.listado.size(); j++) {
                if (Vehiculo.listado.get(j).fabricante.getNombre() == listado.get(i).getNombre()) {
                    cantidad.set(i, cantidad.get(i)+1);
                }
                
            }
            
        }
        int maximoIndex = cantidad.indexOf(Collections.max(cantidad));
        return listado.get(maximoIndex);
        
    }
}

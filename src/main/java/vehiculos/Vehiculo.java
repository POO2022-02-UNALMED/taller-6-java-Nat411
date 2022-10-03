package vehiculos;
import java.util.ArrayList;
public class Vehiculo {
	
	protected static int CantidadVehiculos = 0;
	static ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		CantidadVehiculos++;
		listado.add(this);
		this.placa=placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setfabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.CantidadVehiculos = cantidadVehiculos;
	}

	public static String vehiculosPorTipo() {
	return "Automoviles: "+Automovil.cantidadAutomoviles()+"\nCamionetas: "+ Camioneta.cantidadCamionetas()+ "\nCamiones: "+ Camion.cantidadCamiones();
	}
	
	public ArrayList<Vehiculo> getVehiculos(){
		return listado;
	}
}

package invernadero;

public class Planta {

	private String Nombre;
	private float Tama�o;
	private String Reproduccion;
	private int Duracion;

	//Metodo Constructor
	public Planta(String nombre,float tama�o, String reproduccion,int duracion){
		
		this.Nombre = nombre; 
		this.Tama�o = tama�o;
	this.Reproduccion = reproduccion;
		this.Duracion = duracion;
		
	}
	
	//metodos getters y setters
	
	public void Setnombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public String Getnombre() {
		 
		return Nombre;
	}
	
	//metodo tama�o
	public void Settama�o(float tama�o) {
		this.Tama�o= tama�o;
	}
	
	public float Gettama�o() {
		
	return Tama�o;
	
	}
	
	//metodo reproduccion
	
	public void Setreproduccion(String reproduccion) {
		
		this.Reproduccion = reproduccion;
	}
	
	public String Getreproduccion() {
		return Reproduccion;
	}
	
	//metodo duracion
	public void Setduracion(int duracion) {
		this.Duracion=duracion;	
	}
	
	public int Getduracion() {
		return Duracion;	
	}
	
	
	
}

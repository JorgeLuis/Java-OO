package jorge.compareTo;

public class Alumno {
	private String nombre;
	private int edad;
	private double notaPromedio;
	
	public Alumno(String nombre,int edad,double notaPromedio){
		this.nombre=nombre;
		this.edad=edad;
		this.notaPromedio=notaPromedio;
	}
	public double getNotaPromedio() {
		return notaPromedio;
	}
	public void setNotaPromedio(double notaPromedio) {
		this.notaPromedio = notaPromedio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString(){
		return nombre+", "+edad+", "+", "+notaPromedio;
	}
}

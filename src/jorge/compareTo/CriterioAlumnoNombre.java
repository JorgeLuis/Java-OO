package jorge.compareTo;

public class CriterioAlumnoNombre extends Criterio<Alumno>{

	
	public int comparar(Alumno a, Alumno b) {
		
		return a.getNombre().compareTo(b.getNombre());
	}
	
	

}

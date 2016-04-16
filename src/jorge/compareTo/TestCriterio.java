package jorge.compareTo;

public class TestCriterio {

	public static void main(String[] args) {
		Alumno arr[] = {new Alumno("Martin", 25, 7.2),
				        new Alumno("Carlos", 23, 5.1),
				        new Alumno("Daniel",20,10),
				        new Alumno("Anastacio", 20, 4.8)};
		
		System.out.println("CriterioAlumnoNombre()");
		Util.ordenar(arr, new CriterioAlumnoNombre());
		Util.imprimir(arr);
		System.out.println("");
		System.out.println("CriterioAlumnoNotaPromedio()");
		Util.ordenar(arr, new CriterioAlumnoNotaPromedio());
		Util.imprimir(arr);

	}

}

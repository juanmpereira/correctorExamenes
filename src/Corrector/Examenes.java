package Corrector;

import java.util.*;

public class Examenes {
		List<Ejercicio> ejercicios;
		Nota notaAlumno;
		CriterioCorreccion criterio;
		CriterioErrores modificadorErrores;
		
		public Examenes(Nota nota) {
			notaAlumno = nota;
		}
		
		public List<Ejercicio> getEjercicios() {
			return ejercicios;
		}
		
		public void setEjercicios(List<Ejercicio> ejercicios) {
			this.ejercicios = ejercicios;
		}
		
		
		public CriterioCorreccion getCriterio() {
			return criterio;
		}
		
		public void setCriterio(CriterioCorreccion criterio) {
			this.criterio = criterio;
		}
		
		public double obtenerPuntaje(Alumno alumno) {
			notaAlumno.calcularResultados(ejercicios,modificadorErrores);
			return criterio.obtenerNotaFinal(notaAlumno);
		}
}

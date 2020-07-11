package Corrector;

import java.util.*;

public class Examenes {
		List<Ejercicio> ejercicios;
		List<Alumno> alumnos;
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
		
		public List<Alumno> getAlumnos() {
			return alumnos;
		}
		
		public void setAlumnos(List<Alumno> alumnos) {
			this.alumnos = alumnos;
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

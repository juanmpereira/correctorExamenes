package Corrector;

import java.util.List;

public class Nota {
	double notaParcial;
	double puntajeMaximo;
	
	public double getPuntajeMaximo() {
		return puntajeMaximo;
	}
	
	public void setPuntajeMaximo(double puntajeMaximo) {
		this.puntajeMaximo = puntajeMaximo;
	}

	public double getNotaParcial() {
		return notaParcial;
	}

	public void setNotaParcial(double notaParcial) {
		this.notaParcial = notaParcial;
	}

	public void calcularResultados(List<Ejercicio> ejercicios,
			CriterioErrores modificadorErrores) {
		 	notaParcial = ejercicios.stream().mapToDouble(e -> e.getValorUnitario(modificadorErrores)).sum();
		 	puntajeMaximo = ejercicios.stream().mapToDouble(e->e.getPuntos()).sum();
		 	
	}
	
	
}

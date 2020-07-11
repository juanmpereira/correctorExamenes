package Corrector;

public class ReglaDeTres implements CriterioCorreccion {

	public double obtenerNotaFinal(Nota nota) {
		return nota.getNotaParcial() * 10/nota.getPuntajeMaximo();
	}
}

//solo habria que agregar los demas criterios de correccion
package Corrector;

public class QuitaMitadDelValor implements CriterioErrores{
	public double obtenerModificador(double valorEjercicio) {
		return valorEjercicio * 0.5;
	}
}

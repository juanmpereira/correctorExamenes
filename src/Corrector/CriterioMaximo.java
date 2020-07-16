package Corrector;

import java.awt.Dimension;
import java.util.*;

public class CriterioMaximo implements CriterioCorreccion{
	List<CriterioCorreccion> criterios;
	List<Double> notasParciales = new ArrayList<>();
	public CriterioMaximo (List<CriterioCorreccion> criterios) {
		this.criterios = criterios;
	}
	
	public double obtenerNotaFinal(Nota nota) {
		criterios.stream().forEach(c->notasParciales.add(c.obtenerNotaFinal(nota)));
		return Collections.max(notasParciales);
	}

}

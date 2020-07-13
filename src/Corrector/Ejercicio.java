package Corrector;

public class Ejercicio {
		double valor;
		String respuestaCorrecta;
		String respuestaObtenida;
		
		public Ejercicio(double valor) {
			this.valor = valor;
		}

		public double getValorUnitario(CriterioErrores modificadorErrores) {
			if(respuestaCorrecta != respuestaObtenida)
			return modificadorErrores.obtenerModificador(valor);
			else
			return valor;
		}

		public double getPuntos() {
			return valor;
		}

		public void setRespuestaCorrecta(String respuestaCorrecta) {
			this.respuestaCorrecta = respuestaCorrecta;
		}


		public void setRespuestaObtenida(String respuestaObtenida) {
			this.respuestaObtenida = respuestaObtenida;
		}

		
		
		
}

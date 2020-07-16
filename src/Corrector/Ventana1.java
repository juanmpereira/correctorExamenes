package Corrector;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Choice;
import java.awt.Button;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import javafx.scene.control.Alert;

import javax.swing.JTextField;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	JTextField respuesta3;
	JLabel preguntaMultipleChoice;
	Choice respuesta2;
	Button buttonEnviado;
	JLabel preguntaVoF;
	static Choice respuesta1;
	JLabel preguntaADesarrrollar;
	 String respuestaObtenidaVoF;
	 String respuestaObtenidaChoice;
	 String respuestaObtenidaDesarrollo;
	 static Ejercicio ejercicio1;
	static Ejercicio ejercicio2;
	static Ejercicio ejercicio3;
	static Alumno alumnoJuan;
	static Examenes examen1;
	Double notaAprobacion = 4.00;
	
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		preguntaMultipleChoice = new JLabel("2.");
		preguntaMultipleChoice.setBounds(10, 73, 330, 34);
		contentPane.add(preguntaMultipleChoice);
		preguntaMultipleChoice.setText("cual de los siguientes paises limita con argentina?");
		
		respuesta2 = new Choice();
		respuesta2.setBounds(10, 118, 162, 20);
		contentPane.add(respuesta2);
		respuesta2.add("chile");
		respuesta2.add("canada");
		respuesta2.add("guayana francesa");
		
		buttonEnviado = new Button("enviarRespuestas");
		buttonEnviado.setBounds(127, 239, 146, 22);
		contentPane.add(buttonEnviado);
		buttonEnviado.addActionListener(this::convertButtonActionPerformed);
		
		preguntaVoF = new JLabel("1. V o F");
		preguntaVoF.setBounds(10, 11, 330, 30);
		contentPane.add(preguntaVoF);
		preguntaVoF.setText("voy a aprobar el parcial?");
		
		JLabel titulo = DefaultComponentFactory.getInstance().createTitle("Primer Parcial");
		titulo.setBounds(137, 0, 136, 14);
		contentPane.add(titulo);
		
		respuesta1 = new Choice();
		respuesta1.setBounds(10, 47, 162, 20);
		contentPane.add(respuesta1);
		respuesta1.add("Verdadero"); 
		respuesta1.add("Falso");
		
		preguntaADesarrrollar = new JLabel("3. Desarrollo");
		preguntaADesarrrollar.setBounds(10, 144, 322, 34);
		contentPane.add(preguntaADesarrrollar);
		preguntaADesarrrollar.setText("comente sobre las 5 necesidades basicas del hombre");
		
		respuesta3 = new JTextField();
		respuesta3.setText("Escriba su Respuesta");
		respuesta3.setBounds(10, 189, 322, 44);
		contentPane.add(respuesta3);
		respuesta3.setColumns(10);
	}
	
	private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
		respuestaObtenidaVoF = respuesta1.getSelectedItem();
		respuestaObtenidaChoice = respuesta2.getSelectedItem();
		respuestaObtenidaDesarrollo = respuesta3.getText();
		ejercicio1.setRespuestaObtenida(respuestaObtenidaVoF);
		ejercicio2.setRespuestaObtenida(respuestaObtenidaChoice);
		ejercicio3.setRespuestaObtenida(respuestaObtenidaDesarrollo);
		double puntajeExamen = examen1.obtenerPuntaje(alumnoJuan);
		String aprobacion;
		if (puntajeExamen >= notaAprobacion) {
			aprobacion = "aprobado";
		}
		else 
			aprobacion = "desaprobado";
		
		 JOptionPane.showMessageDialog(null, "tu nota es: " + puntajeExamen + " y el examen esta: " + aprobacion);
		 
		
		
	}
	
	public static void main(String[] args) {
		List<Ejercicio> listaEjercicios = new ArrayList<Ejercicio>();
		ejercicio1 = new Ejercicio(4);
		ejercicio1.setRespuestaCorrecta("Verdadero");
		ejercicio2 = new Ejercicio(2);
		ejercicio2.setRespuestaCorrecta("chile");
		ejercicio3 = new Ejercicio(6);
		ejercicio3.setRespuestaCorrecta("no tengo idea");//como pongo respuesta correcta aca
		
		
		listaEjercicios.add(ejercicio1);
		listaEjercicios.add(ejercicio2);
		listaEjercicios.add(ejercicio3);
		Nota nota1 = new Nota();
		examen1 = new Examenes(nota1);
		examen1.setEjercicios(listaEjercicios);
		examen1.setCriterio(new ReglaDeTres());
		examen1.setCriterioErrores(new ModificadorNulo());
		alumnoJuan = new Alumno();
		
		EventQueue.invokeLater(() -> new Ventana1().setVisible(true));
	}
}

package Tp;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Pais {
	private String pais;
	private LinkedList<Jugador> jugadores = new LinkedList<>();

	public Pais(String pais) {
		super();
		this.pais = pais;
	}

	public String getpais() {
		return pais;
	}

	public void setpais(String pais) {
		this.pais = pais;
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo nombre=" + pais;
	}

	public Pais() {
		pais = "";
	}
	// menu MencionarJugador
	public boolean MencionarJugador(Jugador Jugador, String nombre, int peso, int categoria, int edad) {
		JOptionPane.showMessageDialog(null, nombre + " puede participar, su numero de participante es "
				+ (jugadores.size() + 1) + " en la categoria " + categoria + "Kg");
		jugadores.add(new Jugador(nombre, peso, categoria, edad));
		return true;
	}

	public boolean BuscarJugador() {
		String[] nombres = new String[jugadores.size()];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = jugadores.get(i).getNombre();
		}
		String nombreelegido = (String) JOptionPane.showInputDialog(null, "", "", 0, null, nombres, nombres[0]);
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre().equals(nombreelegido)) {
				JOptionPane.showMessageDialog(null, jugador);
				JOptionPane.showMessageDialog(null,jugador.getNombre() + " puede participar, su numero de participante es "
				+ (jugadores.size() + 1) + " en la categoria " + jugador.getCategoria() + "Kg");
			}
		}
		return true;
	}

	public void  ValidadJugador() {
		String nombre="";

		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad."));
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el peso del participante."));
		int categoria = peso;
		if (edad <= 17) {
			JOptionPane.showMessageDialog(null, "No puede participar porque es menor de edad. ");
		}
		if (edad >= 70) {
			JOptionPane.showMessageDialog(null, "No puede participar porque es mayor de edad. ");
		} else if ((peso >= 110 || peso <= 54) || (categoria >= 110 || categoria <= 5)) {
			JOptionPane.showMessageDialog(null, "No puede participar por no cumplir con las categorias. ");
		} else {
			nombre = JOptionPane.showInputDialog("Ingresar nombre del participante.");
			if (nombre.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Es necesario ingresar un nombre para participar");
			}
		}
		Jugador nuevo = new Jugador(nombre, peso, categoria, edad);
		jugadores.add(nuevo);

	}

}

package Tp;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorTorneo {

	
	private LinkedList<Pais> paises = new LinkedList<Pais>();
	//El gestor tiene la lista de paises 	
	//Cada pais tiene su jugador
	public GestorTorneo() {
	
	}
	public LinkedList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(LinkedList<Pais> paises) {
		this.paises = paises;
	}
	
	
	public Pais seleccionarPais() {
		String[] pais = new String[paises.size()];	
		for (int i = 0; i < pais.length; i++) {
			pais[i] = paises.get(i).getpais();
		}
		
		int select = JOptionPane.showOptionDialog(null, "Eleja un pais para participar ", null, 0, 0, null, pais, pais[0]);
		
		if (select == 0) {
			JOptionPane.showMessageDialog(null, "Tu pais es Italia" );
		} else {
			JOptionPane.showMessageDialog(null, "Tu pais es Alemania");
		}
		
		return paises.get(select);
	}
	


	
}

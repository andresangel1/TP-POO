package Tp;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[]args) {
		int op;
		
		GestorTorneo gestor = new GestorTorneo();
		gestor.getPaises().add(new Pais("Italia"));
		gestor.getPaises().add(new Pais("Alemania"));
		gestor.getPaises().get(0).ValidadJugador();
		gestor.seleccionarPais().ValidadJugador();
		
		do{ 
			op=Integer.parseInt(JOptionPane.showInputDialog("\n0-Jugar \n1-Buscar Jugador  \n2-Mencionar Jugador  \n3-Salir "));
			switch (op) {
				case 0:
					Competencia compe= new Competencia();
					compe.jugarCompetencia(gestor.seleccionarPais());
				break;
				case 1:
					Pais bJ=gestor.seleccionarPais();
					bJ.BuscarJugador();
				break;
				case 2:
					//Pais mJ=gestor.seleccionarPais();
					//mJ.MencionarJugador();	
				break;
				case 3:
					JOptionPane.showMessageDialog(null, "Saliendo...");
				break;
	
				default:
					JOptionPane.showMessageDialog(null, "Error.");
				break;
			}
		}while (op!=3); 
	
	}
  
}

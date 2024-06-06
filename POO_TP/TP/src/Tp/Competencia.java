package Tp;

import javax.swing.JOptionPane;

public class Competencia {
	private int intentos1;
	private int intentos2;
	  public Competencia(int intentos1, int intentos2) {
		super();
		this.intentos1 = intentos1;
		this.intentos2 = intentos2;
	}
	public int getIntentos1() {
		return intentos1;
	}
	public void setIntentos1(int intentos1) {
		this.intentos1 = intentos1;
	}
	public int getIntentos2() {
		return intentos2;
	}
	public void setIntentos2(int intentos2) {
		this.intentos2 = intentos2;
	}
	@Override
	public String toString() {
		return "Competencia [intentos1=" + intentos1 + ", intentos2=" + intentos2 + "]";
	}
	public Competencia (){
		intentos1=0;
		intentos2=0;
	}
	// verificar que a,bos equipos esten llenos (pais1.getJugadores().size()<3 || pais2.getJugadores().size()<3)
	public void jugarCompetencia(Pais pais) {
			//  >  <
		int puntos1=0;
		int puntos2=0;
		for (Jugador jugador : pais.getJugadores()) {
			do {
				intentos1 = (int)(Math.random()*11);
				intentos2 = (int)(Math.random()*11);
			switch (intentos1) {
			case 0:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+" Se leciono el participante del equipo 1 .");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,jugador.getNombre()+ " Fallo jugador del equipo 1 .");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+" Fallo jugador del equipo 1 .");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+" Jugador del equipo 1 consiguió superar la prueba por muy poco.");
				puntos1++;
				break;
			case 4:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+" Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 5:
				JOptionPane.showMessageDialog(null,jugador.getNombre()+ " Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 6:
				JOptionPane.showMessageDialog(null,jugador.getNombre()+ " Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 7:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+" Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 8:
				JOptionPane.showMessageDialog(null,jugador.getNombre()+ "Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 9:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+"Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			case 10:
				JOptionPane.showMessageDialog(null, jugador.getNombre()+"Jugador del equipo 1 consiguió superar la prueba.");
				puntos1++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error.");
			break;
			}
			//segundo equipo
			switch (intentos2) {
			case 0:
				JOptionPane.showMessageDialog(null, "Se leciono el participante del equipo 2 .");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Fallo jugador del equipo 2 .");
			break;
			case 2:
				JOptionPane.showMessageDialog(null, "Fallo jugador del equipo 2 .");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba por muy poco.");
				puntos2++;
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Jugador del equipo 2 consiguió superar la prueba.");
				puntos2++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error.");
			break;
			}
			
			
			
			if (puntos1==puntos2) {
				JOptionPane.showMessageDialog(null, "Hay empate, se vuelve a competir con más peso");
			}
			} while (puntos1==puntos2);
			if (puntos1>puntos2) {
				JOptionPane.showMessageDialog(null, "¡Gano el equipo 1! "+ puntos1+ " Puntos a "+puntos2);
			} else {
				JOptionPane.showMessageDialog(null, "¡Gano el equipo 2! "+ puntos2+ " Puntos a "+puntos1);
			}
		}	
	}
}
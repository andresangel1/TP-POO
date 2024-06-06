package Tp;
import javax.swing.JOptionPane;
public class Jugador {
	private String nombre;
	private int peso;
	private int categoria;
	private int edad;
	private int nCamiseta;
	private static int num;
	private int cantParticipantes;
	public Jugador(String nombre, int peso, int categoria, int edad) {
		super();
		num++;
		this.nombre = nombre;
		this.peso = peso;
		this.categoria = categoria;
		this.edad = edad;
		this.nCamiseta = num;
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getnCamiseta() {
		return nCamiseta;
	}
	public void setnCamiseta(int nCamiseta) {
		this.nCamiseta = nCamiseta;
	}
	public int getCantParticipantes() {
		return cantParticipantes;
	}
	public void setCantParticipantes(int cantParticipantes) {
		this.cantParticipantes = cantParticipantes;
	}
	
	@Override
	public String toString() {
		return "\n Jugador nombre=" + nombre +", peso=" + peso + ", categoria=" + categoria
				+ ", edad=" + edad + ", nCamiseta=" + nCamiseta + "\n";
	}
	public Jugador(){
		nombre="";
		edad=0;
		nCamiseta=1;
		cantParticipantes=0;
	}

	
	
}

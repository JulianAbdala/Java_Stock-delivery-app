public class Videojuego extends Entregable {
//Constantes
	private final static int HORAS_DEF = 10;
	
//Atributos
	private int horas;
	
//Constructores
	public Videojuego() {
		this("", HORAS_DEF, "","", ENTREGADO_DEF);
	}
	public Videojuego(String titulo, int horas) {
		this(titulo, horas, "", "", ENTREGADO_DEF);
	}
	public Videojuego(String c_titulo, int c_horas, String c_genero, String c_creador,boolean c_entregado) {
		this.titulo = c_titulo;
		this.horas = c_horas;
		this.genero = c_genero;
		this.creador = c_creador;
	}
	
//GETS
	public int getHoras() {
		return horas;
	}
	
//SETS
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
//TOSTRING
	public String toString() {

	return "Nombre del videojuego: " + getTitulo() + "\n"
			+ "Cantidad de horas: " + getHoras() + "\n"
			+ "Genero: " + getGenero() + "\n"
			+ "Creador: " + getCreador() + "\n"
			+ "�Ha sido entregado?: " + entregado + "\n";
		
	}
}

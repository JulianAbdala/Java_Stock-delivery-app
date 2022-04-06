public class Serie extends Entregable {
//Constantes
	private final static int NUM_TEMP = 3;	
	
//Atributos
	private int temp;
	
//Constructores
	public Serie() {
		this("", NUM_TEMP, "", "", ENTREGADO_DEF);
	}
	
	public Serie(String titulo, String creador){
		this(titulo, NUM_TEMP, "", creador, ENTREGADO_DEF);
	}
	public Serie(String c_titulo, int c_temp, String c_genero, String c_creador, boolean c_entregado) {
		this.titulo= c_titulo;
		this.temp= c_temp;
		this.genero= c_genero;
		this.creador= c_creador;
	}
	
//GETS
	public int getTemp() {
		return temp;
	}
	
//SETS
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
//TOSTRING
	public String toString() {

		return "Nombre de la serie: " + titulo + "\n"
				+ "Nro de Temporada: " + temp + "\n"
				+ "Genero: " + genero + "\n"
				+ "Creador: " + creador + "\n"
				+ "¿Ha sido entregado?: " + entregado + "\n";	
		}
			
}

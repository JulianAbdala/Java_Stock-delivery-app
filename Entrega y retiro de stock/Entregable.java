public class Entregable {
//CONSTANTES
	protected final static boolean ENTREGADO_DEF = false;
	
//ATRIBUTOS
	protected String titulo;
	protected boolean entregado;
	protected String genero;
	protected String creador;

//SETS
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}

//GETS
	public String getTitulo() {
		return titulo;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}

//EQUALS
		public boolean equalsSerie(Object obj) {
			Serie s= (Serie)obj;
			
			return s.getTitulo().equals(this.getTitulo());
		}		
		public boolean equalsVideojuego(Object obj) {
			Videojuego s= (Videojuego)obj;
			
			return s.getTitulo().equals(this.getTitulo());
		}		
		
//METODOS
		public boolean entregar() {
			return entregado = true;
		}
	
		public boolean devolver() {
			return entregado = false;
		}
		
		public boolean estaEntregado() {
			return entregado;
		}
		
}
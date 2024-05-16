package TDAPadre;
public class Libro {

	//Atributos
	protected String titulo;
	protected String autor;
	protected double precio;
	
	//metodos constructores
	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public Libro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "\n [titulo=" + getTitulo() + "\n autor=" + getAutor() + "\n precio=" + getAutor() + "]";
	}
	
	
	
	
	
	
}

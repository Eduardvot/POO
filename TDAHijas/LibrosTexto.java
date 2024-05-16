package TDAHijas;
import TDAPadre.*;
public class LibrosTexto extends Libro {

	//Atributos
	private String curso; 
	
	//Constructores
    public LibrosTexto(String titulo, String autor, double precio, String curso) { 
    super(titulo, autor, precio);	
    this.curso = curso;
    }
    public LibrosTexto() {
		// TODO Auto-generated constructor stub
	}
	//setters and getters
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
    //tostring
	@Override
	public String toString() {
		return "\n LibrosTexto " + super.toString() + "\n [curso=" + getCurso() + "]";
	}
	
    
    
}

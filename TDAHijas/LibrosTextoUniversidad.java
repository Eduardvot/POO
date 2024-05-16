package TDAHijas;
import TDAHijas.*;
import TDAPadre.*;
public class LibrosTextoUniversidad extends LibrosTexto{

	//Atributos
	protected String solicitar;
	
	//constructores
	public LibrosTextoUniversidad(String titulo, String autor, double precio, String curso, String solicitar) {
		super(titulo, autor, precio, curso);
		this.solicitar = solicitar;
	}

	public LibrosTextoUniversidad() {
	}

	//getters and setters
	public String getSolicitar() {
		return solicitar;
	}

	public void setSolicitar(String solicitar) {
		this.solicitar = solicitar;
	}

	//Tostring
	@Override
	public String toString() {
		return "\n LibrosTextoUniversidad \n" + super.toString() + "\n [solicitar=" + solicitar + "]";
	}
	
	
	
	

	
	
}

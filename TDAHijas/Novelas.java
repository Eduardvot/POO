package TDAHijas;
import TDAHijas.*;
import TDAPadre.*;
public class Novelas extends Libro{

	//Atributos
	private String tipo;
	
	//Constructor
	public Novelas(String titulo, String autor, double precio, String tipo) {
		super(titulo, autor, precio);
		this.tipo = tipo;
	}

	public Novelas() {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\n Novelas \n" + super.toString()  +  "\n [tipo=" + getTipo() + "]";
	}
	
	

}

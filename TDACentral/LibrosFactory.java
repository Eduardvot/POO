package TDACentral;
import TDAPadre.*;
import TDAHijas.*;
public class LibrosFactory {

	public static Libro crearLibroTexto() {
	LibrosTexto libT = new LibrosTexto();
	libT.setTitulo(TJOption.leerString("Como se llama tu Libro"));
	libT.setAutor(TJOption.leerString("Quien es el Autor"));
	libT.setPrecio(TJOption.leerDouble("Cual es el Precio de Tu libro"));
	String curso = TJOption.leerString("A que Curso Pertenece");
  return new LibrosTexto(libT.getTitulo(), libT.getAutor(), libT.getPrecio(), curso);
	}
	
	public static Libro crearLibroTextoUniversidad() { 
	LibrosTextoUniversidad libUni = new LibrosTextoUniversidad();
	libUni.setTitulo(TJOption.leerString("Como se llama tu Libro"));
	libUni.setAutor(TJOption.leerString("Quien es el Autor"));
	libUni.setPrecio(TJOption.leerDouble("Cual es el Precio de Tu libro"));
	String curso = TJOption.leerString("A que Curso Pertenece");
	String facultad = TJOption.leerString("Que Facultad solicita el libro");
 return new LibrosTextoUniversidad(libUni.getTitulo(), libUni.getAutor(), libUni.getPrecio(), curso, facultad);
	}
	
	public static Libro crearNovelas() {
	Novelas nov = new Novelas(); 
	nov.setTitulo(TJOption.leerString("Como se llama tu Libro"));
	nov.setAutor(TJOption.leerString("Quien es el Autor"));
	nov.setPrecio(TJOption.leerDouble("Cual es el Precio de Tu libro"));
	nov.setTipo(TJOption.leerString("Que tipo de Novelas es?"));
	return new Novelas(nov.getTitulo(), nov.getAutor(), nov.getPrecio(), nov.getTipo());
	}
	
}

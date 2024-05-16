package TDACentral;
import TDAPadre.*;
public class Arreglo {

	private Libro [] libro;
	private int i = 0;
	
	public Arreglo(int tamaño) {
		libro = new Libro[tamaño];
	}
	
	public void AgregarLibro(Libro libritos) {
		if(i < libro.length ) {
			libro[i++] = libritos;
			TJOption.imprimePantalla("Librito_Agregado");
		} else { TJOption.imprimeError("No hay espacio para mas libritos");} 	
	}
	public void MostrarArreglo() {
		String msj = "\n Lista de Libritos";
		for(int j = 0; j<i; j++) {
			msj += libro[j].toString() + "\n";
		}
		TJOption.imprimePantalla(msj);
	}	
}


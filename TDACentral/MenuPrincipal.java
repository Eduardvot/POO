package TDACentral;

import javax.swing.JOptionPane;

import TDAPadre.*;

public class MenuPrincipal {

    private static Arreglo admin = new Arreglo(10); 

    public static void main(String[] args) {
        String opcionesMenu = "Crear_Libro_de_Texto,Crear_Libro_de_Texto_Universidad,Crear_Novelas,Imprimir_Libros,Salir";
        String sel;
        do {
        	//revisar el tema 5.1.3 ,5.1.4, 5.1.5,5.1.6
            sel = desplegable(opcionesMenu);
            switch (sel) {
                case "Crear_Libro_de_Texto":
                    admin.AgregarLibro(LibrosFactory.crearLibroTexto());
                    break;
                case "Crear_Libro_de_Texto_Universidad":
                    admin.AgregarLibro(LibrosFactory.crearLibroTextoUniversidad());
                    break;
                case "Crear_Novelas":
                    admin.AgregarLibro(LibrosFactory.crearNovelas());
                    break;   
                case "Imprimir_Libros":
                    admin.MostrarArreglo();
                    break;
                case "Salir":
                    break;
                default:
                    TJOption.imprimeError("Opción no válida.");
                    break;
            }
        } while (!"Salir".equalsIgnoreCase(sel));
    }

    public static String desplegable(String menu) {
        String valores[] = menu.split(",");
        return (String) JOptionPane.showInputDialog(null, "M E N U", "Selecciona opción:",
                JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
    }
}

package TDACentral;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TJOption {
	
	public static byte leerByte(String msje){
        return(Byte.parseByte(JOptionPane.showInputDialog(null,msje," [byte]",JOptionPane.QUESTION_MESSAGE)));
    }
	public static boolean leerBoolean(String msje){
        return(Boolean.parseBoolean(JOptionPane.showInputDialog(null,msje," [boolean]",JOptionPane.QUESTION_MESSAGE)));
    }
	 
	public static short leerShort(String msje){
	        return(Short.parseShort(JOptionPane.showInputDialog(null,msje,"[short]",JOptionPane.QUESTION_MESSAGE)));
	    }
	
    public static int leerInt(String msje){
        return(Integer.parseInt(JOptionPane.showInputDialog(null,msje,"[int]",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static long leerLong(String msje){
        return(Long.parseLong(JOptionPane.showInputDialog(null,msje,"[long]",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static float leerFloat(String msje){
        return(Float.parseFloat(JOptionPane.showInputDialog(null,msje,"[float]",JOptionPane.QUESTION_MESSAGE)));
    }
         
    
    public static double leerDouble(String msje){
        return(Double.parseDouble(JOptionPane.showInputDialog(null,msje,"[double]",JOptionPane.QUESTION_MESSAGE)));
    }
    public static String leerString(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura String",JOptionPane.QUESTION_MESSAGE));
    }
    public static char leerChar(String msje){
        return(JOptionPane.showInputDialog(null,msje,"Lectura Char",JOptionPane.QUESTION_MESSAGE).charAt(0));
    }
    
    
    public static void imprimePantalla(String msje){
        JOptionPane.showMessageDialog(null,msje,"Salida",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void imprimeError(String msje)
	{
		JOptionPane.showMessageDialog(null,msje,"Ërror!!!",	JOptionPane.ERROR_MESSAGE);
	}
    
    
    public static int  seguirSino(){

	    return JOptionPane.showConfirmDialog(null,"Deseas continuar", "Capturando datos",  JOptionPane.YES_NO_OPTION);

	 }
   
        
    public static String  Carrera() {
		String valores[] = { "Ing. En Sistemas", "Ing. Informatica" };
		return ((String) JOptionPane.showInputDialog
				(null, "seleciona", "tu carrera", JOptionPane.QUESTION_MESSAGE, null,
				valores, valores[0]));
	}

    public static String  genero() {
		String valores[] = { "Femenino", "Masculino" };
		return ((String) JOptionPane.showInputDialog
				(null, "seleciona", "tu carrera", JOptionPane.QUESTION_MESSAGE, null,
				valores, valores[0]));
	}
    public static void panelScroll(String cad) {

        JTextArea areaSalida=new JTextArea(10,4);

        JScrollPane scroller=new JScrollPane(areaSalida);

        Font font = new Font("Arial", Font.BOLD, 15);

        areaSalida.setFont(font);

        areaSalida.setForeground(Color.BLUE);
        

        areaSalida.setBackground(Color.black);

        areaSalida.append("\n"+cad);

       JOptionPane.showMessageDialog(null,scroller,"Mi Objetos:",JOptionPane.PLAIN_MESSAGE);

   }
  
}

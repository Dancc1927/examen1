import java.util.HashMap;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int dias=100000, valorPagar=0, cantidadDias=0,tratamiento=0, medicamento=0;
		String nombre="";

		HashMap<String,Integer> mapaNombres= new HashMap<String,Integer>();
		nombre=JOptionPane.showInputDialog("Ingrese su nombre");
		mapaNombres.put(nombre, valorPagar);
		
		
		tratamiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
	    cantidadDias=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de hospitalizacion"));
	    medicamento=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor del medicamento"));
	    cantidadDias=dias;
		valorPagar= tratamiento*cantidadDias*medicamento;
		System.out.println(nombre+ "El valor a pagar es :"+valorPagar);
		
	
		}

}

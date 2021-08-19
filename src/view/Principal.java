package view;

import javax.swing.JOptionPane;

import Controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		
		int entrada;
		
		entrada = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Insira o número do fatorial ", JOptionPane.QUESTION_MESSAGE));
	while (entrada > 12) {
		entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente o número do fatorial", JOptionPane.QUESTION_MESSAGE));
	
	}
	FatorialController dc = new FatorialController();
	int fat = dc.fat(entrada);
	System.out.println(fat);
			
		}

}

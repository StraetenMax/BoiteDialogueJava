package com.philippe;

import javax.swing.JOptionPane;

public class BoiteDialog {

	public static void main(String[] args) {
		String demande1 = JOptionPane.showInputDialog("Entrez un premier nombre ?");
		int nbre1 = Integer.parseInt(demande1);
		String demande2 =JOptionPane.showInputDialog("Entrez un deuxième nombre ?");
		int nbre2 = Integer.parseInt(demande2);
		
		String message = String.format("la somme est de %d ", (nbre1+nbre2));
		//JOptionPane.showMessageDialog(null,"Bonjour "+nom);
		JOptionPane.showMessageDialog(null, message);
		
	}

}

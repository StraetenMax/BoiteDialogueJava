package com.philippe;

import javax.swing.JOptionPane;

public class Solution {

	public static void main(String[] args) {
   int nbre1 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un premier nombre ?"));
   int nbre2 = Integer.parseInt(JOptionPane.showInputDialog("Entrez un deuxième nombre ?"));
	
   String message = String.format("la somme de %d et de %d est de %d", nbre1, nbre2, nbre1 + nbre2);
	JOptionPane.showMessageDialog(null, message);
   
	}
}



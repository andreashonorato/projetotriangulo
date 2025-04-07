

package com.mycompany.projetotriangulo;

import javax.swing.JOptionPane;
public class Projetotriangulo {

    public static void main(String[] args) {
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("digite a altura do triangulo"));
        
        area = (base * altura)/2.0;
        
        JOptionPane.showMessageDialog(null, "A Area do triangulo é" + area);
    }
}

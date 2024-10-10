/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea07;

import javax.swing.JOptionPane;

public class tarea_07 {
    String mensaje;
    public tarea_07() {
        // Crear un programa que capture tres números con JOptionPane y 
        // determine el menor, usar try cath, if, etc
        String valorCadena = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
        String valorCadena1 = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
        String valorCadena2 = JOptionPane.showInputDialog(null, "Ingrese un numero: ");
        try {
            int num = Integer.parseInt(valorCadena);
            int num2 = Integer.parseInt(valorCadena1);
            int num3 = Integer.parseInt(valorCadena2);
            
            if (num < num2 && num < num3) {
                mensaje = "El menor es " + num;
            } else if (num2 < num && num2 < num3) {
                mensaje = "El menor es " + num2;
            } else {
                mensaje = "El menor es " + num3;
            }
        } catch (NumberFormatException ex) {
            mensaje = "No digitaste tres numeros. ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }        
}

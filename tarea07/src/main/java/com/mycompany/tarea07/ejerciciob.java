package com.mycompany.tarea07;

import javax.swing.JOptionPane;

public class ejerciciob {
    // Crea un programa que pida nro. 1 a 12 con JOptionPane imprima el 
    // nombre del mes, usar try catch y switch();
    String mensaje;
    public ejerciciob() {
     
        String valorCadena = JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 12: ");
        try {
            int numero = Integer.parseInt(valorCadena);
            switch(numero) {
                case 1:
                    mensaje = "Enero";
                    break;
                case 2:
                    mensaje = "Febrero";
                    break;
                case 3:
                    mensaje = "Marzo";
                    break;
                case 4:
                    mensaje = "Abril";
                    break;
                case 5:
                    mensaje = "Mayo";
                    break;
                case 6:
                    mensaje = "Junio";
                    break;
                case 7:
                    mensaje = "Julio";
                    break;
                case 8:
                    mensaje = "Agosto";
                    break;
                case 9:
                    mensaje = "Septiembre";
                    break;
                case 10:
                    mensaje = "Octubre";
                    break;
                case 11:
                    mensaje = "Noviembre";
                    break;
                case 12:
                    mensaje = "Diciembre";
                    break;
            }
        } catch(NumberFormatException ex) {
            mensaje = "No digitaste un nro. entre 1 y 12";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

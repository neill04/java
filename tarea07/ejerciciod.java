package com.mycompany.tarea07;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejerciciod  extends JFrame implements ActionListener {
    // Modifique el ejemplo 9 usando tres botones para una creación suya
    
    // Creacion de tres botones
    JButton boton1;
    JButton boton2;
    JButton boton3;
    
    public ejerciciod() {
        organizaComponentes();
        pack();
        setVisible(true);
    }
    
    private void organizaComponentes() {
        JPanel panel2 = new JPanel();
        
        // Se inicializa los botones
        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        
        // Se añade ActionListeners a los tres botones creados
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        
        // Agregar los botones al panel
        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        
        // Agregamos el panel a la ventana
        add(panel2);
    }
    
    public void actionPerformed(ActionEvent ev) {
        // Se identifica el boton que se presiona
        if (ev.getSource() == boton1) {
            JOptionPane.showMessageDialog(this, "Presionaste el botón 1");
        } else if (ev.getSource() == boton2) {
            JOptionPane.showMessageDialog(this, "Presionaste el botón 2");
        } else if (ev.getSource() == boton3) {
            JOptionPane.showMessageDialog(this, "Presionaste el botón 3");
        }
    }   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimeravez;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.event.*;
public class mujerHombre extends JFrame implements ActionListener{
    private JButton boton1,boton2;
    public mujerHombre() {
        setLayout(null);
        boton1=new JButton("Varón");
        boton1.setBounds(10,10,100,30);
        boton1.addActionListener(this);
        add(boton1);
        boton2=new JButton("Mujer");
        boton2.setBounds(10,70,100,30);
        boton2.addActionListener(this);
        add(boton2);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("Varón");
        }
        if (e.getSource()==boton2) {
            setTitle("Mujer");
        }
    }
    
    public static void main(String[] ar) {
        mujerHombre formulario1=new mujerHombre();
        formulario1.setBounds(0,0,130,140);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
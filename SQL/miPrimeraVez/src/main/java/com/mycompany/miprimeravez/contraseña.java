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
public class contraseña extends JFrame implements ActionListener {
    private JLabel label1,label2;
    private JTextField textfield1,textfield2;
    private JButton boton1;
    public contraseña() {
        setLayout(null);
        label1=new JLabel("Nombre:");
        label1.setBounds(10,10,100,30);
        add(label1);
        label2=new JLabel("Clave:");
        label2.setBounds(10,50,100,30);
        add(label2);
        textfield1=new JTextField();
        textfield1.setBounds(130,10,100,30);
        add(textfield1);
        textfield2=new JTextField();
        textfield2.setBounds(130,50,100,30);
        add(textfield2);
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,100,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad1=textfield1.getText();
            String cad2=textfield2.getText();
            if (cad1.equals("juan")==true && cad2.equals("abc123")==true) {
                setTitle("Correcto");
            } else {
                setTitle("Incorrecto");
            }
        }
    }
    
    public static void main(String[] ar) {
        contraseña formulario1=new contraseña();
        formulario1.setBounds(0,0,260,200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

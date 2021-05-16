/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classs;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author mike
 */
public class Metodos {

    // Crear el Text Area
    JScrollPane scroll;
    JTextArea AreaText;
    JButton boton;
    JLabel etiqueta;

    // Variable
    String nombre;

    // Contador para 
    int contador = 0;

    // Arreglo de nombres para ver los proyectos que tenemos actualmente
    String[] names = new String[100];
    
    public void Pestañas(JTabbedPane tabs, String name) {
        
        AreaText = new JTextArea();

        // Color
        AreaText.setBackground(Color.DARK_GRAY);
        AreaText.setForeground(Color.WHITE);

        // Fuente
        Font fuente = new Font("C059", Font.BOLD, 15);

        // Configuracion del Text Area
        AreaText.setFont(fuente);
        AreaText.setLineWrap(true);
        AreaText.setWrapStyleWord(true);

        //
        String completar = name + ".cpl";
        names[contador] = completar;
        contador++;

        //
        scroll = new JScrollPane(AreaText);
        scroll.setBackground(Color.DARK_GRAY);
        
        //
        AreaText.setFocusable(true);
        tabs.add(scroll, completar);
        AreaText.requestFocus();
    }

    public void hola() {
        JOptionPane.showMessageDialog(null, names[0]);
    }

    public void ver(JPanel panel, JButton botton, JLabel label) {

        botton.setVisible(true);
        label.setVisible(true);

        String nombre_archivo = "";

        for (int i = 0; i < contador; i++) {
            nombre_archivo = names[i];
        }

        label.setText(nombre_archivo);

        //System.out.println(nombre_archivo);
        /*boton = new JButton(nombre_archivo);
        etiqueta = new JLabel(nombre_archivo);
        boton.setSize(100,30);
        etiqueta.setSize(80,30);
        panel.add(boton);*/
        // panel.add(etiqueta);
    }
    
    public void Directorio(String carpeta){
        File ruta_directorio = new File(carpeta);
        if(!ruta_directorio.exists()){
            if(ruta_directorio.mkdirs()){
                System.out.println("Exitoso");
            }
        }
            
        
    }

}

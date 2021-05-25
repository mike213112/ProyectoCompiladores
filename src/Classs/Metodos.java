/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classs;

import java.awt.*;
import java.io.*;
import java_cup.runtime.Symbol;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mike
 */
public class Metodos {

    // Crear el Text Area
    JScrollPane scroll;
    JTextArea AreaText;
    JButton boton;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;
    JButton boton9;
    JButton boton10;
    JButton boton11;
    JButton boton12;
    JButton boton13;
    JButton boton14;
    JButton boton15;
    JButton boton16;
    JButton boton17;
    JButton boton18;
    JButton boton19;
    JButton boton20;
    JButton boton21;
    JButton boton22;
    JButton boton23;
    JButton boton24;
    JButton boton25;
    JButton boton26;
    JButton boton27;
    JButton boton28;
    JButton boton29;
    JButton boton30;
    JButton boton31;
    JButton boton32;
    JButton boton33;
    JButton boton34;
    JButton boton35;
    JButton boton36;
    JButton boton37;
    JButton boton38;
    JButton boton39;
    JButton boton40;
    JButton boton41;
    JButton boton42;
    JButton boton43;
    JButton boton44;
    JButton boton45;
    JButton boton46;
    JButton boton47;
    JButton boton48;
    JButton boton49;
    JTextField etiqueta;
    JTextField etiqueta1;
    JTextField etiqueta2;
    JTextField etiqueta3;
    JTextField etiqueta4;
    JTextField etiqueta5;
    JTextField etiqueta6;
    JTextField etiqueta7;
    JTextField etiqueta8;
    JTextField etiqueta9;
    JTextField etiqueta10;
    JTextField etiqueta11;
    JTextField etiqueta12;
    JTextField etiqueta13;
    JTextField etiqueta14;
    JTextField etiqueta15;
    JTextField etiqueta16;
    JTextField etiqueta17;
    JTextField etiqueta18;
    JTextField etiqueta19;
    JTextField etiqueta20;
    JTextField etiqueta21;
    JTextField etiqueta22;
    JTextField etiqueta23;
    JTextField etiqueta24;
    JTextField etiqueta25;
    JTextField etiqueta26;
    JTextField etiqueta27;
    JTextField etiqueta28;
    JTextField etiqueta29;
    JTextField etiqueta30;
    JTextField etiqueta31;
    JTextField etiqueta32;
    JTextField etiqueta33;
    JTextField etiqueta34;
    JTextField etiqueta35;
    JTextField etiqueta36;
    JTextField etiqueta37;
    JTextField etiqueta38;
    JTextField etiqueta39;
    JTextField etiqueta40;
    JTextField etiqueta41;
    JTextField etiqueta42;
    JTextField etiqueta43;
    JTextField etiqueta44;
    JTextField etiqueta45;
    JTextField etiqueta46;
    JTextField etiqueta47;
    JTextField etiqueta48;
    JTextField etiqueta49;
    
    static JFrame f;
    static JLabel l;    

    // Variable
    String nombre;
    String carpeta_nueva;

    // Contador para 
    int contador = 0;

    // Arreglo de nombres para ver los proyectos que tenemos actualmente
    String[] names = new String[100];

    // Files
    String user = System.getenv("USERNAME");
    String directorio_linux = "/home/" + user + "/CursoCompiladores";

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
        nombre = completar;
        names[contador] = completar;
        nombre = completar;
        contador++;

        //
        scroll = new JScrollPane(AreaText);
        scroll.setBackground(Color.DARK_GRAY);

        //
        AreaText.setFocusable(true);
        tabs.add(scroll, completar);
        AreaText.requestFocus();
        GuardarArchivo();
    }

    public void ver(JPanel panel) {

        File archivos = new File(directorio_linux);

        if (archivos.exists()) {

            File[] ficheros = archivos.listFiles();

            String[] buscar;

            //for (int arch = 0; arch < ficheros.length; arch++) {
            for (int arch = 0; arch < contador; arch++) {
                buscar = ficheros[arch].toString().split("/");

                for (int search = 0; search < 1; search++) {
                    String jalarnombre1 = buscar[4];
                    /*System.out.println(buscar[4]);
                    int contar = 0;
                    System.out.println("=========");
                    System.out.println(names[contar]);
                    System.out.println("------------------");

                    String jalarnombre = names[contar];

                    System.out.println(jalarnombre);*/

                }

                //System.out.println(ficheros[arch].toString());
            }
            
            String nombre_archivo = "";

            for (int i = 0; i < contador; i++) {
                nombre_archivo = names[i];
            }

            int valorxb, valorxt, valoryb, valoryt;
            valoryb = 40;
            valorxt = 33;
            valoryt = 45;
            
            for (int botonesr = 0; botonesr < contador; botonesr++) {
                if (botonesr == 0) {
                    boton = new JButton();
                    boton.setBounds(5, valoryb, 25, 25);
                    boton.setBackground(new Color(95,95,95));
                    boton.setIcon(new ImageIcon(getClass().getResource("/Images/cafe.png")));
                    boton.setBorder(null);
                    boton.setVisible(true);
                    panel.add(boton);
                    //
                    etiqueta = new JTextField();
                    etiqueta.setText(names[0]);
                    etiqueta.setBounds(33, 45, 130, 20);
                    etiqueta.setFont(new Font("C059", Font.BOLD, 15));
                    etiqueta.setBackground(new Color(95,95,95));
                    etiqueta.setForeground(Color.WHITE);
                    etiqueta.setEditable(false);
                    etiqueta.setBorder(null);
                    panel.add(etiqueta);
                } else if (botonesr == 1) {
                    boton1 = new JButton();
                    valoryb = 30;
                    boton1.setBounds(5, 70, 25, 25);
                    //boton1.setBounds(5, 70, 25, 25);
                    //boton1.setText("");
                    boton1.setBackground(new Color(95,95,95));
                    boton1.setIcon(new ImageIcon(getClass().getResource("/Images/cafe.png")));
                    boton1.setBorder(null);
                    boton1.setVisible(true);
                    panel.add(boton1);
                    //
                    etiqueta1 = new JTextField();
                    etiqueta1.setText(names[1]);
                    etiqueta1.setBounds(33, 75, 130, 20);
                    etiqueta1.setFont(new Font("C059", Font.BOLD, 15));
                    etiqueta1.setBackground(new Color(95,95,95));
                    etiqueta1.setForeground(Color.WHITE);
                    etiqueta1.setEditable(false);
                    etiqueta1.setBorder(null);
                    panel.add(etiqueta1);
                }
                else if (botonesr == 2) {
                    boton2 = new JButton();
                    boton2.setBounds(5, 100, 25, 25);
                    boton2.setBackground(new Color(95,95,95));
                    boton2.setIcon(new ImageIcon(getClass().getResource("/Images/cafe.png")));
                    boton2.setBorder(null);
                    boton2.setVisible(true);
                    panel.add(boton2);
                    //
                    etiqueta2 = new JTextField();
                    etiqueta2.setText(names[1]);
                    etiqueta2.setBounds(33, 105, 130, 20);
                    etiqueta2.setFont(new Font("C059", Font.BOLD, 15));
                    etiqueta2.setBackground(new Color(95,95,95));
                    etiqueta2.setForeground(Color.WHITE);
                    etiqueta2.setEditable(false);
                    etiqueta2.setBorder(null);
                    panel.add(etiqueta2);
                }
                else if (botonesr == 3) {
                    boton3 = new JButton();
                    boton3.setBounds(5, 130, 25, 25);
                    boton3.setBackground(new Color(95,95,95));
                    boton3.setIcon(new ImageIcon(getClass().getResource("/Images/cafe.png")));
                    boton3.setBorder(null);
                    boton3.setVisible(true);
                    panel.add(boton3);
                    //
                    etiqueta3 = new JTextField();
                    etiqueta3.setText(names[1]);
                    etiqueta3.setBounds(33, 135, 130, 20);
                    etiqueta3.setFont(new Font("C059", Font.BOLD, 15));
                    etiqueta3.setBackground(new Color(95,95,95));
                    etiqueta3.setForeground(Color.WHITE);
                    etiqueta3.setEditable(false);
                    etiqueta3.setBorder(null);
                    panel.add(etiqueta3);
                }
                else if (botonesr == 4) {
                    boton4 = new JButton();
                    boton4.setBounds(5, 160, 25, 25);
                    boton4.setBackground(new Color(95,95,95));
                    boton4.setIcon(new ImageIcon(getClass().getResource("/Images/cafe.png")));
                    boton4.setBorder(null);
                    boton4.setVisible(true);
                    panel.add(boton4);
                    //
                    etiqueta4 = new JTextField();
                    etiqueta4.setText(names[1]);
                    etiqueta4.setBounds(33, 165, 130, 20);
                    etiqueta4.setFont(new Font("C059", Font.BOLD, 15));
                    etiqueta4.setBackground(new Color(95,95,95));
                    etiqueta4.setForeground(Color.WHITE);
                    etiqueta4.setEditable(false);
                    etiqueta4.setBorder(null);
                    panel.add(etiqueta4);
                }
            }
        }
    }

    public void Directorio(String carpeta) {
        carpeta_nueva = carpeta;
        File ruta_directorio = new File(carpeta);
        if (!ruta_directorio.exists()) {
            if (ruta_directorio.mkdirs()) {
                System.out.println("Exitoso");
            }
        }
    }

    public void AbrirArchivo(JTabbedPane Tabs) {
        JFileChooser abrir = new JFileChooser();
        FileNameExtensionFilter fililtro1 = new FileNameExtensionFilter("*.cpl", "cpl");
        abrir.setFileFilter(fililtro1);
        int seleccionar = abrir.showOpenDialog(null);
        AreaText = new JTextArea();
        String ver = "";
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File a = abrir.getSelectedFile();
            String obtenernombre = abrir.getName(a);
            try (FileReader re = new FileReader(a)) {
                String nombrar = "";
                int valor = re.read();
                while (valor != -1) {
                    nombrar = nombrar + (char) valor;
                    valor = re.read();
                    ver = nombrar;
                }
            } catch (Exception e) {
            }
            AreaText.setText(ver);
            Tabs.add(obtenernombre, AreaText);
        }
    }
    
    public void GuardarArchivo() {

        for (int y = 0; y < contador; y++) {
            String directorio_completo_con_nombre_del_archivo = directorio_linux + "/" + names[y];

            File archivo = new File(directorio_completo_con_nombre_del_archivo);
            PrintWriter escribir;
            try {
                escribir = new PrintWriter(archivo);
                escribir.print(AreaText.getText());
                //System.out.println(AreaText.getText());
                escribir.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Error");
            }
        }
    }
    
    public void Analizador_Lexico(JTextArea salida){
        int contador = 1;
        
        String obtenerDatos = (String) AreaText.getText();
        Flex lex = new Flex(new StringReader(obtenerDatos));
        String result = "Linea" + contador + "\t\tSimbolo\n";
        
        while(true){
            
            try {
                Tokens to = lex.yylex();
                if(to==null){
                    salida.setText(result);
                    return;
                }
                switch(to){
                    case Linea:
                        result += "<Letra>\t\t" + lex.lexeme + "\n";
                        break;
                    case Comillas:
                        result += "<Comilla>\t\t" + lex.lexeme + "\n";
                        break;
                    case T_Dato:
                        result += "<Tipo de Dato>\t\t" + lex.lexeme + "\n";
                        break;
                    case string:
                        result += "<string>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_logico:
                        result += "<Operador Logico>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_Aritmeticos:
                        result += "<Operador Aritmetico>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_relacional:
                        result += "<Operador Relacional>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_atribucion:
                        result += "<Operador Atribucion>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_incremento:
                        result += "<Operador Incremento>\t\t" + lex.lexeme + "\n";
                        break;
                    case Op_booleano:
                        result += "<Operador Booleano>\t\t" + lex.lexeme + "\n";
                        break;
                    case Asignacion:
                        result += "<Asignacion>\t\t" + lex.lexeme + "\n";
                        break;
                    case Parentesis_a:
                        result += "<Parentesis Abierto>\t\t" + lex.lexeme + "\n";
                        break;
                    case Parentesis_c:
                        result += "<Parentesis Cerrado>\t\t" + lex.lexeme + "\n";
                        break;
                    case Llave_a:
                        result += "<Llave Abierta>\t\t" + lex.lexeme + "\n";
                        break;
                    case Llave_c:
                        result += "<Llave Cerrada>\t\t" + lex.lexeme + "\n";
                        break;
                    case Corchete_a:
                        result += "<Corchete Abierto>\t\t" + lex.lexeme + "\n";
                        break;
                    case Corchete_c:
                        result += "<Corchete_c>\t\t" + lex.lexeme + "\n";
                        break;
                    case Main:
                        result += "<Main>\t\t" + lex.lexeme + "\n";
                        break;
                    case P_coma:
                        result += "<Punto y coma>\t\t" + lex.lexeme + "\n";
                        break;
                    case Dos_puntos:
                        result += "<Dos Puntos>\t\t" + lex.lexeme + "\n";
                        break;
                    case For:
                        result += "<For>\t\t" + lex.lexeme + "\n";
                        break;
                    case If:
                        result += "<If>\t\t" + lex.lexeme + "\n";
                        break;
                    case Global:
                        result += "Global>\t\t" + lex.lexeme + "\n";
                        break;
                    case Try:
                        result += "Try>\t\t" + lex.lexeme + "\n";
                        break;
                    case Class:
                        result += "<Class>\t\t" + lex.lexeme + "\n";
                        break;
                    case Except:
                        result += "<Except>\t\t" + lex.lexeme + "\n";
                        break;
                    case While:
                        result += "<While>\t\t" + lex.lexeme + "\n";
                        break;
                    case Continue:
                        result += "<Continue>\t\t" + lex.lexeme + "\n";
                        break;
                    case Import:
                        result += "<Import>\t\t" + lex.lexeme + "\n";
                        break;
                    case Def:
                        result += "<Def>\t\t" + lex.lexeme + "\n";
                        break;
                    case Finally:
                        result += "<Finally>\t\t" + lex.lexeme + "\n";
                        break;
                    case In:
                        result += "<In>\t\t" + lex.lexeme + "\n";
                        break;
                    case Print:
                        result += "<Print>\t\t" + lex.lexeme + "\n";
                        break;
                    case Pass:
                        result += "<Pass>\t\t" + lex.lexeme + "\n";
                        break;
                    case As:
                        result += "<As>\t\t" + lex.lexeme + "\n";
                        break;
                    case This:
                        result += "<This>\t\t" + lex.lexeme + "\n";
                        break;
                    case Throw:
                        result += "<Throw>\t\t" + lex.lexeme + "\n";
                        break;
                    case Void:
                        result += "<Void>\t\t" + lex.lexeme + "\n";
                        break;
                    case Null:
                        result += "<Null>\t\t" + lex.lexeme + "\n";
                        break;
                    case Static:
                        result += "<Static>\t\t" + lex.lexeme + "\n";
                        break;
                    case Catch:
                        result += "<Catch>\t\t" + lex.lexeme + "\n";
                        break;
                    case New:
                        result += "<New>\t\t" + lex.lexeme + "\n";
                        break;
                    case Switch:
                        result += "<Switch>\t\t" + lex.lexeme + "\n";
                        break;
                    case Package:
                        result += "<Package>\t\t" + lex.lexeme + "\n";
                        break;
                    case Private:
                        result += "<Private>\t\t" + lex.lexeme + "\n";
                        break;
                    case Default:
                        result += "<Default>\t\t" + lex.lexeme + "\n";
                        break;
                    case Interface:
                        result += "<Interface>\t\t" + lex.lexeme + "\n";
                        break;
                    case Boolean:
                        result += "<Boolean>\t\t" + lex.lexeme + "\n";
                        break;
                    case Break:
                        result += "<Break>\t\t" + lex.lexeme + "\n";
                        break;
                    case Native:
                        result += "<Native>\t\t" + lex.lexeme + "\n";
                        break;
                    case Enum:
                        result += "<Enum>\t\t" + lex.lexeme + "\n";
                        break;
                    case Goto:
                        result += "<Goto>\t\t" + lex.lexeme + "\n";
                        break;
                    case Abstract:
                        result += "<Abstract>\t\t" + lex.lexeme + "\n";
                        break;
                    case Case:
                        result += "<Case>\t\t" + lex.lexeme + "\n";
                        break;
                    case Final:
                        result += "<Final>\t\t" + lex.lexeme + "\n";
                        break;
                    case Identificador:
                        result += "<Letras>\t\t" + lex.lexeme + "\n";
                        break;
                    case Numero:
                        result += "<Numero>\t\t" + lex.lexeme + "\n";
                        break;
                    case ERROR:
                        result += "<ERROR SIMBOLO NO DEFINIDO>\t\t" + "\n";
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void AnalizadorSintactico(JTextArea salida){
        String obtener = AreaText.getText();
        Sintaxis s = new Sintaxis(new Classs.FlexCup(new StringReader(obtener)));
        
        try {
            Object result = s.parse().value;
            salida.setText("Sintaxis Correcta\n");
            salida.setForeground(new Color(37,64,2));
        } catch (Exception e) {
            Symbol sym = s.getS();
            //salida.setText("Error de Sintaxis: "+ (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \n" + sym.value);
            salida.setText("Error de Sintaxis: ");
            salida.setForeground(new Color(255,0,0));
        }
    }
    
    public void AnalizadorSemantico(){
        
    }

}

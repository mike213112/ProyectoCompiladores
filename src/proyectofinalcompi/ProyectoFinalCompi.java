/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalcompi;

import Interface.*;
import Classs.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mike
 */
public class ProyectoFinalCompi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        // Rutas
        
        String ruta1 = System.getProperty("user.dir");
        String completarRuta1 = ruta1 + "/src/Classs/Flex";
        String completarRuta2 = ruta1 + "/src/Classs/FlexCup";
        String completarRuta3 = ruta1 + "/src/Classs/Sintaxis";
        String[] rutas = {"-parser", "Sintaxis", completarRuta3};
        //
        generar(completarRuta1, completarRuta2, rutas);
        //
        String user = System.getenv("USERNAME");
        String directorio_linux = "/home/" + user + "/CursoCompiladores";
        String directorio_windows = "";
        
        String sistema = System.getProperty("os.name");
        
        Metodos metodos = new Metodos();
        
        if (sistema.equals("Linux")) {
            metodos.Directorio(directorio_linux);
            Principal pri = new Principal();
        pri.setVisible(true);
        }
        else{
            metodos.Directorio("");
        }
        
        
        
    }

    public static void generar(String ruta1, String ruta2, String[] ruta3) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(ruta3);
        
        String obtenerRuta = System.getProperty("user.dir");
        String completarLaRuta = obtenerRuta + "/src/Classs/sym.java";
        Path rutaSys = Paths.get(completarLaRuta);
        if(Files.exists(rutaSys)){
            Files.delete(rutaSys);
        }
        Files.move(
                Paths.get(obtenerRuta + "/sym.java"), 
                Paths.get(completarLaRuta));
        Path rutaS = Paths.get(obtenerRuta + "/src/Classs/Sintaxis.java");
        if(Files.exists(rutaS)){
            Files.delete(rutaS);
        }
        Files.move(
                Paths.get(obtenerRuta + "/Sintaxis.java"), 
                Paths.get(obtenerRuta + "/src/Classs/Sintaxis.java"));
        
    }
    
}

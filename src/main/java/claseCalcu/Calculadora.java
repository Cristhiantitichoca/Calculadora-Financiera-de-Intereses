/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package claseCalcu;

import interfaz.LOGIN; // Asegúrate de que la clase Login esté en el paquete igu.
//import javax.swing.ImageIcon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Calculadora {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LOGIN(); // Crea e inicia la ventana del login
        });
        
    }
    
    // Método para calcular el interés simple
    public static double calcularInteresSimple(double montoInicial, double tasaInteres, int tiempo, String tipoInteres, String tipoTiempo) {
        // Ajustar la tasa de interés y el tiempo según las selecciones del usuario
        if (tipoInteres.equals("mensual") && tipoTiempo.equals("años")) {
            tiempo = tiempo * 12; // convertir años a meses
        } else if (tipoInteres.equals("anual") && tipoTiempo.equals("meses")) {
            tiempo = tiempo / 12; // convertir meses a años
        }
        
        // Calcular el interés simple
        return montoInicial * tasaInteres * tiempo;
    }
    
    // Método para guardar los datos en un archivo de texto
    public static void guardarTxt(String prestamista, String cliente, double montoInicial, double tasaInteres, String tipoInteres, int tiempo, String tipoTiempo, double interesSimple) {
       String archivo = "DATOS DEL CLIENTE " + cliente + ".txt"  ;
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter (escribir); 
            buffer.write("Prestamista: " + prestamista);
            buffer.newLine();
            buffer.write("Cliente: " + cliente);
            buffer.newLine();
            buffer.write("Monto Inicial: " + montoInicial);
            buffer.newLine();
            buffer.write("Tasa de Interés: " + tasaInteres + "% " + tipoInteres);
            buffer.newLine();
            buffer.write("Tiempo: " + tiempo + " " + tipoTiempo);
            buffer.newLine();
            buffer.write("Interés Simple Calculado: " + interesSimple);
            buffer.newLine();
            buffer.write("----------------------------");
            buffer.newLine();
            // Asegurarse de que se guarden los datos en el archivo
        buffer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    



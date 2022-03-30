/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class estadisticas {
    private String fuerzaString;
    private String inteString;
    private String agilidadString;

    public estadisticas() {
        this.fuerzaString = "0";
        this.inteString = "0";
        this.agilidadString = "0";
    }

    public void setFuerzaString(String fuerzaString) {
        this.fuerzaString = fuerzaString;
    }

    public void setInteString(String inteString) {
        this.inteString = inteString;
    }

    public void setAgilidadString(String agilidadString) {
        this.agilidadString = agilidadString;
    }

    public String getFuerzaString() {
        return fuerzaString;
    }

    public String getInteString() {
        return inteString;
    }

    public String getAgilidadString() {
        return agilidadString;
    }
    
    public void crearArchivo(){
        try{
            FileWriter guardarArchivo = new FileWriter("C:/Users/Public/Documents/estats.txt");
            guardarArchivo.write("Fuerza-" + fuerzaString + "\n"
                            + "Inteligencia-" + inteString + "\n"
                            + "Agilidad-" + agilidadString);
            
            guardarArchivo.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al crear archivo", "ERROR", 1);
        } 
    }
}

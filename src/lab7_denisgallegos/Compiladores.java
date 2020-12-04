/*
 */
package lab7_denisgallegos;

import java.io.Serializable;
import javax.swing.JTable;


public class Compiladores implements Serializable{
    
    private String nombre; 
    private String nombrecreador;
    private int lineasdecodigo; 
    private int lexico;
    private int sintactico;
    private int semantico;
    private int intermedio;
    private int optimizador;
    private int generador; 
    private JTable tablavariables;
    private JTable tablaerrores; 

    public Compiladores() {
    }

    public Compiladores(String nombre, String nombrecreador, int lineasdecodigo, 
            int lexico, int sintactico, int semantico, int intermedio, int optimizador, int generador) {
        this.nombre = nombre;
        this.nombrecreador = nombrecreador;
        this.lineasdecodigo = lineasdecodigo;
        this.lexico = lexico;
        this.sintactico = sintactico;
        this.semantico = semantico;
        this.intermedio = intermedio;
        this.optimizador = optimizador;
        this.generador = generador;
    }
    
    //MUTADORES: 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecreador() {
        return nombrecreador;
    }

    public void setNombrecreador(String nombrecreador) {
        this.nombrecreador = nombrecreador;
    }

    public int getLineasdecodigo() {
        return lineasdecodigo;
    }

    public void setLineasdecodigo(int lineasdecodigo) {
        this.lineasdecodigo = lineasdecodigo;
    }

    public int getLexico() {
        return lexico;
    }

    public void setLexico(int lexico) {
        this.lexico = lexico;
    }

    public int getSintactico() {
        return sintactico;
    }

    public void setSintactico(int sintactico) {
        this.sintactico = sintactico;
    }

    public int getSemantico() {
        return semantico;
    }

    public void setSemantico(int semantico) {
        this.semantico = semantico;
    }

    public int getIntermedio() {
        return intermedio;
    }

    public void setIntermedio(int intermedio) {
        this.intermedio = intermedio;
    }

    public int getOptimizador() {
        return optimizador;
    }

    public void setOptimizador(int optimizador) {
        this.optimizador = optimizador;
    }

    public int getGenerador() {
        return generador;
    }

    public void setGenerador(int generador) {
        this.generador = generador;
    }

    public JTable getTablavariables() {
        return tablavariables;
    }

    public void setTablavariables(JTable tablavariables) {
        this.tablavariables = tablavariables;
    }

    public JTable getTablaerrores() {
        return tablaerrores;
    }

    public void setTablaerrores(JTable tablaerrores) {
        this.tablaerrores = tablaerrores;
    }
    
    //MA:
    public String toStringCompiladores(){
        return "Nombre: "+nombre;
    }
    
    
    
}//Fin de la clase.

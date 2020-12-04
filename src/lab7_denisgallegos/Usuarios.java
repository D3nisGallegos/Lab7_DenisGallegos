/*
 */
package lab7_denisgallegos;

import java.io.Serializable;


public class Usuarios extends Persona implements Serializable {
    
    private int nota;
    private Compiladores compilador; 

    public Usuarios() {
        super();
    }

    //MUTADORES: 
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Compiladores getCompilador() {
        return compilador;
    }

    public void setCompilador(Compiladores compilador) {
        this.compilador = compilador;
    }
    
    //MA: 
    public String toStringUsusarios(){
        return toStringPersonas()+", Nota: "+nota;
    }
    
    
    
    
    
    
    
    
}//Fin de la clase.

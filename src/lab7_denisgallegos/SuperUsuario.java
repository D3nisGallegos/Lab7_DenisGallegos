/*
 */
package lab7_denisgallegos;

import java.io.Serializable;


public class SuperUsuario extends Persona implements Serializable{
    
    public SuperUsuario() {
        super();
    }
    
    //MUTADORES: 
    
    
    //MA:
    public String toStringSuperUsuario(){
        return toStringPersonas();
    }
    
    
    
}//Fin de la clase.

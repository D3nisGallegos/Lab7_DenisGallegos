/*
 */
package lab7_denisgallegos;

import java.io.Serializable;


public class Usuarios implements Serializable{
    
    private String nombre;
    private String apellido; 
    private String username;
    private String password; 
    private int nota;
    private Compiladores compilador; 

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
    }
    
    //MUTADORES: 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
        return "Nombre: "+nombre+", Apellido: "+apellido;
    }
    
    
    
    
    
    
    
    
}//Fin de la clase.

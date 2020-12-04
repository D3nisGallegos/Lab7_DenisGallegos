/*
 */
package lab7_denisgallegos;


public class SuperUsuario {
    
    private String nombre = "Carlos";
    private String appelido = "Vallejo";
    private String username = "ca.vallejo";
    private String password = "compi123";

    public SuperUsuario() {
    }
    
    //MUTADORES: 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
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
    
    //MA:
    public String toStringSuperUsuario(){
        return "Nombre; "+nombre+", Apellido: "+appelido;
    }
    
    
    
}//Fin de la clase.

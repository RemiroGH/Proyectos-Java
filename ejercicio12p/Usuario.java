package ejercicio12p;

/**
 *
 * @author dremi
 */
public class Usuario {
 
    private String nombre;
    private int id;
    
    Usuario(String nombre,int id){
        
        this.nombre= nombre;
        this.id=id;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

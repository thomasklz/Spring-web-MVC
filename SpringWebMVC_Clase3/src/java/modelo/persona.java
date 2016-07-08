
package modelo;

public class persona {
    private String Nombre ;
    private String Apellido ;
    private int Cedula ;
    
    public persona (String nombre, String apellido,int cedula)
    {
        this.Nombre = nombre;
        this.Apellido =apellido;
        this.Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
    
}

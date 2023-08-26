public class Usuario {
    //Atributos
    private String ID;
    private String nombre;
    private String password;


    // Constructores
    public Usuario() {
    }

    public Usuario(String ID, String nombre, String password) {
        this.ID = ID;
        this.nombre = nombre;
        this.password = password;
    }

    public String getID(){
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    // Getters y Setters

    /*
    public void setID(Integer ID) {
        this.ID = ID;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    */
}

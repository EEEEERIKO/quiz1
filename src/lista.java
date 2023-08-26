import java.util.ArrayList;

public class lista {
    static ArrayList<Usuario> crearLista(String Usuarios){
        ArrayList<Usuario> listaUsuarios= new ArrayList<>();
        String[] Usuario=Usuarios.split(";");
        Usuario c;
        String[] atributos;
        for (int i = 0; i < Usuario.length; i++) {
            atributos=Usuario[i].split(",");
            c= new Usuario(atributos[0],atributos[1],atributos[2]);
            listaUsuarios.add(c);

        }
        return listaUsuarios;
    }
}
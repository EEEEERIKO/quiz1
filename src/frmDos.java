import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class frmDos extends JFrame implements ActionListener{

    static JButton btnLeer, btnListar, btnNuevo;
    static JTextArea txtTablero;
    static JTextField txtID,txtNombre,txtPassword;
    static JLabel lblCodigo;
    static String linea;
    static ArrayList<Usuario> laLista;
    public frmDos(){

        //configuración
        btnLeer = new JButton("Leer Archivo");
        btnLeer.setLocation(30,30);
        btnLeer.setSize(130,30);
        btnLeer.addActionListener(this);

        txtTablero = new JTextArea();
        txtTablero.setLocation(30,70);
        txtTablero.setSize(200,350);

        lblCodigo = new JLabel("Digite Código");
        lblCodigo.setLocation(270,40);
        lblCodigo.setSize(100,30);

        txtID = new JTextField(10);
        txtID.setLocation(270,70);
        txtID.setSize(150,30);

        txtNombre = new JTextField(10);
        txtNombre.setLocation(270,110);
        txtNombre.setSize(150,30);

        txtPassword = new JTextField(10);
        txtPassword.setLocation(270,150);
        txtPassword.setSize(150,30);

        btnNuevo = new JButton("Registrar");
        btnNuevo.setLocation(270,190);
        btnNuevo.setSize(130,30);
        btnNuevo.addActionListener(this);

        btnListar = new JButton("Listar");
        btnListar.setLocation(270,230);
        btnListar.setSize(130,30);
        btnListar.addActionListener(this);


        //adicionar
        add(btnLeer);
        add(txtTablero);
        add(txtID);
        add(txtNombre);
        add(txtPassword);
        add(lblCodigo);
        add(btnNuevo);
        add(btnListar);
        //configurar formulario
        /*Color c = new Color(38,38,38);
        getContentPane().setBackground(c);*/

        setLayout(null);
        setSize(500,500);
        setTitle("Agenda de Usuarios");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (false);

    }


    public void actionPerformed(ActionEvent e)  {
        String listaArea="";
        if (e.getSource().equals(btnListar)){
            for (Usuario c:laLista){
                listaArea=listaArea+c.getID()+"-"+c.getNombre()+"\n";
            }
            txtTablero.setText("");
            txtTablero.append(listaArea);
        }
        if(e.getSource().equals(btnLeer)){
            try{
                txtTablero.append("");
                linea = readFile.leer("C:\\ERIKO\\UNAC\\POO2\\23-08-2023\\Quiz 1 Erik Valencia Y Alejandor Valencia\\src\\archivoPlanoUsuarios");
                txtTablero.setText("");
                txtTablero.append("Archivo leido\nLista creada");
                laLista=lista.crearLista(linea);

            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }

        if(e.getSource().equals(btnNuevo)){
            String id = txtID.getText();
            String nom = txtNombre.getText();
            String psw = txtPassword.getText();

            Usuario c = new Usuario(id,nom,psw);
           String lineaEscribir = linea+";"+id+","+nom+","+psw;
            try{
                writeFile.escribir(lineaEscribir,"c:\\codeall\\Usuarios.txt");
            }catch(IOException ioe){
                System.out.println(ioe);
            }
        }
    }



}
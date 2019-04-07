/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncorto;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Natas
 */
public class Control {
   

    ArrayList<Estudiantes> alumnoList = new ArrayList<>();
    Estudiantes alumSelect = new Estudiantes();
    DefaultListModel modeloLista = new DefaultListModel();

    public void Agregar(String nombre, String apellido, Integer grado) {
        alumSelect.setNombre(nombre);
        alumSelect.setApellido(apellido);
        alumSelect.setCarnet(generadorCarne(nombre, apellido));
        alumSelect.setGrado(grado);
        alumnoList.add(alumSelect);
        alumSelect = new Estudiantes();
        modeloLista(alumnoList);
    }

    public void init() {
        modeloLista(alumnoList);
    }

    public void modeloLista(ArrayList<Estudiantes> lista) {
        modeloLista.removeAllElements();
        for (Estudiantes alumno : lista) {
            modeloLista.addElement(alumno.nombre + " " + alumno.apellido + " " + alumno.grado + " " + alumno.carnet + " " + alumno.ingreso);
        }
    }

    public Estudiantes buscar(String carnet) {
        for (Estudiantes alumno : alumnoList) {
            if (alumno.carnet.equals(carnet.toUpperCase())) {
                return alumno;
            }
        }
        return null;
    }

    public String generadorCarne(String nombre, String apellido) {
        String unir;
        StringBuilder sb = new StringBuilder();
        char nom = nombre.charAt(0);
        char ape = apellido.charAt(0);
        sb.append(nom);
        sb.append(ape);
        String anio = JOptionPane.showInputDialog(null, "Ingrese el año de ingreso ");
        alumSelect.setIngreso(Integer.parseInt(anio));
        char a = anio.charAt(2);
        char b = anio.charAt(3);
        sb.append(a);
        sb.append(b);
        sb.append("0");
        Random miAleatorio = new Random();
        int numero = miAleatorio.nextInt(100);
        if (numero < 10) {
            sb.append("0");
            sb.append(numero);
        } else {
            sb.append(numero);
        }
        unir = sb.toString().toUpperCase();
        return unir;
    }

    public DefaultListModel getModeloLista() {
        return modeloLista;
    }

    void modeloLista(Estudiantes busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

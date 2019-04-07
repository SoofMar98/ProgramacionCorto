/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioncorto;

/**
 *
 * @author Natas
 */
public class Estudiantes {
    String nombre;
    String apellido;
    String carnet;
    Integer grado;
    Integer ingreso;

    public Estudiantes(String nombre, String apellido, String carnet, Integer grado, Integer ingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.grado = grado;
        this.ingreso = ingreso;
    }

    public Estudiantes() {
    }

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

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public Integer getIngreso() {
        return ingreso;
    }

    public void setIngreso(Integer ingreso) {
        this.ingreso = ingreso;
    }
    
}

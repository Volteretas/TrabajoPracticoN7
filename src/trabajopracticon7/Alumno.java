/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopracticon7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sant
 */
public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private ArrayList<Materia> materias = new ArrayList<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public ArrayList getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia materia){
        Menu menu = new Menu();
        if(materias.contains(materia)){
            JOptionPane.showMessageDialog(menu, "Este alumno ya esta inscripto a esa materia");
        }else{
            materias.add(materia);
            JOptionPane.showMessageDialog(menu, "Alumno inscripto correctamente");
        }
    }
    
    public int cantidadMaterias(){
       return materias.size();
    }

    @Override
    public String toString() {
        return nombre + ' ' + apellido + " " + legajo;
    }
    
    
    
}

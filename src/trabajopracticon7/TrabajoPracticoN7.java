/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticon7;

/**
 *
 * @author sant
 */
public class TrabajoPracticoN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia m1 = new Materia(1, "Ingles I", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio", 1);
        
        Alumno a1 = new Alumno(1001, "Martin", "Lopez");
        Alumno a2 = new Alumno(1002, "Brenda", "Martinez");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        System.out.println("Martin "+a1.getMaterias());   
        System.out.println("Brenda "+a2.getMaterias());
        
                
        
        
    }
    
}

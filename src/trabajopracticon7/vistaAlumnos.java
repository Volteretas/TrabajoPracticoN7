/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package trabajopracticon7;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sant
 */
public class vistaAlumnos extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo;
    /**
     * Creates new form vistaAlumnos
     */
    public vistaAlumnos() {
        initComponents();
        modelo = new DefaultTableModel();
        this.armarCabezera();
        this.borrarFila();
        this.agregarItem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcAlumno = new javax.swing.JComboBox<>();

        setClosable(true);

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idMateria", "Nombre", "Año"
            }
        ));
        jtAlumnos.setEnabled(false);
        jScrollPane1.setViewportView(jtAlumnos);

        jLabel1.setText("Alumnos");

        jcAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAlumnoActionPerformed
        // TODO add your handling code here:
        this.borrarFila();
        this.llenarTabla();
    }//GEN-LAST:event_jcAlumnoActionPerformed
    
    private void armarCabezera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("idMateria");
        titulos.add("Nombre");
        titulos.add("Año");
        
        for(Object titulo: titulos){
            modelo.addColumn(titulo);
        }
        
        jtAlumnos.setModel(modelo);
    }
    
    private void agregarItem(){
        ArrayList<Alumno> alumnos = vistaFormularioAlumnos.getAlumnos();
        
        for(int i = 0; i < alumnos.size(); i++){
            jcAlumno.addItem(alumnos.get(i));
        }
    }
    
    private void borrarFila(){
        
        int filas = modelo.getRowCount() - 1;
        
        for (int cont = filas; cont >= 0; cont--){
            modelo.removeRow(cont);
        }
    }
    
    private void llenarTabla(){
        Alumno alumno = (Alumno) jcAlumno.getSelectedItem();
        ArrayList<Materia> materias = alumno.getMaterias();
        
        for(Materia mat: materias){
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(),mat.getAnio()});
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcAlumno;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables
}
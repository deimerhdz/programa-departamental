/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Archivo;
import modelos.ListaDoble;
import modelos.Municipio;
import modelos.Nino;
import modelos.Nodo;
import modelos.Representante;

/**
 *
 * @author asus-vivobook
 */
public class frmPrincipal extends javax.swing.JFrame {

    ListaDoble lista;
    DefaultTableModel modelo;
    Archivo archivo;

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {

        initComponents();

        modelo = new DefaultTableModel();
        lista = new ListaDoble();
        setModelo();
        archivo = new Archivo();
        Municipio Lorica = new Municipio("Lorica");
        Municipio monteria = new Municipio("Montería");
        Municipio sahagun = new Municipio("sahagún");

        Nino jose = new Nino(1, "Jose", 4, 0.7f, 12.3f, null, Lorica);
        Nino maria = new Nino(2, "Maria", 4, 1f, 15.3f, null, Lorica);
        Nino juan = new Nino(4, "Juan", 2, 1f, 12.3f, null, Lorica);
        Nino carlos = new Nino(3, "Carlos", 4, 1.3f, 14.9f, null, monteria);

        Representante representante1 = new Representante(1, "Miguel", "Padre");
        representante1.agregarHijo(jose);
        representante1.agregarHijo(maria);

        Representante representante2 = new Representante(2, "Maria", "Madre");
        representante2.agregarHijo(carlos);
        representante2.agregarHijo(juan);
        
        
        lista.agregarRegistroAlInicio(jose);
        lista.agregarRegistroAlInicio(maria);
        lista.agregarRegistroAlInicio(carlos);
        lista.agregarRegistroAlFinal(juan);
       
        listar();

    }

    private void setModelo() {
        String nombreColumnas[] = {"N° registro", "Nombre niño", "edad", "Talla", "Peso", "Municipio", "Id representante", "Nombre representante", "Parentesco"};
        modelo.setColumnIdentifiers(nombreColumnas);
        this.tabla.setModel(modelo);
    }

    private void listar() {
        Object[] datos = new Object[modelo.getColumnCount()];
        modelo.setRowCount(0);
        if (!lista.estaVacia()) {
            Nodo aux = lista.getInicio();
            while (aux != null) {

                datos[0] = aux.getNino().getNumeroRegistroCivil();
                datos[1] = aux.getNino().getNombre();
                datos[2] = aux.getNino().getEdad();
                datos[3] = aux.getNino().getTalla();
                datos[4] = aux.getNino().getPeso();
                datos[5] = aux.getNino().getMunicipio().getNombreMunicipio();
                datos[6] = aux.getNino().getRepresentante().getIdentificador();
                datos[7] = aux.getNino().getRepresentante().getNombre();
                datos[8] = aux.getNino().getRepresentante().getParentesco();
                modelo.addRow(datos);
                aux = aux.getSiguiente();
            }

            tabla.setModel(modelo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textarea = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumeroRegistro = new javax.swing.JTextField();
        txtNombreNino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtedadNino = new javax.swing.JTextField();
        txtTallaNino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        cmbMunicipio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreRepresentante = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtParentesco = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        EliminarRegistro = new javax.swing.JButton();
        scroltabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        scrtextarea = new javax.swing.JScrollPane();
        textareaReporte = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        btnFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("N° de Registro");

        jLabel2.setText("Nombre del niño");

        txtNombreNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreNinoActionPerformed(evt);
            }
        });

        jLabel3.setText("Edad");

        jLabel4.setText("Talla");

        jLabel5.setText("Peso");

        jLabel6.setText("Municipio");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Montería", "Lorica", "Sahagún" }));
        cmbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipioActionPerformed(evt);
            }
        });

        jLabel7.setText("Datos representante.");

        jLabel8.setText("Nombre");

        jLabel9.setText("Identificación");

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Parentesco.");

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        jLabel12.setText("Registro de niños");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtParentesco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumeroRegistro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtedadNino, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombreNino)
                                    .addComponent(txtTallaNino)
                                    .addComponent(cmbMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIdentificacion)
                                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel12)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtedadNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTallaNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnregistrar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        textarea.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Tabla de registros.");
        textarea.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 170, -1));

        btnInfo.setText("Informacion");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        textarea.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        textarea.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        EliminarRegistro.setText("Eliminar registro");
        EliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarRegistroActionPerformed(evt);
            }
        });
        textarea.add(EliminarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° de registro", "Nombre niño", "Edad", "Talla", "Peso", "Municipo", "Id Representante", "Nombre R", "Parentesco"
            }
        ));
        scroltabla.setViewportView(tabla);

        textarea.add(scroltabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 710, 320));

        textareaReporte.setColumns(20);
        textareaReporte.setRows(5);
        scrtextarea.setViewportView(textareaReporte);

        textarea.add(scrtextarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 510, 240));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        textarea.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        btnFile.setText("Generar archivo");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });
        textarea.add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textarea, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreNinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreNinoActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void cmbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMunicipioActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        //capturando datos del niño
        Integer numeroRegistro = Integer.parseInt(txtnumeroRegistro.getText());
        String nombre = txtNombreNino.getText();
        int edad = Integer.parseInt(txtedadNino.getText());
        float talla = Float.parseFloat(txtTallaNino.getText());
        float peso = Float.parseFloat(txtPeso.getText());
        //creando instancia del niño

        Nino nino = new Nino(numeroRegistro, nombre, edad, talla, peso, null, new Municipio(cmbMunicipio.getSelectedItem().toString()));

        //capturando datos del representante
        Integer identificador = Integer.parseInt(txtIdentificacion.getText());
        String nombreRepresentante = txtNombreRepresentante.getText();
        String parentesco = txtParentesco.getText();
        Representante representante = new Representante(identificador, nombre, parentesco);
        representante.agregarHijo(nino);
        
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja un valorentre 1 y 3 \n  1 - agregar al inicio\n 2 - agregar entre nodos \n3 - agregaral final"));
        
        switch (opcion) {
            case 1:
                  lista.agregarRegistroAlInicio(nino);
                break;
            case 2:
                int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del registro a insertar;"));
                lista.agregarRegistroEntreNodo(nino,pos);
                break;
            case 3:
                lista.agregarRegistroAlFinal(nino);
                break;
        }
        listar();
        limpiarCampos();
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        tabla.setVisible(true);
        scroltabla.setVisible(true);

        /* scrtextarea.setVisible(false);
    textarea.setVisible(false);*/
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
        scroltabla.setVisible(false);
        tabla.setVisible(false);

        scrtextarea.setVisible(true);
        textarea.setVisible(true);
        crearReporte();

    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Integer numeroDeRegistro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de registro del niño:"));

        String result = lista.buscarRegistro(numeroDeRegistro);

        if (result.length() > 0) {
            JOptionPane.showMessageDialog(null, "La talla y peso del niño son:\n" + result);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void EliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarRegistroActionPerformed
        // TODO add your handling code here:
        Integer numeroDeRegistro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de registro del niño:"));
        lista.eliminarRegistro(numeroDeRegistro);
        listar();
    }//GEN-LAST:event_EliminarRegistroActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        try {
            // TODO add your handling code here:
            archivo.generarArchivo(lista);
            JOptionPane.showMessageDialog(null, "El archivo ha sido creado "+archivo.getPath());
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnFileActionPerformed

    private void limpiarCampos() {
        txtIdentificacion.setText("");
        txtNombreNino.setText("");
        txtNombreRepresentante.setText("");
        txtParentesco.setText("");
        txtPeso.setText("");
        txtTallaNino.setText("");
        txtnumeroRegistro.setText("");
        txtedadNino.setText("");
    }

    private void crearReporte() {
        String reporte = "";
        int numNinosLorica = lista.reportarNinosDeBajaEstatura("Lorica");
        int numNinosSahagun = lista.reportarNinosDeBajaEstatura("Sahagún");
        int numNinosMonteria = lista.reportarNinosDeBajaEstatura("Montería");

        reporte = "Catindad de niños de baja estatura por municipio entre niños de 4 y 6 años:\n";
        reporte += "Lorica: " + numNinosLorica + "\t"
                + "Sahagún: " + numNinosSahagun + "\t"
                + "Montería: " + numNinosMonteria + "\n\n";

        reporte += "Niños de bajo peso:\n";
        reporte += lista.reportarNinosDeBajoPeso();
        reporte += "Total de niños de bajo peso entre ninos de 2 y 3 años: \n"
                + "Lorica: " + lista.totalizarNinosDeBajoPeso("Lorica")
                + "\tSahagún: " + lista.totalizarNinosDeBajoPeso("Sahagún")
                + "\tMontería: " + lista.totalizarNinosDeBajoPeso("Montería");

        this.textareaReporte.setText(reporte);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarRegistro;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scroltabla;
    private javax.swing.JScrollPane scrtextarea;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel textarea;
    private javax.swing.JTextArea textareaReporte;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombreNino;
    private javax.swing.JTextField txtNombreRepresentante;
    private javax.swing.JTextField txtParentesco;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTallaNino;
    private javax.swing.JTextField txtedadNino;
    private javax.swing.JTextField txtnumeroRegistro;
    // End of variables declaration//GEN-END:variables
}

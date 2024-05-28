package javiye.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author javiy
 */
public class JFrame_Principal extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Principal
     */
    public JFrame_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TipoEstrella = new javax.swing.JLabel();
        Radio = new javax.swing.JLabel();
        Temperatura = new javax.swing.JLabel();
        Distancia = new javax.swing.JLabel();
        Composicion = new javax.swing.JLabel();
        Estrella = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectorPlanetas = new javax.swing.JComboBox<>();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPlanetas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSatelite = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 10)); // NOI18N
        jLabel3.setText("Autor: Javier Yeguas Díaz");

        TipoEstrella.setText("Tipo de estrella: ");

        Radio.setText("Radio: ");

        Temperatura.setText("Temperatura: ");

        Distancia.setText("Distancia: ");

        Composicion.setText("Composición: ");

        Estrella.setText("Nombre de la estrella: ");

        Boton1.setText("Ver detalles");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\javiy\\Documents\\NetBeansProjects\\Practica_Intermodular\\src\\main\\resources\\images\\sol.tif")); // NOI18N

        selectorPlanetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un planeta: ", "Tierra", "Marte", "Venus", "Saturno", "Jupiter", "Urano", "Mercurio", "Neptuno", " " }));
        selectorPlanetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorPlanetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(Estrella, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Boton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TipoEstrella, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                .addComponent(Radio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Temperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Distancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Composicion, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Estrella)
                            .addGap(12, 12, 12)
                            .addComponent(Boton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TipoEstrella)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Radio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Distancia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Composicion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Titulo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        Titulo.setText("PRÁCTICA INTERMODULAR - 1º DAM");

        TablaPlanetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Radio (km)", "Temperatura Media (°C)", "Distancia Media a su Planeta (km)", "Tipo de Cuerpo (composición)", "Período Orbital (días)", "Número de satélites", "Fecha creación"
            }
        ));
        jScrollPane1.setViewportView(TablaPlanetas);

        tableSatelite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Radio", "Distancia", "P. Orbitario", "Temperatura", "Tipo", "Fecha_Creación"
            }
        ));
        jScrollPane2.setViewportView(tableSatelite);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(337, 337, 337)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectorPlanetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorPlanetasActionPerformed

        // Obtener el nombre del planeta seleccionado
        String nombrePlaneta = (String) selectorPlanetas.getSelectedItem();

        // Crear una instancia de la clase ConexionBBDD
        ConexionBBDD conexion = new ConexionBBDD();

        // Obtener los datos del planeta y sus satélites
        Planeta planeta = conexion.obtenerDatosPlanetaConSatelites(nombrePlaneta);

        // Actualizar los valores en la tabla de planetas
        TablaPlanetas.setValueAt(planeta.getRadio(), 0, 0);
        TablaPlanetas.setValueAt(planeta.getDistancia(), 0, 1);
        TablaPlanetas.setValueAt(planeta.getPeriodo(), 0, 2);
        TablaPlanetas.setValueAt(planeta.getTipo(), 0, 3);
        TablaPlanetas.setValueAt(planeta.getTemperatura(), 0, 4);
        TablaPlanetas.setValueAt(planeta.getNumSatelites(), 0, 5);
        TablaPlanetas.setValueAt(planeta.getFechaCreacion(), 0, 6);

        // Limpiar la tabla de satélites
        for (int i = 0; i < tableSatelite.getRowCount(); i++) {
            for (int j = 0; j < tableSatelite.getColumnCount(); j++) {
                tableSatelite.setValueAt("", i, j);
            }
        }

        // Actualizar los valores en la tabla de satélites si existen
        int fila = 0;
        for (Satelite satelite : planeta.getSatelites()) {
            tableSatelite.setValueAt(satelite.getNombre(), fila, 0);
            tableSatelite.setValueAt(satelite.getRadio(), fila, 1);
            tableSatelite.setValueAt(satelite.getDistancia(), fila, 2);
            tableSatelite.setValueAt(satelite.getPeriodo(), fila, 3);
            tableSatelite.setValueAt(satelite.getTemperatura(), fila, 4);
            tableSatelite.setValueAt(satelite.getTipo(), fila, 5);
            tableSatelite.setValueAt(satelite.getFechaCreacion(), fila, 6);
            fila++;
        }

        // Mostrar la tabla de satélites si tiene datos
        tableSatelite.setVisible(fila > 0);

        // Mostrar mensaje de alerta con el número de satélites
        String numSatelites = planeta.getNumSatelites();
        
        if (nombrePlaneta.equalsIgnoreCase("Seleccione un planeta: ")) {
            return; // Salir del método si no se ha seleccionado un planeta válido
        } else {
            JOptionPane.showMessageDialog(null, "El planeta " + nombrePlaneta + " tiene " + numSatelites + " satélites.");

            //tableSatelite.setVisible(false);
        }


    }//GEN-LAST:event_selectorPlanetasActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed

        /* YA QUE SÓLO EXISTE UNA ESTRELLA Y EL ENUNCIADO ESPECIFICA QUE ESA INFORMACIÓN ES FIJA
        En vez de crear una clase con sus respectivos métodos, concateno la información que ya existía en JLABEL para mostrar la información del sol.
        
         */
        // Verificar si el botón ya ha sido presionado
        boolean botonPresionado = Boton1.isSelected();

        if (!botonPresionado) {
            // Obtener la información y actualizar los campos de texto
            String nombreEstrella = Estrella.getText();
            Estrella.setText(nombreEstrella + "SOL");

            String tipoEstrellaActual = TipoEstrella.getText();
            TipoEstrella.setText(tipoEstrellaActual + "G2V");

            String radioActual = Radio.getText();
            Radio.setText(radioActual + " 696340 KM");

            String temperaturaActual = Temperatura.getText();
            Temperatura.setText(temperaturaActual + " 5500");

            String distanciaActual = Distancia.getText();
            Distancia.setText(distanciaActual + " 149,6");

            String composicionActual = Composicion.getText();
            Composicion.setText(composicionActual + " 74% Hidrógeno, 24% Helio, 2% Otros");

            JOptionPane.showMessageDialog(this, "EL ENUNCIADO ESPECIFICA QUE ESA INFORMACIÓN ES FIJA.");

            // Deshabilitar el botón
            Boton1.setEnabled(false);
            botonPresionado = true;
        } else {
            // El botón ya ha sido presionado, no hacer nada
            JOptionPane.showMessageDialog(this, "El botón ya ha sido presionado...");
            //No debería en teoría tener opción a este mensaje...
        }
    }//GEN-LAST:event_Boton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JLabel Composicion;
    private javax.swing.JLabel Distancia;
    private javax.swing.JLabel Estrella;
    private javax.swing.JLabel Radio;
    private javax.swing.JTable TablaPlanetas;
    private javax.swing.JLabel Temperatura;
    private javax.swing.JLabel TipoEstrella;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selectorPlanetas;
    private javax.swing.JTable tableSatelite;
    // End of variables declaration//GEN-END:variables
}

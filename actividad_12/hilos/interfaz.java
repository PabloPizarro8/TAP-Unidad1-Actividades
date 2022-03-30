/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author zotzo
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        
        hiloTiempo.start();
        hiloEstadisticas.start();
    }
    /*
    En este hilo se ira guardando las estadisticas de personaje cada 10s
    Estas estadisticas se guardaran en la clase estadisticas.java
    */
    estadisticas estats = new estadisticas();
    
    Thread hiloEstadisticas = new Thread(){
        
        @Override
        public void run() {
            // Se crea el objeto estats
            
            // se mandan las estadisticas a la clase
            for (int i = 0; i < 7; i++) {
                estats.setFuerzaString(lblFuerzaCont.getText());
                estats.setInteString(lblIntCont.getText());
                estats.setAgilidadString(lblAgiCont.getText());

                estats.crearArchivo();
                // se pone en espera cada 10s o 10000 mili s
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {
                }
            }

        }
        
    };
    
    /* 
    Este hilo servira para cerrar el programa luego de 60s
    */
    Thread hiloTiempo = new Thread(){
        String tiempoString = "";
        // int iContTiempo = Integer.parseInt(lblTiempoImpreso.getText());
        
        @Override
        public void run() {
            // Creamos un cliclo de 0 a 60
            for (int i = 0; i < 61; i++) {
                // COntamos en reversa y pasamos el tiempo a un string
                tiempoString = "" + (60 - i) + "s";
                
                // mandamos el tiempo a la etiqueta correspondiente
                lblTiempoImpreso.setText(tiempoString);
                
                // esperamos 1s 
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
            // Cuando termine el ciclo cerramos el programa
            System.exit(0);
        }
    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTiempoTitulo = new javax.swing.JLabel();
        lblTiempoImpreso = new javax.swing.JLabel();
        lblEstadisticasTitulo = new javax.swing.JLabel();
        lblFuerzaCont = new javax.swing.JLabel();
        btnFuerzaIzq = new javax.swing.JButton();
        btnFuerzaDer = new javax.swing.JButton();
        lblFuerzaTitulo = new javax.swing.JLabel();
        lblIntTitulo = new javax.swing.JLabel();
        btnIntIzq = new javax.swing.JButton();
        lblIntCont = new javax.swing.JLabel();
        btnIntDer = new javax.swing.JButton();
        lblAgiTitulo = new javax.swing.JLabel();
        btnAgiIzq = new javax.swing.JButton();
        lblAgiCont = new javax.swing.JLabel();
        btnAgiDer = new javax.swing.JButton();
        btnGuardarEstats = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HILOS");
        setResizable(false);

        lblTiempoTitulo.setText("Se cerrara en: ");

        lblTiempoImpreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoImpreso.setText("60 s");
        lblTiempoImpreso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEstadisticasTitulo.setText("Estadisticas de personaje");

        lblFuerzaCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFuerzaCont.setText("0");

        btnFuerzaIzq.setText("<");
        btnFuerzaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerzaIzqActionPerformed(evt);
            }
        });

        btnFuerzaDer.setText(">");
        btnFuerzaDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerzaDerActionPerformed(evt);
            }
        });

        lblFuerzaTitulo.setText("Fuerza");

        lblIntTitulo.setText("Inteligencia");

        btnIntIzq.setText("<");
        btnIntIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntIzqActionPerformed(evt);
            }
        });

        lblIntCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntCont.setText("0");

        btnIntDer.setText(">");
        btnIntDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntDerActionPerformed(evt);
            }
        });

        lblAgiTitulo.setText("Agilidad");

        btnAgiIzq.setText("<");
        btnAgiIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgiIzqActionPerformed(evt);
            }
        });

        lblAgiCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgiCont.setText("0");

        btnAgiDer.setText(">");
        btnAgiDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgiDerActionPerformed(evt);
            }
        });

        btnGuardarEstats.setText("Guardar");
        btnGuardarEstats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEstadisticasTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTiempoTitulo)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTiempoImpreso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAgiTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIntTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(lblFuerzaTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAgiIzq)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblAgiCont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFuerzaIzq)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFuerzaCont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnIntIzq)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblIntCont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFuerzaDer)
                                    .addComponent(btnIntDer)
                                    .addComponent(btnAgiDer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnGuardarEstats)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoImpreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(lblEstadisticasTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFuerzaIzq)
                    .addComponent(lblFuerzaCont, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuerzaDer)
                    .addComponent(lblFuerzaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnIntIzq)
                        .addComponent(lblIntCont, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIntDer))
                    .addComponent(lblIntTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgiTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgiIzq)
                    .addComponent(lblAgiCont, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgiDer))
                .addGap(28, 28, 28)
                .addComponent(btnGuardarEstats)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuerzaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerzaIzqActionPerformed
        String cont = lblFuerzaCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont > 0){
            iCont--;
            cont = "" + iCont;
        }
        
        lblFuerzaCont.setText(cont);
    }//GEN-LAST:event_btnFuerzaIzqActionPerformed

    private void btnFuerzaDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerzaDerActionPerformed
        String cont = lblFuerzaCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont < 10){
            iCont++;
            cont = "" + iCont;
        }
        
        lblFuerzaCont.setText(cont);
    }//GEN-LAST:event_btnFuerzaDerActionPerformed

    private void btnIntIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntIzqActionPerformed
        String cont = lblIntCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont > 0){
            iCont--;
            cont = "" + iCont;
        }
        lblIntCont.setText(cont);
    }//GEN-LAST:event_btnIntIzqActionPerformed

    private void btnIntDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntDerActionPerformed
        String cont = lblIntCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont < 10){
            iCont++;
            cont = "" + iCont;
        }
        lblIntCont.setText(cont);
    }//GEN-LAST:event_btnIntDerActionPerformed

    private void btnAgiIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgiIzqActionPerformed
        String cont = lblAgiCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont > 0){
            iCont--;
            cont = "" + iCont;
        }
        lblAgiCont.setText(cont);
    }//GEN-LAST:event_btnAgiIzqActionPerformed

    private void btnAgiDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgiDerActionPerformed
        String cont = lblAgiCont.getText();
        int iCont = Integer.parseInt(cont);
        
        if(iCont < 10){
            iCont++;
            cont = "" + iCont;
        }
        lblAgiCont.setText(cont);
    }//GEN-LAST:event_btnAgiDerActionPerformed

    private void btnGuardarEstatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstatsActionPerformed
        
        estats.setFuerzaString(lblFuerzaCont.getText());
        estats.setInteString(lblIntCont.getText());
        estats.setAgilidadString(lblAgiCont.getText());
        
        estats.crearArchivo();
    }//GEN-LAST:event_btnGuardarEstatsActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgiDer;
    private javax.swing.JButton btnAgiIzq;
    private javax.swing.JButton btnFuerzaDer;
    private javax.swing.JButton btnFuerzaIzq;
    private javax.swing.JButton btnGuardarEstats;
    private javax.swing.JButton btnIntDer;
    private javax.swing.JButton btnIntIzq;
    private javax.swing.JLabel lblAgiCont;
    private javax.swing.JLabel lblAgiTitulo;
    private javax.swing.JLabel lblEstadisticasTitulo;
    private javax.swing.JLabel lblFuerzaCont;
    private javax.swing.JLabel lblFuerzaTitulo;
    private javax.swing.JLabel lblIntCont;
    private javax.swing.JLabel lblIntTitulo;
    private javax.swing.JLabel lblTiempoImpreso;
    private javax.swing.JLabel lblTiempoTitulo;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import claseCalcu.Calculadora;

public class DATOS extends javax.swing.JFrame {
    
    public DATOS() {
    initComponents();
    agruparBotones();
    setSize(516, 449);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}
    
@SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ingresarprestamista = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        ingresartiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ingresarmontoinicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ingresartasadeinteres = new javax.swing.JTextField();
        Tiempoaños = new javax.swing.JRadioButton();
        Tiempomeses = new javax.swing.JRadioButton();
        Interesanual = new javax.swing.JRadioButton();
        Interesmensual = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ingresarcliente = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIEMPO A PAGAR :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));

        ingresarprestamista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarprestamista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarprestamista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamistaActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarprestamista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 210, 30));

        Cancelar.setBackground(new java.awt.Color(255, 255, 51));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 343, 120, -1));

        ingresartiempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartiempoActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 210, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("    PRESTAMISTA :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 50));

        Calcular.setBackground(new java.awt.Color(255, 255, 0));
        Calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcular.setText("CALCULAR");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 343, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" MONTO INICIAL (Bs)  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 50));

        ingresarmontoinicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarmontoinicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarmontoinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarmontoinicialActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarmontoinicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" TASA DE INTERES (%) :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        ingresartasadeinteres.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresartasadeinteres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresartasadeinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresartasadeinteresActionPerformed(evt);
            }
        });
        getContentPane().add(ingresartasadeinteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 210, 30));

        Tiempoaños.setText("Años");
        Tiempoaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoañosActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempoaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        Tiempomeses.setText("Meses");
        Tiempomeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempomesesActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempomeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        Interesanual.setText("Anual");
        Interesanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresanualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        Interesmensual.setText("Mensual");
        Interesmensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresmensualActionPerformed(evt);
            }
        });
        getContentPane().add(Interesmensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    CLIENTE :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, 50));

        ingresarcliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 210, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//funcion para que se pueda seleccionar solo un boton al mismo tiempo 
private void agruparBotones() {
    // Crear los ButtonGroup para agrupar los botones de tiempo e interés
    ButtonGroup grupoTiempo = new ButtonGroup();
    ButtonGroup grupoInteres = new ButtonGroup();

    // Agregar los botones de tiempo al grupo "grupoTiempo"
    grupoTiempo.add(Tiempoaños);
    grupoTiempo.add(Tiempomeses);

    // Agregar los botones de interés al grupo "grupoInteres"
    grupoInteres.add(Interesanual);
    grupoInteres.add(Interesmensual);
}
    private void ingresartiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartiempoActionPerformed

    }//GEN-LAST:event_ingresartiempoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
    //obtener datos
    String prestamista = ingresarprestamista.getText().toUpperCase().trim();
    String cliente = ingresarcliente.getText().toUpperCase().trim();
    String montoInicial = ingresarmontoinicial.getText();
    String tasaInteres = ingresartasadeinteres.getText();
    String tipoInteres = Interesanual.isSelected() ? "anual" : "mensual"; // Ajustar según la selección
    String tiempo = ingresartiempo.getText();
    String tipoTiempo = Tiempoaños.isSelected() ? "años" : "meses"; // Ajustar según la selección
    
   //calcular el interes simple con los datos adquiridos 
    try {
        // Convertir los valores ingresados a tipos numéricos
        double monto = Double.parseDouble(montoInicial);
        double tasa = Double.parseDouble(tasaInteres) / 100; // convertir a decimal
        int tiempoTotal = Integer.parseInt(tiempo);

        // Calcular el interés simple    
        double interesSimple = Calculadora.calcularInteresSimple(monto, tasa, tiempoTotal, tipoInteres, tipoTiempo );
        
        //enviar datos a RESULTADO 
         RESULTADO datos = new RESULTADO(prestamista, cliente, monto, tasa, tipoInteres, tiempoTotal, tipoTiempo, interesSimple);
    
        } catch (NumberFormatException e) {
        // Manejo de errores si la entrada no es un número válido
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
      
    }//GEN-LAST:event_CalcularActionPerformed

    private void ingresarprestamistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarprestamistaActionPerformed
           
    }//GEN-LAST:event_ingresarprestamistaActionPerformed

    private void ingresarmontoinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarmontoinicialActionPerformed
       
    }//GEN-LAST:event_ingresarmontoinicialActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
      
        MENU menu = new MENU();
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ingresartasadeinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresartasadeinteresActionPerformed
       
    }//GEN-LAST:event_ingresartasadeinteresActionPerformed

    private void TiempoañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoañosActionPerformed
        
    }//GEN-LAST:event_TiempoañosActionPerformed

    private void InteresanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresanualActionPerformed
       
    }//GEN-LAST:event_InteresanualActionPerformed

    private void InteresmensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresmensualActionPerformed
        
    }//GEN-LAST:event_InteresmensualActionPerformed

    private void TiempomesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempomesesActionPerformed
        
    }//GEN-LAST:event_TiempomesesActionPerformed

    private void ingresarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarclienteActionPerformed

    }//GEN-LAST:event_ingresarclienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Cancelar;
    private javax.swing.JRadioButton Interesanual;
    private javax.swing.JRadioButton Interesmensual;
    private javax.swing.JRadioButton Tiempoaños;
    private javax.swing.JRadioButton Tiempomeses;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresarcliente;
    private javax.swing.JTextField ingresarmontoinicial;
    private javax.swing.JTextField ingresarprestamista;
    private javax.swing.JTextField ingresartasadeinteres;
    private javax.swing.JTextField ingresartiempo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

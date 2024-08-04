
package Views;

public class FrmResultado extends javax.swing.JFrame {

    public FrmResultado() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }
    public FrmResultado(double puntoFuncion, double personaMes, double esfuerzo, double duracionTiempo) {
        initComponents();
        
        // Setear los valores a los componentes de la interfaz
        txtPuntoFuncion.setText(String.format("%.2f", puntoFuncion));
        txtPersonaMes.setText(String.format("%.2f", personaMes));
        txtEzfuerzo.setText(String.format("%.2f", esfuerzo));
        txtDuracionTiempo.setText(String.format("%.2f", duracionTiempo));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        rSPanelForma1 = new rojeru_san.rspanel.RSPanelForma();
        rSLabelSombra1 = new rojeru_san.rslabel.RSLabelSombra();
        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound2 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound3 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound4 = new rojeru_san.rslabel.RSLabelBorderRound();
        btn_calcular = new rojeru_san.rsbutton.RSButtonRoundEffect();
        txtPuntoFuncion = new RSComponentShade.RSTextFieldShade();
        txtPersonaMes = new RSComponentShade.RSTextFieldShade();
        txtEzfuerzo = new RSComponentShade.RSTextFieldShade();
        txtDuracionTiempo = new RSComponentShade.RSTextFieldShade();
        rSTextFullBD1 = new rojeru_san.rsfield.RSTextFullBD();
        rSTextFullBD2 = new rojeru_san.rsfield.RSTextFullBD();
        rSTextFullBD3 = new rojeru_san.rsfield.RSTextFullBD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(102, 255, 51));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 0, 0));
        rSPanelGradiente1.setLayout(null);

        rSPanelForma1.setBackground(new java.awt.Color(0, 0, 0));
        rSPanelForma1.setLayout(null);

        rSLabelSombra1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelSombra1.setText("Resultado");
        rSLabelSombra1.setToolTipText("");
        rSLabelSombra1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        rSPanelForma1.add(rSLabelSombra1);
        rSLabelSombra1.setBounds(160, 20, 290, 70);
        rSLabelSombra1.getAccessibleContext().setAccessibleName("Resultado");

        rSPanelGradiente1.add(rSPanelForma1);
        rSPanelForma1.setBounds(0, 0, 640, 113);

        rSLabelBorderRound1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound1.setText("Punto de Funcion");
        rSLabelBorderRound1.setBgBorde(new java.awt.Color(204, 255, 0));
        rSPanelGradiente1.add(rSLabelBorderRound1);
        rSLabelBorderRound1.setBounds(10, 130, 180, 40);

        rSLabelBorderRound2.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound2.setText("Calculo DePersona Mes");
        rSLabelBorderRound2.setBgBorde(new java.awt.Color(204, 255, 0));
        rSPanelGradiente1.add(rSLabelBorderRound2);
        rSLabelBorderRound2.setBounds(10, 180, 180, 40);

        rSLabelBorderRound3.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound3.setText("Calculo Ezfuerzo");
        rSLabelBorderRound3.setBgBorde(new java.awt.Color(204, 255, 0));
        rSPanelGradiente1.add(rSLabelBorderRound3);
        rSLabelBorderRound3.setBounds(10, 230, 180, 40);

        rSLabelBorderRound4.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound4.setText("Calculo Duracion Tiempo");
        rSLabelBorderRound4.setBgBorde(new java.awt.Color(204, 255, 0));
        rSPanelGradiente1.add(rSLabelBorderRound4);
        rSLabelBorderRound4.setBounds(10, 280, 180, 40);

        btn_calcular.setBackground(new java.awt.Color(153, 0, 51));
        btn_calcular.setText("Volver");
        btn_calcular.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btn_calcular);
        btn_calcular.setBounds(120, 360, 360, 60);

        txtPuntoFuncion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPuntoFuncion.setPlaceholder("");
        rSPanelGradiente1.add(txtPuntoFuncion);
        txtPuntoFuncion.setBounds(200, 130, 120, 45);

        txtPersonaMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPersonaMes.setPlaceholder("");
        rSPanelGradiente1.add(txtPersonaMes);
        txtPersonaMes.setBounds(200, 180, 120, 45);

        txtEzfuerzo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEzfuerzo.setPlaceholder("");
        rSPanelGradiente1.add(txtEzfuerzo);
        txtEzfuerzo.setBounds(200, 230, 120, 45);

        txtDuracionTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuracionTiempo.setPlaceholder("");
        rSPanelGradiente1.add(txtDuracionTiempo);
        txtDuracionTiempo.setBounds(200, 280, 120, 45);

        rSTextFullBD1.setBackground(new java.awt.Color(0, 0, 0));
        rSTextFullBD1.setForeground(new java.awt.Color(255, 255, 0));
        rSTextFullBD1.setText("meses para la conclusión del software");
        rSPanelGradiente1.add(rSTextFullBD1);
        rSTextFullBD1.setBounds(330, 280, 280, 42);

        rSTextFullBD2.setBackground(new java.awt.Color(0, 0, 0));
        rSTextFullBD2.setForeground(new java.awt.Color(255, 255, 0));
        rSTextFullBD2.setText("8 horas de trabajo 1 personal");
        rSPanelGradiente1.add(rSTextFullBD2);
        rSTextFullBD2.setBounds(330, 180, 280, 42);

        rSTextFullBD3.setBackground(new java.awt.Color(0, 0, 0));
        rSTextFullBD3.setForeground(new java.awt.Color(255, 255, 0));
        rSTextFullBD3.setText("Equivale a horas personas mes");
        rSPanelGradiente1.add(rSTextFullBD3);
        rSTextFullBD3.setBounds(330, 230, 280, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        FrmPuntoDeFuncion frmPunto = new FrmPuntoDeFuncion();
        frmPunto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffect btn_calcular;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound2;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound3;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound4;
    private rojeru_san.rslabel.RSLabelSombra rSLabelSombra1;
    private rojeru_san.rspanel.RSPanelForma rSPanelForma1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rsfield.RSTextFullBD rSTextFullBD1;
    private rojeru_san.rsfield.RSTextFullBD rSTextFullBD2;
    private rojeru_san.rsfield.RSTextFullBD rSTextFullBD3;
    private RSComponentShade.RSTextFieldShade txtDuracionTiempo;
    private RSComponentShade.RSTextFieldShade txtEzfuerzo;
    private RSComponentShade.RSTextFieldShade txtPersonaMes;
    private RSComponentShade.RSTextFieldShade txtPuntoFuncion;
    // End of variables declaration//GEN-END:variables
}

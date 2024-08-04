
package Views;

import Models.PuntoFuncion;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class FrmPuntoDeFuncion extends javax.swing.JFrame {

    public FrmPuntoDeFuncion() {
       
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("../img/icon.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSCustomPopuMenu1 = new rojeru_san.complementos.RSCustomPopuMenu();
        rSEffectFade1 = new rojeru_san.complementos.RSEffectFade();
        rSEffectFade2 = new rojeru_san.complementos.RSEffectFade();
        rSMoveWindow1 = new rojeru_san.complementos.RSMoveWindow();
        verticalLabelIUI1 = new necesario.VerticalLabelIUI();
        verticalLabelIUI2 = new necesario.VerticalLabelIUI();
        valoresEnum1 = new rojeru_san.efectos.ValoresEnum();
        timingTargetAdapter1 = new org.jdesktop.core.animation.timing.TimingTargetAdapter();
        swingTimerTimingSource1 = new org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource();
        swingTimerTimingSource2 = new org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource();
        roboto1 = new rojeru_san.efectos.Roboto();
        rSUtilities1 = new rojeru_san.complementos.RSUtilities();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        rSPanelForma1 = new rojeru_san.rspanel.RSPanelForma();
        rSLabelSombra1 = new rojeru_san.rslabel.RSLabelSombra();
        txtEE = new RSComponentShade.RSTextFieldShade();
        txtSE = new RSComponentShade.RSTextFieldShade();
        txtCE = new RSComponentShade.RSTextFieldShade();
        txtALI = new RSComponentShade.RSTextFieldShade();
        txtAIE = new RSComponentShade.RSTextFieldShade();
        txtNroDesarrolladores = new RSComponentShade.RSTextFieldShade();
        cboModelo = new rojerusan.RSComboBox();
        rSLabelBorderRound1 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound2 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound3 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound4 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound5 = new rojeru_san.rslabel.RSLabelBorderRound();
        rSLabelBorderRound6 = new rojeru_san.rslabel.RSLabelBorderRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtUno = new RSComponentShade.RSTextFieldShade();
        txtDos = new RSComponentShade.RSTextFieldShade();
        txtTres = new RSComponentShade.RSTextFieldShade();
        txtCuatro = new RSComponentShade.RSTextFieldShade();
        txtCinco = new RSComponentShade.RSTextFieldShade();
        txtSeis = new RSComponentShade.RSTextFieldShade();
        txtSiete = new RSComponentShade.RSTextFieldShade();
        txtOcho = new RSComponentShade.RSTextFieldShade();
        txtNueve = new RSComponentShade.RSTextFieldShade();
        txtDiez = new RSComponentShade.RSTextFieldShade();
        txtOnce = new RSComponentShade.RSTextFieldShade();
        txtDoce = new RSComponentShade.RSTextFieldShade();
        txtTrece = new RSComponentShade.RSTextFieldShade();
        txtCatorce = new RSComponentShade.RSTextFieldShade();
        btn_calcular = new rojeru_san.rsbutton.RSButtonRoundEffect();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        rSPanelGradiente1.setLayout(null);

        rSPanelForma1.setBackground(new java.awt.Color(0, 0, 0));
        rSPanelForma1.setLayout(null);

        rSLabelSombra1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelSombra1.setText("Calculadora de Punto de Funcion");
        rSLabelSombra1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        rSPanelForma1.add(rSLabelSombra1);
        rSLabelSombra1.setBounds(190, 10, 770, 70);

        rSPanelGradiente1.add(rSPanelForma1);
        rSPanelForma1.setBounds(0, 0, 1140, 100);

        txtEE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEE.setPlaceholder("");
        txtEE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEEKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtEE);
        txtEE.setBounds(280, 110, 120, 45);

        txtSE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSE.setPlaceholder("");
        txtSE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSEKeyPressed(evt);
            }
        });
        rSPanelGradiente1.add(txtSE);
        txtSE.setBounds(280, 160, 120, 45);

        txtCE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCE.setPlaceholder("");
        txtCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCEKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtCE);
        txtCE.setBounds(280, 210, 120, 45);

        txtALI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtALI.setPlaceholder("");
        txtALI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtALIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtALIKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtALI);
        txtALI.setBounds(280, 260, 120, 45);

        txtAIE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAIE.setPlaceholder("");
        txtAIE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAIEKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAIEKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtAIE);
        txtAIE.setBounds(280, 310, 120, 45);

        txtNroDesarrolladores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNroDesarrolladores.setPlaceholder("");
        txtNroDesarrolladores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNroDesarrolladoresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDesarrolladoresKeyTyped(evt);
            }
        });
        rSPanelGradiente1.add(txtNroDesarrolladores);
        txtNroDesarrolladores.setBounds(280, 410, 120, 45);

        cboModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIMPLE", "PROMEDIO", "COMPLEJO " }));
        rSPanelGradiente1.add(cboModelo);
        cboModelo.setBounds(280, 370, 120, 32);

        rSLabelBorderRound1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound1.setText("Entradas Externas EE");
        rSLabelBorderRound1.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound1);
        rSLabelBorderRound1.setBounds(50, 110, 220, 40);

        rSLabelBorderRound2.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound2.setText("Salidas Externas SE");
        rSLabelBorderRound2.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound2);
        rSLabelBorderRound2.setBounds(50, 160, 220, 40);

        rSLabelBorderRound3.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound3.setText("Consultas Externas CE");
        rSLabelBorderRound3.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound3);
        rSLabelBorderRound3.setBounds(50, 210, 220, 40);

        rSLabelBorderRound4.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound4.setText("Archivos Lógicos Internos ALI");
        rSLabelBorderRound4.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound4);
        rSLabelBorderRound4.setBounds(50, 260, 220, 40);

        rSLabelBorderRound5.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound5.setText("Archivos Interfaz Externos AIE");
        rSLabelBorderRound5.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound5);
        rSLabelBorderRound5.setBounds(50, 310, 220, 40);

        rSLabelBorderRound6.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelBorderRound6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rSLabelBorderRound6.setText("Numero de Desarrolladores");
        rSLabelBorderRound6.setBgBorde(new java.awt.Color(51, 204, 255));
        rSPanelGradiente1.add(rSLabelBorderRound6);
        rSLabelBorderRound6.setBounds(50, 410, 220, 40);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("1. ¿El sistema requiere respaldo y recuperación confiables? ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 10, 380, 30);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("2. ¿Se requieren comunicaciones de datos especializadas para transferir información hacia o desde la aplicación? ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 50, 640, 30);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("3. ¿Existen funciones de procesamiento distribuidas? ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 90, 352, 30);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("4. ¿El desempeño es crucial? ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 130, 240, 30);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("5. ¿El sistema correrá en un entorno operativo existente enormemente utilizado? ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 170, 490, 30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("6. ¿El sistema requiere entrada de datos en línea? ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 210, 340, 30);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("7. ¿La entrada de datos en línea requiere que la transacción de entrada se construya sobre múltiples pantallas u operaciones? ");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 250, 740, 30);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("8. ¿Los ALI se actualizan en línea? ");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 290, 270, 30);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("9. ¿Las entradas, salidas, archivos o consultas son complejos? ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 330, 400, 30);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("10. ¿El procesamiento interno es complejo? ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(60, 370, 320, 30);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("11. ¿El código se diseña para ser reutilizable? ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(60, 410, 330, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("12. ¿La conversión y la instalación se incluyen en el diseño? ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(60, 450, 400, 30);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("13. ¿El sistema se diseña para instalaciones múltiples en diferentes organizaciones? ");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(60, 490, 510, 30);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("14. ¿La aplicación se diseña para facilitar el cambio y su uso por parte del usuario?");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(60, 530, 500, 30);

        txtUno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUno.setPlaceholder("");
        txtUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtUno);
        txtUno.setBounds(10, 10, 40, 30);

        txtDos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDos.setPlaceholder("");
        txtDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtDos);
        txtDos.setBounds(10, 50, 40, 30);

        txtTres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTres.setPlaceholder("");
        txtTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTresKeyTyped(evt);
            }
        });
        jPanel1.add(txtTres);
        txtTres.setBounds(10, 90, 40, 30);

        txtCuatro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuatro.setPlaceholder("");
        txtCuatro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuatroKeyTyped(evt);
            }
        });
        jPanel1.add(txtCuatro);
        txtCuatro.setBounds(10, 130, 40, 30);

        txtCinco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCinco.setPlaceholder("");
        txtCinco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCincoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCinco);
        txtCinco.setBounds(10, 170, 40, 30);

        txtSeis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSeis.setPlaceholder("");
        txtSeis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeisKeyTyped(evt);
            }
        });
        jPanel1.add(txtSeis);
        txtSeis.setBounds(10, 210, 40, 30);

        txtSiete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSiete.setPlaceholder("");
        txtSiete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSieteKeyTyped(evt);
            }
        });
        jPanel1.add(txtSiete);
        txtSiete.setBounds(10, 250, 40, 30);

        txtOcho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOcho.setPlaceholder("");
        txtOcho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOchoKeyTyped(evt);
            }
        });
        jPanel1.add(txtOcho);
        txtOcho.setBounds(10, 290, 40, 30);

        txtNueve.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNueve.setPlaceholder("");
        txtNueve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNueveKeyTyped(evt);
            }
        });
        jPanel1.add(txtNueve);
        txtNueve.setBounds(10, 330, 40, 30);

        txtDiez.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiez.setPlaceholder("");
        txtDiez.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiezKeyTyped(evt);
            }
        });
        jPanel1.add(txtDiez);
        txtDiez.setBounds(10, 370, 40, 30);

        txtOnce.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOnce.setPlaceholder("");
        txtOnce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOnceKeyTyped(evt);
            }
        });
        jPanel1.add(txtOnce);
        txtOnce.setBounds(10, 410, 40, 30);

        txtDoce.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDoce.setPlaceholder("");
        txtDoce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDoceKeyTyped(evt);
            }
        });
        jPanel1.add(txtDoce);
        txtDoce.setBounds(10, 450, 40, 30);

        txtTrece.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTrece.setPlaceholder("");
        txtTrece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTreceKeyTyped(evt);
            }
        });
        jPanel1.add(txtTrece);
        txtTrece.setBounds(10, 490, 40, 30);

        txtCatorce.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCatorce.setPlaceholder("");
        txtCatorce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCatorceKeyTyped(evt);
            }
        });
        jPanel1.add(txtCatorce);
        txtCatorce.setBounds(10, 530, 40, 30);

        rSPanelGradiente1.add(jPanel1);
        jPanel1.setBounds(420, 110, 690, 570);

        btn_calcular.setBackground(new java.awt.Color(204, 0, 51));
        btn_calcular.setText("Calcular");
        btn_calcular.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        rSPanelGradiente1.add(btn_calcular);
        btn_calcular.setBounds(40, 480, 360, 60);

        getContentPane().add(rSPanelGradiente1);
        rSPanelGradiente1.setBounds(0, 0, 1140, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        
        PuntoFuncion pf = new PuntoFuncion();
        int parametro = cboModelo.getSelectedIndex();
        int entrada = Integer.parseInt(txtEE.getText());
        int salida = Integer.parseInt(txtSE.getText());
        int peticiones = Integer.parseInt(txtCE.getText());
        int archivos = Integer.parseInt(txtALI.getText());
        int interfaces = Integer.parseInt(txtAIE.getText());

        pf.CuentaTotal(entrada, salida, peticiones, archivos, interfaces, parametro);

        int preguntas[];
        preguntas = new int[14];
        preguntas[0] = Integer.parseInt(txtUno.getText());
        preguntas[1] = Integer.parseInt(txtDos.getText());
        preguntas[2] = Integer.parseInt(txtTres.getText());
        preguntas[3] = Integer.parseInt(txtCuatro.getText());
        preguntas[4] = Integer.parseInt(txtCinco.getText());
        preguntas[5] = Integer.parseInt(txtSeis.getText());
        preguntas[6] = Integer.parseInt(txtSiete.getText());
        preguntas[7] = Integer.parseInt(txtOcho.getText());
        preguntas[8] = Integer.parseInt(txtNueve.getText());
        preguntas[9] = Integer.parseInt(txtDiez.getText());
        preguntas[10] = Integer.parseInt(txtOnce.getText());
        preguntas[11] = Integer.parseInt(txtDoce.getText());
        preguntas[12] = Integer.parseInt(txtTrece.getText());
        preguntas[13] = Integer.parseInt(txtCatorce.getText());
        // Calcular la suma de las respuestas
        pf.SumatoriaFi(preguntas);
        
        // Calcular los puntos de función
    double puntoFuncion = pf.PuntoFuncion();
                
        // Calcular el esfuerzo en persona-mes
    double personaMes = pf.PersonaMes();
    // Calcular el esfuerzo
    double esfuerzo = pf.Esfuerzo();

    // Recuperar el número de desarrolladores y calcular la duración del tiempo
    int desarrolladores = Integer.parseInt(txtNroDesarrolladores.getText());
    double duracionTiempo = pf.DuracionTiempo(desarrolladores);
    
     // Crear y mostrar el formulario de resultados con los valores calculados
    FrmResultado frmres = new FrmResultado(puntoFuncion, personaMes, esfuerzo, duracionTiempo);
    frmres.setVisible(true);

    // Cerrar el formulario actual
    this.dispose();
    /*
        txtPuntoFuncion.setText(Math.round(puntoFuncion * 100.0) / 100.0 + "");

        double personaMes = pf.PersonaMes();

        txtPersonaMes.setText(Math.round(personaMes * 100.0) / 100.0 + "");

        double esfuerzo = pf.Esfuerzo();

        txtEzfuerzo.setText(Math.round(esfuerzo * 100.0) / 100.0 + "");

        int desarrolladores = Integer.parseInt(txtNroDesarrolladores.getText());

        double duracionTiempo = pf.DuracionTiempo(desarrolladores);

        txtDuracionTiempo.setText(Math.round(duracionTiempo * 100.0) / 100.0 + "");
        FrmResultado frmres = new FrmResultado();
        frmres.setVisible(true);
        this.dispose();
        

    // Calcular la suma de las respuestas
    pf.SumatoriaFi(preguntas);*/

    

    

    

    

   
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void txtEEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEEKeyPressed
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtEEKeyPressed

    private void txtSEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSEKeyPressed

    private void txtCEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEKeyPressed

    private void txtALIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtALIKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtALIKeyPressed

    private void txtAIEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAIEKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAIEKeyPressed

    private void txtNroDesarrolladoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDesarrolladoresKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDesarrolladoresKeyPressed

    private void txtEEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEEKeyTyped
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtEEKeyTyped

    private void txtCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCEKeyTyped
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtCEKeyTyped

    private void txtALIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtALIKeyTyped
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtALIKeyTyped

    private void txtAIEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAIEKeyTyped
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtAIEKeyTyped

    private void txtNroDesarrolladoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDesarrolladoresKeyTyped
        // TODO add your handling code here:
        numberKeyPress(evt);
    }//GEN-LAST:event_txtNroDesarrolladoresKeyTyped

    private void txtUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnoKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtUno);
    }//GEN-LAST:event_txtUnoKeyTyped

    private void txtDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDosKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtDos);
    }//GEN-LAST:event_txtDosKeyTyped

    private void txtTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTresKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtTres);
    }//GEN-LAST:event_txtTresKeyTyped

    private void txtCuatroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuatroKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtCuatro);
    }//GEN-LAST:event_txtCuatroKeyTyped

    private void txtCincoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCincoKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtCinco);
    }//GEN-LAST:event_txtCincoKeyTyped

    private void txtSeisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeisKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtSeis);
    }//GEN-LAST:event_txtSeisKeyTyped

    private void txtSieteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSieteKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtSiete);
    }//GEN-LAST:event_txtSieteKeyTyped

    private void txtOchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOchoKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtOcho);
    }//GEN-LAST:event_txtOchoKeyTyped

    private void txtNueveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNueveKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtNueve);
    }//GEN-LAST:event_txtNueveKeyTyped

    private void txtDiezKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiezKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtDiez);
    }//GEN-LAST:event_txtDiezKeyTyped

    private void txtOnceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOnceKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtOnce);
    }//GEN-LAST:event_txtOnceKeyTyped

    private void txtDoceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoceKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtDoce);
    }//GEN-LAST:event_txtDoceKeyTyped

    private void txtTreceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTreceKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtTrece);
    }//GEN-LAST:event_txtTreceKeyTyped

    private void txtCatorceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatorceKeyTyped
        // TODO add your handling code here:
        numberKeyPressUnoCinco(evt,txtCatorce);
    }//GEN-LAST:event_txtCatorceKeyTyped

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
            java.util.logging.Logger.getLogger(FrmPuntoDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPuntoDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPuntoDeFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffect btn_calcular;
    private rojerusan.RSComboBox cboModelo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.complementos.RSCustomPopuMenu rSCustomPopuMenu1;
    private rojeru_san.complementos.RSEffectFade rSEffectFade1;
    private rojeru_san.complementos.RSEffectFade rSEffectFade2;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound1;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound2;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound3;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound4;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound5;
    private rojeru_san.rslabel.RSLabelBorderRound rSLabelBorderRound6;
    private rojeru_san.rslabel.RSLabelSombra rSLabelSombra1;
    private rojeru_san.complementos.RSMoveWindow rSMoveWindow1;
    private rojeru_san.rspanel.RSPanelForma rSPanelForma1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.complementos.RSUtilities rSUtilities1;
    private rojeru_san.efectos.Roboto roboto1;
    private org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource swingTimerTimingSource1;
    private org.jdesktop.swing.animation.timing.sources.SwingTimerTimingSource swingTimerTimingSource2;
    private org.jdesktop.core.animation.timing.TimingTargetAdapter timingTargetAdapter1;
    private RSComponentShade.RSTextFieldShade txtAIE;
    private RSComponentShade.RSTextFieldShade txtALI;
    private RSComponentShade.RSTextFieldShade txtCE;
    private RSComponentShade.RSTextFieldShade txtCatorce;
    private RSComponentShade.RSTextFieldShade txtCinco;
    private RSComponentShade.RSTextFieldShade txtCuatro;
    private RSComponentShade.RSTextFieldShade txtDiez;
    private RSComponentShade.RSTextFieldShade txtDoce;
    private RSComponentShade.RSTextFieldShade txtDos;
    private RSComponentShade.RSTextFieldShade txtEE;
    private RSComponentShade.RSTextFieldShade txtNroDesarrolladores;
    private RSComponentShade.RSTextFieldShade txtNueve;
    private RSComponentShade.RSTextFieldShade txtOcho;
    private RSComponentShade.RSTextFieldShade txtOnce;
    private RSComponentShade.RSTextFieldShade txtSE;
    private RSComponentShade.RSTextFieldShade txtSeis;
    private RSComponentShade.RSTextFieldShade txtSiete;
    private RSComponentShade.RSTextFieldShade txtTrece;
    private RSComponentShade.RSTextFieldShade txtTres;
    private RSComponentShade.RSTextFieldShade txtUno;
    private rojeru_san.efectos.ValoresEnum valoresEnum1;
    private necesario.VerticalLabelIUI verticalLabelIUI1;
    private necesario.VerticalLabelIUI verticalLabelIUI2;
    // End of variables declaration//GEN-END:variables


public void numberKeyPress(KeyEvent evt) {
        // declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

    }

    public void numberKeyPressUnoCinco(KeyEvent evt,JTextField textField) {
        // declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        if ((car < '0' || car > '5') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

        if (textField.getText().length() >= 1) {
            evt.consume();
        }
        
    }
}

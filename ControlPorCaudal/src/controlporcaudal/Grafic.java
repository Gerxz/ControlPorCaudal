/*
PARTE GRAFICA QUE SIRVE PARA CARGAR LOS VALORES PARA CREAR LOS TAGS

DESARROLLADO POR GERXZ - PARA VOS CACATÚA
 */
package controlporcaudal;

import javax.swing.JOptionPane;

public class Grafic extends javax.swing.JFrame {

    //INSTANCIAMOS A LAS OTRAS CLASES
    Metodos metodos = new Metodos();
    Elementos elemento = new Elementos();
    Flechazo flechazo = new Flechazo();
    Booleanos booleano = new Booleanos();

    public Grafic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        factorAcheckBox1 = new javax.swing.JCheckBox();
        factorAcheckBox3 = new javax.swing.JCheckBox();
        caudalJLabel1 = new javax.swing.JLabel();
        caudalJLabel3 = new javax.swing.JLabel();
        nivelSPEpanCheckBox17 = new javax.swing.JCheckBox();
        crearJButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tituloJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        zonaJComboBox = new javax.swing.JComboBox<>();
        instalacionJTextField = new javax.swing.JTextField();
        instalacionJLabel = new javax.swing.JLabel();
        factorJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        factorAcheckBox = new javax.swing.JCheckBox();
        factorBcheckBox = new javax.swing.JCheckBox();
        factorCcheckBox = new javax.swing.JCheckBox();
        factorDcheckBox = new javax.swing.JCheckBox();
        nivelJLabel = new javax.swing.JLabel();
        nivelSPEpanCheckBox = new javax.swing.JCheckBox();
        nivelSPLACheckBox = new javax.swing.JCheckBox();
        caudalSPVACheckBox = new javax.swing.JCheckBox();
        nivelSPEpbnCheckBox = new javax.swing.JCheckBox();
        nivelSPLBCheckBox = new javax.swing.JCheckBox();
        nivelSPLCCheckBox = new javax.swing.JCheckBox();
        caudalSPVBCheckBox = new javax.swing.JCheckBox();
        nivelSPLDCheckBox = new javax.swing.JCheckBox();
        caudalSPVCCheckBox = new javax.swing.JCheckBox();
        caudalSPVDCheckBox = new javax.swing.JCheckBox();
        nivelSPCheckBox = new javax.swing.JCheckBox();
        caudalJLabel = new javax.swing.JLabel();
        caudalJLabel2 = new javax.swing.JLabel();
        digitalesValvRecirCheckBox = new javax.swing.JCheckBox();
        digitalesEstadoValvCheckBox = new javax.swing.JCheckBox();
        digitalesEnclValvCheckBox = new javax.swing.JCheckBox();
        digitalesEnclAltoNivelCheckBox = new javax.swing.JCheckBox();
        digitalesEnclBajoNivelCheckBox = new javax.swing.JCheckBox();
        digitalesHiloLTCorCheckBox = new javax.swing.JCheckBox();
        digitalesHiloPTCorCheckBox = new javax.swing.JCheckBox();
        digitalesHiloYFallaCheckBox = new javax.swing.JCheckBox();
        digitalesFallaSensorNivelCheckBox = new javax.swing.JCheckBox();
        digitalesFallaComAltCheckBox = new javax.swing.JCheckBox();
        otrosSPCheckBox = new javax.swing.JCheckBox();
        caudalJLabel4 = new javax.swing.JLabel();
        otrosPresionGasCheckBox = new javax.swing.JCheckBox();
        otrosEnclavamientoCheckBox = new javax.swing.JCheckBox();
        otrosCaudalVariableCheckBox = new javax.swing.JCheckBox();
        otrosCaudalBrutoCheckBox = new javax.swing.JCheckBox();
        cargarJButton = new javax.swing.JButton();
        crearJButton = new javax.swing.JButton();

        factorAcheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        factorAcheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorAcheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        factorAcheckBox1.setText("A");
        factorAcheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorAcheckBox1ActionPerformed(evt);
            }
        });

        factorAcheckBox3.setBackground(new java.awt.Color(0, 0, 0));
        factorAcheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorAcheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        factorAcheckBox3.setText("A");
        factorAcheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorAcheckBox3ActionPerformed(evt);
            }
        });

        caudalJLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        caudalJLabel1.setText("CAUDAL");

        caudalJLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalJLabel3.setForeground(new java.awt.Color(255, 255, 255));
        caudalJLabel3.setText("DIGITALES");

        nivelSPEpanCheckBox17.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPEpanCheckBox17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPEpanCheckBox17.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPEpanCheckBox17.setText("SP VA");
        nivelSPEpanCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPEpanCheckBox17ActionPerformed(evt);
            }
        });

        crearJButton1.setBackground(new java.awt.Color(0, 0, 0));
        crearJButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearJButton1.setForeground(new java.awt.Color(153, 153, 0));
        crearJButton1.setText("CREAR");
        crearJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tituloJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloJLabel.setForeground(new java.awt.Color(153, 153, 0));
        tituloJLabel.setText("Control por Caudal");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zona");

        zonaJComboBox.setBackground(new java.awt.Color(0, 0, 0));
        zonaJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zonaJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        zonaJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELG", "LHC", "LPC" }));
        zonaJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zonaJComboBoxActionPerformed(evt);
            }
        });

        instalacionJTextField.setBackground(new java.awt.Color(0, 0, 0));
        instalacionJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instalacionJTextField.setForeground(new java.awt.Color(255, 255, 255));
        instalacionJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instalacionJTextFieldActionPerformed(evt);
            }
        });

        instalacionJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        instalacionJLabel.setForeground(new java.awt.Color(255, 255, 255));
        instalacionJLabel.setText("Instalación");

        factorJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorJLabel.setForeground(new java.awt.Color(255, 255, 255));
        factorJLabel.setText("FACTOR");

        factorAcheckBox.setBackground(new java.awt.Color(0, 0, 0));
        factorAcheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorAcheckBox.setForeground(new java.awt.Color(255, 255, 255));
        factorAcheckBox.setText("A");
        factorAcheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorAcheckBoxActionPerformed(evt);
            }
        });

        factorBcheckBox.setBackground(new java.awt.Color(0, 0, 0));
        factorBcheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorBcheckBox.setForeground(new java.awt.Color(255, 255, 255));
        factorBcheckBox.setText("B");
        factorBcheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorBcheckBoxActionPerformed(evt);
            }
        });

        factorCcheckBox.setBackground(new java.awt.Color(0, 0, 0));
        factorCcheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorCcheckBox.setForeground(new java.awt.Color(255, 255, 255));
        factorCcheckBox.setText("C");
        factorCcheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorCcheckBoxActionPerformed(evt);
            }
        });

        factorDcheckBox.setBackground(new java.awt.Color(0, 0, 0));
        factorDcheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        factorDcheckBox.setForeground(new java.awt.Color(255, 255, 255));
        factorDcheckBox.setText("D");
        factorDcheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorDcheckBoxActionPerformed(evt);
            }
        });

        nivelJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelJLabel.setForeground(new java.awt.Color(255, 255, 255));
        nivelJLabel.setText("NIVEL");

        nivelSPEpanCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPEpanCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPEpanCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPEpanCheckBox.setText("SP EPAN");
        nivelSPEpanCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPEpanCheckBoxActionPerformed(evt);
            }
        });

        nivelSPLACheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPLACheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPLACheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPLACheckBox.setText("SP + LA");
        nivelSPLACheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPLACheckBoxActionPerformed(evt);
            }
        });

        caudalSPVACheckBox.setBackground(new java.awt.Color(0, 0, 0));
        caudalSPVACheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalSPVACheckBox.setForeground(new java.awt.Color(255, 255, 255));
        caudalSPVACheckBox.setText("SP VA");
        caudalSPVACheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caudalSPVACheckBoxActionPerformed(evt);
            }
        });

        nivelSPEpbnCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPEpbnCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPEpbnCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPEpbnCheckBox.setText("SP EPBN");
        nivelSPEpbnCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPEpbnCheckBoxActionPerformed(evt);
            }
        });

        nivelSPLBCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPLBCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPLBCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPLBCheckBox.setText("SP + LB");
        nivelSPLBCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPLBCheckBoxActionPerformed(evt);
            }
        });

        nivelSPLCCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPLCCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPLCCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPLCCheckBox.setText("SP + LC");
        nivelSPLCCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPLCCheckBoxActionPerformed(evt);
            }
        });

        caudalSPVBCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        caudalSPVBCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalSPVBCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        caudalSPVBCheckBox.setText("SP VB");
        caudalSPVBCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caudalSPVBCheckBoxActionPerformed(evt);
            }
        });

        nivelSPLDCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPLDCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPLDCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPLDCheckBox.setText("SP + LD");
        nivelSPLDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPLDCheckBoxActionPerformed(evt);
            }
        });

        caudalSPVCCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        caudalSPVCCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalSPVCCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        caudalSPVCCheckBox.setText("SP VC");
        caudalSPVCCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caudalSPVCCheckBoxActionPerformed(evt);
            }
        });

        caudalSPVDCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        caudalSPVDCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalSPVDCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        caudalSPVDCheckBox.setText("SP VD");
        caudalSPVDCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caudalSPVDCheckBoxActionPerformed(evt);
            }
        });

        nivelSPCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        nivelSPCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivelSPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        nivelSPCheckBox.setText("SP");
        nivelSPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelSPCheckBoxActionPerformed(evt);
            }
        });

        caudalJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalJLabel.setForeground(new java.awt.Color(255, 255, 255));
        caudalJLabel.setText("DIGITALES");

        caudalJLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalJLabel2.setForeground(new java.awt.Color(255, 255, 255));
        caudalJLabel2.setText("CAUDAL");

        digitalesValvRecirCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesValvRecirCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesValvRecirCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesValvRecirCheckBox.setText("VALV. RECIRC.");
        digitalesValvRecirCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesValvRecirCheckBoxActionPerformed(evt);
            }
        });

        digitalesEstadoValvCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesEstadoValvCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesEstadoValvCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesEstadoValvCheckBox.setText("ESTADO VALV.");
        digitalesEstadoValvCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesEstadoValvCheckBoxActionPerformed(evt);
            }
        });

        digitalesEnclValvCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesEnclValvCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesEnclValvCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesEnclValvCheckBox.setText("ENCL. VALV");
        digitalesEnclValvCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesEnclValvCheckBoxActionPerformed(evt);
            }
        });

        digitalesEnclAltoNivelCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesEnclAltoNivelCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesEnclAltoNivelCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesEnclAltoNivelCheckBox.setText("ENCL. ALTO NIV.");
        digitalesEnclAltoNivelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesEnclAltoNivelCheckBoxActionPerformed(evt);
            }
        });

        digitalesEnclBajoNivelCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesEnclBajoNivelCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesEnclBajoNivelCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesEnclBajoNivelCheckBox.setText("ENCL. BAJO NIV.");
        digitalesEnclBajoNivelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesEnclBajoNivelCheckBoxActionPerformed(evt);
            }
        });

        digitalesHiloLTCorCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesHiloLTCorCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesHiloLTCorCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesHiloLTCorCheckBox.setText("HILO LT CORTADO");
        digitalesHiloLTCorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesHiloLTCorCheckBoxActionPerformed(evt);
            }
        });

        digitalesHiloPTCorCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesHiloPTCorCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesHiloPTCorCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesHiloPTCorCheckBox.setText("HILO PT. CORTADO");
        digitalesHiloPTCorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesHiloPTCorCheckBoxActionPerformed(evt);
            }
        });

        digitalesHiloYFallaCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesHiloYFallaCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesHiloYFallaCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesHiloYFallaCheckBox.setText("HILO Y FALLA ALTUS");
        digitalesHiloYFallaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesHiloYFallaCheckBoxActionPerformed(evt);
            }
        });

        digitalesFallaSensorNivelCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesFallaSensorNivelCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesFallaSensorNivelCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesFallaSensorNivelCheckBox.setText("FALLA SENSOR NIVEL");
        digitalesFallaSensorNivelCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesFallaSensorNivelCheckBoxActionPerformed(evt);
            }
        });

        digitalesFallaComAltCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        digitalesFallaComAltCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        digitalesFallaComAltCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        digitalesFallaComAltCheckBox.setText("FALLA COM. ALTUS");
        digitalesFallaComAltCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitalesFallaComAltCheckBoxActionPerformed(evt);
            }
        });

        otrosSPCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        otrosSPCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otrosSPCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        otrosSPCheckBox.setText("SP");
        otrosSPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosSPCheckBoxActionPerformed(evt);
            }
        });

        caudalJLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        caudalJLabel4.setForeground(new java.awt.Color(255, 255, 255));
        caudalJLabel4.setText("OTROS");

        otrosPresionGasCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        otrosPresionGasCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otrosPresionGasCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        otrosPresionGasCheckBox.setText("PRESIÓN GAS");
        otrosPresionGasCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosPresionGasCheckBoxActionPerformed(evt);
            }
        });

        otrosEnclavamientoCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        otrosEnclavamientoCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otrosEnclavamientoCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        otrosEnclavamientoCheckBox.setText("ENCLAVAMIENTO");
        otrosEnclavamientoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosEnclavamientoCheckBoxActionPerformed(evt);
            }
        });

        otrosCaudalVariableCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        otrosCaudalVariableCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otrosCaudalVariableCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        otrosCaudalVariableCheckBox.setText("CAUDAL VARIABLE");
        otrosCaudalVariableCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosCaudalVariableCheckBoxActionPerformed(evt);
            }
        });

        otrosCaudalBrutoCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        otrosCaudalBrutoCheckBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        otrosCaudalBrutoCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        otrosCaudalBrutoCheckBox.setText("CAUDAL BRUTO");
        otrosCaudalBrutoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrosCaudalBrutoCheckBoxActionPerformed(evt);
            }
        });

        cargarJButton.setBackground(new java.awt.Color(0, 0, 0));
        cargarJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargarJButton.setForeground(new java.awt.Color(153, 153, 0));
        cargarJButton.setText("CARGAR");
        cargarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarJButtonActionPerformed(evt);
            }
        });

        crearJButton.setBackground(new java.awt.Color(0, 0, 0));
        crearJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        crearJButton.setForeground(new java.awt.Color(153, 153, 0));
        crearJButton.setText("CREAR");
        crearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloJLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zonaJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instalacionJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instalacionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(factorJLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(factorBcheckBox)
                                        .addComponent(factorAcheckBox)
                                        .addComponent(factorCcheckBox))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(factorDcheckBox)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nivelSPEpbnCheckBox)
                                    .addComponent(nivelSPLDCheckBox)
                                    .addComponent(nivelSPCheckBox)
                                    .addComponent(nivelSPLCCheckBox)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nivelSPLBCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nivelSPEpanCheckBox)
                                                    .addComponent(nivelSPLACheckBox)
                                                    .addComponent(nivelJLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(caudalJLabel2)
                                                    .addComponent(caudalSPVBCheckBox)
                                                    .addComponent(caudalSPVACheckBox)
                                                    .addComponent(caudalSPVCCheckBox)
                                                    .addComponent(caudalSPVDCheckBox)))
                                            .addComponent(cargarJButton))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(17, 17, 17)
                                                        .addComponent(caudalJLabel))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(digitalesValvRecirCheckBox))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(digitalesEstadoValvCheckBox)
                                                            .addComponent(digitalesEnclAltoNivelCheckBox)
                                                            .addComponent(digitalesEnclValvCheckBox)
                                                            .addComponent(digitalesEnclBajoNivelCheckBox)
                                                            .addComponent(digitalesHiloPTCorCheckBox)
                                                            .addComponent(digitalesFallaComAltCheckBox)
                                                            .addComponent(digitalesFallaSensorNivelCheckBox)
                                                            .addComponent(digitalesHiloLTCorCheckBox)
                                                            .addComponent(digitalesHiloYFallaCheckBox))))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(otrosEnclavamientoCheckBox)
                                                    .addComponent(otrosSPCheckBox)
                                                    .addComponent(caudalJLabel4)
                                                    .addComponent(otrosPresionGasCheckBox)
                                                    .addComponent(otrosCaudalVariableCheckBox)
                                                    .addComponent(otrosCaudalBrutoCheckBox)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(crearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zonaJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(instalacionJLabel)
                    .addComponent(instalacionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorJLabel)
                    .addComponent(nivelJLabel)
                    .addComponent(caudalJLabel2)
                    .addComponent(caudalJLabel)
                    .addComponent(caudalJLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorAcheckBox)
                    .addComponent(nivelSPEpanCheckBox)
                    .addComponent(caudalSPVACheckBox)
                    .addComponent(digitalesValvRecirCheckBox)
                    .addComponent(otrosSPCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorBcheckBox)
                    .addComponent(nivelSPLACheckBox)
                    .addComponent(caudalSPVBCheckBox)
                    .addComponent(digitalesEstadoValvCheckBox)
                    .addComponent(otrosPresionGasCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorCcheckBox)
                    .addComponent(nivelSPLBCheckBox)
                    .addComponent(caudalSPVCCheckBox)
                    .addComponent(digitalesEnclValvCheckBox)
                    .addComponent(otrosCaudalVariableCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factorDcheckBox)
                    .addComponent(nivelSPCheckBox)
                    .addComponent(caudalSPVDCheckBox)
                    .addComponent(digitalesEnclAltoNivelCheckBox)
                    .addComponent(otrosCaudalBrutoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelSPLCCheckBox)
                    .addComponent(digitalesEnclBajoNivelCheckBox)
                    .addComponent(otrosEnclavamientoCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelSPLDCheckBox)
                    .addComponent(digitalesHiloLTCorCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivelSPEpbnCheckBox)
                    .addComponent(digitalesHiloPTCorCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitalesHiloYFallaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitalesFallaComAltCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitalesFallaSensorNivelCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargarJButton)
                    .addComponent(crearJButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zonaJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zonaJComboBoxActionPerformed
        Elementos.setZona((String) zonaJComboBox.getSelectedItem());
    }//GEN-LAST:event_zonaJComboBoxActionPerformed

    private void factorAcheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorAcheckBoxActionPerformed
        if (factorAcheckBox.isSelected()) {
            System.out.println("SELECCIONADO EL CHECKBOX FACTOR A");
            //booleano.setFactorA(true);
            Booleanos.setFaactorA("ENCENDIDO");
            System.out.println("PASO A TRUE");
        }
    }//GEN-LAST:event_factorAcheckBoxActionPerformed

    private void factorAcheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorAcheckBox1ActionPerformed

    }//GEN-LAST:event_factorAcheckBox1ActionPerformed

    private void factorBcheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorBcheckBoxActionPerformed
        if (factorBcheckBox.isSelected()) {
            System.out.println("SELECCIONADO EL CHECKBOX FACTOR B");
            //booleano.setFactorA(true);
            Booleanos.setFaactorB("ENCENDIDO");
            System.out.println("PASO A TRUE");
        }
    }//GEN-LAST:event_factorBcheckBoxActionPerformed

    private void factorAcheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorAcheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorAcheckBox3ActionPerformed

    private void factorCcheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorCcheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorCcheckBoxActionPerformed

    private void factorDcheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorDcheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factorDcheckBoxActionPerformed

    private void nivelSPEpanCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPEpanCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPEpanCheckBoxActionPerformed

    private void nivelSPLACheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPLACheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPLACheckBoxActionPerformed

    private void caudalSPVACheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caudalSPVACheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caudalSPVACheckBoxActionPerformed

    private void nivelSPEpbnCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPEpbnCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPEpbnCheckBoxActionPerformed

    private void nivelSPLBCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPLBCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPLBCheckBoxActionPerformed

    private void nivelSPLCCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPLCCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPLCCheckBoxActionPerformed

    private void caudalSPVBCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caudalSPVBCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caudalSPVBCheckBoxActionPerformed

    private void nivelSPLDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPLDCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPLDCheckBoxActionPerformed

    private void caudalSPVCCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caudalSPVCCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caudalSPVCCheckBoxActionPerformed

    private void caudalSPVDCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caudalSPVDCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caudalSPVDCheckBoxActionPerformed

    private void nivelSPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPCheckBoxActionPerformed

    private void digitalesValvRecirCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesValvRecirCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesValvRecirCheckBoxActionPerformed

    private void digitalesEstadoValvCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesEstadoValvCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesEstadoValvCheckBoxActionPerformed

    private void digitalesEnclValvCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesEnclValvCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesEnclValvCheckBoxActionPerformed

    private void digitalesEnclAltoNivelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesEnclAltoNivelCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesEnclAltoNivelCheckBoxActionPerformed

    private void digitalesEnclBajoNivelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesEnclBajoNivelCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesEnclBajoNivelCheckBoxActionPerformed

    private void digitalesHiloLTCorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesHiloLTCorCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesHiloLTCorCheckBoxActionPerformed

    private void digitalesHiloPTCorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesHiloPTCorCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesHiloPTCorCheckBoxActionPerformed

    private void digitalesHiloYFallaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesHiloYFallaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesHiloYFallaCheckBoxActionPerformed

    private void digitalesFallaSensorNivelCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesFallaSensorNivelCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesFallaSensorNivelCheckBoxActionPerformed

    private void digitalesFallaComAltCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitalesFallaComAltCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_digitalesFallaComAltCheckBoxActionPerformed

    private void otrosSPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosSPCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrosSPCheckBoxActionPerformed

    private void nivelSPEpanCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelSPEpanCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivelSPEpanCheckBox17ActionPerformed

    private void otrosPresionGasCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosPresionGasCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrosPresionGasCheckBoxActionPerformed

    private void otrosEnclavamientoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosEnclavamientoCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrosEnclavamientoCheckBoxActionPerformed

    private void otrosCaudalVariableCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosCaudalVariableCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrosCaudalVariableCheckBoxActionPerformed

    private void otrosCaudalBrutoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrosCaudalBrutoCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrosCaudalBrutoCheckBoxActionPerformed

    private void instalacionJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instalacionJTextFieldActionPerformed


    }//GEN-LAST:event_instalacionJTextFieldActionPerformed

    private void cargarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarJButtonActionPerformed
        elemento.setTag(instalacionJTextField.getText()); //SETEAMOS EL VALOR DE SETTAG CON LO QUE OBTENEMOS EN INSTALACION JTEXTFIELD
        JOptionPane.showMessageDialog(null, "CARGADO PERRO");
    }//GEN-LAST:event_cargarJButtonActionPerformed

    private void crearJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearJButton1ActionPerformed

    private void crearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearJButtonActionPerformed
        metodos.creandoExcel();
        JOptionPane.showMessageDialog(null, "CREADO LORO");
    }//GEN-LAST:event_crearJButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Grafic().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarJButton;
    private javax.swing.JLabel caudalJLabel;
    private javax.swing.JLabel caudalJLabel1;
    private javax.swing.JLabel caudalJLabel2;
    private javax.swing.JLabel caudalJLabel3;
    private javax.swing.JLabel caudalJLabel4;
    private javax.swing.JCheckBox caudalSPVACheckBox;
    private javax.swing.JCheckBox caudalSPVBCheckBox;
    private javax.swing.JCheckBox caudalSPVCCheckBox;
    private javax.swing.JCheckBox caudalSPVDCheckBox;
    private javax.swing.JButton crearJButton;
    private javax.swing.JButton crearJButton1;
    private javax.swing.JCheckBox digitalesEnclAltoNivelCheckBox;
    private javax.swing.JCheckBox digitalesEnclBajoNivelCheckBox;
    private javax.swing.JCheckBox digitalesEnclValvCheckBox;
    private javax.swing.JCheckBox digitalesEstadoValvCheckBox;
    private javax.swing.JCheckBox digitalesFallaComAltCheckBox;
    private javax.swing.JCheckBox digitalesFallaSensorNivelCheckBox;
    private javax.swing.JCheckBox digitalesHiloLTCorCheckBox;
    private javax.swing.JCheckBox digitalesHiloPTCorCheckBox;
    private javax.swing.JCheckBox digitalesHiloYFallaCheckBox;
    private javax.swing.JCheckBox digitalesValvRecirCheckBox;
    private javax.swing.JCheckBox factorAcheckBox;
    private javax.swing.JCheckBox factorAcheckBox1;
    private javax.swing.JCheckBox factorAcheckBox3;
    private javax.swing.JCheckBox factorBcheckBox;
    private javax.swing.JCheckBox factorCcheckBox;
    private javax.swing.JCheckBox factorDcheckBox;
    private javax.swing.JLabel factorJLabel;
    private javax.swing.JLabel instalacionJLabel;
    private javax.swing.JTextField instalacionJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nivelJLabel;
    private javax.swing.JCheckBox nivelSPCheckBox;
    private javax.swing.JCheckBox nivelSPEpanCheckBox;
    private javax.swing.JCheckBox nivelSPEpanCheckBox17;
    private javax.swing.JCheckBox nivelSPEpbnCheckBox;
    private javax.swing.JCheckBox nivelSPLACheckBox;
    private javax.swing.JCheckBox nivelSPLBCheckBox;
    private javax.swing.JCheckBox nivelSPLCCheckBox;
    private javax.swing.JCheckBox nivelSPLDCheckBox;
    private javax.swing.JCheckBox otrosCaudalBrutoCheckBox;
    private javax.swing.JCheckBox otrosCaudalVariableCheckBox;
    private javax.swing.JCheckBox otrosEnclavamientoCheckBox;
    private javax.swing.JCheckBox otrosPresionGasCheckBox;
    private javax.swing.JCheckBox otrosSPCheckBox;
    private javax.swing.JLabel tituloJLabel;
    private javax.swing.JComboBox<String> zonaJComboBox;
    // End of variables declaration//GEN-END:variables
}

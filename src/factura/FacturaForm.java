package factura;

import static java.awt.SystemColor.window;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;




public class FacturaForm extends javax.swing.JFrame {

    //Declaracion de variables   
    // Cantidad
    int Cant1, Cant2, Cant3, Cant4, Cant5;

    // precio unitario
    double Precio1, Precio2, Precio3, Precio4, Precio5;

    // Descuento
    double Dscto1, Dscto2, Dscto3, Dscto4, Dscto5;

    // Total a Pagar por producto
    double TotalP1, TotalP2, TotalP3, TotalP4, TotalP5;

    // Total a pagar 
    double SubTotal, IvaTotal, TotalAPagar;

    //iva
    final int Iva = 19;

    public FacturaForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regene.cvkvxkrated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NombreTB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ApellidoTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RutTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DireccionTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TelefonoTb = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FechaEmision = new javax.swing.JTextField();
        FechaPago = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        P1CantidadTb = new javax.swing.JTextField();
        P2CantidadTb = new javax.swing.JTextField();
        P3CantidadTb = new javax.swing.JTextField();
        P4CantidadTb = new javax.swing.JTextField();
        P5CantidadTb = new javax.swing.JTextField();
        P1Tb = new javax.swing.JTextField();
        P2Tb = new javax.swing.JTextField();
        P3Tb = new javax.swing.JTextField();
        P5Tb = new javax.swing.JTextField();
        P4Tb = new javax.swing.JTextField();
        P5VunitarioTb = new javax.swing.JTextField();
        P4VunitarioTb = new javax.swing.JTextField();
        P1VunitarioTb = new javax.swing.JTextField();
        P2VunitarioTb = new javax.swing.JTextField();
        P3VunitarioTb = new javax.swing.JTextField();
        P5DesctTb = new javax.swing.JTextField();
        P4DesctTb = new javax.swing.JTextField();
        P1DesctTb = new javax.swing.JTextField();
        P2DesctTb = new javax.swing.JTextField();
        P3DesctTb = new javax.swing.JTextField();
        P5TotalTb = new javax.swing.JTextField();
        P1TotalTb = new javax.swing.JTextField();
        P2TotalTb = new javax.swing.JTextField();
        P4TotalTb = new javax.swing.JTextField();
        P3TotalTb = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        SubTotalTb = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        IvaTb = new javax.swing.JTextField();
        LiquidoTb = new javax.swing.JTextField();
        SubTotalTb1 = new javax.swing.JTextField();
        CalcularBtn = new javax.swing.JButton();
        LimpiarBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        RegionCb = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Rut");

        RutTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutTbActionPerformed(evt);
            }
        });

        jLabel4.setText("Direccion");

        jLabel7.setText("Telefono");

        TelefonoTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTbActionPerformed(evt);
            }
        });

        jLabel8.setText("Empresa Oechsler");

        jLabel9.setText("Fecha de emision");

        jLabel10.setText("Fecha de pago");

        jLabel11.setText("Factura electronica");

        jLabel12.setText("RUT");

        jLabel13.setText("Numero");

        FechaEmision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FechaEmisionFocusGained(evt);
            }
        });
        FechaEmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaEmisionActionPerformed(evt);
            }
        });

        jLabel14.setText("14.762.264-3");

        jLabel15.setText("0000001");

        jLabel16.setText("Cantidad");

        jLabel17.setText("Producto");

        jLabel18.setText("Precio unitario");

        jLabel19.setText("% Descuento");

        jLabel20.setText("Total");

        P1CantidadTb.setText("0");

        P2CantidadTb.setText("0");

        P3CantidadTb.setText("0");

        P4CantidadTb.setText("0");

        P5CantidadTb.setText("0");

        P1Tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1TbActionPerformed(evt);
            }
        });

        P5VunitarioTb.setText("0");

        P4VunitarioTb.setText("0");

        P1VunitarioTb.setText("0");
        P1VunitarioTb.setToolTipText("");

        P2VunitarioTb.setText("0");

        P3VunitarioTb.setText("0");

        P5DesctTb.setText("0");

        P4DesctTb.setText("0");

        P1DesctTb.setText("0");

        P2DesctTb.setText("0");

        P3DesctTb.setText("0");

        P5TotalTb.setEditable(false);

        P1TotalTb.setEditable(false);
        P1TotalTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1TotalTbActionPerformed(evt);
            }
        });

        P2TotalTb.setEditable(false);

        P4TotalTb.setEditable(false);

        P3TotalTb.setEditable(false);

        jLabel21.setText("Subtotal");

        SubTotalTb.setEditable(false);

        jLabel22.setText("Neto");

        jLabel23.setText("19% IVA");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Total a Pagar");

        IvaTb.setEditable(false);

        LiquidoTb.setEditable(false);
        LiquidoTb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        SubTotalTb1.setEditable(false);

        CalcularBtn.setBackground(new java.awt.Color(102, 102, 102));
        CalcularBtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CalcularBtn.setText("Calcular");
        CalcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularBtnActionPerformed(evt);
            }
        });

        LimpiarBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        LimpiarBtn.setText("Limpiar ");
        LimpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarBtnActionPerformed(evt);
            }
        });

        SalirBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        SalirBtn.setText("Salir");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        RegionCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarapaca", "Antofagasta ", "Atacama ", "Coquimbo ", "Valparaíso ", "O'Higgins ", "El Maule ", "El Bío Bío ", "La Araucania ", "Los Lagos ", "Aysen ", "Magallanes y Antartica Chilena ", "Region Metropolitana de Santiago ", "Los Rios ", "Arica y Parinacota " }));
        RegionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegionCbActionPerformed(evt);
            }
        });

        jLabel5.setText("Region");

        jLabel6.setText("Comuna");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14)))))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CalcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SubTotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(P4CantidadTb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                            .addComponent(P3CantidadTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P2CantidadTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P1CantidadTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P5CantidadTb))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P1Tb, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(P5Tb, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(P4Tb, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(P2Tb, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(P3Tb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(P4VunitarioTb, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P2VunitarioTb, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P3VunitarioTb, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P1VunitarioTb)
                                            .addComponent(P5VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(P2DesctTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P3DesctTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P4DesctTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P5DesctTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P1DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P2TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P1TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P3TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P4TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P5TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator6))
                                .addGap(13, 13, 13)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LimpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IvaTb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LiquidoTb, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubTotalTb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DireccionTb, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NombreTB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ApellidoTb, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelefonoTb, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(RutTb)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)
                                .addComponent(jLabel18)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(RegionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5)))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel15))
                            .addComponent(FechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NombreTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ApellidoTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(RutTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DireccionTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TelefonoTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18))
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(P1CantidadTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P2CantidadTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P3CantidadTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P4CantidadTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P5CantidadTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(P1Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P2Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P3Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P4Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(P5Tb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P2DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P3DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P4DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P5DesctTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P2TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P3TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P4TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P5TotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P2VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P3VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P4VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P5VunitarioTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubTotalTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(CalcularBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(SubTotalTb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IvaTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel24)
                                            .addComponent(LiquidoTb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(SalirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LimpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelefonoTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTbActionPerformed

    private void RutTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutTbActionPerformed
      
        
        
        
        
        
        
        
    }//GEN-LAST:event_RutTbActionPerformed

    private void FechaEmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaEmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaEmisionActionPerformed

    private void CalcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularBtnActionPerformed

// Acciones boton calcular.
        // Producto 1
        Precio1 = Double.parseDouble(P1VunitarioTb.getText()); // convierte valor ingresado en precio  a real

        Cant1 = Integer.parseInt(P1CantidadTb.getText());  // convierte valor ingresado en cantidad  a entero

        Dscto1 = Double.parseDouble(P1DesctTb.getText()); // convierto valor ingresado en descuento a real

        TotalP1 = ((Precio1 * Cant1) - ((Precio1 * Cant1) * Dscto1) / 100); // realiza calculo matematico, suma precio mas cantidad y resta % descuento (si aplica)

        String Subt1 = TotalP1 + "";  // convierte precio neto a cadena de texto
        P1TotalTb.setText(Subt1); // imprime precio neto en text box correspondiente 

        // Producto 2
        Precio2 = Double.parseDouble(P2VunitarioTb.getText()); // convierte valor ingresado en precio  a real

        Cant2 = Integer.parseInt(P2CantidadTb.getText());  // convierte valor ingresado en cantidad  a entero

        Dscto2 = Double.parseDouble(P2DesctTb.getText()); // convierto valor ingresado en descuento a real

        TotalP2 = ((Precio2 * Cant2) - ((Precio2 * Cant2) * Dscto2) / 100); // realiza calculo matematico, suma precio mas cantidad y resta % descuento (si aplica)

        String Subt2 = TotalP2 + "";  // convierte precio neto a cadena de texto
        P2TotalTb.setText(Subt2); // imprime precio neto en text box correspondiente 

        // Producto 3
        Precio3 = Double.parseDouble(P3VunitarioTb.getText()); // convierte valor ingresado en precio  a real

        Cant3 = Integer.parseInt(P3CantidadTb.getText());  // convierte valor ingresado en cantidad  a entero

        Dscto3 = Double.parseDouble(P3DesctTb.getText()); // convierto valor ingresado en descuento a real

        TotalP3 = ((Precio3 * Cant3) - ((Precio3 * Cant3) * Dscto3) / 100); // realiza calculo matematico, suma precio mas cantidad y resta % descuento (si aplica)

        String Subt3 = TotalP3 + "";  // convierte precio neto a cadena de texto
        P3TotalTb.setText(Subt3); // imprime precio neto en text box correspondiente 

        // Producto 4
        Precio4 = Double.parseDouble(P4VunitarioTb.getText()); // convierte valor ingresado en precio  a real

        Cant4 = Integer.parseInt(P4CantidadTb.getText());  // convierte valor ingresado en cantidad  a entero

        Dscto4 = Double.parseDouble(P4DesctTb.getText()); // convierto valor ingresado en descuento a real

        TotalP4 = ((Precio4 * Cant4) - ((Precio4 * Cant4) * Dscto4) / 100); // realiza calculo matematico, suma precio mas cantidad y resta % descuento (si aplica)

        String Subt4 = TotalP4 + "";  // convierte precio neto a cadena de texto
        P4TotalTb.setText(Subt4); // imprime precio neto en text box correspondiente 

        // Producto 5
        Precio5 = Double.parseDouble(P5VunitarioTb.getText()); // convierte valor ingresado en precio  a real

        Cant5 = Integer.parseInt(P5CantidadTb.getText());  // convierte valor ingresado en cantidad  a entero

        Dscto5 = Double.parseDouble(P5DesctTb.getText()); // convierto valor ingresado en descuento a real

        TotalP5 = ((Precio5 * Cant5) - ((Precio5 * Cant5) * Dscto5) / 100); // realiza calculo matematico, suma precio mas cantidad y resta % descuento (si aplica)

        String Subt5 = TotalP5 + "";  // convierte precio neto a cadena de texto
        P5TotalTb.setText(Subt5); // imprime precio neto en text box correspondiente 
        
        

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Calculo subtotal<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        
        SubTotal = TotalP1 + TotalP2 + TotalP3 + TotalP4 + TotalP5;

        String SuboTotalNeto = SubTotal + "";
        SubTotalTb.setText(SuboTotalNeto);  // Imprime subtotal en text box correspondiente

        // calculo valor liquido a pagar
        //caclulo subtotal
        String SuboTotalNeto1 = SubTotal + "";
        SubTotalTb1.setText(SuboTotalNeto1);

        // Calculo Iva por esta compra
        IvaTotal = (SubTotal * Iva) / 100;

        String IvaTotalCompra = IvaTotal + "";  // imprime IVA en textbox correspondiente
        IvaTb.setText(IvaTotalCompra);

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Calculo total liquido>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        
        
        TotalAPagar = ((SubTotal * Iva) / 100) + SubTotal;

        String TotalLiquido = TotalAPagar + "";
        LiquidoTb.setText(TotalLiquido);


    }//GEN-LAST:event_CalcularBtnActionPerformed

    private void P1TotalTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1TotalTbActionPerformed

        // text box total producto 1

    }//GEN-LAST:event_P1TotalTbActionPerformed

    private void LimpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarBtnActionPerformed
        // Boton Limpiar

// Limpiar fecha emision
        FechaEmision.setText("");
        FechaPago.setText("");

// Limpiar Datos Usuario
        NombreTB.setText(""); // campos que no requieren calculos matematios se resetean vaios para ingresar nuevos datos
        ApellidoTb.setText("");
        RutTb.setText("");
        DireccionTb.setText("");
        TelefonoTb.setText("");

// Limpiar cantidad de productos
        P1CantidadTb.setText("0");  // campos que requieren calculo matematico se resetean con el valor 0 para evitar errores de calculo al ser considerados en las formulas.
        P2CantidadTb.setText("0");
        P3CantidadTb.setText("0");
        P4CantidadTb.setText("0");
        P5CantidadTb.setText("0");

//limpiar Producto
        P1Tb.setText("0");
        P2Tb.setText("0");
        P3Tb.setText("0");
        P4Tb.setText("0");
        P5Tb.setText("0");

// Limpiar precio unitario
        P1VunitarioTb.setText("0");
        P2VunitarioTb.setText("0");
        P3VunitarioTb.setText("0");
        P4VunitarioTb.setText("0");
        P5VunitarioTb.setText("0");

//Limpiar descuento 
        P1DesctTb.setText("0");
        P2DesctTb.setText("0");
        P3DesctTb.setText("0");
        P4DesctTb.setText("0");
        P5DesctTb.setText("0");

// descuento precio total
        P1TotalTb.setText("0");
        P2TotalTb.setText("0");
        P3TotalTb.setText("0");
        P4TotalTb.setText("0");
        P5TotalTb.setText("0");

// limpiar calculo total
        SubTotalTb.setText("");
        SubTotalTb1.setText("");
        IvaTb.setText("");
        LiquidoTb.setText("");


    }//GEN-LAST:event_LimpiarBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        // TODO add your handling code here:
        int Out = JOptionPane.showConfirmDialog(this, "Realmente desea salir?");
        if (Out == JOptionPane.YES_OPTION){
            System.exit( 0 );
        }
        
    }//GEN-LAST:event_SalirBtnActionPerformed

    private void FechaEmisionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaEmisionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaEmisionFocusGained

    private void RegionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegionCbActionPerformed
       // combo box Regiones
        
   /****   

        
Tarapaca
Antofagasta 
Atacama 
Coquimbo 
Valparaíso 
O'Higgins 
El Maule 
El Bío Bío 
La Araucania 
Los Lagos 
Aysen 
Magallanes y Antartica Chilena 
Region Metropolitana de Santiago 
Los Rios 
Arica y Parinacota 
        
        ****/
        
        
    }//GEN-LAST:event_RegionCbActionPerformed

    private void P1TbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1TbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1TbActionPerformed

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
            java.util.logging.Logger.getLogger(FacturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTb;
    private javax.swing.JButton CalcularBtn;
    private javax.swing.JTextField DireccionTb;
    private javax.swing.JTextField FechaEmision;
    private javax.swing.JTextField FechaPago;
    private javax.swing.JTextField IvaTb;
    private javax.swing.JButton LimpiarBtn;
    private javax.swing.JTextField LiquidoTb;
    private javax.swing.JTextField NombreTB;
    private javax.swing.JTextField P1CantidadTb;
    private javax.swing.JTextField P1DesctTb;
    private javax.swing.JTextField P1Tb;
    private javax.swing.JTextField P1TotalTb;
    private javax.swing.JTextField P1VunitarioTb;
    private javax.swing.JTextField P2CantidadTb;
    private javax.swing.JTextField P2DesctTb;
    private javax.swing.JTextField P2Tb;
    private javax.swing.JTextField P2TotalTb;
    private javax.swing.JTextField P2VunitarioTb;
    private javax.swing.JTextField P3CantidadTb;
    private javax.swing.JTextField P3DesctTb;
    private javax.swing.JTextField P3Tb;
    private javax.swing.JTextField P3TotalTb;
    private javax.swing.JTextField P3VunitarioTb;
    private javax.swing.JTextField P4CantidadTb;
    private javax.swing.JTextField P4DesctTb;
    private javax.swing.JTextField P4Tb;
    private javax.swing.JTextField P4TotalTb;
    private javax.swing.JTextField P4VunitarioTb;
    private javax.swing.JTextField P5CantidadTb;
    private javax.swing.JTextField P5DesctTb;
    private javax.swing.JTextField P5Tb;
    private javax.swing.JTextField P5TotalTb;
    private javax.swing.JTextField P5VunitarioTb;
    public javax.swing.JComboBox<String> RegionCb;
    private javax.swing.JTextField RutTb;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JTextField SubTotalTb;
    private javax.swing.JTextField SubTotalTb1;
    private javax.swing.JTextField TelefonoTb;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package Cliente;

import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diemo
 */
public class PantallaJugador extends javax.swing.JFrame {

    Cliente refCliente;
    String imagenFicha;
    String nombre;
    
    
    public PantallaJugador() {
        initComponents();
    }

    public void setRefCliente(Cliente refCliente) {
        this.refCliente = refCliente;
    }
    
    public void setImagenFicha(String imagenFicha){
        this.imagenFicha = imagenFicha;
        lblFicha.setIcon(putIcon(imagenFicha, lblFicha));
        
    }
    
    private Icon putIcon(String url, JLabel label){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = label.getWidth();
        int alto = label.getHeight();
        ImageIcon icon2 = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING));
        return icon2;
    }
    
    public void setNombreJugador(String nombre){
        this.nombre = nombre;
        lblNombreJugador.setText(nombre);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblFicha = new javax.swing.JLabel();
        lblNombreJugador = new javax.swing.JLabel();
        lblCantidadDinero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        btnLanzarDados = new javax.swing.JButton();
        lblTurno = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        btnMoverFicha = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        btnCasillaNorthumrldAv = new javax.swing.JButton();
        btnCasillaVineSt = new javax.swing.JButton();
        btnCasillaRegentSt = new javax.swing.JButton();
        btnCasillaStrand = new javax.swing.JButton();
        btnCasillaFleetSt = new javax.swing.JButton();
        btnCasillaTrafalgarSq = new javax.swing.JButton();
        btnCasillaWhitehall = new javax.swing.JButton();
        btnCasillaMarlborough = new javax.swing.JButton();
        btnCasillaOxfordSt = new javax.swing.JButton();
        btnCasillaLeicesterSq = new javax.swing.JButton();
        btnCasillaCoventrySt = new javax.swing.JButton();
        btnCasillaPicadilly = new javax.swing.JButton();
        btnCasillaPallMall = new javax.swing.JButton();
        btnCasillaBowSt = new javax.swing.JButton();
        btnCasillaBondSt = new javax.swing.JButton();
        btnCasillaPentonvilleRd = new javax.swing.JButton();
        btnCasillaEustonRd = new javax.swing.JButton();
        btnCasillaTheAngel = new javax.swing.JButton();
        btnCasillaParkLane = new javax.swing.JButton();
        btnFerrocarrilFS = new javax.swing.JButton();
        btnFerrocarrilLS = new javax.swing.JButton();
        btnCasillaElectricidad = new javax.swing.JButton();
        btnCasillaWhiteChapelRd = new javax.swing.JButton();
        btnCasillaMayfair = new javax.swing.JButton();
        btnFerrocarrilMS = new javax.swing.JButton();
        btnFerrocarrilKC = new javax.swing.JButton();
        btnCasillaAgua = new javax.swing.JButton();
        btnCasillaOldKentRd = new javax.swing.JButton();
        btnEdificaciones = new javax.swing.JButton();
        lblHoteles = new javax.swing.JLabel();
        lblCasas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaHistorial = new javax.swing.JTextArea();
        labelTitulo3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaChat = new javax.swing.JTextArea();
        txfEscribirChat = new javax.swing.JTextField();
        btnEnviarMensaje = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblFondoMonopoly = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1515, 865));
        setPreferredSize(new java.awt.Dimension(1515, 865));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        lblFicha.setForeground(new java.awt.Color(255, 255, 255));
        lblFicha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFicha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblNombreJugador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador.setText("NOMBRE JUGADOR");

        lblCantidadDinero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCantidadDinero.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidadDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadDinero.setText("$0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCantidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCantidadDinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dado3.png"))); // NOI18N

        lblDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dado5.png"))); // NOI18N

        btnLanzarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnLanzar.png"))); // NOI18N
        btnLanzarDados.setBorder(null);
        btnLanzarDados.setBorderPainted(false);
        btnLanzarDados.setContentAreaFilled(false);
        btnLanzarDados.setFocusPainted(false);
        btnLanzarDados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnLanzarPressed.png"))); // NOI18N
        btnLanzarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadosActionPerformed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTurno.setText("NOMBRE TURNO");
        lblTurno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo1.setText("TURNO:");

        btnMoverFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnMover.png"))); // NOI18N
        btnMoverFicha.setBorder(null);
        btnMoverFicha.setBorderPainted(false);
        btnMoverFicha.setContentAreaFilled(false);
        btnMoverFicha.setFocusPainted(false);
        btnMoverFicha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnMoverPressed.png"))); // NOI18N
        btnMoverFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLanzarDados)
                .addGap(18, 18, 18)
                .addComponent(btnMoverFicha)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnLanzarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDado2)
                            .addComponent(lblDado1))
                        .addComponent(btnMoverFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));

        labelTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo2.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo2.setText("MIS POSESIONES");

        btnCasillaNorthumrldAv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaNorthumrldAv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fucsia.png"))); // NOI18N
        btnCasillaNorthumrldAv.setBorder(null);
        btnCasillaNorthumrldAv.setBorderPainted(false);
        btnCasillaNorthumrldAv.setContentAreaFilled(false);
        btnCasillaNorthumrldAv.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaNorthumrldAv.setEnabled(false);
        btnCasillaNorthumrldAv.setFocusPainted(false);
        btnCasillaNorthumrldAv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaNorthumrldAvActionPerformed(evt);
            }
        });

        btnCasillaVineSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaVineSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/naranja.png"))); // NOI18N
        btnCasillaVineSt.setBorder(null);
        btnCasillaVineSt.setBorderPainted(false);
        btnCasillaVineSt.setContentAreaFilled(false);
        btnCasillaVineSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaVineSt.setEnabled(false);
        btnCasillaVineSt.setFocusPainted(false);
        btnCasillaVineSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaVineStActionPerformed(evt);
            }
        });

        btnCasillaRegentSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaRegentSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verde.png"))); // NOI18N
        btnCasillaRegentSt.setBorder(null);
        btnCasillaRegentSt.setBorderPainted(false);
        btnCasillaRegentSt.setContentAreaFilled(false);
        btnCasillaRegentSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaRegentSt.setEnabled(false);
        btnCasillaRegentSt.setFocusPainted(false);
        btnCasillaRegentSt.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCasillaRegentSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaRegentStActionPerformed(evt);
            }
        });

        btnCasillaStrand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaStrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rojo.png"))); // NOI18N
        btnCasillaStrand.setBorder(null);
        btnCasillaStrand.setBorderPainted(false);
        btnCasillaStrand.setContentAreaFilled(false);
        btnCasillaStrand.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaStrand.setEnabled(false);
        btnCasillaStrand.setFocusPainted(false);
        btnCasillaStrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaStrandActionPerformed(evt);
            }
        });

        btnCasillaFleetSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaFleetSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rojo.png"))); // NOI18N
        btnCasillaFleetSt.setBorder(null);
        btnCasillaFleetSt.setBorderPainted(false);
        btnCasillaFleetSt.setContentAreaFilled(false);
        btnCasillaFleetSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaFleetSt.setEnabled(false);
        btnCasillaFleetSt.setFocusPainted(false);
        btnCasillaFleetSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaFleetStActionPerformed(evt);
            }
        });

        btnCasillaTrafalgarSq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaTrafalgarSq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rojo.png"))); // NOI18N
        btnCasillaTrafalgarSq.setBorder(null);
        btnCasillaTrafalgarSq.setBorderPainted(false);
        btnCasillaTrafalgarSq.setContentAreaFilled(false);
        btnCasillaTrafalgarSq.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaTrafalgarSq.setEnabled(false);
        btnCasillaTrafalgarSq.setFocusPainted(false);
        btnCasillaTrafalgarSq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaTrafalgarSqActionPerformed(evt);
            }
        });

        btnCasillaWhitehall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaWhitehall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fucsia.png"))); // NOI18N
        btnCasillaWhitehall.setBorder(null);
        btnCasillaWhitehall.setBorderPainted(false);
        btnCasillaWhitehall.setContentAreaFilled(false);
        btnCasillaWhitehall.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaWhitehall.setEnabled(false);
        btnCasillaWhitehall.setFocusPainted(false);
        btnCasillaWhitehall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaWhitehallActionPerformed(evt);
            }
        });

        btnCasillaMarlborough.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaMarlborough.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/naranja.png"))); // NOI18N
        btnCasillaMarlborough.setBorder(null);
        btnCasillaMarlborough.setBorderPainted(false);
        btnCasillaMarlborough.setContentAreaFilled(false);
        btnCasillaMarlborough.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaMarlborough.setEnabled(false);
        btnCasillaMarlborough.setFocusPainted(false);
        btnCasillaMarlborough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaMarlboroughActionPerformed(evt);
            }
        });

        btnCasillaOxfordSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaOxfordSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verde.png"))); // NOI18N
        btnCasillaOxfordSt.setBorder(null);
        btnCasillaOxfordSt.setBorderPainted(false);
        btnCasillaOxfordSt.setContentAreaFilled(false);
        btnCasillaOxfordSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaOxfordSt.setEnabled(false);
        btnCasillaOxfordSt.setFocusPainted(false);
        btnCasillaOxfordSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaOxfordStActionPerformed(evt);
            }
        });

        btnCasillaLeicesterSq.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaLeicesterSq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/amarillo.png"))); // NOI18N
        btnCasillaLeicesterSq.setBorder(null);
        btnCasillaLeicesterSq.setBorderPainted(false);
        btnCasillaLeicesterSq.setContentAreaFilled(false);
        btnCasillaLeicesterSq.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaLeicesterSq.setEnabled(false);
        btnCasillaLeicesterSq.setFocusPainted(false);
        btnCasillaLeicesterSq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaLeicesterSqActionPerformed(evt);
            }
        });

        btnCasillaCoventrySt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaCoventrySt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/amarillo.png"))); // NOI18N
        btnCasillaCoventrySt.setBorder(null);
        btnCasillaCoventrySt.setBorderPainted(false);
        btnCasillaCoventrySt.setContentAreaFilled(false);
        btnCasillaCoventrySt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaCoventrySt.setEnabled(false);
        btnCasillaCoventrySt.setFocusPainted(false);
        btnCasillaCoventrySt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaCoventryStActionPerformed(evt);
            }
        });

        btnCasillaPicadilly.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaPicadilly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/amarillo.png"))); // NOI18N
        btnCasillaPicadilly.setBorder(null);
        btnCasillaPicadilly.setBorderPainted(false);
        btnCasillaPicadilly.setContentAreaFilled(false);
        btnCasillaPicadilly.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaPicadilly.setEnabled(false);
        btnCasillaPicadilly.setFocusPainted(false);
        btnCasillaPicadilly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaPicadillyActionPerformed(evt);
            }
        });

        btnCasillaPallMall.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaPallMall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fucsia.png"))); // NOI18N
        btnCasillaPallMall.setBorder(null);
        btnCasillaPallMall.setBorderPainted(false);
        btnCasillaPallMall.setContentAreaFilled(false);
        btnCasillaPallMall.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaPallMall.setEnabled(false);
        btnCasillaPallMall.setFocusPainted(false);
        btnCasillaPallMall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaPallMallActionPerformed(evt);
            }
        });

        btnCasillaBowSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaBowSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/naranja.png"))); // NOI18N
        btnCasillaBowSt.setBorder(null);
        btnCasillaBowSt.setBorderPainted(false);
        btnCasillaBowSt.setContentAreaFilled(false);
        btnCasillaBowSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaBowSt.setEnabled(false);
        btnCasillaBowSt.setFocusPainted(false);
        btnCasillaBowSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaBowStActionPerformed(evt);
            }
        });

        btnCasillaBondSt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaBondSt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verde.png"))); // NOI18N
        btnCasillaBondSt.setBorder(null);
        btnCasillaBondSt.setBorderPainted(false);
        btnCasillaBondSt.setContentAreaFilled(false);
        btnCasillaBondSt.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaBondSt.setEnabled(false);
        btnCasillaBondSt.setFocusPainted(false);
        btnCasillaBondSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaBondStActionPerformed(evt);
            }
        });

        btnCasillaPentonvilleRd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaPentonvilleRd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/celeste.png"))); // NOI18N
        btnCasillaPentonvilleRd.setBorder(null);
        btnCasillaPentonvilleRd.setBorderPainted(false);
        btnCasillaPentonvilleRd.setContentAreaFilled(false);
        btnCasillaPentonvilleRd.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaPentonvilleRd.setEnabled(false);
        btnCasillaPentonvilleRd.setFocusPainted(false);
        btnCasillaPentonvilleRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaPentonvilleRdActionPerformed(evt);
            }
        });

        btnCasillaEustonRd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaEustonRd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/celeste.png"))); // NOI18N
        btnCasillaEustonRd.setBorder(null);
        btnCasillaEustonRd.setBorderPainted(false);
        btnCasillaEustonRd.setContentAreaFilled(false);
        btnCasillaEustonRd.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaEustonRd.setEnabled(false);
        btnCasillaEustonRd.setFocusPainted(false);
        btnCasillaEustonRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaEustonRdActionPerformed(evt);
            }
        });

        btnCasillaTheAngel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaTheAngel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/celeste.png"))); // NOI18N
        btnCasillaTheAngel.setBorder(null);
        btnCasillaTheAngel.setBorderPainted(false);
        btnCasillaTheAngel.setContentAreaFilled(false);
        btnCasillaTheAngel.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaTheAngel.setEnabled(false);
        btnCasillaTheAngel.setFocusPainted(false);
        btnCasillaTheAngel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaTheAngelActionPerformed(evt);
            }
        });

        btnCasillaParkLane.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaParkLane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul.png"))); // NOI18N
        btnCasillaParkLane.setBorder(null);
        btnCasillaParkLane.setBorderPainted(false);
        btnCasillaParkLane.setContentAreaFilled(false);
        btnCasillaParkLane.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaParkLane.setEnabled(false);
        btnCasillaParkLane.setFocusPainted(false);
        btnCasillaParkLane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaParkLaneActionPerformed(evt);
            }
        });

        btnFerrocarrilFS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFerrocarrilFS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarril.png"))); // NOI18N
        btnFerrocarrilFS.setBorder(null);
        btnFerrocarrilFS.setBorderPainted(false);
        btnFerrocarrilFS.setContentAreaFilled(false);
        btnFerrocarrilFS.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarrilDisabled.png"))); // NOI18N
        btnFerrocarrilFS.setEnabled(false);
        btnFerrocarrilFS.setFocusPainted(false);
        btnFerrocarrilFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerrocarrilFSActionPerformed(evt);
            }
        });

        btnFerrocarrilLS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFerrocarrilLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarril.png"))); // NOI18N
        btnFerrocarrilLS.setBorder(null);
        btnFerrocarrilLS.setBorderPainted(false);
        btnFerrocarrilLS.setContentAreaFilled(false);
        btnFerrocarrilLS.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarrilDisabled.png"))); // NOI18N
        btnFerrocarrilLS.setEnabled(false);
        btnFerrocarrilLS.setFocusPainted(false);
        btnFerrocarrilLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerrocarrilLSActionPerformed(evt);
            }
        });

        btnCasillaElectricidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaElectricidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bombillo.png"))); // NOI18N
        btnCasillaElectricidad.setBorder(null);
        btnCasillaElectricidad.setBorderPainted(false);
        btnCasillaElectricidad.setContentAreaFilled(false);
        btnCasillaElectricidad.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/electricidadDisabled.png"))); // NOI18N
        btnCasillaElectricidad.setEnabled(false);
        btnCasillaElectricidad.setFocusPainted(false);
        btnCasillaElectricidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaElectricidadActionPerformed(evt);
            }
        });

        btnCasillaWhiteChapelRd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaWhiteChapelRd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cafe.png"))); // NOI18N
        btnCasillaWhiteChapelRd.setBorder(null);
        btnCasillaWhiteChapelRd.setBorderPainted(false);
        btnCasillaWhiteChapelRd.setContentAreaFilled(false);
        btnCasillaWhiteChapelRd.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaWhiteChapelRd.setEnabled(false);
        btnCasillaWhiteChapelRd.setFocusPainted(false);
        btnCasillaWhiteChapelRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaWhiteChapelRdActionPerformed(evt);
            }
        });

        btnCasillaMayfair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaMayfair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/azul.png"))); // NOI18N
        btnCasillaMayfair.setBorder(null);
        btnCasillaMayfair.setBorderPainted(false);
        btnCasillaMayfair.setContentAreaFilled(false);
        btnCasillaMayfair.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaMayfair.setEnabled(false);
        btnCasillaMayfair.setFocusPainted(false);
        btnCasillaMayfair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaMayfairActionPerformed(evt);
            }
        });

        btnFerrocarrilMS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFerrocarrilMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarril.png"))); // NOI18N
        btnFerrocarrilMS.setBorder(null);
        btnFerrocarrilMS.setBorderPainted(false);
        btnFerrocarrilMS.setContentAreaFilled(false);
        btnFerrocarrilMS.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarrilDisabled.png"))); // NOI18N
        btnFerrocarrilMS.setEnabled(false);
        btnFerrocarrilMS.setFocusPainted(false);
        btnFerrocarrilMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerrocarrilMSActionPerformed(evt);
            }
        });

        btnFerrocarrilKC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFerrocarrilKC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarril.png"))); // NOI18N
        btnFerrocarrilKC.setBorder(null);
        btnFerrocarrilKC.setBorderPainted(false);
        btnFerrocarrilKC.setContentAreaFilled(false);
        btnFerrocarrilKC.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ferrocarrilDisabled.png"))); // NOI18N
        btnFerrocarrilKC.setEnabled(false);
        btnFerrocarrilKC.setFocusPainted(false);
        btnFerrocarrilKC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerrocarrilKCActionPerformed(evt);
            }
        });

        btnCasillaAgua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agua.png"))); // NOI18N
        btnCasillaAgua.setBorder(null);
        btnCasillaAgua.setBorderPainted(false);
        btnCasillaAgua.setContentAreaFilled(false);
        btnCasillaAgua.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aguaDisabled.png"))); // NOI18N
        btnCasillaAgua.setEnabled(false);
        btnCasillaAgua.setFocusPainted(false);
        btnCasillaAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaAguaActionPerformed(evt);
            }
        });

        btnCasillaOldKentRd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCasillaOldKentRd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cafe.png"))); // NOI18N
        btnCasillaOldKentRd.setBorder(null);
        btnCasillaOldKentRd.setBorderPainted(false);
        btnCasillaOldKentRd.setContentAreaFilled(false);
        btnCasillaOldKentRd.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/casillaDisabled.png"))); // NOI18N
        btnCasillaOldKentRd.setEnabled(false);
        btnCasillaOldKentRd.setFocusPainted(false);
        btnCasillaOldKentRd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasillaOldKentRdActionPerformed(evt);
            }
        });

        btnEdificaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEdificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnCasas.png"))); // NOI18N
        btnEdificaciones.setBorder(null);
        btnEdificaciones.setBorderPainted(false);
        btnEdificaciones.setContentAreaFilled(false);
        btnEdificaciones.setFocusPainted(false);
        btnEdificaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnCasasPressed.png"))); // NOI18N
        btnEdificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdificacionesActionPerformed(evt);
            }
        });

        lblHoteles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHoteles.setForeground(new java.awt.Color(204, 0, 0));
        lblHoteles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoteles.setText("0");

        lblCasas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCasas.setForeground(new java.awt.Color(0, 153, 0));
        lblCasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCasas.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelTitulo2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCasillaPallMall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaBowSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaBondSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaPentonvilleRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaEustonRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaTheAngel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnCasillaWhitehall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaMarlborough, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaOxfordSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaLeicesterSq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaCoventrySt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaPicadilly, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btnCasillaNorthumrldAv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaVineSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaRegentSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaStrand, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaFleetSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCasillaTrafalgarSq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCasillaMayfair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFerrocarrilMS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFerrocarrilKC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCasillaParkLane, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFerrocarrilFS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFerrocarrilLS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaElectricidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCasillaWhiteChapelRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCasillaOldKentRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEdificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCasillaVineSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaRegentSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaStrand, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaFleetSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaTrafalgarSq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaNorthumrldAv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCasillaWhitehall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaMarlborough, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaOxfordSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaLeicesterSq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaCoventrySt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaPicadilly, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCasillaParkLane, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFerrocarrilFS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFerrocarrilLS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaElectricidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCasillaMayfair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFerrocarrilMS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFerrocarrilKC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCasillaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCasillaPallMall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaBowSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaBondSt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaPentonvilleRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaEustonRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaTheAngel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaWhiteChapelRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCasillaOldKentRd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEdificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoteles)
                            .addComponent(lblCasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57))))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        txaHistorial.setColumns(20);
        txaHistorial.setRows(5);
        txaHistorial.setText("fsdg\nfgfdg\n\n\nfgfdg\nfdgdfg\nfg\n");
        txaHistorial.setEnabled(false);
        jScrollPane2.setViewportView(txaHistorial);

        labelTitulo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo3.setForeground(new java.awt.Color(51, 51, 51));
        labelTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitulo3.setText("HISTORIAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(labelTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        txaChat.setColumns(20);
        txaChat.setRows(5);
        txaChat.setText("prueba\nprueba\nprueba\npruebaprueba\npruebaprueba\npruebaprueba\npruebaprueba\nprueba");
        txaChat.setEnabled(false);
        jScrollPane1.setViewportView(txaChat);

        txfEscribirChat.setText("Escriba aquí...");
        txfEscribirChat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfEscribirChatFocusLost(evt);
            }
        });
        txfEscribirChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfEscribirChatMouseClicked(evt);
            }
        });
        txfEscribirChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEscribirChatActionPerformed(evt);
            }
        });

        btnEnviarMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnEnviar.png"))); // NOI18N
        btnEnviarMensaje.setBorder(null);
        btnEnviarMensaje.setBorderPainted(false);
        btnEnviarMensaje.setContentAreaFilled(false);
        btnEnviarMensaje.setFocusPainted(false);
        btnEnviarMensaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnEnviarPressed.png"))); // NOI18N
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txfEscribirChat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnviarMensaje)
                    .addComponent(txfEscribirChat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(830, 0, 680, 831);

        jPanel7.setPreferredSize(new java.awt.Dimension(830, 830));
        jPanel7.setLayout(null);

        lblFondoMonopoly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/board2.jpg"))); // NOI18N
        jPanel7.add(lblFondoMonopoly);
        lblFondoMonopoly.setBounds(0, 0, 830, 830);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 830, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    private void btnEdificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEdificacionesActionPerformed

    private void btnCasillaOldKentRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaOldKentRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaOldKentRdActionPerformed

    private void btnCasillaAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaAguaActionPerformed

    private void btnFerrocarrilKCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerrocarrilKCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFerrocarrilKCActionPerformed

    private void btnFerrocarrilMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerrocarrilMSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFerrocarrilMSActionPerformed

    private void btnCasillaMayfairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaMayfairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaMayfairActionPerformed

    private void btnCasillaWhiteChapelRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaWhiteChapelRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaWhiteChapelRdActionPerformed

    private void btnCasillaElectricidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaElectricidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaElectricidadActionPerformed

    private void btnFerrocarrilLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerrocarrilLSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFerrocarrilLSActionPerformed

    private void btnFerrocarrilFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerrocarrilFSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFerrocarrilFSActionPerformed

    private void btnCasillaParkLaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaParkLaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaParkLaneActionPerformed

    private void btnCasillaTheAngelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaTheAngelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaTheAngelActionPerformed

    private void btnCasillaEustonRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaEustonRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaEustonRdActionPerformed

    private void btnCasillaPentonvilleRdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaPentonvilleRdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaPentonvilleRdActionPerformed

    private void btnCasillaBondStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaBondStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaBondStActionPerformed

    private void btnCasillaBowStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaBowStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaBowStActionPerformed

    private void btnCasillaPallMallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaPallMallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaPallMallActionPerformed

    private void btnCasillaPicadillyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaPicadillyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaPicadillyActionPerformed

    private void btnCasillaCoventryStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaCoventryStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaCoventryStActionPerformed

    private void btnCasillaLeicesterSqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaLeicesterSqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaLeicesterSqActionPerformed

    private void btnCasillaOxfordStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaOxfordStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaOxfordStActionPerformed

    private void btnCasillaMarlboroughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaMarlboroughActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaMarlboroughActionPerformed

    private void btnCasillaWhitehallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaWhitehallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaWhitehallActionPerformed

    private void btnCasillaTrafalgarSqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaTrafalgarSqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaTrafalgarSqActionPerformed

    private void btnCasillaFleetStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaFleetStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaFleetStActionPerformed

    private void btnCasillaStrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaStrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaStrandActionPerformed

    private void btnCasillaRegentStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaRegentStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaRegentStActionPerformed

    private void btnCasillaVineStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaVineStActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaVineStActionPerformed

    private void btnCasillaNorthumrldAvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasillaNorthumrldAvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCasillaNorthumrldAvActionPerformed

    private void btnMoverFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMoverFichaActionPerformed

    private void btnLanzarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLanzarDadosActionPerformed

    private void txfEscribirChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEscribirChatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEscribirChatActionPerformed

    private void txfEscribirChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfEscribirChatMouseClicked
        txfEscribirChat.setText("");
    }//GEN-LAST:event_txfEscribirChatMouseClicked

    private void txfEscribirChatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfEscribirChatFocusLost
        txfEscribirChat.setText("Escriba aquí...");
    }//GEN-LAST:event_txfEscribirChatFocusLost

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
            java.util.logging.Logger.getLogger(PantallaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasillaAgua;
    private javax.swing.JButton btnCasillaBondSt;
    private javax.swing.JButton btnCasillaBowSt;
    private javax.swing.JButton btnCasillaCoventrySt;
    private javax.swing.JButton btnCasillaElectricidad;
    private javax.swing.JButton btnCasillaEustonRd;
    private javax.swing.JButton btnCasillaFleetSt;
    private javax.swing.JButton btnCasillaLeicesterSq;
    private javax.swing.JButton btnCasillaMarlborough;
    private javax.swing.JButton btnCasillaMayfair;
    private javax.swing.JButton btnCasillaNorthumrldAv;
    private javax.swing.JButton btnCasillaOldKentRd;
    private javax.swing.JButton btnCasillaOxfordSt;
    private javax.swing.JButton btnCasillaPallMall;
    private javax.swing.JButton btnCasillaParkLane;
    private javax.swing.JButton btnCasillaPentonvilleRd;
    private javax.swing.JButton btnCasillaPicadilly;
    private javax.swing.JButton btnCasillaRegentSt;
    private javax.swing.JButton btnCasillaStrand;
    private javax.swing.JButton btnCasillaTheAngel;
    private javax.swing.JButton btnCasillaTrafalgarSq;
    private javax.swing.JButton btnCasillaVineSt;
    private javax.swing.JButton btnCasillaWhiteChapelRd;
    private javax.swing.JButton btnCasillaWhitehall;
    private javax.swing.JButton btnEdificaciones;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JButton btnFerrocarrilFS;
    private javax.swing.JButton btnFerrocarrilKC;
    private javax.swing.JButton btnFerrocarrilLS;
    private javax.swing.JButton btnFerrocarrilMS;
    private javax.swing.JButton btnLanzarDados;
    private javax.swing.JButton btnMoverFicha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel lblCantidadDinero;
    private javax.swing.JLabel lblCasas;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblFicha;
    private javax.swing.JLabel lblFondoMonopoly;
    private javax.swing.JLabel lblHoteles;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextArea txaChat;
    private javax.swing.JTextArea txaHistorial;
    private javax.swing.JTextField txfEscribirChat;
    // End of variables declaration//GEN-END:variables
}

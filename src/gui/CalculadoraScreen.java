
package gui;

import com.sun.glass.ui.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CalculadoraScreen extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public CalculadoraScreen() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPantalla = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnMode = new javax.swing.JButton();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        panelTeclado = new javax.swing.JPanel();
        btnResult = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnCe = new javax.swing.JButton();
        btnPorc = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPantalla.setBackground(new java.awt.Color(244, 253, 251));
        panelPantalla.setMinimumSize(new java.awt.Dimension(340, 140));
        panelPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(51, 51, 51));
        txtOperacion.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPantalla.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 308, 39));

        txtResultado.setBackground(new java.awt.Color(51, 51, 51));
        txtResultado.setFont(new java.awt.Font("Yu Gothic", 1, 53)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        panelPantalla.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 308, 70));

        btnMode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnDarkMode1.png"))); // NOI18N
        btnMode.setBorder(null);
        btnMode.setBorderPainted(false);
        btnMode.setContentAreaFilled(false);
        btnMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeActionPerformed(evt);
            }
        });
        panelPantalla.add(btnMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 60, 30));

        btnMinimize.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 204, 0));
        btnMinimize.setText("•");
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });
        panelPantalla.add(btnMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 20));

        btnClose.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 51, 0));
        btnClose.setText("•");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        panelPantalla.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 20));

        getContentPane().add(panelPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 140));

        panelTeclado.setBackground(new java.awt.Color(255, 255, 255));
        panelTeclado.setMinimumSize(new java.awt.Dimension(340, 390));
        panelTeclado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResult.setBackground(new java.awt.Color(255, 255, 255));
        btnResult.setFont(new java.awt.Font("Tempus Sans ITC", 1, 33)); // NOI18N
        btnResult.setForeground(new java.awt.Color(255, 255, 255));
        btnResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btnResult.setText("=");
        btnResult.setBorder(null);
        btnResult.setBorderPainted(false);
        btnResult.setContentAreaFilled(false);
        btnResult.setDefaultCapable(false);
        btnResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btnResult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3_pressed.png"))); // NOI18N
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        panelTeclado.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 50, 50));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(55, 62, 71));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setDefaultCapable(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 50, 50));

        btnCe.setBackground(new java.awt.Color(255, 255, 255));
        btnCe.setFont(new java.awt.Font("Yu Gothic Light", 1, 20)); // NOI18N
        btnCe.setForeground(new java.awt.Color(55, 62, 71));
        btnCe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnCe.setText("CE");
        btnCe.setBorder(null);
        btnCe.setBorderPainted(false);
        btnCe.setContentAreaFilled(false);
        btnCe.setDefaultCapable(false);
        btnCe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnCe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });
        panelTeclado.add(btnCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 50, 50));

        btnPorc.setBackground(new java.awt.Color(255, 255, 255));
        btnPorc.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnPorc.setForeground(new java.awt.Color(55, 62, 71));
        btnPorc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnPorc.setText("%");
        btnPorc.setBorder(null);
        btnPorc.setBorderPainted(false);
        btnPorc.setContentAreaFilled(false);
        btnPorc.setDefaultCapable(false);
        btnPorc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPorc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnPorc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcActionPerformed(evt);
            }
        });
        panelTeclado.add(btnPorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 50));

        btnDiv.setBackground(new java.awt.Color(255, 255, 255));
        btnDiv.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnDiv.setForeground(new java.awt.Color(55, 62, 71));
        btnDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDiv.setText("÷");
        btnDiv.setBorder(null);
        btnDiv.setBorderPainted(false);
        btnDiv.setContentAreaFilled(false);
        btnDiv.setDefaultCapable(false);
        btnDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDiv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        panelTeclado.add(btnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 50, 50));

        btnMulti.setBackground(new java.awt.Color(255, 255, 255));
        btnMulti.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnMulti.setForeground(new java.awt.Color(55, 62, 71));
        btnMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMulti.setText("x");
        btnMulti.setBorder(null);
        btnMulti.setBorderPainted(false);
        btnMulti.setContentAreaFilled(false);
        btnMulti.setDefaultCapable(false);
        btnMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        panelTeclado.add(btnMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 50));

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(55, 62, 71));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnResta.setText("-");
        btnResta.setBorder(null);
        btnResta.setBorderPainted(false);
        btnResta.setContentAreaFilled(false);
        btnResta.setDefaultCapable(false);
        btnResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        panelTeclado.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 50, 50));

        btnSum.setBackground(new java.awt.Color(255, 255, 255));
        btnSum.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnSum.setForeground(new java.awt.Color(55, 62, 71));
        btnSum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSum.setText("+");
        btnSum.setBorder(null);
        btnSum.setBorderPainted(false);
        btnSum.setContentAreaFilled(false);
        btnSum.setDefaultCapable(false);
        btnSum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });
        panelTeclado.add(btnSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 50, 50));

        btnC.setBackground(new java.awt.Color(255, 255, 255));
        btnC.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(55, 62, 71));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setDefaultCapable(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        panelTeclado.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 50));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(55, 62, 71));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setDefaultCapable(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 50));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(55, 62, 71));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setDefaultCapable(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, 50));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(55, 62, 71));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setDefaultCapable(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 50, 50));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(55, 62, 71));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setDefaultCapable(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 50, 50));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(55, 62, 71));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setDefaultCapable(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 50, 50));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(55, 62, 71));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setDefaultCapable(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 50, 50));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(55, 62, 71));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setDefaultCapable(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 50, 50));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(55, 62, 71));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setDefaultCapable(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        panelTeclado.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 50));

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(55, 62, 71));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setDefaultCapable(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn0KeyTyped(evt);
            }
        });
        panelTeclado.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 50));

        btnDot.setBackground(new java.awt.Color(255, 255, 255));
        btnDot.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        btnDot.setForeground(new java.awt.Color(55, 62, 71));
        btnDot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnDot.setText(".");
        btnDot.setBorder(null);
        btnDot.setBorderPainted(false);
        btnDot.setContentAreaFilled(false);
        btnDot.setDefaultCapable(false);
        btnDot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        panelTeclado.add(btnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 50, 50));

        getContentPane().add(panelTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        int len = txtOperacion.getText().length();
                
        if( len > 0 ){
            String texto = txtOperacion.getText().substring(0,len-1);
            txtOperacion.setText(texto);
            txtResultado.setText(texto);
        }
    }//GEN-LAST:event_btnCeActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
       addNumber("/");       
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        try {
           String resultado = se.eval(txtOperacion.getText()).toString();
           txtResultado.setText(resultado);
           txtResultado.setFont(new java.awt.Font("Yu Gothic", 1, 53));
        } catch (ScriptException ex) {
           
           txtResultado.setFont(new java.awt.Font("Yu Gothic", 1, 20));
           txtResultado.setText("Syntax Error");
           
        }
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       addNumber("7");
       btnResult.doClick();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumber("8");
        btnResult.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumber("9");
        btnResult.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumber("4");
        btnResult.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumber("5");
        btnResult.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumber("6");
        btnResult.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumber("1");
        btnResult.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumber("2");
        btnResult.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumber("3");
        btnResult.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addNumber("0");
        btnResult.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcActionPerformed
        addNumber("%");        
    }//GEN-LAST:event_btnPorcActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        addNumber("*");        
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        addNumber("-");        
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        addNumber("+");        
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        addNumber(".");        
    }//GEN-LAST:event_btnDotActionPerformed
    boolean darkMode = false;
    private void btnModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeActionPerformed
        if(!darkMode){
                    //cambiamos el color de los fondos
        panelPantalla.setBackground(Color.decode("#212b41"));
        panelTeclado.setBackground(Color.decode("#2e3951"));
        txtOperacion.setForeground(Color.decode("#18d4a3"));
        txtResultado.setForeground(Color.decode("#18d4a3"));
        btnResult.setForeground(Color.decode("#2e3951"));
        btnMode.setIcon(new ImageIcon(getClass().getResource("/images/btnDarkMode2.png")));
        //cambiamos los estilos de los dos tipos de botones.
     
        //btn1
        changeStyleBtn1(btn0);
        changeStyleBtn1(btn1);
        changeStyleBtn1(btn2);
        changeStyleBtn1(btn3);
        changeStyleBtn1(btn4);
        changeStyleBtn1(btn5);
        changeStyleBtn1(btn6);
        changeStyleBtn1(btn7);
        changeStyleBtn1(btn8);
        changeStyleBtn1(btn9);
        changeStyleBtn1(btn0);
        changeStyleBtn1(btnDot);
        
        //btn2
        changeStyleBtn2(btnC);
        changeStyleBtn2(btnCe);
        changeStyleBtn2(btnDiv);
        changeStyleBtn2(btnPorc);
        changeStyleBtn2(btnMulti);
        changeStyleBtn2(btnResta);
        changeStyleBtn2(btnSum);
        
        darkMode = true;
        }
        else{
            CalculadoraScreen frame = new CalculadoraScreen();
            this.dispose();
            frame.setVisible(true);
            
        }
    }//GEN-LAST:event_btnModeActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
       this.dispose();       
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        this.setState(Frame.ICONIFIED);        
    }//GEN-LAST:event_btnMinimizeMouseClicked

    private void btn0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn0KeyTyped
        
    }//GEN-LAST:event_btn0KeyTyped

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
            java.util.logging.Logger.getLogger(CalculadoraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraScreen().setVisible(true);
            }
        });
    }

    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    
    public void changeStyleBtn1(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2_pressed_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }
    
    public void changeStyleBtn2(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2_pressed_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setForeground(Color.decode("#18d4a3"));
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCe;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JButton btnMode;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPorc;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSum;
    private javax.swing.JPanel panelPantalla;
    private javax.swing.JPanel panelTeclado;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}

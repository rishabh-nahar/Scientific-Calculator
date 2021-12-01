package scientific_cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class SCalcu {
    public static void main(String srgs[]) {
        Sc_Calculator obj = new Sc_Calculator();
        obj.setVisible(true);
        obj.setSize(400, 400);
        obj.setTitle("Scientific Calculator");
        obj.setResizable(false);
    }
}

class Sc_Calculator extends JFrame implements ActionListener {

    // Initializion of JFrame Components
    // text areas
    JTextField calculationArea, calcDispArea;
    // Numbers dot exp clear and clear
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bpi, bexp, bdot, bclear, ballclear;

    // arithematic
    JButton bplus, bsubtract, bmul, bdiv, bequal, bmod;
    // algebric and log
    JButton blog, bln, bfactorial, bxraisey, byrootx, bxinverse, bleftparenthesis, brightparenthesis, trialButton;
    // Trigonometry
    JButton bsin, bcos, btan, bsininv, bcosinv, btaninv;
    // panels
    JPanel mainPanel, bttnPanel, calculationPanel, radioButtonPanel;
    // Radio button - degree and radian
    JRadioButton r1, r2;
    // colors
    String light = "#ffffff", dark = "#00000", bttn_panel_bg = "#f2f2f2", light_grey = "#dddddc";

    public Sc_Calculator() {

        String NumberColor_bg = light, Number_foreground = dark;
        String ArithematicColor_bg = "#dddddc", Arhithmatic_foreground = "#000000";
        String TrigoColor_bg = "#dddddc", Trigo_foreground = "#000000";
        String ACcolor_bg = "#800000", AC_foreground = light;
        String equalToColor_bg = "#9d4e09", equalTo_foreground = light;
        String instColor_bg = "#ffffff";
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creating Panels
        calculationPanel = new JPanel();
        calculationPanel = new JPanel();
        bttnPanel = new JPanel();
        mainPanel = new JPanel();

        // Panel Layouts
        mainPanel.setLayout(new BorderLayout());
        bttnPanel.setLayout(new GridBagLayout());
        calculationPanel.setLayout(new GridBagLayout());

        add(mainPanel);
        mainPanel.add(calculationPanel, BorderLayout.NORTH);
        mainPanel.add(bttnPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.9;
        gbc.weighty = 0.9;

        bttnPanel.setBackground(Color.decode(bttn_panel_bg));
        // Creating components

        calcDispArea = new JTextField("", 2);
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        calculationPanel.add(calcDispArea, gbc);
        calcDispArea.setBackground(Color.decode("#ffffff"));
        calcDispArea.setFont(new Font("Serif", Font.PLAIN, 30));

        radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridBagLayout());
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        calculationPanel.add(radioButtonPanel, gbc);

        // Radio buttons

        ButtonGroup bg = new ButtonGroup();
        r1 = new JRadioButton();
        r1.setText("Radian");
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bg.add(r1);
        radioButtonPanel.add(r1, gbc);

        r2 = new JRadioButton();
        r2.setText("Degree");
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bg.add(r2);
        radioButtonPanel.add(r2, gbc);

        instruction = new JLabel("Quadratic Equation");
        gbc.gridy = 0;
        gbc.gridx = 3;
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        radioButtonPanel.add(instruction, gbc);
        instruction.setHorizontalAlignment(SwingConstants.RIGHT);

        trialButton = new JButton("\u263E");
        gbc.gridy = 0;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bg.add(trialButton);
        radioButtonPanel.add(trialButton, gbc);
        trialButton.setBorder(null);
        trialButton.setPreferredSize(new Dimension(20, 40));
        trialButton.setBackground(Color.decode(light));
        trialButton.setFocusPainted(false);

        // background color for radiobutton panel
        r1.setBackground(Color.decode(instColor_bg));
        r2.setBackground(Color.decode(instColor_bg));
        radioButtonPanel.setBackground(Color.decode(instColor_bg));

        // // CalculationArea and calculation display area

        // calculationArea.setPreferredSize(new Dimension(50, 50));
        // calculationArea.setHorizontalAlignment(SwingConstants.RIGHT);
        calcDispArea.setHorizontalAlignment(SwingConstants.RIGHT);

        // calcDispArea.setHorizontalAlignment(SwingConstants.RIGHT);

        // //Component properties
        // calculationArea.setEditable(false);
        // calculationArea.setBorder(null);
        calcDispArea.setEditable(false);
        calcDispArea.setBorder(null);

        int top = 2;
        int left = 2;
        int bottom = 2;
        int right = 2;
        gbc.insets = new Insets(top, left, bottom, right);

        // Numbers
        b1 = new JButton("1");
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b1, gbc);
        b1.setBorder(null);
        b1.setForeground(Color.decode(Number_foreground));
        b1.setBackground(Color.decode(NumberColor_bg));

        // b1.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b1.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b1.setBackground(Color.decode("#98C2F7"));
        // }

        // });
        // b1.setBorder(new RoundBtn(15));
        // b1.setBounds(20, 50, 70, 100);

        b2 = new JButton("2");
        gbc.gridy = 0;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b2, gbc);
        b2.setBorder(null);
        b2.setForeground(Color.decode(Number_foreground));
        b2.setBackground(Color.decode(NumberColor_bg));
        // b2.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b2.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b2.setBackground(Color.decode("#98C2F7"));
        // }

        // });
        // b2.setBorder(new RoundBtn(15));
        // b2.setBounds(20, 50, 70, 100);

        b3 = new JButton("3");
        gbc.gridy = 0;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b3, gbc);
        b3.setBorder(null);
        b3.setForeground(Color.decode(Number_foreground));
        b3.setBackground(Color.decode(NumberColor_bg));
        // b3.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b3.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b3.setBackground(Color.decode("#98C2F7"));
        // }

        // });
        // b3.setBorder(new RoundBtn(15));
        // b3.setBounds(20, 50, 70, 100);

        b4 = new JButton("4");
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b4, gbc);
        b4.setBorder(null);
        b4.setForeground(Color.decode(Number_foreground));
        b4.setBackground(Color.decode(NumberColor_bg));
        // b4.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b4.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b4.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b4.setBorder(new RoundBtn(15));
        // b4.setBounds(20, 50, 70, 100);

        b5 = new JButton("5");
        gbc.gridy = 1;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b5, gbc);
        b5.setBorder(null);
        b5.setForeground(Color.decode(Number_foreground));
        b5.setBackground(Color.decode(NumberColor_bg));
        // b5.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b5.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b5.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b5.setBorder(new RoundBtn(15));
        // b5.setBounds(20, 50, 70, 100);

        b6 = new JButton("6");
        gbc.gridy = 1;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b6, gbc);
        b6.setBorder(null);
        b6.setForeground(Color.decode(Number_foreground));
        b6.setBackground(Color.decode(NumberColor_bg));
        // b6.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b6.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b6.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b6.setBorder(new RoundBtn(15));
        // b6.setBounds(20, 50, 70, 100);

        b7 = new JButton("7");
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b7, gbc);
        b7.setBorder(null);
        b7.setForeground(Color.decode(Number_foreground));
        b7.setBackground(Color.decode(NumberColor_bg));
        // b7.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b7.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b7.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b7.setBorder(new RoundBtn(15));
        // b7.setBounds(20, 50, 70, 100);

        b8 = new JButton("8");
        gbc.gridy = 2;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b8, gbc);
        b8.setBorder(null);
        b8.setForeground(Color.decode(Number_foreground));
        b8.setBackground(Color.decode(NumberColor_bg));
        // b8.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b8.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b8.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b8.setBorder(new RoundBtn(15));
        // b8.setBounds(20, 50, 70, 100);

        b9 = new JButton("9");
        gbc.gridy = 2;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b9, gbc);
        b9.setBorder(null);
        b9.setForeground(Color.decode(Number_foreground));
        b9.setBackground(Color.decode(NumberColor_bg));
        // b9.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b9.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b9.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b9.setBorder(new RoundBtn(15));
        // b9.setBounds(20, 50, 70, 100);

        b0 = new JButton("0");
        gbc.gridy = 3;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b0, gbc);
        b0.setBorder(null);
        b0.setForeground(Color.decode(Number_foreground));
        b0.setBackground(Color.decode(NumberColor_bg));
        // b0.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // b0.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // b0.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // b0.setBorder(new RoundBtn(15));
        // b0.setBounds(20, 50, 70, 100);

        // Dot, Clear and all clear
        bclear = new JButton("C");
        gbc.gridy = 3;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bclear, gbc);
        bclear.setBorder(null);
        bclear.setForeground(Color.decode(Number_foreground));
        bclear.setBackground(Color.decode(NumberColor_bg));
        // bclear.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bclear.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bclear.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bclear.setBorder(new RoundBtn(15));
        // bclear.setBounds(20, 50, 70, 100);

        ballclear = new JButton("AC");
        gbc.gridy = 5;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(ballclear, gbc);
        ballclear.setBorder(null);
        ballclear.setForeground(Color.decode(AC_foreground));
        ballclear.setBackground(Color.decode(ACcolor_bg));
        // ballclear.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // ballclear.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // ballclear.setBackground(Color.decode("#225b79"));
        // }
        // });
        // ballclear.setBorder(new RoundBtn(15));
        // ballclear.setBounds(20, 50, 70, 100);

        bdot = new JButton(".");
        gbc.gridy = 3;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bdot, gbc);
        bdot.setBorder(null);
        bdot.setForeground(Color.decode(Number_foreground));
        bdot.setBackground(Color.decode(NumberColor_bg));
        // bdot.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bdot.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bdot.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bdot.setBorder(new RoundBtn(15));
        // bdot.setBounds(20, 50, 70, 100);

        // Pi and Exponential
        bpi = new JButton("\u03C0");
        gbc.gridy = 4;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bpi, gbc);
        bpi.setBorder(null);
        bpi.setForeground(Color.decode(Number_foreground));
        bpi.setBackground(Color.decode(NumberColor_bg));
        // bpi.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bpi.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bpi.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bpi.setBorder(new RoundBtn(15));
        // bpi.setBounds(20, 50, 70, 100);

        bexp = new JButton("e");
        gbc.gridy = 4;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bexp, gbc);
        bexp.setBorder(null);
        bexp.setForeground(Color.decode(Number_foreground));
        bexp.setBackground(Color.decode(NumberColor_bg));
        // bexp.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bexp.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bexp.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bexp.setBorder(new RoundBtn(15));
        // bexp.setBounds(20, 50, 70, 100);

        // Equal to
        bequal = new JButton("=");
        gbc.gridy = 5;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        bttnPanel.add(bequal, gbc);
        bequal.setBorder(null);
        bequal.setForeground(Color.decode(equalTo_foreground));
        bequal.setBackground(Color.decode(equalToColor_bg));
        // bequal.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bequal.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bequal.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bequal.setBorder(new RoundBtn(15));
        // bequal.setBounds(20, 50, 70, 100);

        // Arithematic
        bplus = new JButton("+");
        gbc.gridy = 0;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bplus, gbc);
        bplus.setBorder(null);
        bplus.setForeground(Color.decode(Arhithmatic_foreground));
        bplus.setBackground(Color.decode(ArithematicColor_bg));
        // bplus.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bplus.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bplus.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bplus.setBorder(new RoundBtn(15));
        // bplus.setBounds(20, 50, 70, 100);
        bsubtract = new JButton("-");
        gbc.gridy = 1;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bsubtract, gbc);
        bsubtract.setBorder(null);
        bsubtract.setForeground(Color.decode(Arhithmatic_foreground));
        bsubtract.setBackground(Color.decode(ArithematicColor_bg));
        // bsubtract.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bsubtract.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bsubtract.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bsubtract.setBorder(new RoundBtn(15));
        // bsubtract.setBounds(20, 50, 70, 100);

        bmul = new JButton("\u2715");
        gbc.gridy = 2;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bmul, gbc);
        bmul.setBorder(null);
        bmul.setForeground(Color.decode(Arhithmatic_foreground));
        bmul.setBackground(Color.decode(ArithematicColor_bg));
        // bmul.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bmul.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bmul.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bmul.setBorder(new RoundBtn(15));
        // bmul.setBounds(20, 50, 70, 100);

        bdiv = new JButton("\u002f");
        gbc.gridy = 3;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bdiv, gbc);
        bdiv.setBorder(null);
        bdiv.setForeground(Color.decode(Arhithmatic_foreground));
        bdiv.setBackground(Color.decode(ArithematicColor_bg));
        // bdiv.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bdiv.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bdiv.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bdiv.setBorder(new RoundBtn(15));
        // bdiv.setBounds(20, 50, 70, 100);

        bmod = new JButton("%");
        gbc.gridy = 4;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bmod, gbc);
        bmod.setBorder(null);
        bmod.setForeground(Color.decode(Arhithmatic_foreground));
        bmod.setBackground(Color.decode(ArithematicColor_bg));
        // bmod.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bmod.setBackground(Color.decode("#30336b"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bmod.setBackground(Color.decode("#142f44"));
        // }
        // });
        // // bmod.setBorder(new RoundBtn(15));
        // bmod.setBounds(20, 50, 70, 100);

        // Algebric
        bxraisey = new JButton("x\u02B8");
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bxraisey, gbc);
        bxraisey.setBorder(null);
        bxraisey.setForeground(Color.decode(Number_foreground));
        bxraisey.setBackground(Color.decode(NumberColor_bg));
        // bxraisey.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bxraisey.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bxraisey.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bxraisey.setBorder(new RoundBtn(15));
        // bxraisey.setBounds(20, 50, 70, 100);

        byrootx = new JButton("y\u221Ax");
        gbc.gridy = 5;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(byrootx, gbc);
        byrootx.setBorder(null);
        byrootx.setForeground(Color.decode(Number_foreground));
        byrootx.setBackground(Color.decode(NumberColor_bg));
        // byrootx.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // byrootx.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // byrootx.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // byrootx.setBorder(new RoundBtn(15));
        // byrootx.setBounds(20, 50, 70, 100);

        bfactorial = new JButton("x!");
        gbc.gridy = 5;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bfactorial, gbc);
        bfactorial.setBorder(null);
        bfactorial.setForeground(Color.decode(Number_foreground));
        bfactorial.setBackground(Color.decode(NumberColor_bg));
        // bfactorial.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bfactorial.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bfactorial.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bfactorial.setBorder(new RoundBtn(15));
        // bfactorial.setBounds(20, 50, 70, 100);

        bxinverse = new JButton("(\u0031\u002fx)");
        gbc.gridy = 4;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bxinverse, gbc);
        bxinverse.setBorder(null);
        bxinverse.setForeground(Color.decode(Number_foreground));
        bxinverse.setBackground(Color.decode(NumberColor_bg));
        // bxinverse.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bxinverse.setBackground(Color.decode("#c7ecee"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bxinverse.setBackground(Color.decode("#98C2F7"));
        // }
        // });
        // // bxinverse.setBorder(new RoundBtn(15));
        // bxinverse.setBounds(20, 50, 70, 100);

        // Trignometric
        bsin = new JButton("Sin");
        gbc.gridy = 0;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bsin, gbc);
        bsin.setBorder(null);
        bsin.setForeground(Color.decode(Trigo_foreground));
        bsin.setBackground(Color.decode(TrigoColor_bg));
        // bsin.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bsin.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bsin.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bsin.setBorder(new RoundBtn(15));
        // bsin.setBounds(20, 50, 70, 100);

        bcos = new JButton("Cos");
        gbc.gridy = 1;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bcos, gbc);
        bcos.setBorder(null);
        bcos.setForeground(Color.decode(Trigo_foreground));
        bcos.setBackground(Color.decode(TrigoColor_bg));
        // bcos.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bcos.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bcos.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bcos.setBorder(new RoundBtn(15));
        // bcos.setBounds(20, 50, 70, 100);

        btan = new JButton("Tan");
        gbc.gridy = 2;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(btan, gbc);
        btan.setBorder(null);
        btan.setForeground(Color.decode(Trigo_foreground));
        btan.setBackground(Color.decode(TrigoColor_bg));
        // btan.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // btan.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // btan.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // btan.setBorder(new RoundBtn(15));
        // btan.setBounds(20, 50, 70, 100);

        // Inverse Trignometric
        bsininv = new JButton("Sin\u207B\u00b9");
        gbc.gridy = 0;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bsininv, gbc);
        bsininv.setBorder(null);
        bsininv.setForeground(Color.decode(Trigo_foreground));
        bsininv.setBackground(Color.decode(TrigoColor_bg));
        // bsininv.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bsininv.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bsininv.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bsininv.setBorder(new RoundBtn(15));
        // bsininv.setBounds(20, 50, 70, 100);

        bcosinv = new JButton("Cos\u207B\u00b9");
        gbc.gridy = 1;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bcosinv, gbc);
        bcosinv.setBorder(null);
        bcosinv.setForeground(Color.decode(Trigo_foreground));
        bcosinv.setBackground(Color.decode(TrigoColor_bg));
        // bcosinv.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bcosinv.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bcosinv.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bcosinv.setBorder(new RoundBtn(15));
        // bcosinv.setBounds(20, 50, 70, 100);

        btaninv = new JButton("Tan\u207B\u00b9");
        gbc.gridy = 2;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(btaninv, gbc);
        btaninv.setBorder(null);
        btaninv.setForeground(Color.decode(Trigo_foreground));
        btaninv.setBackground(Color.decode(TrigoColor_bg));
        // btaninv.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // btaninv.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // btaninv.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // btaninv.setBorder(new RoundBtn(15));
        // btaninv.setBounds(20, 50, 70, 100);

        // Log & Natural Log
        blog = new JButton("log");
        gbc.gridy = 3;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(blog, gbc);
        blog.setBorder(null);
        blog.setForeground(Color.decode(Trigo_foreground));
        blog.setBackground(Color.decode(TrigoColor_bg));
        // blog.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // blog.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // blog.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // blog.setBorder(new RoundBtn(15));
        // blog.setBounds(20, 50, 70, 100);

        bln = new JButton("ln");
        gbc.gridy = 3;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bln, gbc);
        bln.setBorder(null);
        bln.setForeground(Color.decode(Trigo_foreground));
        bln.setBackground(Color.decode(TrigoColor_bg));
        // bln.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bln.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bln.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bln.setBorder(new RoundBtn(15));
        // bln.setBounds(20, 50, 70, 100);

        // Parenthesis
        brightparenthesis = new JButton("(");
        gbc.gridy = 4;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(brightparenthesis, gbc);
        brightparenthesis.setBorder(null);
        brightparenthesis.setForeground(Color.decode(Trigo_foreground));
        brightparenthesis.setBackground(Color.decode(TrigoColor_bg));
        // brightparenthesis.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // brightparenthesis.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // brightparenthesis.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // brightparenthesis.setBorder(new RoundBtn(15));
        // brightparenthesis.setBounds(20, 50, 70, 100);

        bleftparenthesis = new JButton(")");
        gbc.gridy = 4;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bleftparenthesis, gbc);
        bleftparenthesis.setBorder(null);
        bleftparenthesis.setForeground(Color.decode(Trigo_foreground));
        bleftparenthesis.setBackground(Color.decode(TrigoColor_bg));
        // bleftparenthesis.addMouseListener(new java.awt.event.MouseAdapter() {
        // public void mouseEntered(java.awt.event.MouseEvent evt) {
        // bleftparenthesis.setBackground(Color.decode("#218c74"));
        // }

        // public void mouseExited(java.awt.event.MouseEvent evt) {
        // bleftparenthesis.setBackground(Color.decode("#225b79"));
        // }
        // });
        // // bleftparenthesis.setBorder(new RoundBtn(15));
        // bleftparenthesis.setBounds(20, 50, 70, 100);

        // Making the complier perform an action on clicking the button
        // Numberrs

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        // Pi and exponential
        bpi.addActionListener(this);
        bexp.addActionListener(this);

        // Dot and parenthesis
        brightparenthesis.addActionListener(this);
        bleftparenthesis.addActionListener(this);
        bdot.addActionListener(this);

        // Arithematic
        bplus.addActionListener(this);
        bsubtract.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);

        // C, Ac, =
        ballclear.addActionListener(this);
        bclear.addActionListener(this);
        bequal.addActionListener(this);

        // Trignometric
        bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bsininv.addActionListener(this);
        bcosinv.addActionListener(this);
        btaninv.addActionListener(this);

        // Algebric
        bxraisey.addActionListener(this);
        byrootx.addActionListener(this);
        bfactorial.addActionListener(this);
        bxinverse.addActionListener(this);

        // Log and Natural log
        blog.addActionListener(this);
        bln.addActionListener(this);

        trialButton.addActionListener(this);
    }

    // Declaration of variables and arraylist
    ArrayList<String> bodmas_algo = new ArrayList<String>();
    ArrayList<String> main_array = new ArrayList<String>();
    ArrayList<String> start_main_array = new ArrayList<String>();

    // b0, b1, b2 , b3, b4, b5, b6, b7, b8, b9, bpi, bexp, bdot, bclear, ballclear
    ArrayList<JButton> general_buttons = new ArrayList<JButton>();
    ArrayList<JButton> trrigo_arith_log_buttons = new ArrayList<JButton>();
    ArrayList<JPanel> button_panels = new ArrayList<JPanel>();

    JLabel instruction;
    boolean number = false, operation = false, start = false, brack_end = false, negative = false, power = false,
            factorial_num = false,
            decimal = false, lastvalue_added = false, temp_bool, pow_inv = false, decimal_start = false,
            ans_inv = false, radian = false, constant = false;

    String value = "", DisplayEquation = "", last_value_string = "";
    double ans = 0.0, last_value = 0.0, prev_value = 0.0, temp_value = 0.0, pi_value = 22 / 7f;
    int first_brack = 0, last_brack = 0, ans_pos, i = 0, j = 0, k = 0, power_count = 0, trigo_sin = 0, temp_ans = 0,
            count_decimal_fig = 10;

    // Functions
    // Display
    void display_output(String ans) {
        // calculationArea.setText(ans);
    }

    // arithematic
    void division(Double a, Double b) {
        ans = a / b;
    }

    void multiplication(Double a, Double b) {
        ans = a * b;
    }

    void addition(Double a, Double b) {
        ans = a + b;
    }

    void subtract(Double a, Double b) {
        ans = a - b;
    }

    // Trigo and log
    void trigo(String func, Double x) {

        if (radian == true) {
        } else {
            x = Math.toRadians(x);
        }

        if (func == "Sin") {
            ans = Math.sin(x);
        } else if (func == "Cos") {
            ans = Math.cos(x);
        } else if (func == "Tan") {
            ans = Math.tan(x);
        }
    }

    void trigo_inv(String func, Double x) {
        if (func == "Sin\u207B\u00b9") {
            ans = Math.asin(x);
        } else if (func == "Cos\u207B\u00b9") {
            ans = Math.acos(x);
        } else if (func == "Tan\u207B\u00b9") {
            ans = Math.atan(x);
        }
        if (radian == true) {

        } else {
            ans = Math.toDegrees(ans);
        }
    }

    // Logarithemic
    void log_func(String x, Double y) {
        if (x == "ln") {
            ans = Math.log(y);
        } else if (x == "log") {
            ans = Math.log10(y);
        }
    }

    // Algebric
    void factorial(Double fact) {
        temp_ans = 1;
        for (i = 1; i <= fact; i++) {
            temp_ans = temp_ans * i;
        }
        ans = temp_ans;
        System.out.println(ans);
    }

    void order(Double x, Double y) {
        ans = Math.pow(x, y);
    }

    // Percentage
    void percentage(Double per, Double val) {
        ans = val * per / 100;
    }

    // Clear and All Clear
    void allClear() {
        display_output("");
        // calculationArea.setText("");
        DisplayEquation = "";
        last_value_string = "";

        value = "";
        number = false;
        operation = false;
        start = false;
        brack_end = false;
        negative = false;
        power = false;
        decimal = false;
        start = false;

        first_brack = 0;
        last_brack = 0;
        ans_pos = 0;
        i = 0;
        j = 0;
        k = 0;
        count_decimal_fig = 0;
        power_count = 0;
        trigo_sin = 0;

        ans = 0.0;
        last_value = 0.0;
        prev_value = 0.0;
        temp_value = 0.0;

        start_main_array.clear();
        main_array.clear();
    }

    void add_in_arraylist() {
        // general_buttons
        general_buttons.add(b0);
        general_buttons.add(b1);
        general_buttons.add(b2);
        general_buttons.add(b3);
        general_buttons.add(b4);
        general_buttons.add(b5);
        general_buttons.add(b6);
        general_buttons.add(b7);
        general_buttons.add(b8);
        general_buttons.add(b9);
        general_buttons.add(bpi);
        general_buttons.add(bexp);
        general_buttons.add(bdot);
        general_buttons.add(bxraisey);
        general_buttons.add(bxinverse);
        general_buttons.add(bfactorial);
        general_buttons.add(byrootx);
        general_buttons.add(bclear);

        // trigo,arithematic and log
        trrigo_arith_log_buttons.add(bplus);
        trrigo_arith_log_buttons.add(bsubtract);
        trrigo_arith_log_buttons.add(bmul);
        trrigo_arith_log_buttons.add(bdiv);
        trrigo_arith_log_buttons.add(bmod);

        trrigo_arith_log_buttons.add(blog);
        trrigo_arith_log_buttons.add(bln);

        trrigo_arith_log_buttons.add(bleftparenthesis);
        trrigo_arith_log_buttons.add(brightparenthesis);
        trrigo_arith_log_buttons.add(bsin);
        trrigo_arith_log_buttons.add(bcos);
        trrigo_arith_log_buttons.add(btan);
        trrigo_arith_log_buttons.add(bsininv);
        trrigo_arith_log_buttons.add(bcosinv);
        trrigo_arith_log_buttons.add(btaninv);

        // otherbutton
        button_panels.add(mainPanel);
        button_panels.add(bttnPanel);
        button_panels.add(calculationPanel);
    }

    String temp_col1, temp_col2, temp_col3, temp_bw , temp_equalto;
    String light_panel = "#f2f2f2", dark_panel = "#00000", light_button = "#ffffff", dark_button = "#343434",
            light_button2 = "#dddddc", dark_button2 = "#141d28", black = "#000000", white = "#ffffff",
            equalto_light = "#9d4e09",equalto_dark = "#4290dc";

    void toggle_color_mode() {

        //toggling from arraylist
        for (JButton x : general_buttons) {
            x.setForeground(Color.decode(white));
            x.setBackground(Color.decode(dark_button));
        }
        for (JButton y : trrigo_arith_log_buttons) {
        y.setForeground(Color.decode(white));
        y.setBackground(Color.decode(dark_button2));
        }
        for (JPanel z : button_panels) {
            z.setBackground(Color.decode(dark_panel));
        }

        //manual toggling for equalto, calculation display area, radio buttons, radiobutton panel & quadratic equation
        calcDispArea.setBackground(Color.decode(dark_button));
        radioButtonPanel.setBackground(Color.decode(dark_button));
        r1.setBackground(Color.decode(dark_button));
        r2.setBackground(Color.decode(dark_button));
        trialButton.setBackground(Color.decode(dark_button));
        instruction.setBackground(Color.decode(dark_button));
        bequal.setBackground(Color.decode(equalto_dark));

        calcDispArea.setForeground(Color.decode(white));
        radioButtonPanel.setForeground(Color.decode(white));
        r1.setForeground(Color.decode(white));
        r2.setForeground(Color.decode(white));
        trialButton.setForeground(Color.decode(white));
        instruction.setForeground(Color.decode(white));

        temp_bw = black;
        black = white;
        white = temp_bw;

        temp_col1 = light_panel;
        light_panel = dark_panel;
        dark_panel = temp_col1;

        temp_col2 = light_button;
        light_button = dark_button;
        dark_button = temp_col2;

        temp_col3 = light_button2;
        light_button2 = dark_button2;
        dark_button2 = temp_col3;

        temp_equalto = equalto_light;
        equalto_light = equalto_dark;
        equalto_dark = temp_equalto;

    }

    // To check if string is number
    boolean check_whole_String_isNum(String toCheck, boolean forClear) {
        System.out.println("String Length: " + (toCheck.length()));

        if (Character.isDigit(toCheck.charAt(toCheck.length() - 1)) || Character.isDigit(toCheck.charAt(0))) {
            temp_bool = true;
            temp_ans = (int) (Double.parseDouble(toCheck) / 10);
            if (forClear) {
                forClear();
            }
        } else {
            temp_bool = false;
        }

        return temp_bool;
    }

    void forClear() {
        if (temp_ans == 0) {
            temp_bool = false;
        }
    }

    void after_operations() {
        count_decimal_fig = 10;
        constant = false;
    }

    public void actionPerformed(ActionEvent e) {
        try {

            add_in_arraylist();

            value = e.getActionCommand();
            number = Character.isDigit(value.charAt(0));

            if (r1.isSelected()) {
                radian = true;
            } else {
                radian = false;
            }

            if (start == false) {
                main_array.add("(");
                start = true;
            }

            if (value == "\u263E") {
                trialButton.setText("\u263C");
                toggle_color_mode();
            } else if (value == "\u263C") {
                trialButton.setText("\u263E");
                toggle_color_mode();
            }

            if (number) {
                if (decimal) {
                    if (decimal_start) {
                        last_value_string = last_value_string + ".";
                        decimal_start = false;
                    }

                    last_value_string = last_value_string + value;
                    last_value = Double.parseDouble(last_value_string);

                    System.out.println("Count dec fig" + count_decimal_fig + "\nLastval:" + last_value);
                } else {
                    last_value_string = last_value_string + value;
                    if (negative == true) {
                        last_value_string = "-" + last_value_string;
                        negative = false;
                    }
                    last_value = Double.parseDouble(last_value_string);

                    System.out.println("dsdf: " + last_value);
                }

                DisplayEquation = DisplayEquation + value;
                lastvalue_added = false;

            } else {
                if (value == "+" || value == "\u2715" || value == "\u002f") {
                    after_operations();
                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        main_array.add(last_value + "");
                        lastvalue_added = true;
                    }
                    last_value = 0;
                    last_value_string = "";
                    main_array.add(value);
                    DisplayEquation = DisplayEquation + value;
                } else if (value == "-") {
                    after_operations();
                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value + "");
                        lastvalue_added = true;
                        brack_end = false;
                    }
                    main_array.add("+");
                    last_value = 0;
                    last_value_string = "";
                    negative = true;
                    DisplayEquation = DisplayEquation + value;
                } else if (value == "x\u02B8") {
                    after_operations();
                    decimal = false;
                    if (brack_end || power) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        main_array.add(last_value + "");
                        lastvalue_added = true;
                        brack_end = false;
                    }
                    power_count++;
                    main_array.add("pow");
                    main_array.add("(");
                    last_value = 0;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + "Power of (";
                } else if (value == "y\u221Ax") {
                    after_operations();

                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        main_array.add(last_value + "");
                        lastvalue_added = true;
                        brack_end = false;
                    }
                    pow_inv = true;
                    power_count++;
                    main_array.add("pow");
                    main_array.add("(");
                    last_value = 0;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + "Root of (";
                } else if (value == "x!") {
                    after_operations();
                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        main_array.add(last_value + "");
                        lastvalue_added = true;
                        brack_end = false;
                    }
                    factorial_num = true;
                    main_array.add("!");
                    DisplayEquation = DisplayEquation + "!";
                } else if (value == "(\u0031\u002fx)") {
                    after_operations();
                    ans_inv = true;
                    DisplayEquation = "1/(" + DisplayEquation + ")";
                } else if (value == "%") {
                    after_operations();
                    decimal = false;
                    DisplayEquation = DisplayEquation + "% of(";
                    main_array.add("" + last_value);
                    lastvalue_added = true;
                    last_value = 0;
                    last_value_string = "";
                    main_array.add("%");
                    main_array.add("(");
                } else if (value == "Sin" || value == "Cos" || value == "Tan") {

                    after_operations();
                    decimal = false;
                    instruction.setText("In Degree");
                    if (negative) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation + value + "(";
                } else if (value == "Sin\u207B\u00b9" || value == "Cos\u207B\u00b9" || value == "Tan\u207B\u00b9") {
                    after_operations();
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation + value + "(";
                } else if (value == "log" || value == "ln") {
                    after_operations();
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation + value + "(";
                } else if (value == "\u03C0") {
                    after_operations();
                    main_array.add(Math.PI + "");
                    DisplayEquation = DisplayEquation + "\u03C0";
                    constant = true;
                } else if (value == "e") {
                    after_operations();
                    main_array.add(Math.exp(1) + "");
                    DisplayEquation = DisplayEquation + "e";
                    constant = true;
                } else if (value == ".") {
                    decimal = true;
                    decimal_start = true;
                    DisplayEquation = DisplayEquation + ".";
                } else if (value == "(") {
                    if (negative) {
                        main_array.remove(main_array.get(main_array.size() - 1));
                        main_array.add("-");
                        main_array.add(value);
                        negative = false;
                    } else {
                        main_array.add(value);
                    }
                    DisplayEquation = DisplayEquation + value;
                } else if (value == ")") {
                    after_operations();
                    trigo_sin--;
                    if (main_array.get(main_array.size() - 1) == ")") {
                    } else {
                        main_array.add("" + last_value);
                        lastvalue_added = true;
                    }
                    if (trigo_sin == 0) {
                        instruction.setText("");
                    }
                    main_array.add(")");
                    brack_end = true;
                    last_value = 0;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + value;
                } else if (value == "AC") {
                    allClear();
                } else if (value == "C") {
                    if (main_array.size() > 1) {

                        if (lastvalue_added) {

                        } else {
                            main_array.add("" + last_value);
                            last_value = 0;
                            last_value_string = "";
                            lastvalue_added = true;
                        }

                        if (check_whole_String_isNum(main_array.get(main_array.size() - 1), true)) {
                            main_array.set(main_array.size() - 1, temp_ans + "");
                            temp_ans = 0;
                            System.out.println("displayed after:" + main_array);
                        } else {
                            main_array.remove(main_array.size() - 1);
                        }
                    }
                    StringBuffer sb = new StringBuffer(DisplayEquation);
                    sb.deleteCharAt(sb.length() - 1);
                    DisplayEquation = "" + sb;
                    System.out.println("Hello! " + DisplayEquation);
                } else if (value == "=") {
                    System.out.println("Start Main ArrayList = " + main_array + "\nsize: " + main_array.size() + "\n");
                    if (lastvalue_added) {
                    } else {
                        main_array.add("" + last_value);
                    }
                    main_array.add(")");

                    for (i = 0; i <= main_array.size() - 1; i++) {
                        start_main_array.add(main_array.get(i));
                    }
                    System.out.println("sma -->>" + start_main_array);
                    System.out.println("Start Main ArrayList = " + main_array + "\nsize: " + main_array.size() + "\n");
                    test: while (main_array.size() > 1) {
                        if (main_array.contains("(") && main_array.contains(")")) {

                            bodmas_algo.removeAll(bodmas_algo);

                            k = 0;
                            i = 0;
                            last_brack = 0;
                            first_brack = 0;

                            for (i = 0; i < main_array.size(); i++) {
                                if (main_array.get(i) == "(") {
                                    first_brack = i + 1;
                                }
                            }
                            // Search for first ")"
                            for (j = first_brack; j < main_array.size(); j++) {
                                if (main_array.get(j) == ")") {
                                    last_brack = j - 1;
                                    break;
                                }
                            }
                            for (k = first_brack; k <= last_brack; k++) {
                                bodmas_algo.add(main_array.get(k));
                            }
                            System.out.println("Bodmas_algo start loop:\nMain:" + main_array + "\tSize:"
                                    + main_array.size() + "\nAlgo:" + bodmas_algo + "\tSize:" + bodmas_algo.size());
                            if (first_brack == last_brack) {
                                main_array.remove(first_brack + 1);
                                main_array.remove(first_brack - 1);
                            } else {

                                for (k = 0; k < bodmas_algo.size() - 1; k++) {
                                    boolean check1, check2;
                                    check1 = check_whole_String_isNum(bodmas_algo.get(k), false);
                                    check2 = check_whole_String_isNum(bodmas_algo.get(k + 1), false);
                                    System.out.println("c1 " + check1 + " c2 " + check2);
                                    if (check2 == true && check1 == true) {
                                        multiplication(Double.parseDouble(bodmas_algo.get(k)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_special_mul(first_brack, last_brack, k);
                                        // System.out.println(ans);
                                    } else {
                                    }
                                }

                                for (k = bodmas_algo.size() - 1; k >= 0; k--) {
                                    if (bodmas_algo.get(k) == "%") {
                                        percentage(Double.parseDouble(bodmas_algo.get(k - 1)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_arith(first_brack, last_brack, k);
                                    }
                                    if (bodmas_algo.get(k) == "!") {
                                        factorial(Double.parseDouble(bodmas_algo.get(k - 1)));
                                        remove_fact(first_brack, last_brack, k);
                                    }
                                }
                                for (k = bodmas_algo.size() - 1; k >= 0; k--) {
                                    if (bodmas_algo.get(k) == "pow") {// raise to
                                        Double raise_to_value;
                                        operation = true;
                                        if (pow_inv) {
                                            raise_to_value = 1 / Double.parseDouble(bodmas_algo.get(k + 1));
                                            pow_inv = false;
                                        } else {
                                            raise_to_value = Double.parseDouble(bodmas_algo.get(k + 1));
                                        }
                                        System.out.println(bodmas_algo);
                                        order(Double.parseDouble(bodmas_algo.get(k - 1)), raise_to_value);
                                        removeorder(first_brack, last_brack, k);
                                    }
                                }

                                for (k = bodmas_algo.size() - 1; k >= 0; k--) {
                                    if (bodmas_algo.get(k) == "Sin" || bodmas_algo.get(k) == "Cos"
                                            || bodmas_algo.get(k) == "Tan") {// tirgo
                                        operation = true;
                                        trigo(bodmas_algo.get(k), Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_trigo_log(first_brack, last_brack, k);
                                    }
                                    if (bodmas_algo.get(k) == "Sin\u207B\u00b9"
                                            || bodmas_algo.get(k) == "Cos\u207B\u00b9"
                                            || bodmas_algo.get(k) == "Tan\u207B\u00b9") {// Sin
                                        operation = true;
                                        trigo_inv(bodmas_algo.get(k), Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_trigo_log(first_brack, last_brack, k);
                                    }
                                    if (bodmas_algo.get(k) == "log" || bodmas_algo.get(k) == "ln") {// log
                                        operation = true;
                                        log_func(bodmas_algo.get(k), Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_trigo_log(first_brack, last_brack, k);
                                    }
                                }
                                for (k = 0; k < bodmas_algo.size() - 1; k++) {

                                    if (bodmas_algo.get(k) == ("\u2715")) {// multiplication
                                        operation = true;
                                        multiplication(Double.parseDouble(bodmas_algo.get(k - 1)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        removeorder(first_brack, last_brack, k);
                                    }
                                }

                                for (k = 0; k < bodmas_algo.size(); k++) {

                                    if (bodmas_algo.get(k) == "\u002f") {// division
                                        operation = true;
                                        division(Double.parseDouble(bodmas_algo.get(k - 1)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_arith(first_brack, last_brack, k);

                                    }
                                }
                                for (k = 0; k < bodmas_algo.size(); k++) {
                                    if (bodmas_algo.get(k) == "+") {
                                        operation = true;
                                        addition(Double.parseDouble(bodmas_algo.get(k - 1)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_arith(first_brack, last_brack, k);

                                    }
                                }
                                for (k = 0; k < bodmas_algo.size(); k++) {
                                    if (bodmas_algo.get(k) == "-") {
                                        operation = true;
                                        subtract(Double.parseDouble(bodmas_algo.get(k - 1)),
                                                Double.parseDouble(bodmas_algo.get(k + 1)));
                                        remove_arith(first_brack, last_brack, k);

                                    }
                                }
                            }
                            if (operation == true) {
                                main_array.remove(ans_pos + 1);
                                main_array.remove(ans_pos - 1);
                                operation = false;
                                System.out.println("After bracket removed from main: " + main_array);
                            }
                            System.out.println("\nMain:" + main_array + "\tSize:" + main_array.size() + "\nAlgo:"
                                    + bodmas_algo + "\tSize:" + bodmas_algo.size());

                        } else {
                            System.out.println("->" + main_array);
                            if (main_array.get(0) != "(") {
                                main_array.removeAll(main_array);
                                main_array.add("(");
                                for (i = 0; i <= start_main_array.size() - 1; i++) {
                                    main_array.add(start_main_array.get(i));
                                }
                            }

                            if (main_array.get(main_array.size() - 1) != ")") {

                                main_array.add(")");

                            }
                        }
                    }

                    ans = Double.parseDouble(main_array.get(0));
                    if (ans_inv) {
                        ans = 1 / ans;
                        ans_inv = false;
                    } else {
                    }
                    display_output("" + ans);
                    DisplayEquation = "" + ans;
                    main_array.remove(0);
                    start_main_array.clear();
                    last_value = ans;
                    number = false;
                    operation = false;
                    start = false;
                    brack_end = false;
                    negative = false;
                    power = false;
                }

                if (decimal) {
                    bfactorial.setEnabled(false);
                } else {
                    bfactorial.setEnabled(true);
                }

                if (constant) {
                    bdot.setEnabled(false);
                } else {
                    bdot.setEnabled(true);
                }

            }
        } catch (Exception err) {
            System.out.println("Error: " + err);
        }
        calcDispArea.setText(DisplayEquation);
    }

    void remove_special_mul(int first_brack, int last_brack, int Op_pos) {

        main_array.set(first_brack + Op_pos, "" + ans);
        bodmas_algo.set(Op_pos, "" + ans);

        main_array.remove(first_brack + Op_pos + 1);

        bodmas_algo.remove(Op_pos + 1);

        ans_pos = first_brack + Op_pos - 1;

        k = 0;
    }

    void remove_arith(int first_brack, int last_brack, int Op_pos) {

        main_array.set(first_brack + Op_pos, "" + ans);
        bodmas_algo.set(Op_pos, "" + ans);

        main_array.remove(first_brack + Op_pos + 1);
        main_array.remove(first_brack + Op_pos - 1);

        bodmas_algo.remove(Op_pos + 1);
        bodmas_algo.remove(Op_pos - 1);

        ans_pos = first_brack + Op_pos - 1;

        k = 0;
    }

    void removeorder(int first_brack, int last_brack, int Op_pos) {
        main_array.set(first_brack + Op_pos, "" + ans);
        bodmas_algo.set(Op_pos, "" + ans);

        main_array.remove(first_brack + Op_pos + 1);
        main_array.remove(first_brack + Op_pos - 1);

        bodmas_algo.remove(Op_pos + 1);
        bodmas_algo.remove(Op_pos - 1);

        ans_pos = first_brack + Op_pos - 1;

        k = bodmas_algo.size() - 1;
    }

    void remove_trigo_log(int first_brack, int last_brack, int trigo_answer_pos) {

        main_array.set(first_brack + trigo_answer_pos, "" + ans);
        bodmas_algo.set(trigo_answer_pos, "" + ans);

        main_array.remove(first_brack + trigo_answer_pos + 1);
        bodmas_algo.remove(trigo_answer_pos + 1);

        ans_pos = first_brack + trigo_answer_pos;
        k = bodmas_algo.size() - 1;

    }

    void remove_fact(int first_brack, int last_brack, int trigo_answer_pos) {
        main_array.set(first_brack + trigo_answer_pos, "" + ans);
        bodmas_algo.set(trigo_answer_pos, "" + ans);

        main_array.remove(first_brack + trigo_answer_pos - 1);
        bodmas_algo.remove(trigo_answer_pos - 1);

        ans_pos = first_brack + trigo_answer_pos;
        k = bodmas_algo.size() - 1;
    }
}

// class RoundBtn implements Border {
// private int r;

// RoundBtn(int r) {
// this.r = r;
// }

// public Insets getBorderInsets(Component c) {
// return new Insets(this.r + 1, this.r + 1, this.r + 2, this.r);
// }

// public boolean isBorderOpaque() {
// return true;
// }

// public void paintBorder(Component c, Graphics g, int x, int y,
// int width, int height) {
// g.drawRoundRect(x, y, width - 1, height - 1, r, r);
// }
// }

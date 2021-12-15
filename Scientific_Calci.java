package scientific_cal.SciCal.javadocfile;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SCalc {
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
    JButton blog, bln, bfactorial, bxraisey, byrootx, bxinverse, bleftparenthesis, brightparenthesis, color_mode_bttn;
    // Trigonometry
    JButton bsin, bcos, btan, bsininv, bcosinv, btaninv;
    // panels
    JPanel mainPanel, bttnPanel, calculationPanel, radioButtonPanel;
    // degree and radian combobox
    // JComboBox<String> comboBox;

    JButton quadratic_bttn, deg_rad_btttn;
    // colors
    String light = "#ffffff", dark = "#00000", bttn_panel_bg = "#f2f2f2", light_grey = "#dddddc",
            hover_button_light = "#dfd2c4", hover_button2_light = "#dfd2c4";

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
        mainPanel.setLayout(new BorderLayout());// Setting main panel layout as border layout
        bttnPanel.setLayout(new GridBagLayout());// Setting bttn panel layout as Gridbaglayout
        calculationPanel.setLayout(new GridBagLayout());// Setting calculation panel layout as Gridbaglayout

        add(mainPanel);// Main panel on which other panels are set
        mainPanel.add(calculationPanel, BorderLayout.NORTH);// adding calculation_panel to main panel
        mainPanel.add(bttnPanel, BorderLayout.CENTER);// adding bttn_panel to main panel

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        // weightx and weighty helps to maintain
        gbc.weightx = 1;
        gbc.weighty = 1;

        GridBagConstraints gbc_info = new GridBagConstraints();
        gbc_info.fill = GridBagConstraints.BOTH;

        // weightx and weighty helps to maintain
        gbc_info.weightx = 1;
        gbc_info.weighty = 1;

        bttnPanel.setBackground(Color.decode(bttn_panel_bg));

        // Creating components

        calcDispArea = new JTextField("", 2);
        gbc.gridy = 0;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        calculationPanel.add(calcDispArea, gbc);
        calcDispArea.setBackground(Color.decode("#ffffff"));
        calcDispArea.setFont(new Font("Serif", Font.PLAIN, 20));

        radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridBagLayout());
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        calculationPanel.add(radioButtonPanel, gbc);

        deg_rad_btttn = new JButton("In Degree");
        gbc.gridy = 0;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        deg_rad_btttn.setPreferredSize(new Dimension(40, 20));
        radioButtonPanel.add(deg_rad_btttn, gbc);

        quadratic_bttn = new JButton("Quadratic");
        quadratic_bttn.setPreferredSize(new Dimension(40, 20));
        // quadratic_info.setBorder(null);

        gbc.gridy = 0;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        radioButtonPanel.add(quadratic_bttn, gbc);

        color_mode_bttn = new JButton("\u263E");
        gbc.gridy = 0;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        radioButtonPanel.add(color_mode_bttn);
        radioButtonPanel.add(color_mode_bttn, gbc);
        color_mode_bttn.setBorder(null);
        color_mode_bttn.setPreferredSize(new Dimension(0, 20));
        color_mode_bttn.setBackground(Color.decode(light));
        color_mode_bttn.setFocusPainted(false);

        radioButtonPanel.setBackground(Color.decode(instColor_bg));

        // calculation display area
        calcDispArea.setHorizontalAlignment(SwingConstants.RIGHT);

        // Component properties
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

        b2 = new JButton("2");
        gbc.gridy = 0;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b2, gbc);
        b2.setBorder(null);

        b3 = new JButton("3");
        gbc.gridy = 0;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b3, gbc);
        b3.setBorder(null);

        b4 = new JButton("4");
        gbc.gridy = 1;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b4, gbc);
        b4.setBorder(null);

        b5 = new JButton("5");
        gbc.gridy = 1;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b5, gbc);
        b5.setBorder(null);

        b6 = new JButton("6");
        gbc.gridy = 1;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b6, gbc);
        b6.setBorder(null);

        b7 = new JButton("7");
        gbc.gridy = 2;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b7, gbc);
        b7.setBorder(null);

        b8 = new JButton("8");
        gbc.gridy = 2;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b8, gbc);
        b8.setBorder(null);

        b9 = new JButton("9");
        gbc.gridy = 2;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b9, gbc);
        b9.setBorder(null);

        b0 = new JButton("0");
        gbc.gridy = 3;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(b0, gbc);
        b0.setBorder(null);

        // Dot, Clear and all clear
        bclear = new JButton("C");
        gbc.gridy = 3;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bclear, gbc);
        bclear.setBorder(null);

        ballclear = new JButton("AC");
        gbc.gridy = 5;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(ballclear, gbc);
        ballclear.setBorder(null);
        ballclear.setForeground(Color.decode(AC_foreground));
        ballclear.setBackground(Color.decode(ACcolor_bg));
        ballclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ballclear.setBackground(Color.decode("#5c0202"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ballclear.setBackground(Color.decode(ACcolor_bg));
            }
        });

        bdot = new JButton(".");
        gbc.gridy = 3;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bdot, gbc);
        bdot.setBorder(null);

        // Pi and Exponential
        bpi = new JButton("\u03C0");
        gbc.gridy = 4;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bpi, gbc);
        bpi.setBorder(null);

        bexp = new JButton("e");
        gbc.gridy = 4;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bexp, gbc);
        bexp.setBorder(null);

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

        bsubtract = new JButton("-");
        gbc.gridy = 1;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bsubtract, gbc);
        bsubtract.setBorder(null);
        bsubtract.setForeground(Color.decode(Arhithmatic_foreground));
        bsubtract.setBackground(Color.decode(ArithematicColor_bg));

        bmul = new JButton("\u2715");
        gbc.gridy = 2;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bmul, gbc);
        bmul.setBorder(null);
        bmul.setForeground(Color.decode(Arhithmatic_foreground));
        bmul.setBackground(Color.decode(ArithematicColor_bg));

        bdiv = new JButton("\u002f");
        gbc.gridy = 3;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bdiv, gbc);
        bdiv.setBorder(null);
        bdiv.setForeground(Color.decode(Arhithmatic_foreground));
        bdiv.setBackground(Color.decode(ArithematicColor_bg));

        bmod = new JButton("%");
        gbc.gridy = 4;
        gbc.gridx = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bmod, gbc);
        bmod.setBorder(null);
        bmod.setForeground(Color.decode(Arhithmatic_foreground));
        bmod.setBackground(Color.decode(ArithematicColor_bg));

        // Algebric
        bxraisey = new JButton("x\u02B8");
        gbc.gridy = 5;
        gbc.gridx = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bxraisey, gbc);
        bxraisey.setBorder(null);

        byrootx = new JButton("y\u221Ax");
        gbc.gridy = 5;
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(byrootx, gbc);
        byrootx.setBorder(null);

        bfactorial = new JButton("x!");
        gbc.gridy = 5;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bfactorial, gbc);
        bfactorial.setBorder(null);

        bxinverse = new JButton("(\u0031\u002fx)");
        gbc.gridy = 4;
        gbc.gridx = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bxinverse, gbc);
        bxinverse.setBorder(null);

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

        bcos = new JButton("Cos");
        gbc.gridy = 1;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bcos, gbc);
        bcos.setBorder(null);
        bcos.setForeground(Color.decode(Trigo_foreground));
        bcos.setBackground(Color.decode(TrigoColor_bg));

        btan = new JButton("Tan");
        gbc.gridy = 2;
        gbc.gridx = 5;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(btan, gbc);
        btan.setBorder(null);
        btan.setForeground(Color.decode(Trigo_foreground));
        btan.setBackground(Color.decode(TrigoColor_bg));

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

        bcosinv = new JButton("Cos\u207B\u00b9");
        gbc.gridy = 1;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bcosinv, gbc);
        bcosinv.setBorder(null);
        bcosinv.setForeground(Color.decode(Trigo_foreground));
        bcosinv.setBackground(Color.decode(TrigoColor_bg));
        // });

        btaninv = new JButton("Tan\u207B\u00b9");
        gbc.gridy = 2;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(btaninv, gbc);
        btaninv.setBorder(null);
        btaninv.setForeground(Color.decode(Trigo_foreground));
        btaninv.setBackground(Color.decode(TrigoColor_bg));

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

        bln = new JButton("ln");
        gbc.gridy = 3;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bln, gbc);
        bln.setBorder(null);
        bln.setForeground(Color.decode(Trigo_foreground));
        bln.setBackground(Color.decode(TrigoColor_bg));

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

        bleftparenthesis = new JButton(")");
        gbc.gridy = 4;
        gbc.gridx = 6;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        bttnPanel.add(bleftparenthesis, gbc);
        bleftparenthesis.setBorder(null);
        bleftparenthesis.setForeground(Color.decode(Trigo_foreground));
        bleftparenthesis.setBackground(Color.decode(TrigoColor_bg));

        add_in_arraylist();// adding buttons in arraylist

        // Button properties : Background Color, Foreground Colors, Hover Colors, Border
        // using arrayist of all buttons

        quadratic_bttn.setBackground(Color.decode(NumberColor_bg));
        quadratic_bttn.setForeground(Color.decode(Number_foreground));

        deg_rad_btttn.setBackground(Color.decode(NumberColor_bg));
        deg_rad_btttn.setForeground(Color.decode(Number_foreground));

        ballclear.setBorder(null);
        ballclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ballclear.setBackground(Color.decode("#5c0202"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ballclear.setBackground(Color.decode(ACcolor_bg));
            }
        });
        for (JButton x : general_buttons) {
            mouse_hover_general_bttn(x);
            x.setBorder(null);
            x.setForeground(Color.decode(Number_foreground));
            x.setBackground(Color.decode(NumberColor_bg));
        }
        for (JButton y : trigo_arith_log_buttons) {
            mouse_hover_TLA_bttn(y);
            y.setBorder(null);
            y.setForeground(Color.decode(Trigo_foreground));
            y.setBackground(Color.decode(TrigoColor_bg));
        }

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

        color_mode_bttn.addActionListener(this);

        quadratic_bttn.addActionListener(this);

        deg_rad_btttn.addActionListener(this);

    }

    // Declaration of variables and arraylist

    /*
     * main_array stores the given input in arraylist in sorted manner and gets
     * solved using bodmas arraylist till it gets completely solved ans lastly
     * returns ans
     */
    ArrayList<String> main_array = new ArrayList<>();

    /*
     * bodmas_algo is arraylist of small part or main_array in brackets where
     * calculations ans returns ans to main_array
     */
    ArrayList<String> bodmas_algo = new ArrayList<>();

    /*
     * start_main_array is created to fix error by user if brackets are not closed
     * by them
     */
    ArrayList<String> start_main_array = new ArrayList<>();

    /* when decimal is arraylist to store indexes when user gives ans in decimal */
    ArrayList<Integer> when_decimal = new ArrayList<Integer>();

    /*
     * fix_value_var_indexes arraylist will store the indexes of variable with fix
     * value such as π and e
     */
    ArrayList<Integer> fix_value_var_indexes = new ArrayList<Integer>();

    /*
     * general_buttons, trigo_arith_log_buttons & button_panels are arraylists to
     * keep all collections buttons and panels in one variable
     * and are stored in list according to their name respectively
     */
    ArrayList<JButton> general_buttons = new ArrayList<JButton>();
    ArrayList<JButton> trigo_arith_log_buttons = new ArrayList<JButton>();
    ArrayList<JPanel> button_panels = new ArrayList<JPanel>();

    boolean number = false, quadratic_mode, operation = false, start = false, brack_end = false, negative = false,
            power = false,
            factorial_num = false,
            decimal = false, lastvalue_added = true, temp_bool, decimal_start = false, radian = false, constant = false,
            trig_pi = false, cleared = false;

    boolean last_val_is_num = false, last_val_is_operation = false, last_val_is_TL = false,
            last_val_is_brack_open = false;

    String value = "", DisplayEquation = "", last_value_string = "", ans1 = "", ans2 = "";
    double ans = 0.0, last_value = 0.0, prev_value = 0.0, temp_value = 0.0;
    int first_brack = 0, last_brack = 0, ans_pos, i = 0, j = 0, k = 0, power_count = 0, trigo_val = 0, temp_ans = 0,
            count_decimal_fig = 10;
    Double quadratic_a = 0.0, quadratic_b = 0.0, quadratic_c = 0.0;

    // Functions

    //to create an arraylist of buttons and panels
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
        general_buttons.add(byrootx);
        general_buttons.add(bclear);
        general_buttons.add(bfactorial);

        // trigo,arithematic and log
        trigo_arith_log_buttons.add(bplus);
        trigo_arith_log_buttons.add(bsubtract);
        trigo_arith_log_buttons.add(bmul);
        trigo_arith_log_buttons.add(bdiv);
        trigo_arith_log_buttons.add(bmod);

        trigo_arith_log_buttons.add(blog);
        trigo_arith_log_buttons.add(bln);

        trigo_arith_log_buttons.add(bleftparenthesis);
        trigo_arith_log_buttons.add(brightparenthesis);
        trigo_arith_log_buttons.add(bsin);
        trigo_arith_log_buttons.add(bcos);
        trigo_arith_log_buttons.add(btan);
        trigo_arith_log_buttons.add(bsininv);
        trigo_arith_log_buttons.add(bcosinv);
        trigo_arith_log_buttons.add(btaninv);

        // otherbutton
        button_panels.add(mainPanel);
        button_panels.add(bttnPanel);
        button_panels.add(calculationPanel);
    }


    // When mouse hover on general buttons
    void mouse_hover_general_bttn(JButton bttn) {
        bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn.setBackground(Color.decode(hover_button_light));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bttn.setBackground(Color.decode(light_button));
            }

        });
    }

    // When mouse hover on Trigo log and Arithematic buttons
    void mouse_hover_TLA_bttn(JButton bttn) {
        bttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttn.setBackground(Color.decode(hover_button_light));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                bttn.setBackground(Color.decode(light_button2));
            }

        });
    }

    // Display
    void display_output(String getString) {
        calcDispArea.setText(getString);
    }
    

    void add_last_value() {
        if (lastvalue_added) {

        } else {
            main_array.add("" + last_value);
            last_value = 0;
            lastvalue_added = true;
            last_value_string = "";
        }
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

    // quadratic
    void solve_quadratic(Double a, Double b, Double c) {
        DecimalFormat df = new DecimalFormat("0.00");
        Double delta = (b * b) - 4 * a * c;
        if (delta < 0) {
            delta = delta * -1;
            ans1 = df.format(-b / (2 * a)) + "+" + df.format((Math.sqrt(delta) / (2 * a))) + "i";
            ans2 = df.format(-b / (2 * a)) + "-" + df.format((Math.sqrt(delta) / (2 * a))) + "i";
        } else {
            ans1 = df.format((-b + Math.sqrt(delta)) / (2 * a)) + "";
            ans2 = df.format((-b - Math.sqrt(delta)) / (2 * a)) + "";
        }
    }

    Double pi_value() {
        int sign = 1;
        if (negative) {
            sign = -1;
        }
        if (trigo_val > 0) {
            return sign * 180.0;
        } else {
            return sign * Math.PI;
        }
    }

    Double exp_value() {
        int sign = 1;
        if (negative) {
            sign = -1;
        }
        return sign * Math.exp(1);
    }

    void auto_multiplly() {
        for (k = 0; k < bodmas_algo.size() - 1; k++) {
            boolean check1, check2;
            check1 = check_whole_String_isNum(bodmas_algo.get(k));
            check2 = check_whole_String_isNum(bodmas_algo.get(k + 1));
            System.out.println("c1 " + check1 + " c2 " + check2);
            if (check2 == true && check1 == true) {
                multiplication(Double.parseDouble(bodmas_algo.get(k)),
                        Double.parseDouble(bodmas_algo.get(k + 1)));
                System.out.println("Number automultiplied");
                remove_special_mul(first_brack, last_brack, k);
            }
        }
    }
   
  
    /* all Toggle colors and tempory color strings */
    String temp_col1, temp_col2, temp_col3, temp_hover, temp_bw, temp_equalto, temp_rad_deg;
    String light_panel = "#f2f2f2", dark_panel = "#00000", light_button = "#ffffff", dark_button = "#343434",
            light_button2 = "#dddddc", dark_button2 = "#141d28", black = "#000000", white = "#ffffff",
            equalto_light = "#9d4e09", equalto_dark = "#4290dc", hover_button_dark = "#457ba6",
            hover_button2_dark = "#487eb0";
    String light_mode = "Light Mode", dark_mode = "Dark Mode";

    void toggle_color_mode() {

        // toggling from arraylist
        for (JButton x : general_buttons) {
            x.setForeground(Color.decode(white));
            x.setBackground(Color.decode(dark_button));
        }
        for (JButton y : trigo_arith_log_buttons) {
            y.setForeground(Color.decode(white));
            y.setBackground(Color.decode(dark_button2));
        }
        for (JPanel z : button_panels) {
            z.setBackground(Color.decode(dark_panel));
        }

        /*
         * automatic toggling of colors for equalto, calculation display area, radio
         * buttons,radiobutton panel & quadratic equation
         */
        calcDispArea.setBackground(Color.decode(dark_button));
        radioButtonPanel.setBackground(Color.decode(dark_button));
        color_mode_bttn.setBackground(Color.decode(dark_button));
        quadratic_bttn.setBackground(Color.decode(dark_button));
        deg_rad_btttn.setBackground(Color.decode(dark_button));

        bequal.setBackground(Color.decode(equalto_dark));

        calcDispArea.setForeground(Color.decode(white));
        radioButtonPanel.setForeground(Color.decode(white));
        color_mode_bttn.setForeground(Color.decode(white));
        quadratic_bttn.setForeground(Color.decode(white));
        deg_rad_btttn.setForeground(Color.decode(white));

        temp_rad_deg = light_mode;
        light_mode = dark_mode;
        dark_mode = temp_rad_deg;

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

        temp_hover = hover_button_light;
        hover_button_light = hover_button_dark;
        hover_button_dark = temp_hover;

        temp_hover = hover_button2_light;
        hover_button2_light = hover_button2_dark;
        hover_button2_dark = temp_hover;
    }

    // To check if string is number

    boolean check_whole_String_isNum(String toCheck) {

        int string_length = toCheck.length();
        if (Character.isDigit(toCheck.charAt(string_length - 1)) || Character.isDigit(toCheck.charAt(0))) {
            temp_bool = true;

        } else {
            temp_bool = false;
        }

        return temp_bool;
    }

    boolean check_decimal(Double toCheckDecimal) {
        String toCheckString = toCheckDecimal + "";
        boolean numType_decimal = false;

        int current_mainarray_index = main_array.size() - 1;

        if (when_decimal.size() >= 1) {
        }

        if (toCheckString.contains(".")) {

            int decimal_index = toCheckString.indexOf(".");
            StringBuffer string_after_dec = new StringBuffer(toCheckString.substring(decimal_index));
            String toCheckAfterDecimmal = string_after_dec + "";
            numType_decimal = true;

            if (toCheckAfterDecimmal.equals(".0")) {
                numType_decimal = false;
            }

            for (Integer i : when_decimal) {
                if (current_mainarray_index == i) {
                    numType_decimal = true;
                }
            }

        } else {
            numType_decimal = false;
        }
        System.out.println("numType_decimal: " + numType_decimal);
        return numType_decimal;
    }

    boolean check_decimal_from_string(String toCheck, int toCheck_length) {
        boolean numType_decimal = false;// Returning value
        int decimal_index, after_dec_length;
        String toCheckAfterDecimal;
        int current_mainarray_index = main_array.size() - 1; // Index of main array which we are working on

        /** If string containg point */
        if (toCheck.contains(".")) {

            /** If decimal point detected then returning value is true */
            numType_decimal = true;

            decimal_index = toCheck.indexOf(".");// to store the index where the point is located

            /* to create a string of numbers after decimal including decimal point */
            toCheckAfterDecimal = toCheck.substring(decimal_index, toCheck_length);
            after_dec_length = toCheckAfterDecimal.length();// to store the length of numbers after decimal including
                                                            // decimal point

            /**
             * If the length of after decimal numbers is 2 and is equal to ".0" then
             * overwriting the returning value as false
             */
            if (toCheckAfterDecimal.equals(".0") && after_dec_length == 2) {
                numType_decimal = false;
            }

            /** If index found in when_decimal then numType_decimal is true */
            for (Integer i : when_decimal) {
                if (current_mainarray_index == i) {
                    numType_decimal = true;
                    break;
                }
            }

        } else {
            numType_decimal = false;
        }
        System.out.println("numType Decimal: " + numType_decimal);
        return numType_decimal;
    }

    boolean check_from_whenDecimal(int index) {
        boolean isFound = false;// Returning value

        /** If index found in when_decimal then isFound is true */
        for (Integer i : when_decimal) {
            if (index == i) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    boolean check_int(String toCheck, int toCheck_length) {

        boolean numType_int = false;
        int decimal_index;
        String toCheckAfterDecimal;
        char indexAt0 = toCheck.charAt(0);
        if (Character.isDigit(indexAt0)) {
            toCheck = Double.parseDouble(toCheck)+"";
        }
        try {
            if (toCheck.contains(".")) {
                decimal_index = toCheck.indexOf(".");
                toCheckAfterDecimal = toCheck.substring(decimal_index, toCheck_length);

                if (toCheckAfterDecimal.equals(".0")) {
                    numType_int = true;
                }
            } else {
                int int_number = Integer.parseInt(toCheck);
                System.out.println("number is without decimal point: " + int_number);
            }
        } catch (Exception e) {
            System.out.println("Not int number");
            numType_int = false;
        }

        System.out.println("numType Int: " + numType_int);
        return numType_int;
    }

    String getMainarray_lastString(int n) {
        return main_array.get(main_array.size() - n);
    }

    
    String clearString(String getStringValue, int indexStart, int indexEnd) {
        StringBuffer stringHere = new StringBuffer(getStringValue);
        String getSubString = stringHere.substring(indexStart, indexEnd);
        return getSubString;
    }


    void after_operations() {
        count_decimal_fig = 10;
        constant = false;
        decimal = false;
    }

    void setEnable_bttns(boolean getBool) {
        for (JButton i : general_buttons) {
            i.setEnabled(getBool);
        }
        for (JButton j : trigo_arith_log_buttons) {
            j.setEnabled(getBool);
        }
        ballclear.setEnabled(getBool);
    }

    //when clear
    
    void forClear(String string) {

        if (main_array.size() > 1) {

            String modifiedString = string;
            int string_length = modifiedString.length();
            int current_mainarray_index = main_array.size() - 1; // Index of main array which we are working on

            
            int fix_value_index_in_mainarray = 0;

            if (fix_value_var_indexes.size() >= 1) {
                fix_value_index_in_mainarray = fix_value_var_indexes.get(fix_value_var_indexes.size() - 1);
                System.out.println("\nt fix_value_index_in_mainarray: " + fix_value_index_in_mainarray);
            }

            char lastCharOfDisplayEquation = DisplayEquation.charAt(DisplayEquation.length() - 1);

            if (lastCharOfDisplayEquation == '.') {
                DisplayEquation = clearString(DisplayEquation, 0, DisplayEquation.length() - 1);
            } else if (check_int(string, string_length) && check_from_whenDecimal(current_mainarray_index) == false) {

                int decimal_index = modifiedString.indexOf(".");

                modifiedString = clearString(modifiedString, 0, decimal_index - 1) + "";
                DisplayEquation = clearString(DisplayEquation, 0, DisplayEquation.length() - 1);

                if (modifiedString.isEmpty() || modifiedString == "") {
                    main_array.remove(current_mainarray_index);
                } else {
                    main_array.remove(current_mainarray_index);

                    lastvalue_added = false;
                    last_value = Double.parseDouble(modifiedString);
                    last_value_string = modifiedString;
            }

                System.out.println("Now the value is: " + modifiedString);
                System.out.println("main_array: " + main_array);


            } else if (check_decimal_from_string(string, string_length)) {
                int decimal_index = modifiedString.indexOf(".");
                String numAfterDecimal = clearString(modifiedString, decimal_index, string_length);
                int numAfterDecimal_length = numAfterDecimal.length();
                System.out.println("\nafter decimal: " + numAfterDecimal);

                if (numAfterDecimal_length == 2) {
                    DisplayEquation = clearString(DisplayEquation, 0, DisplayEquation.length() - 2);
                    modifiedString = clearString(modifiedString, 0, modifiedString.length() - 2);
                    when_decimal.remove(when_decimal.size() - 1);
                    decimal = false;
                }
                else{
                    DisplayEquation = clearString(DisplayEquation, 0, DisplayEquation.length() - 1);
                    modifiedString = clearString(modifiedString, 0, modifiedString.length() - 1);
                    last_value_string = modifiedString;
                    decimal = true;
            }

                main_array.remove(current_mainarray_index);
                lastvalue_added = false;
                last_value = Double.parseDouble(modifiedString);
                last_value_string = modifiedString;

                System.out.println("Now the value is: " + modifiedString);
                System.out.println("\nmain_array: " + main_array);
            }
            else{
                System.out.println("String is not num");
                int main_array_loop = 1;
                if (getMainarray_lastString(2) == "pow") {
                    string_length = 10;
                    main_array_loop = 2;
                }
                if (getMainarray_lastString(2) == "root") {
                    string_length = 9;
                    main_array_loop = 2;
                } else if (getMainarray_lastString(2) == "Sin" || getMainarray_lastString(2) == "Cos"
                        || getMainarray_lastString(2) == "Tan") {
                    string_length = 4;
                    main_array_loop = 2;
                } else if (getMainarray_lastString(2) == "Sin\u207B\u00b9"
                        || getMainarray_lastString(2) == "Cos\u207B\u00b9"
                        || getMainarray_lastString(2) == "Tan\u207B\u00b9") {
                    string_length = 6;
                    main_array_loop = 2;
                } else if (getMainarray_lastString(2) == "log") {
                    string_length = 4;
                    main_array_loop = 2;
                } else if (getMainarray_lastString(2) == "ln") {
                    string_length = 3;
                    main_array_loop = 2;
                } else if (getMainarray_lastString(1) == "+") {
                    if (negative) {
                        negative = false;
                    }
                } else if (getMainarray_lastString(1) == "-") {
                    negative = false;
                } else if (current_mainarray_index == fix_value_index_in_mainarray) {
                    System.out.println("clearing constant value");
                    string_length = 1;
                    main_array_loop = 1;
                    fix_value_var_indexes.remove(fix_value_var_indexes.size() - 1);
                }
                for (i = 1; i <= string_length; i++) {
                    DisplayEquation =  clearString(DisplayEquation, 0, DisplayEquation.length()-1);
                    System.out.println("\nLast value removed from display");
                }
                for (i = 1; i <= main_array_loop; i++) {
                    main_array.remove(main_array.size() - 1);
                    System.out.println("last value removed from main_array");
                }
                lastvalue_added = true;
            }
            }
        }
    

    //when AC 
    void allClear() {
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
        factorial_num = false;

        first_brack = 0;
        last_brack = 0;
        ans_pos = 0;
        i = 0;
        j = 0;
        k = 0;
        count_decimal_fig = 0;
        power_count = 0;
        trigo_val = 0;

        ans = 0.0;
        last_value = 0.0;
        prev_value = 0.0;
        temp_value = 0.0;

        start_main_array.clear();
        main_array.clear();
    }

    void isEqualto_func() {
        System.out.println("Start Main ArrayList = " + main_array + "\nsize: " + main_array.size() + "\n");
        add_last_value();
        main_array.add(")");

        for (i = 0; i <= main_array.size() - 1; i++) {
            start_main_array.add(main_array.get(i));
        }
        System.out.println("sma -->>" + start_main_array);
        System.out.println("Start Main ArrayList = " + main_array + "\nsize: " +
                main_array.size() + "\n");

        while (main_array.size() > 1) {
            if (main_array.contains("(") && main_array.contains(")")) {

                if (main_array.contains("avalue") && main_array.contains("bvalue")) {
                    System.out.println("Quadratic Entered");
                }

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
                } else if (first_brack > last_brack) {
                    break;
                } else {
                    auto_multiplly();

                    System.out.println("\nSubtracting process initiated...");
                    for (k = 0; k < bodmas_algo.size(); k++) {
                        System.out.println("subtracting steps");
                        if (bodmas_algo.get(k) == "-") {
                            operation = true;
                            if (check_whole_String_isNum(main_array.get(first_brack + k - 1)) == false) {

                                Double minus_value = Double.parseDouble(bodmas_algo.get(k + 1)) * (-1);
                                System.out.println("Step1 : setting bodmas_algo");

                                bodmas_algo.set(k + 1, minus_value + "");

                                System.out.println("Step2 : setting main_array");

                                main_array.set(first_brack + k + 1, minus_value + "");

                                System.out.println("After minus loop : " + main_array);

                                bodmas_algo.remove(k);
                                main_array.remove(first_brack + k);
                                ans_pos = first_brack + k;

                            }
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
                            raise_to_value = Double.parseDouble(bodmas_algo.get(k + 1));
                            System.out.println(bodmas_algo);
                            order(Double.parseDouble(bodmas_algo.get(k - 1)), raise_to_value);
                            removeorder(first_brack, last_brack, k);
                        }
                    }
                    for (k = bodmas_algo.size() - 1; k >= 0; k--) {
                        if (bodmas_algo.get(k) == "root") {// raise to
                            Double raise_to_value;
                            operation = true;
                            raise_to_value = 1 / Double.parseDouble(bodmas_algo.get(k + 1));
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
                            System.out.println("\nMain array after trigo solved: " + main_array);
                            remove_trigo_log(first_brack, last_brack, k);
                            System.out.println(
                                    "Main array after trigo removed bracket: " + main_array + "\n");
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
                    System.out.println("\nBefore auto multiply -> bodmas_algo: " + bodmas_algo);
                    auto_multiplly();
                    System.out.println("After auto multiplication| main array: " + main_array
                            + " | bodmas_algo: " + bodmas_algo + "\n");

                    for (k = 0; k < bodmas_algo.size(); k++) {

                        if (bodmas_algo.get(k) == ("\u2715")) {// multiplication
                            operation = true;
                            multiplication(Double.parseDouble(bodmas_algo.get(k - 1)),
                                    Double.parseDouble(bodmas_algo.get(k + 1)));
                            removeorder(first_brack, last_brack, k);
                        }
                    }

                    if (bodmas_algo.contains("\u002f")) {
                        for (k = 0; k < bodmas_algo.size(); k++) {

                            if (bodmas_algo.get(k) == "\u002f") {// division
                                operation = true;
                                division(Double.parseDouble(bodmas_algo.get(k - 1)),
                                        Double.parseDouble(bodmas_algo.get(k + 1)));
                                remove_arith(first_brack, last_brack, k);

                            }
                        }
                    }
                    if (bodmas_algo.contains("-")) {
                        System.out.println("Subtracting process initiated...");
                        for (k = 0; k < bodmas_algo.size(); k++) {
                            System.out.println("subtracting steps");
                            if (bodmas_algo.get(k) == "-") {
                                operation = true;
                                if (check_whole_String_isNum(main_array.get(first_brack + k - 1))) {
                                    System.out.println("before minus number: " + bodmas_algo.get(k - 1));
                                    subtract(Double.parseDouble(bodmas_algo.get(k - 1)),
                                            Double.parseDouble(bodmas_algo.get(k + 1)));
                                    remove_arith(first_brack, last_brack, k);
                                }
                            }
                        }
                    }
                    if (bodmas_algo.contains("+")) {
                        for (k = 0; k < bodmas_algo.size(); k++) {
                            if (bodmas_algo.get(k) == "+") {
                                operation = true;
                                addition(Double.parseDouble(bodmas_algo.get(k - 1)),
                                        Double.parseDouble(bodmas_algo.get(k + 1)));
                                remove_arith(first_brack, last_brack, k);

                            }
                        }
                    }

                    System.out.println("anspos: " + ans_pos);
                }
                if (operation) {
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

        number = false;
        operation = false;
        brack_end = false;
        negative = false;
        power = false;

        System.out.println("After loop main_array: " + main_array);
        // display_output("" + ans);
        main_array.clear();
        start_main_array.clear();

        when_decimal.clear();

        System.out.println("After loop main_array: " + main_array);

        if (quadratic_mode) {
            if (value == "Enter b") {
                System.out.println("a initialized: " + main_array);
                quadratic_a = ans;
                main_array.clear();
            } else if (value == "Enter c") {
                quadratic_b = ans;
                main_array.clear();
            } else if (value == "=") {
                quadratic_c = ans;
                setEnable_bttns(false);
                System.out.println("Solving Quadratic.....\n");
                solve_quadratic(quadratic_a, quadratic_b, quadratic_c);
                DisplayEquation = "Roots: " + ans1 + " & " + ans2;
                quadratic_mode = false;
            }
        }

        else {
            start = false;
            last_value = ans;
            lastvalue_added = false;
            DisplayEquation = "" + ans;
            System.out.println("Final main_array: " + main_array);

            if (check_decimal(ans)) {
                when_decimal.add(1);
                last_value_string = ans + "";
            } else {
                DisplayEquation = clearString(ans + "", 0, (ans + "").length() - 2);
                last_value_string = DisplayEquation;
        }
        }

    }

    public void actionPerformed(ActionEvent e) {
        try {

            value = e.getActionCommand();
            number = Character.isDigit(value.charAt(0));

            /**
             * When clicked In Degree it will change buttin text to In Radian and as shown
             * on button it will set radian true and vice versa
             */
            if (value == "In Degree") {
                radian = true;
                deg_rad_btttn.setText("In Radians");
            } else if (value == "In Radians") {
                radian = false;
                deg_rad_btttn.setText("In Degree");
            }

            if (start == false) {
                start = true;
                when_decimal.add(0);
                fix_value_var_indexes.add(0);
                main_array.add("(");
            }

            if (value == "Quadratic") {
                allClear();
                setEnable_bttns(false);
                quadratic_mode = true;
                quadratic_bttn.setText("Exit");
                bequal.setText("Enter a");
                DisplayEquation = "ax\u00B2 + bx + c = 0";
            }

            if (value == "Exit") {
                allClear();
                setEnable_bttns(true);
                quadratic_mode = false;
                quadratic_bttn.setText("Quadratic");
                bequal.setText("=");
            }

            if (value == "Enter a") {
                allClear();
                setEnable_bttns(true);
                DisplayEquation = "a=";
                bequal.setText("Enter b");
            } else if (value == "Enter b") {
                isEqualto_func();
                DisplayEquation = "b=";
                bequal.setText("Enter c");
                add_last_value();
            } else if (value == "Enter c") {
                isEqualto_func();
                DisplayEquation = "c=";
                bequal.setText("=");
                add_last_value();
            }

            if (value == "\u263E") {
                color_mode_bttn.setText("\u263C");
                toggle_color_mode();
            } else if (value == "\u263C") {
                color_mode_bttn.setText("\u263E");
                toggle_color_mode();
            }

            if (number) {
                if (decimal) {
                    System.out.println("Decimal on index: " + when_decimal);

                    last_value_string = decimal_start ? last_value_string + "." : last_value_string;

                    System.out.println("last_value_string when decimal is true: " + last_value_string);
                    decimal_start = false;

                    when_decimal.add(main_array.size());

                    decimal = false;
                }
                    
                last_value_string = last_value_string + value;
                last_value = Double.parseDouble(last_value_string);
                DisplayEquation = DisplayEquation + value;
                lastvalue_added = false;
                System.out.println("\nlast_value: " + last_value);
            } else {
                cleared = false;
                // for + * & /
                if (value == "+" || value == "\u2715" || value == "\u002f") {
                    after_operations();
                    add_last_value();
                    main_array.add(value);
                    DisplayEquation = DisplayEquation + value;

                } else if (value == "-") {
                    after_operations();
                    add_last_value();
                    brack_end = false;
                    main_array.add("-");
                    DisplayEquation = DisplayEquation + value;
                }
                // value = raise to
                else if (value == "x\u02B8") {
                    after_operations();
                    if (brack_end || power) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        add_last_value();
                        brack_end = false;
                    }
                    power_count++;
                    main_array.add("pow");
                    main_array.add("(");
                    last_value = 0;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + "Power of (";
                }
                // value = root of
                else if (value == "y\u221Ax") {
                    after_operations();

                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        add_last_value();
                        brack_end = false;
                    }

                    power_count++;
                    main_array.add("root");
                    main_array.add("(");
                    last_value = 0;
                    lastvalue_added = true;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + "Root of (";
                } else if (value == "x!") {
                    after_operations();
                    decimal = false;
                    if (brack_end || power || factorial_num) {
                        brack_end = false;
                        factorial_num = false;
                    } else {
                        add_last_value();
                        brack_end = false;
                    }
                    factorial_num = true;
                    main_array.add("!");
                    DisplayEquation = DisplayEquation + "!";
                }
                // value = (1/x)
                else if (value == "(\u0031\u002fx)") {
                    after_operations();
                    add_last_value();
                    isEqualto_func();
                    main_array.clear();
                    main_array.add("1");
                    main_array.add("/");
                    main_array.add("(");
                    main_array.add("" + ans);
                    main_array.add(")");
                    DisplayEquation = "1/(" + ans + ")";
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
                    if (negative) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    add_last_value();
                    main_array.add(value);
                    main_array.add("(");
                    trigo_val++;
                    DisplayEquation = DisplayEquation + value + "(";
                } else if (value == "Sin\u207B\u00b9" || value == "Cos\u207B\u00b9" || value == "Tan\u207B\u00b9") {
                    after_operations();
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    add_last_value();
                    main_array.add(value);
                    main_array.add("(");
                    trigo_val++;
                    DisplayEquation = DisplayEquation + value + "(";
                } else if (value == "log" || value == "ln") {
                    after_operations();
                    add_last_value();
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size() - 1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_val++;
                    DisplayEquation = DisplayEquation + value + "(";
                }
                // value = pi
                else if (value == "\u03C0") {
                    after_operations();
                    add_last_value();
                    fix_value_var_indexes.add(main_array.size());
                    main_array.add("" + pi_value());
                    lastvalue_added = true;
                    last_value = 0;
                    System.out.println("pi added: " + main_array);

                    DisplayEquation = DisplayEquation + "\u03C0";
                    constant = true;
                } else if (value == "e") {
                    after_operations();
                    fix_value_var_indexes.add(main_array.size() - 1);
                    main_array.add(exp_value() + "");
                    DisplayEquation = DisplayEquation + "e";
                    constant = true;
                } else if (value == ".") {
                    decimal = true;
                    decimal_start = true;
                    DisplayEquation = DisplayEquation + ".";
                } else if (value == "(") {
                    add_last_value();
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
                    trigo_val--;
                    if (main_array.get(main_array.size() - 1) == ")") {
                    } else {
                        main_array.add("" + last_value);
                        lastvalue_added = true;
                    }
                    main_array.add(")");
                    brack_end = true;
                    last_value = 0;
                    last_value_string = "";
                    DisplayEquation = DisplayEquation + value;
                } else if (value == "AC") {
                    allClear();
                } else if (value == "C") {

                    if (main_array.size() >= 1) {
                        add_last_value();
                        forClear(main_array.get(main_array.size() - 1));
                    }

                } else if (value == "=") {
                    isEqualto_func();
                }

                // if (decimal) {
                // bfactorial.setEnabled(false);
                // } else {
                // bfactorial.setEnabled(true);
                // }

                // if (constant) {
                // bdot.setEnabled(false);
                // } else {
                // bdot.setEnabled(true);
                // }

            }
        } catch (Exception err) {
            System.out.println("Error: " + err);
            display_output("ERROR");
        }
        calcDispArea.setText(DisplayEquation);
    }

    void remove_special_mul(int first_brack, int last_brack, int Op_pos) {

        main_array.set(first_brack + Op_pos, "" + ans);
        bodmas_algo.set(Op_pos, "" + ans);

        main_array.remove(first_brack + Op_pos + 1);

        bodmas_algo.remove(Op_pos + 1);

        ans_pos = first_brack + Op_pos;

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

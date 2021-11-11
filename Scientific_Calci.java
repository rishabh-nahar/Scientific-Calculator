import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Scientific_Calci{
    public static void main(String srgs[])
    {
        Sc_Calc obj = new Sc_Calc();
        obj.setVisible(true);
        obj.setSize(400,400);
        obj.setTitle("Scientific Calculator");
        obj.setResizable(false);
    }
}
     class Sc_Calc extends JFrame implements ActionListener
    {
        JLabel instruction;
        JTextField calculationArea, calcDispArea;
        String operation="",operationAssist="",value="",disp="",operationTrigo="", temp_disp="", operation_algebra="", operation_log = "", operation_ln="";
        double ans=0.0,last_value=0.0 , prev_value=0.0, temp_value=0.0, alg_value = 0.0;
        boolean number = false;

        public Sc_Calc()
        {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            //Initializion of JFrame Components
            JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bpi,bexp,bdot,bclear,ballclear;
            JButton bplus,bsubtract,bmul,bdiv,bequal,bmod;
            JButton blog,bln,bfactorial,bsqrt,bxraisey,braise2,byrootx,bxinverse,bleftparenthesis,brightparenthesis;
            JButton bsin,bcos,btan,bsininv,bcosinv,btaninv;
            JPanel mainPanel, bttnPanel, calculationPanel ;
            
            //Creating Panels
            calculationPanel = new JPanel();
            calculationPanel = new JPanel();
            bttnPanel = new JPanel();
            mainPanel = new JPanel();

            //Panel Layouts
            mainPanel.setLayout(new BorderLayout());
            bttnPanel.setLayout(new GridBagLayout());
            calculationPanel.setLayout(new GridBagLayout());

            add(mainPanel);
            mainPanel.add(calculationPanel,BorderLayout.NORTH);
            mainPanel.add(bttnPanel,BorderLayout.CENTER);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 0.9;
            gbc.weighty = 0.9;

        //Creating coomponents and adding

            instruction = new JLabel("");
            gbc.gridy = 1;
            gbc.gridx = 1;
            gbc.gridheight = 2;
            gbc.gridwidth = 1;
            calculationPanel.add(instruction,gbc);

            calculationArea = new JTextField("",100);
            gbc.gridy = 1;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            calculationPanel.add(calculationArea,gbc);

            calcDispArea = new JTextField("",100);
            gbc.gridy = 0;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            calculationPanel.add(calcDispArea,gbc);

            //CalculationArea and calculation display area
            

            calculationArea.setPreferredSize(new Dimension(50,50));
            calculationArea.setHorizontalAlignment(SwingConstants.RIGHT);
            calcDispArea.setHorizontalAlignment(SwingConstants.RIGHT);
            
            // calcDispArea.setHorizontalAlignment(SwingConstants.RIGHT);

                // //Component properties
                calculationArea.setEditable(false);
                calcDispArea.setEditable(false);

            //Numbers
            b1 = new JButton("1");
            gbc.gridy = 0;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b1,gbc);

            b2 = new JButton("2");
            gbc.gridy = 0;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b2,gbc);

            b3 = new JButton("3");
            gbc.gridy = 0;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b3,gbc);

            b4 = new JButton("4");
            gbc.gridy = 1;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b4,gbc);

            b5 = new JButton("5");
            gbc.gridy = 1;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b5,gbc);

            b6 = new JButton("6");
            gbc.gridy = 1;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b6,gbc);

            b7 = new JButton("7");
            gbc.gridy = 2;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b7,gbc);

            b8 = new JButton("8");
            gbc.gridy = 2;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b8,gbc);

            b9 = new JButton("9");
            gbc.gridy = 2;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b9,gbc);


            b0 = new JButton("0");
            gbc.gridy = 3;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(b0,gbc);
            

            // Dot, Clear and all clear
            bclear = new JButton("C");
            gbc.gridy = 3;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bclear,gbc);


            ballclear = new JButton("AC");
            gbc.gridy = 4;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(ballclear,gbc);

            bdot = new JButton(".");
            gbc.gridy = 3;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bdot,gbc);

            //Pi and Exponential
            bpi = new JButton("\u03C0");
            gbc.gridy = 4;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bpi,gbc);

            bexp = new JButton("e");
            gbc.gridy = 4;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bexp,gbc);

            
            //Equal to
            bequal = new JButton("=");
            gbc.gridy = 5;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            bttnPanel.add(bequal,gbc);


            //Arithematic
            bplus = new JButton("+");
            gbc.gridy = 0;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bplus,gbc);

            bsubtract = new JButton("-");
            gbc.gridy = 1;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bsubtract,gbc);

            bmul = new JButton("X");
            gbc.gridy = 2;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bmul,gbc);

            bdiv = new JButton("\u002f");
            gbc.gridy = 3;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bdiv,gbc);

            bmod = new JButton("%");
            gbc.gridy = 4;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bmod,gbc);
            
            //Algebric
            bxraisey = new JButton("x\u02B8");
            gbc.gridy = 5;
            gbc.gridx = 1;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bxraisey,gbc);

            byrootx = new JButton("y\u221Ax");
            gbc.gridy = 5;
            gbc.gridx = 2;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(byrootx,gbc);

            bfactorial = new JButton("x!");
            gbc.gridy = 5;
            gbc.gridx = 3;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bfactorial,gbc);

            bxinverse = new JButton("(\u0031\u002fx)");
            gbc.gridy = 5;
            gbc.gridx = 4;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bxinverse,gbc);
           
            //Trignometric
            bsin = new JButton("Sin");
            gbc.gridy = 0;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bsin,gbc);

            bcos = new JButton("Cos");
            gbc.gridy = 1;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bcos,gbc);

            btan = new JButton("Tan");
            gbc.gridy = 2;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(btan,gbc);

            //Inverse Trignometric
            bsininv = new JButton("Sin\u207B\u00b9");
            gbc.gridy = 0;
            gbc.gridx = 6;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bsininv,gbc);

            bcosinv = new JButton("Cos\u207B\u00b9");
            gbc.gridy = 1;
            gbc.gridx = 6;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bcosinv,gbc);

            btaninv = new JButton("Tan\u207B\u00b9");
            gbc.gridy = 2;
            gbc.gridx = 6;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(btaninv,gbc);

            //Log & Natural Log
            blog = new JButton("log");
            gbc.gridy = 3;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(blog,gbc);

            bln = new JButton("ln");
            gbc.gridy = 3;
            gbc.gridx = 6;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bln,gbc);

            //Parenthesis
            brightparenthesis = new JButton("(");
            gbc.gridy = 4;
            gbc.gridx = 5;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(brightparenthesis,gbc);

            bleftparenthesis = new JButton(")");
            gbc.gridy = 4;
            gbc.gridx = 6;
            gbc.gridheight = 1;
            gbc.gridwidth = 1;
            bttnPanel.add(bleftparenthesis,gbc);

            //Making the complier perform an action on clicking the button
            //Numberrs
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

            //Pi and exponential
            bpi.addActionListener(this);
            bexp.addActionListener(this);

            //Dot and parenthesis
            brightparenthesis.addActionListener(this);
            bleftparenthesis.addActionListener(this);
            bdot.addActionListener(this);

            //Arithematic
            bplus.addActionListener(this);
            bsubtract.addActionListener(this);
            bmul.addActionListener(this);
            bdiv.addActionListener(this);
            bmod.addActionListener(this);

            //C, Ac, =
            ballclear.addActionListener(this);
            bclear.addActionListener(this);
            bequal.addActionListener(this);

            //Trignometric
            bsin.addActionListener(this);
            bcos.addActionListener(this);
            btan.addActionListener(this);
            bsininv.addActionListener(this);
            bcosinv.addActionListener(this);
            btaninv.addActionListener(this);

            //Algebric
            bxraisey.addActionListener(this);
            byrootx.addActionListener(this);
            bfactorial.addActionListener(this);
            bxinverse.addActionListener(this);

            //Log and Natural log
            blog.addActionListener(this);
            bln.addActionListener(this);

        }
        void display(String disp, Double ans){
            calcDispArea.setText(disp);
            calculationArea.setText(ans+"");
        }
        void isEqualto(){
                if(operationTrigo == "Sin" || operationTrigo == "Cos" || operationTrigo == "Tan" || operationTrigo == "Sininv" || operationTrigo == "Cosinv" || operationTrigo == "Taninv"){
                    trigo(last_value);
                }
                if(operation != "" && operationTrigo == ""){
                    if (operation == "addition") {
                        ans = prev_value + last_value;
                    }
                    else if (operation == "subtraction") {
                        ans = prev_value - last_value; 
                    }
                    else if (operation == "multiplication") {
                        ans = prev_value * last_value; 
                    }
                    else if (operation == "division") {
                        ans = prev_value/last_value; 
                    }
                }
                if (operation_algebra == "" && operation_log == "" && operation_ln == "" ) {
                    display(disp, ans);
                }
            }
        void trigo(Double val){
            if(operationTrigo == "Sin"){
                temp_value =(Math.sin(Math.toRadians(val)));
            }
            else if(operationTrigo == "Cos"){
                temp_value =(Math.cos(Math.toRadians(val)));
            }
            else if(operationTrigo == "Tan"){
                temp_value =(Math.tan(Math.toRadians(val)));
            }
            else if(operationTrigo == "Sininv"){
                temp_value =Math.toDegrees(Math.asin(val));
            }
            else if(operationTrigo == "Cosinv"){
                temp_value =Math.toDegrees(Math.acos(val));
            }
            else if(operationTrigo == "Taninv"){
                temp_value =Math.toDegrees(Math.atan(val));
            }

        }
        void fact(Double val){
            double fact=1;
            for (int i = 1; i <= val; i++) {
                fact = fact * i;
            }
            if (prev_value == 0) {
                ans = fact;
                last_value = fact;
            }
            else{
                last_value = fact;
            }
            operationAssist = "";
            isEqualto();
        }
        void percentage(Double val){
            if (val != 0) {
                last_value = (val*last_value/100);
                disp = disp + "%";
                isEqualto();
        }
            else{
                disp = disp + "% of (";
                prev_value = last_value;
                last_value = 0;
            }
        }
        void percentageof(Double val){
                ans = (val * prev_value/100);
        }
        void yrootx(){
            Double n;
            if (last_value == 0) {
                n = 2.0;
            }
            else{
                n = last_value;
            }
            raiseto_function(1/n);
            display(temp_disp, temp_value);
        }
        void xraisetoy(){
            Double n;
            if (last_value == 0) {
                n = 1.0;
            }
            else{
                n = last_value;
            }
            raiseto_function(n);
            ans = temp_value;
            display(disp, ans);
        }
        void raiseto_function(Double x){
            temp_value = Math.pow(alg_value, x);
        }
        void xinv(){
             temp_value = 1/alg_value;
             ans = temp_value;
        }
        void log10_func(Double x){
            temp_value = Math.log10(x);
            display(disp, temp_value);
        }
        void log_func(Double x){
            temp_value = Math.log(x);
            display(disp, temp_value);
        }
        void onComplete(){
            if(operation_algebra != ""){
                if(operation_algebra == "root"){
                    yrootx();
                    disp = temp_disp;
            }
                else if(operation_algebra == "raiseto"){
                    disp = disp + ")";
                    xraisetoy();
                }
                operation_algebra = "";
                ans = temp_value;
                temp_value = 0;
            }
        }
        void autoOperation(){
            instruction.setText("Add ) or press = to update answer");
        }
        public void actionPerformed(ActionEvent e) {
            value  =   e.getActionCommand();
            number = Character.isDigit(value.charAt(0));

            //If value is number/digit
            if (number){
                last_value = (last_value*10) + Double.parseDouble(value);
                if(operation_algebra == ""){
                    disp = disp+value;
                }
                else if(operation_algebra == "root"){
                    temp_disp = last_value + disp;
                    yrootx();
                }
                else if(operation_algebra == "raiseto"){
                    disp = disp + value;
                    xraisetoy();
                }

                if(operation_log == "log"){
                    log10_func(last_value);
                }
                if(operation_ln == "log"){
                    log_func(last_value);
                }

                if(operationTrigo != "" && operationAssist == "percentage" && operation_algebra != "" && operation_log != "" &&  operation_ln != "" ){
                
                }
                else{
                    ans = last_value;
                }

                isEqualto();
            }

        //If value is Sin, Cos, Tan
            if (value == "=") {
                if (operation_algebra != "") {
                    onComplete();
                }
                disp = ans + "";
                operationTrigo = "";
                isEqualto();
                last_value = ans;
                instruction.setText("");
                operation = "";
            }
            else if(value == ")"){
                if(operationTrigo == "Sin" || operationTrigo == "Cos" || operationTrigo == "Tan"  || operationTrigo == "Sininv" || operationTrigo == "Cosinv" || operationTrigo == "Taninv"){
                    disp = disp + ")";
                    last_value = temp_value;
                    ans = last_value;
                    operationTrigo = "";
                    instruction.setText("");
                    isEqualto();
                }
                if(operation_algebra == "raiseto"){
                    disp = disp + ")";
                    operation_algebra = "";
                }
                if(operationAssist == "percentage"){
                    disp = disp + ")";
                    percentageof(last_value);
                }
                if(operation_log == "" && operation_ln=="log"){
                    disp = disp + ")";
                    ans = temp_value;
                    operation_ln="";
                    instruction.setText("");
                }
                display(disp, ans);
            }
            else if(value == "+"){
                onComplete();
                operation = "addition";
                prev_value = ans;
                disp = disp + "+";
                display(disp, ans);
                last_value = 0;
            }
            else if(value == "-"){
                onComplete();
                operation = "subtraction";
                prev_value = ans;
                disp = disp + "-";
                display(disp, ans);
                last_value = 0;
            }
            else if(value == "X"){
                onComplete();
                operation = "multiplication";
                prev_value = ans;
                disp = disp + "x";
                display(disp, ans);
                last_value = 0;
            }
            else if(value == "\u002f"){
                onComplete();
                operation = "division";
                prev_value = ans;
                disp = disp + "/";
                display(disp, ans);
                last_value = 0;
            }
            else if (value == "%") {
                onComplete();
                operationAssist = "percentage";
                percentage(prev_value);
                display(disp, ans);
            }
            else if (value == "Sin") {
                autoOperation();
                operationTrigo = "Sin";
                disp = disp + "Sin(";
                display(disp, ans);
            }
            else if (value == "Cos") {
                autoOperation();
                operationTrigo = "Cos";
                disp = disp + "Cos(";
                display(disp, ans);
            }
            else if (value == "Tan") {
                autoOperation();
                operationTrigo = "Tan";
                disp = disp + "Tan(";
                display(disp, ans);
            }
            else if (value == "Sin\u207B\u00b9") {
                autoOperation();
                operationTrigo = "Sininv";
                disp = disp + "Sin\u207B\u00b9(";
                display(disp, ans);
            }
            else if (value == "Cos\u207B\u00b9") {
                autoOperation();
                operationTrigo = "Cosinv";
                disp = disp + "Cos\u207B\u00b9(";
                display(disp, ans);
            }
            else if (value == "Tan\u207B\u00b9") {
                autoOperation();
                operationTrigo = "Taninv";
                disp = disp + "Tan\u207B\u00b9(";
                display(disp, ans);
            }
            else if (value == "x!") {
                operationAssist = "fact";
                disp = disp + "!";
                fact(last_value);                
                display(disp, ans);
            }
            else if (value == "(\u0031\u002fx)") {
                System.out.println(ans);
                operation_algebra ="xinverse";
                alg_value = ans;
                last_value = 0;
                disp = "1/("+ans+")";
                xinv();
                display(disp, ans);
                System.out.println(ans);
            }
            else if (value == "y\u221Ax") {
                disp = "\u221A" + ans ;
                operation_algebra ="root";
                alg_value = ans;
                last_value = 0;
                temp_disp = disp;
                yrootx();                
            }
            else if (value == "x\u02B8") {
                operation_algebra ="raiseto";
                alg_value = ans;
                last_value = ans;
                disp = ans + " raise to (";
                xraisetoy();                
            }
            else if (value == "log") {
                autoOperation();
                operation_log = "log";
                disp = disp + "log(";
                display(disp, ans);
            }
            else if (value == "ln") {
                autoOperation();
                operation_log = "ln";
                disp = disp + "ln(";
                display(disp, ans);
            }
            else if(value == "AC"){
                calculationArea.setText("");
                calcDispArea.setText("");

                last_value =0;
                ans = 0;
                prev_value = 0;

                temp_disp = "";
                disp = "";
                operation = "";
                operationAssist = "";
                operationTrigo = "";
            }

            
        }
    }
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener ;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SCalci{
    public static void main(String srgs[])
    {
        Sc_Calculat obj = new Sc_Calculat();
        obj.setVisible(true);
        obj.setSize(400,400);
        obj.setTitle("Scientific Calculator");
        obj.setResizable(false);
    }
}
     class Sc_Calculat extends JFrame implements ActionListener
    {
        JTextField calculationArea, calcDispArea;

        public Sc_Calculat()
        {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            //Initializion of JFrame Components
            JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bpi,bexp,bdot,bclear,ballclear;
            JButton bplus,bsubtract,bmul,bdiv,bequal,bmod;
            JButton blog,bln,bfactorial,bxraisey,byrootx,bxinverse,bleftparenthesis,brightparenthesis;
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

            bmul = new JButton("\u2715");
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
        

        ArrayList <String> bodmas_algo = new ArrayList<String>();
        ArrayList <String> main_array = new ArrayList<String>();
        
        JLabel instruction;
        boolean number = false,operation = false,start = false, brack_end = false, negative = false , power = false, decimal = false,lastvalue_added=false;

        String value = "",DisplayEquation="";
        double ans=0.0,last_value=0.0 , prev_value=0.0, temp_value=0.0, pi_value = 22/7f;
        int first_brack= 0 , last_brack = 0,ans_pos,i=0,j=0,k=0,power_count = 0,trigo_sin=0;

        void display_output(String ans){
            calculationArea.setText(ans);
        }
        
        void division(Double a, Double b){
            ans = a/b;
        }
        void multiplication(Double a, Double b){
            ans = a*b;
        }
        void addition(Double a, Double b){
            ans = a+b;
        }
        void subtract(Double a, Double b){
            ans = a-b;
        }
        void order(Double x , Double y){
            ans  = Math.pow(x,y);
        }
        void trigo(String func,Double x){
            if (func == "Sin") {
                ans = Math.sin(Math.toRadians(x));
            }
            else if (func == "Cos") {
                ans = Math.cos(Math.toRadians(x));
            }
            else if (func == "Tan") {
                ans = Math.tan(Math.toRadians(x));
            }
        }
        void trigo_inv(String func,Double x){
            if (func == "Sin\u207B\u00b9") {
                ans = Math.toDegrees(Math.asin(x));
            }
            else if (func == "Cos\u207B\u00b9") {
                ans = Math.toDegrees(Math.acos(x));
            }
            else if (func == "Tan\u207B\u00b9") {
                ans = Math.toDegrees(Math.atan(x));
            }
        }
        void log_func(String x , Double y){
            if (x == "ln") {
                ans = Math.log(y);
            }
            else if (x == "log") {
                ans = Math.log10(y);
            }
        }
        void allClear(){
            display_output("");
                calculationArea.setText("");
                DisplayEquation = "";value = "";
                number = false;operation = false;start = false; brack_end = false; negative = false ; power = false; decimal = false;
                first_brack= 0 ; last_brack = 0;ans_pos=0;i=0;j=0;k=0;power_count = 0;trigo_sin=0;
                ans=0.0;last_value=0.0 ; prev_value=0.0; temp_value=0.0;
                start = false;
                main_array.removeAll(main_array);
        }
        public void actionPerformed(ActionEvent e) {
            try{
            value  =   e.getActionCommand();
            number = Character.isDigit(value.charAt(0));
            
            System.out.println(main_array);
            if(start == false){
                main_array.add("(");
                start = true;
            }
        
            if (number) {
                if (decimal) {
                    last_value = (last_value) + (Double.parseDouble(value)/10);
                    DisplayEquation = DisplayEquation + ".";
                }
                else{
                    last_value = (last_value*10) + Double.parseDouble(value);
                    if (negative == true) {
                        last_value = last_value * (-1);
                        negative = false;
                }
                }
                DisplayEquation = DisplayEquation + value;
                lastvalue_added = false;

            } 
            else {
                if (value == "+" || value == "\u2715" || value == "\u002f" ) {
                    decimal = false;
                    if (brack_end || power) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");
                        lastvalue_added = true;   
                    }
                        last_value = 0;
                        main_array.add(value);
                        DisplayEquation = DisplayEquation + value;
                }
                else if( value == "-" ){
                    decimal = false;
                    if (brack_end || power) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");
                        lastvalue_added = true;  
                        brack_end = false; 
                    }
                    main_array.add("+");
                    last_value = 0;
                    negative = true;
                    DisplayEquation = DisplayEquation + value;
                }
                else if(value == "x\u02B8"){
                    decimal = false;
                    if (brack_end || power) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");
                        lastvalue_added = true;   
                        brack_end = false; 
                    }
                    power_count++;
                    main_array.add("pow");
                    main_array.add("(");
                    last_value = 0;
                    DisplayEquation = DisplayEquation + "Power of (";
                }
               
                else if(value == "Sin" || value == "Cos" || value == "Tan"){
                    decimal = false;
                    instruction.setText("In Degree");
                    if (negative == true) {
                        main_array.remove(main_array.size()-1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation+ value + "(";
                }
                else if(value == "Sin\u207B\u00b9" || value == "Cos\u207B\u00b9" || value == "Tan\u207B\u00b9"){
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size()-1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation+ value + "(";
                }
                else if(value == "log" || value == "ln"){
                    decimal = false;
                    if (negative == true) {
                        main_array.remove(main_array.size()-1);
                        main_array.add("-");
                        negative = false;
                    }
                    main_array.add(value);
                    main_array.add("(");
                    trigo_sin++;
                    DisplayEquation = DisplayEquation+ value + "(";
                }
                else if(value == "."){
                    decimal = true;
                }
                else if (value == "(") {
                    if(negative){
                        main_array.remove(main_array.get(main_array.size()-1));
                        main_array.add("-");
                        main_array.add(value);
                        negative = false;
                    }
                    else{
                        main_array.add(value);
                    }
                    DisplayEquation = DisplayEquation + value;
                }
                else if(value == ")"){
                    trigo_sin--;
                    if(main_array.get(main_array.size() - 1) == ")"){
                    }
                    else{
                        main_array.add(""+last_value);
                        lastvalue_added=true;
                    }
                    if (trigo_sin == 0) {
                        instruction.setText("");
                    }
                    main_array.add(")");
                    brack_end = true;
                    last_value = 0;
                    DisplayEquation = DisplayEquation + value;
                }
                else if(value == "AC"){
                    allClear();
                }
                else if(value == "C"){
                    if (lastvalue_added == false) {
                        System.out.println(main_array);
                        main_array.add(""+last_value);
                        last_value = 0;
                        lastvalue_added = true;
                        if (last_value >= 0 || last_value < 10) {
                            main_array.remove(main_array.size()-1);
                        } 
                        else if (last_value>=10) {
                            last_value = last_value/10-last_value%10;
                            main_array.set(main_array.size()-1,""+ last_value);
                        }
                        else if(last_value < 0){
                            last_value = (last_value/10-last_value%10)*-1;
                            main_array.set(main_array.size()-1,"-"+last_value); 
                        }
                        System.out.println(main_array);
                        
                    }
                    else{
                        System.out.println(main_array);
                        main_array.remove(main_array.size()-1);
                        System.out.println(main_array);
                    }
                    
                }
                else if (value == "=") {
                System.out.println("Start Main ArrayList = "+main_array+"\nsize: "+main_array.size()+"\n");
                if(main_array.get(main_array.size() - 1) == ")"){
                }
                else{
                    main_array.add(""+last_value);
                    }
                    main_array.add(")");

                    test:while(main_array.size() > 1 ){

                        bodmas_algo.removeAll(bodmas_algo);

                        k=0;i=0;last_brack = 0;first_brack=0;

                        for (i = 0; i < main_array.size(); i++) {
                            if(main_array.get(i) == "("){
                                first_brack = i+1;
                            }
                            }
                            //Search for first ")"
                            for (j = first_brack; j < main_array.size();j++) {
                            if(main_array.get(j) == ")"){
                                last_brack = j-1;
                                break ;
                            }
                            }
                            for(k = first_brack ; k <= last_brack; k++){
                            bodmas_algo.add(main_array.get(k));
                            }
                            //System.out.println("Bodmas_algo start loop:\nMain:"+main_array+"\tSize:"+main_array.size()+"\nAlgo:"+bodmas_algo+"\tSize:"+bodmas_algo.size());
                            if (first_brack == last_brack) {
                                main_array.remove(first_brack+1);
                                main_array.remove(first_brack-1);
                            }
                            else{
                                for(k = bodmas_algo.size()-1 ; k >= 0;k--){
                                    if(bodmas_algo.get(k) == "pow" ){//raise to
                                        operation = true;
                                        order( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                        removeorder(first_brack,last_brack,k);
                                    }
                                }

                                for(k = bodmas_algo.size()-1 ; k >= 0 ;k--){
                                    if(bodmas_algo.get(k) == "Sin" || bodmas_algo.get(k) == "Cos" || bodmas_algo.get(k) == "Tan" ){//tirgo
                                        operation = true;
                                        trigo(bodmas_algo.get(k) ,Double.parseDouble(bodmas_algo.get(k+1)));
                                        remove_trigo_log(first_brack,last_brack,k);
                                    }
                                    if(bodmas_algo.get(k) == "Sin\u207B\u00b9" || bodmas_algo.get(k) == "Cos\u207B\u00b9" || bodmas_algo.get(k) == "Tan\u207B\u00b9" ){//Sin
                                        operation = true;
                                        trigo_inv(bodmas_algo.get(k) ,Double.parseDouble(bodmas_algo.get(k+1)));
                                        remove_trigo_log(first_brack,last_brack,k);
                                    }
                                    if(bodmas_algo.get(k) == "log" || bodmas_algo.get(k) == "ln"){//log
                                        operation = true;
                                        log_func(bodmas_algo.get(k) ,Double.parseDouble(bodmas_algo.get(k+1)));
                                        remove_trigo_log(first_brack,last_brack,k);
                                    }
                                }
                                for(k = 0 ; k < bodmas_algo.size()-1; k++){
                                
                                    if(bodmas_algo.get(k)==("\u2715")){//multiplication
                                        operation = true;
                                        multiplication( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                        removeorder(first_brack,last_brack,k);
                                    }
                                }
                               
                                for(k = 0 ; k < bodmas_algo.size(); k++){
                                    
                                    if(bodmas_algo.get(k)=="\u002f"){//division
                                        operation = true;
                                        division( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                        remove_arith(first_brack,last_brack,k);
                                        
                                    }
                                }
                                for(k = 0 ; k < bodmas_algo.size(); k++){
                                    if(bodmas_algo.get(k)=="+"){
                                        operation = true;
                                        addition( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                        remove_arith(first_brack,last_brack,k);

                                    }
                                }
                                for(k = 0 ; k < bodmas_algo.size(); k++){
                                    if(bodmas_algo.get(k)=="-"){
                                        operation = true;
                                        subtract( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                        remove_arith(first_brack,last_brack,k);

                                    }
                                }
                            }
                            if(operation == true){
                                main_array.remove(ans_pos + 1);
                                main_array.remove(ans_pos - 1);
                                operation = false;
                                System.out.println("After bracket removed from main: "+main_array);
                            }
                            //System.out.println("\nMain:"+main_array+"\tSize:"+main_array.size()+"\nAlgo:"+bodmas_algo+"\tSize:"+bodmas_algo.size());

                    }
                    DisplayEquation = ""+ans;
                    ans =Double.parseDouble(main_array.get(0));
                    display_output(""+ans);
                    main_array.remove(0);
                    last_value = ans;
                    number = false; operation = false;start = false; brack_end = false; negative = false ; power = false;
                }
            }
        }catch(Exception err){
            System.out.println("Error: "+err);
        }
        calcDispArea.setText(DisplayEquation);
        }
        void remove_arith(int first_brack,int last_brack, int Op_pos){

            main_array.set(first_brack+Op_pos,""+ans);
            bodmas_algo.set(Op_pos,""+ans);

            main_array.remove(first_brack+Op_pos+1);
            main_array.remove(first_brack+Op_pos-1);

            bodmas_algo.remove(Op_pos+1);
            bodmas_algo.remove(Op_pos-1);

            ans_pos = first_brack+Op_pos-1;

            k=0;
          }
          void removeorder(int first_brack,int last_brack, int Op_pos){
            main_array.set(first_brack+Op_pos,""+ans);
            bodmas_algo.set(Op_pos,""+ans);

            main_array.remove(first_brack+Op_pos+1);
            main_array.remove(first_brack+Op_pos-1);

            bodmas_algo.remove(Op_pos+1);
            bodmas_algo.remove(Op_pos-1);

            ans_pos = first_brack+Op_pos-1;
            
            k = bodmas_algo.size() -1;
          }
          void remove_trigo_log(int first_brack,int last_brack, int trigo_answer_pos){

            main_array.set(first_brack+trigo_answer_pos,""+ans);
            bodmas_algo.set(trigo_answer_pos,""+ans);

            main_array.remove(first_brack+trigo_answer_pos+1);
            bodmas_algo.remove(trigo_answer_pos+1);

            ans_pos = first_brack  + trigo_answer_pos;
            k = bodmas_algo.size() -1;
            
          }
}

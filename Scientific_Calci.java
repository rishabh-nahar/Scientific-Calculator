

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
        boolean number = false,operation = false,start = false, brack_end = false, negative = false , power = false;

        String value = "",DisplayEquation="";
        double ans=0.0,last_value=0.0 , prev_value=0.0, temp_value=0.0, pi_value = 22/7f;
        int first_brack= 0 , last_brack = 0,ans_pos,i=0,j=0,k=0,power_count = 0;

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
                last_value = (last_value*10) + Double.parseDouble(value);
                if (negative == true) {
                    last_value = last_value * (-1);
                    negative = false;
                }
                DisplayEquation = DisplayEquation + value;
            } 
            else {
                if (value == "+" || value == "\u2715" || value == "\u002f" ) {
                    if (brack_end) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");   
                    }
                    last_value = 0;
                    main_array.add(value);
                    DisplayEquation = DisplayEquation + value;
                }
                else if( value == "-" ){
                    if (brack_end) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");  
                        brack_end = false; 
                    }
                    main_array.add("+");
                    last_value = 0;
                    negative = true;
                    DisplayEquation = DisplayEquation + value;
                }
                else if(value == "x\u02B8"){
                    if (brack_end) {
                        brack_end = false;
                    } else {
                        main_array.add(last_value+"");   
                        brack_end = false; 
                    }
                    power_count++;
                    main_array.add("pow");
                    last_value = 0;
                    DisplayEquation = DisplayEquation + "Power of (";
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
                    if (power_count != 0) {
                        power_count--;
                    } else {
                        if(main_array.get(main_array.size() - 1) == ")"){
                            main_array.add(")");
                        }
                        else{
                            main_array.add(""+last_value);
                            main_array.add(")");
                        }
                        brack_end = true;
                        last_value = 0;
                    }
                    DisplayEquation = DisplayEquation + value;
                }

                else if (value == "=") {
                System.out.println("Start Main ArrayList = "+main_array+"\nsize: "+main_array.size()+"\npos_sec_last: "+main_array.get(main_array.size()-1));
                if(main_array.get(main_array.size() - 1) == ")"){
                }
                else{
                    main_array.add(""+last_value);
                }
                    main_array.add(")");
                    test:do{
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
                            System.out.println("Bodmas_algo start loop:\nMain:"+main_array+"\tSize:"+main_array.size()+"\nAlgo:"+bodmas_algo+"\tSize:"+bodmas_algo.size());
                            int count = 0;
                            count++;
                            for(k = bodmas_algo.size()-1 ; k >= 0;k--){
                                if(bodmas_algo.get(k)== "pow" ){//raise to
                                    operation = true;
                                    order( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                                    remove_elem(first_brack,last_brack);
                                    System.out.println(main_array);
                                }
                            }
                            if (count >= 3) {
                                break test;
                            }
                            // for(k = 0 ; k < bodmas_algo.size()-1; k++){
                            //     if(bodmas_algo.get(k)==("\u2715")){//multiplication
                            //     operation = true;
                            //     multiplication( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                            //     remove_elem(first_brack,last_brack);
                            //     }
                            // }
                            // for(k = 0 ; k < bodmas_algo.size(); k++){
                            //     if(bodmas_algo.get(k)=="\u002f"){//division
                            //         operation = true;
                            //         division( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                            //         remove_elem(first_brack,last_brack);
                            //     }
                            // }
                            // for(k = 0 ; k < bodmas_algo.size(); k++){
                            //     if(bodmas_algo.get(k)=="+"){
                            //         operation = true;
                            //         addition( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                            //         remove_elem(first_brack,last_brack);
                            //     }
                            // }
                            // for(k = 0 ; k < bodmas_algo.size(); k++){
                            //     if(bodmas_algo.get(k)=="-"){
                            //         operation = true;
                            //         subtract( Double.parseDouble(bodmas_algo.get(k-1)) , Double.parseDouble(bodmas_algo.get(k+1) ));
                            //         remove_elem(first_brack,last_brack);
                            //     }
                            // }
                            if(operation == true){
                                main_array.remove(ans_pos + 1);
                                main_array.remove(ans_pos - 1);
                                operation = false;
                            }
                            System.out.println("\nMain:"+main_array+"\tSize:"+main_array.size()+"\nAlgo:"+bodmas_algo+"\tSize:"+bodmas_algo.size());

                    }while(main_array.size() > 1 );
                    System.out.println(main_array);
                    ans =Double.parseDouble(main_array.get(0));
                    display_output(""+ans);
                    main_array.remove(0);
                    last_value = ans;
                    main_array.add("(");
                }
            }
        }catch(Exception err){
            System.out.println("Error: "+err);
            System.out.println("E:> "+err.getStackTrace()[0].getLineNumber());
        }
        calcDispArea.setText(DisplayEquation);
        }
        void remove_elem(int first_brack,int last_brack){

            main_array.set(first_brack+k,""+ans);
            bodmas_algo.set(k,""+ans);

            main_array.remove(first_brack+k+1);
            main_array.remove(first_brack+k-1);

            bodmas_algo.remove(k+1);
            bodmas_algo.remove(k-1);

            ans_pos = first_brack+k-1;
            k=0;
          }
}

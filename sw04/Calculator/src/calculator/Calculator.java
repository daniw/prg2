/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.awt.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Daniel
 */
public class Calculator extends Frame
{
    Label empty0    = new Label();
    Label empty1    = new Label();
    Label empty2    = new Label();
    TextField value = new TextField("0");
    Button zero     = new Button("0");
    Button one      = new Button("1");
    Button two      = new Button("2");
    Button three    = new Button("3");
    Button four     = new Button("4");
    Button five     = new Button("5");
    Button six      = new Button("6");
    Button seven    = new Button("7");
    Button eight    = new Button("8");
    Button nine     = new Button("9");
    Button plus     = new Button("+");
    Button minus    = new Button("-");
    Button times    = new Button("*");
    Button divide   = new Button("/");
    Button equals   = new Button("=");
    Button clear    = new Button("C");
    Button sign     = new Button("+/-");
    
    public Calculator()
    {
        super("PRG2Calculator");
        setSize(250, 210);
        setResizable(false);
        setLayout(new BorderLayout());
        Container buttons = new Container();
        buttons.setLayout(new BorderLayout());
        Container numbers = new Container();
        numbers.setLayout(new GridLayout(4, 3));
        Container operands = new Container();
        operands.setLayout(new GridLayout(5, 1));
        
        add(value, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        buttons.add(numbers, BorderLayout.CENTER);
        buttons.add(operands, BorderLayout.EAST);
        numbers.add(seven);
        numbers.add(eight);
        numbers.add(nine);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(sign);
        numbers.add(zero);
        operands.add(plus);
        operands.add(minus);
        operands.add(times);
        operands.add(divide);
        operands.add(equals);
        buttons.add(clear, BorderLayout.NORTH);

        value.setEditable(false);
        value.setBackground(Color.WHITE);
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        
    }
    
}

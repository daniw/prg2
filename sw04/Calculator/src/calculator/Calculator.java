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
        buttons.setLayout(new GridLayout(5, 4));
        add(value, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(plus);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(minus);
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(times);
        buttons.add(sign);
        buttons.add(zero);
        buttons.add(equals);
        buttons.add(divide);
        buttons.add(empty0);
        buttons.add(empty1);
        buttons.add(empty2);
        buttons.add(clear);
        empty0.setBackground(Color.lightGray);
        empty1.setBackground(Color.LIGHT_GRAY);
        empty2.setBackground(Color.LIGHT_GRAY);
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

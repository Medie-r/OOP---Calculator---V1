/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the.app;

import javax.swing.JOptionPane;
import the.engine.CalculatorEngine;

/**
 *
 * @author Medie Rubuz
 */
public class CalculatorApp {
    private CalculatorEngine engine;

    public CalculatorApp() {
        this.engine = new CalculatorEngine();
    }
   public void start(){
       
       //step 1: get first number
    double no1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number", "FIRST NUMBER", JOptionPane.INFORMATION_MESSAGE));
    
    //step 2: get operator
    String operator = JOptionPane.showInputDialog(null, "Enter operator: + * - /", "OPERATOR", JOptionPane.INFORMATION_MESSAGE);
    
    //step 3: get second number
    double no2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number", "SECOND NUMBER", JOptionPane.INFORMATION_MESSAGE));

    //step 4: call engine object to do the math
    double calculation = engine.calculate(no1, no2, operator);
    
    String operation = "";
    if(operator.equals("+"))
    {
        operation = "The sum of numbers";
    }else if(operator.equals("-"))
    {
        operation = "The difference of numbers";
    }else if (operator.equals("*"))
    {
     operation = "The product of numbers";

    }else if(operator.equals("/"))
    {
    operation = "The quotient of numbers";
    }else
    {
     operation = "Invalid operator";
    }
    
   
    
    //check if it's a whole number
    if(calculation == (int)calculation)
    {
       //step 5: show result
    JOptionPane.showMessageDialog(null, "Result: "+(int)calculation, operation, JOptionPane.INFORMATION_MESSAGE);  
    }else
    {
         //step 5: show result
    JOptionPane.showMessageDialog(null, "Result: "+calculation, operation, JOptionPane.INFORMATION_MESSAGE);
    }
   }
}

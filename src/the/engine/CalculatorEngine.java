/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the.engine;

/**
 *
 * @author Medie Rubuz
 */
public class CalculatorEngine {
    
  
    public double add(double a, double b)
    {
        double sum = 0.0;
           sum = a + b;

        return sum;
    }
    public double substract(double a, double b)
    {
        double difference = 0.0;
        difference = a - b;
        return difference;
    }
    public double division(double a, double b)
    {
        double quotient = 0.0;
        if(b ==0)
        {
           quotient =0; //v1 avoid crash. will throw exception in v2 
        }else
        {
        quotient = a/b;
        }
        return quotient;
    }
    public double multiplication(double a, double b)
    {
        double product = 0.0;
        product = a*b;
        return product;
    }
    public double calculate(double a, double b, String operator)
    {
        double result = 0.0;
        switch(operator)
        {
            case "+":
             result = add( a, b);   
            break;
            case"-":
            result = substract( a, b);   
            break;
            case"*":
             result = multiplication( a, b);   
            break;
            case"/":
            result = division( a, b);   
            break;
            default:
               result =0; 
            break;
        }
        return result;
    }
}

    


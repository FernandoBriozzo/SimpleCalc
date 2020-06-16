/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbdemo;

/**
 *
 * @author Fer
 */
public class Functions {
    public String AppendNumber(String x, String y){
        return x + y;
    }
    
    public String Calculate(String x, String y, String operator){
        String Result;
        float num1 = Float.parseFloat(x);
        float num2 = Float.parseFloat(y);
        switch(operator){
            case "+":
                Result = String.valueOf(num1 + num2);
                break;
            case "-":
                Result = String.valueOf(num1 - num2);
                break;
            case "*":
                Result = String.valueOf(num1 * num2);
                break;
            case "/":
                Result = String.valueOf(num1 / num2);
                break;
            default:
                Result = "?";
        }
        
        return Result;
    }
}

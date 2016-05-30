/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mc;

import com.leapfrog.mc.command.MathCommand;
import com.leapfrog.mc.command.MathFactory;
import com.leapfrog.mc.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc= new Calculator();
        while(true){
        System.out.println("Please enter the first number:");
        int x = input.nextInt();
        System.out.println("Please enter the second number:");
        int y = input.nextInt();
        int total=0;
        
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
        System.out.println("Please enter your choice[1-5]");
        String choice =input.next();
            
            MathCommand cmd = MathFactory.get(choice);
            if(cmd!=null){
                System.out.println("Total is : " + cmd.calculate(x, y));
            }else{
                System.out.println("Invalid Command");
            }
            System.out.println("Do you want to Continue[Y/N]:");
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }
    
}

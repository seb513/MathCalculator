/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mc.command;

/**
 *
 * @author User
 */
public class MathFactory {
    public static  MathCommand get(String key){
        if(key.equals("1")){
            return new AddCommand();
        }else if(key.equals("2")){
            return new SubCommand();
        }else if(key.equals("3")){
            return new MulCommand();
        }else if(key.equals("4")){
            return new DivCommand();
        }else
            return null;
    }
    
}

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
public class MulCommand extends MathCommand{

    @Override
    public int calculate(int x, int y) {
        return x*y;
    }
    
}

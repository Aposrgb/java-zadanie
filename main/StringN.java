/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kamalov.main;

import ru.kamalov.geometry.Figures;
import ru.kamalov.geometry.Lenghtable;

/**
 *
 * @author abbos
 */
public class StringN extends Figures implements Lenghtable{
    private String str;

    public StringN(String str) {
        this.str = str;
    }
    
    @Override
    public int Length() {
        int res=0;
        for(int i=0;i<str.length();i++){
            res+=(int)str.charAt(i);
        }
        return res;
    }

    @Override
    public int getS() {
        return str.length();
    }
    
}

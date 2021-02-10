/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kamalov.numbers;

/**
 *
 * @author abbos
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drob<Integer> s= new Drob<>(1,1);
        Drob<Number> s1= new Drob<>(1,2);
        System.out.println(s.compareTo(s1));
    }
    
}
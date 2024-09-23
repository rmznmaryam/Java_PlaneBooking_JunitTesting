/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author maryam
 */
public class NonMember extends Passenger{
    
    public NonMember(String name, int age) {
        super(name, age);
    }
    
      
    @Override
    public double applyDiscount(double p){
    if(getAge()>65){
        return 0.9*p;//10% off discount for passengers over 65
    
    }else 
        return p;//No discount for other ages
    }
    
}

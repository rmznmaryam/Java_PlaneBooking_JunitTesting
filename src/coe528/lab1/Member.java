/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author maryam
 */
public class Member extends Passenger{
     private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
                
                
    }

    @Override
    public double applyDiscount(double p) {
        if(yearsOfMembership >5){//Member for more than 5 years
            return 0.5*p;
        }else if(yearsOfMembership>1 && yearsOfMembership <5 ){ //More than 1 year yet less than 5 years membership
            return 0.9*p;
        }else
            return p;
    }
}
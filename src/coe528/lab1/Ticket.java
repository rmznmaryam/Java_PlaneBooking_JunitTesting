/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Maryam
 */
public class Ticket {
    
    public Passenger passenger;
    public Flight flight;
    public double price;
    
    public static int number;// ticket number
    
    public Ticket(Passenger pass, Flight flight, double price){
        this.passenger= pass;
        this.flight=flight;
        this.price=price;
        number++; //increment number of Ticket created
          
    }
    
    public int getTicketNumber(){
    return number;
    }
    
    public double getPrice(){
    return price;
    }
    
    public void setPrice(double price){
    this.price=price;
    }
    
    public Passenger getPassenger(){
    return passenger;
    }
    
   
    @Override 
    public String toString(){
    return (passenger.name +", Flight "+ flight.flightNumber + ", "+ flight.origin + ", to " +flight.destination
            +   " at " + flight.departureTime + " | Capacity: "+ flight.capacity + ", Remaining seats: "
            + flight.numOfSeatsLeft+ ", Original Price:$" + flight.originalPrice + ", Ticket Price:$ "+ price);
    }
}
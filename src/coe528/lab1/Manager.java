/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Maryam
 */
public class Manager {
    //Initialize or prepare the arrays to store all Tickets and Flights
   public Flight[] f1;
   public Ticket[] t1;

    /**
     *
     */
   
//Hardcode passengers
    Passenger maryam = new Member("Maryam", 18, 2);
    Passenger salma = new NonMember("Salma", 26);
    Passenger zainab = new Member("Zainab", 69, 8);
    
//Constructor
    public Manager(Flight[] f1, Ticket[] t1){
        this.f1 = f1;
        this.t1= t1;
    
    }
   
    
    public void createFlights(){ //Create flights and tickets corresponding to passengers
        //Make flights and store it in the array
        Flight texas = new Flight(380, "Toronto", "Texas", "6/21/2024 5pm", 1200, 1200, 1018);
        Flight florida = new Flight(350, "Dallas", "Florida", "6/30/24 9am", 1200, 1100,1018);
        Flight pei = new Flight(260, "Ottawa", "PEI", "7/12/2025 3pm", 1000, 200,740);
                
        f1[0]= texas;
        f1[1]=florida;
        f1[2]= pei;
        
        //Make tickets and store it in the array
        Ticket toronto = new Ticket(maryam, texas, maryam.applyDiscount(1018.0)); 
        Ticket dallas = new Ticket(salma, florida, salma.applyDiscount(1018.0));
        Ticket ottawa = new Ticket(zainab, pei,zainab.applyDiscount(740.0));
        
        t1[0]= toronto;
        t1[1]=dallas;
        t1[2]= ottawa;
        
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for (Flight f2 : f1){ //make a variable type Flight for each element of array f1
            if (f2.getOrigin().equals(origin) && f2.getDestination().equals(destination) && f2.getNumOfSeatsLeft() !=0){ 
            //each Flight object has access to methods of Flight class
                System.out.println(f2); //display that
            }
        }
    }
    /**
     *
     * @param fnum
     */
    public void getFlightN(int fnum){
    for (Flight f3: f1){
        if (f3.getFlightNumber()==fnum){
        System.out.println(f3);
       break;
        }
    }
    System.out.println("That flight number does not exist. Please try again");
    }    
        
    //Book a seat
    public void bookSeat(int flightnum, Passenger p){ 
        //to book a seat it means get tickets and apply discounts based on the passenger's membership
         for (int i=0; i< f1.length; i++){
            if (f1[i].getFlightNumber() == flightnum){ //when the flight number user wants is what we have 
                
            if (f1[i].bookAseat() == true){ //using the boolean bookAseat() method from Flight class
                System.out.println("\nFlight Booked Successfully");
                //fix the ticket and discount
                t1[i].setPrice(t1[i].getPassenger().applyDiscount(t1[i].getPrice()  )  );
                System.out.println(t1[i]);
             
                System.out.println("New Capacity: "+ f1[i].getNumOfSeatsLeft() );
                    
                }else{
                    System.out.println("Flight Booking Unsuccessful. \n This flight has reached maximum capacity");
                }
            }
        }
            
    }
    
    /**
     *
     * @param args
     */
   public static void main(String[] args) {
        // TODO code application logic here
// Initialize arrays with sufficient size
        Flight[] flights = new Flight[3];
        Ticket[] tickets = new Ticket[3];

        // Create an instance of Manager
        Manager manager = new Manager(flights, tickets);
       
        
        //Create flights
        manager.createFlights();
        
        System.out.println("~~WELCOME TO MARYAM AIRLINES~~\n");
        
        //Display Available flights
        System.out.println("---Flights from Toronto to Texas--");
        manager.displayAvailableFlights("Toronto", "Texas");
        
        System.out.println("\n---Flights from Dallas to Florida--");
        manager.displayAvailableFlights("Dallas", "Florida");
        
        System.out.println("\n---Flights from Ottawa to PEI--");
        manager.displayAvailableFlights("Ottawa", "PEI");
                   
         System.out.println("\nHave a great trip, and Thank you for choosing Maryam Airlines");
    }
 }//End of Code
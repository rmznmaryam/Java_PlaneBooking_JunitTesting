/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author Maryam
 */
public class Flight {
    //instance variables
    public int flightNumber;
    public String origin;
    public String destination;
    public String departureTime;
    public int capacity;
    public int numOfSeatsLeft;
    public double originalPrice;
    
    //Constructor
    public Flight(int flightNumber,String origin, String destination, String departureTime, int capacity,int numOfSeatsLeft,double originalPrice){
    this.flightNumber= flightNumber;
    this.origin = origin;
    this.destination=destination;
    this.departureTime=departureTime;
    this.capacity = capacity;
    this.numOfSeatsLeft = numOfSeatsLeft;
    this.originalPrice = originalPrice;
    
    //Cannot have same origin and destination
    if (origin.equals(destination)){
        throw new IllegalArgumentException("Origin and Destination are the same");
        }
       
    }
   
    //Methods
    
    //Getters
    public int getNumOfSeatsLeft(){
    return numOfSeatsLeft;
    }
    
    public String getOrigin(){
   return origin;
    }
    
    public String getDestination(){
    return destination;
    }
    
    public String getDepartureTime(){
    return departureTime;
    }
    
    public int getCapacity(){
    return capacity;
    }
    
    public double getOriginalPrice(){
    return originalPrice;
    }
    
    public int getFlightNumber(){
    return flightNumber;
    }
    
    //Setters
    public void setFlightNumber(int flightNumber){
    this.flightNumber = flightNumber;
    }
    
    public void setNumOfSeatsLeft(int numOfSeatsLeft){
    this.numOfSeatsLeft=numOfSeatsLeft;
    }
    
    public void setOrigin(String origin){
   this.origin= origin;
    }
    
    public void setDestination(String destination){
    this.destination= destination;
    }
    
    public void setDepartureTime(String departureTime){
    this.departureTime= departureTime;
    }
    
    public void setCapacity(int capacity){
    this.capacity= capacity;
    }
    
    public void setOriginalPrice(double originalPrice ){
    this.originalPrice=originalPrice;
    }
    
    //Book a seat
    public boolean bookAseat(){
    if (getNumOfSeatsLeft() > 0){
        numOfSeatsLeft--;
        return true;
    }else
        return false;
    }
    
    //State all the variables
    @Override 
    public String toString(){
    return ("Flight: "+ flightNumber + ", Origin: "+ origin + ", Destination: " +destination
            +   ", Departure Time: " + departureTime + ", Capacity: "+ capacity + ", Number of Seats Left: "
            + numOfSeatsLeft+ ", Original Price:$" + originalPrice);
    }
    
}

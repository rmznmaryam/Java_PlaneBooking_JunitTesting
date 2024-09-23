/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package coe528.lab1;

import coe528.lab1.Flight;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maryam
 */
public class FlightTest {
    private Flight flight;
    public FlightTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() { //test the constructor in the setUp() method
          flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm",1200, 1200, 1000);
        
    }
    
    @After
    public void tearDown() {
        flight= null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testConstructor(){
       Flight flight = new Flight(1030, "Toronto", "Kolkata", 
                "03/02/99 7:50 pm",1200, 1200, 1000);
        
        assertEquals(1030, flight.getFlightNumber());
        assertEquals("Toronto", flight.getOrigin());
        assertEquals("Kolkata", flight.getDestination() );
        assertEquals("03/02/99 7:50 pm", flight.getDepartureTime() );
        assertEquals(1200,flight.getCapacity());
        assertEquals(1200,flight.getNumOfSeatsLeft());
        assertEquals(1000,flight.getOriginalPrice(), 0.0);
        
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        System.out.println("Invalid Constructor");
        flight = new Flight(370, "SriLanka", "SriLanka", "8:00am", 1200, 1200, 1000);
        
    }
    
    //Tests for all the getters
    @Test
    public void testGetFlightNumber(){
     System.out.println("GetFlightNumber");
     int expFlightNumber = 1030;
     double flightNumber = flight.getFlightNumber();
     assertEquals(expFlightNumber, flightNumber, 0);
     
    }
    
    @Test 
    public void testGetOrigin(){
        System.out.println("GetOrigin");
        String expOrigin = "Toronto";
        String origin= flight.getOrigin();
        assertEquals(expOrigin, origin);
    }
    
    @Test
    public void testGetDestination(){
         System.out.println("GetDestination");
         String expDestination = "Kolkata";
         String destination = flight.getDestination();
         assertEquals(expDestination, destination);
    }
    
    @Test
    public void testGetDepartureTime(){
        System.out.println("GetDepartureTime");
        String expDepartureTime="03/02/99 7:50 pm"; //03/02/99 7:50 pm
        String departureTime= flight.getDepartureTime();
        assertEquals(expDepartureTime, departureTime);
    }
    
    @Test
    public void testGetCapacity(){
        System.out.println("Getcapacity");
        int expCapacity = 1200;
        int capacity = flight.getCapacity();
        assertEquals(expCapacity, capacity, 0);
    }
    
    @Test
    public void testNumOfSeatsLeft(){
         System.out.println("GetDepartureTime");
        int expNumofSeatsLeft = 1200;
        int numOfSeatsLeft = flight.getNumOfSeatsLeft();
        assertEquals(expNumofSeatsLeft,numOfSeatsLeft,0 );
 
    }
    
      @Test
   public void testGetPrice(){
       System.out.println("GetPrice");
       double expPrice = 1000;
   double price= flight.getOriginalPrice();
   
   assertEquals(expPrice, price, 0.0); 
    }
   
   //Test all the setters
   @Test 
   public void testSetNumOfSeatsLeft(){
    System.out.println("SetNumOfSeatsLeft");
    int numOfSeats = 1200;
    flight.setNumOfSeatsLeft(numOfSeats);
    assertEquals(numOfSeats,flight.getNumOfSeatsLeft() );
   }
   
   @Test
   public void testSetCapacity(){
    System.out.println("SetCapacity");
    int capacity = 1200;
    flight.setCapacity(capacity);
    assertEquals(capacity, flight.getCapacity() );
   }
   
   @Test
   public void testSetDepartureTime(){
    System.out.println("SetDepartureTime");
    String departureTime = "03/02/99 7:50 pm";
    flight.setDepartureTime(departureTime);
    assertEquals(departureTime, flight.getDepartureTime() );
   }
   
   @Test
   public void testSetDestination(){
        System.out.println("SetDestination");
    String destination ="Kolkata";
    flight.setDestination(destination);
    assertEquals(destination,flight.getDestination() );
   }
   
   
     @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Toronto";
        flight.setOrigin(origin);
        assertEquals(origin, flight.getOrigin());
    }
    
     @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1030;
        flight.setFlightNumber(flightNumber);
        assertEquals(flightNumber, flight.getFlightNumber(), 0);
    }
    
     @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 1000.0;
        flight.setOriginalPrice(price);
        assertEquals(price,flight.getOriginalPrice(),0.0);
    }
    
    //Test bookAseat()
    @Test
    public void testBookASeat(){
        System.out.println("setPrice");
        flight.setNumOfSeatsLeft(1);
        assertTrue(flight.bookAseat() );
        //when input to this method is 1 then calling the method shud give TRUE
    }
    
    @Test
    public void testToString(){
    System.out.println("ToString");
    String expResult ="Flight: 1030, Origin: Toronto, Destination: Kolkata, Departure Time: 03/02/99 7:50 pm, Capacity: 1200, Number of Seats Left: 1200, Original Price:$1000.0";
            //"Flight: 1030, Origin: Toronto, Destination: Kolkata, Departure Time: 03/02/99 7:50 pm, Capacity: 1200, Number of Seats Left: 1200, Original Price:$1000.0 ";
    String result= flight.toString();
    assertEquals(expResult, result);
    
    }
}

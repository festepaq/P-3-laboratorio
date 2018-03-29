/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelacion;

/**
 *
 * @author Farid Estepa
 */
public class BookedFlight {
 private int flightNumber;
 private String departure, arrival;
 private Airport from,to;

    public BookedFlight(int flightNumber, String departure, String arrival,Airport from, Airport to) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }

    public BookedFlight(Airport from, Airport to) {
        
    }
    

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Airport getTo() {
        return to;
    }

    public void setTo(Airport to) {
        this.to = to;
    }

}

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
public class Travel {
private String lugar;    
private String start;
private int duration;
private Hotel hotel;
private BookedFlight  outbound;
private BookedFlight  returns;

    public Travel(String lugar, String start, int duration) {
        this.lugar= lugar;
        this.start = start;
        this.duration = duration;
    }

    public Travel() {
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

 
    
    public void designarHotel(Hotel hotel){
 this.hotel= hotel;       
    }
    
public void designarOutBound(int FligtNumber, String departure, String arrival, Airport from, Airport to){
 this.outbound = new BookedFlight(FligtNumber,  departure,  arrival, from, to);
}
public void designarReturns(int FligtNumber, String departure, String arrival, Airport from, Airport to){
 this.returns = new BookedFlight(FligtNumber,  departure,  arrival, from, to);
}

//public void designarReturn(int i, String a, String c){
// this.outbound= new BookedFlight(i,a,c);
//
//}

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }
    

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Hotel getHotel() {
        return hotel;
    }
    
    

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public void setOutbound(BookedFlight outbound) {
        this.outbound = outbound;
    }

    public BookedFlight getReturns() {
        return returns;
    }

    public void setReturns(BookedFlight returns) {
        this.returns = returns;
    }
    
}

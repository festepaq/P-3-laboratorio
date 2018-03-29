/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Farid Estepa
 */
public class TravelAgency {
private String name;
private ArrayList<Airport> airports;
private ArrayList<Hotel> knownHoteles;
private ArrayList<Travel> offeredTravels;


public TravelAgency(String name) {
 this.name= name;       
 this.airports= new ArrayList<>();
 this.knownHoteles =    new ArrayList<>();
 this.offeredTravels = new ArrayList<>();      
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//
//public void asignarHotel(String a, String b){
//this.knownHoteles[0]= new Hotel(a,b)  ;  
//}
//public void asignarOutBound(int FligtNumber, String departure, String arrival){
//    
//}

public void asignarTravel(String lugar,String start, int duration,int flightNumber, 
        String departure, String departure_2, int flightNumber_2, String arrival,
        String arrival_2, Airport from, Airport from_2, Airport to, Airport to_2, Hotel hotel){
    
offeredTravels.add(new Travel(lugar,start,duration));


    for (int i = 0; i < offeredTravels.size(); i++) {
if( offeredTravels.get(i).getLugar()== lugar){
    
    offeredTravels.get(i).designarOutBound(flightNumber, departure, arrival, from, to);
    offeredTravels.get(i).designarReturns(flightNumber_2, departure_2, arrival_2, from_2, to_2);
    offeredTravels.get(i).designarHotel(hotel);
}
    }

    
////    for (int i = 0; i < 10; i++) {
////        
////if ( this.offeredTravels[i]==null){
////    this.offeredTravels[i]= new Travel (lugar,start, duration);
////    offeredTravels[i].designarOutBound( fligtNumber,  departure,  arrival, from, to);
////    offeredTravels[i].designarReturns( flightNumber_2,  departure_2,  arrival_2, from_2, to_2);
////    offeredTravels[i].designarHotel(hotel);
////    return true;
////} else {
////}
////}  
//    return false;
}

public void listarViajesOfrecidos(){
    for (int i = 0; i < offeredTravels.size(); i++) { // mirar en casa
    
        System.out.println(
                
                "La agencia " + getName() +" ofrece un viaje de " 
                +
                        offeredTravels.get(i).getDuration()
                        +" dias a "+ offeredTravels.get(i).getLugar()+", al hotel "+ 
                offeredTravels.get(i).getHotel().getNombre()+ ". \n El viaje empieza el "+ 
                        offeredTravels.get(i).getStart()+". El vuelo de partida es el "+ offeredTravels.get(i).getOutbound().getArrival()+
                ". Numero de vuelo salida :" + offeredTravels.get(i).getOutbound().getFlightNumber() + ". Aeropuerto Salida: "+offeredTravels.get(i).getOutbound().getFrom().getDescription()+". Aeropuerto llegada: "
                + offeredTravels.get(i).getOutbound().getTo().getDescription()+"\n"+"... Retorno: El regreso es el día "+offeredTravels.get(i).getReturns().getDeparture()  +". Vuelo numero: "+ 
                offeredTravels.get(i).getReturns().getFlightNumber()+ ". Aeropuerto salida: "+ 
                offeredTravels.get(i).getReturns().getFrom().getDescription()+ ". Aeropuerto llegada: " + offeredTravels.get(i).getReturns().getTo().getDescription()+"\n"
                
        );
       
        
    }
    
}
public void listarViajesPorDuracion(){
    

    
    
    
    
    
        
int lista[] = new int[offeredTravels.size()];

    for (int i = 0; i < this.offeredTravels.size(); i++) {
lista[i]= this.offeredTravels.get(i).getDuration();
        for (int j = 0; j < this.offeredTravels.size(); j++) {
lista[j]= this.offeredTravels.get(j).getDuration();
        }
    }
Arrays.sort(lista);
    
    for (int i = 0; i < this.offeredTravels.size(); i++) {
        
        for (int j = 0; j < this.offeredTravels.size(); j++) {
            
        
        if(this.offeredTravels.get(j).getDuration()==lista[i]){
         System.out.println((i+1)+") Viaje a "+this.offeredTravels.get(j).getLugar()+" por "+ 
                 this.offeredTravels.get(j).getDuration()+" dias");     
        }}
              
    }
    
  
}

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public ArrayList<Hotel> getKnownHoteles() {
        return knownHoteles;
    }

    public void setKnownHoteles(ArrayList<Hotel> knownHoteles) {
        this.knownHoteles = knownHoteles;
    }

    public ArrayList<Travel> getOfferedTravels() {
        return offeredTravels;
    }

    public void setOfferedTravels(ArrayList<Travel> offeredTravels) {
        this.offeredTravels = offeredTravels;
    }



      
}


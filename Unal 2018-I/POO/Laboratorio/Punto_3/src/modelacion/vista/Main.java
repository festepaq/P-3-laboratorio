/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelacion.vista;
import java.util.Scanner;
import modelacion.Airport;
import modelacion.BookedFlight;
import modelacion.Hotel;
import modelacion.TravelAgency;
import modelacion.Travel;
       

/**
 *
 * @author Farid Estepa
 */
public class Main {
    
    public static void main(String[] args) {
        
   Scanner teclado= new Scanner(System.in);

TravelAgency aviatur= new TravelAgency("Aviatur");
Hotel hotelFontanar= new Hotel("Fontanar", "Cra 21 a # 159a-28");
Airport a_Jose = new Airport("Jose Maria Asuncion");
Airport a_Dorado = new Airport("El Dorado");
Airport a_Leticia= new Airport("Leticia");
Hotel hotelReal= new Hotel("Real", "Cra 23 b 34-59");
Hotel hotelPasto= new Hotel("Casa Grande", "Cra34 b 98-78");
Airport a_Pasto= new Airport("Pasto");
        
        
      

//asignarTravel
//         (String lugar,String start, int duration,int fligtNumber, 
//        String departure, String departure_2, int flightNumber_2, String arrival,
//        String arrival_2, Airport from, Airport from_2, Airport to, Airport to_2, Hotel hotel)

aviatur.asignarTravel("Cartagena","22/03/2017", 40, 1345, "22/03/2017", "21/04/2017", 2255, 
        "22/03/2017","21/04/2017",  a_Jose, a_Dorado, a_Dorado, a_Jose, hotelFontanar);   
    
aviatur.asignarTravel("Leticia","22/03/2017", 6, 1885, "22/03/2017", "11/04/2017", 7855, 
        "22/03/2017","11/04/2017",  a_Dorado, a_Leticia, a_Leticia, a_Dorado, hotelReal);

aviatur.asignarTravel("Pasto","22/03/2017", 45, 7826, "22/03/2017", "11/04/2017", 7775, 
        "22/03/2017","11/04/2017",  a_Dorado, a_Pasto, a_Pasto, a_Dorado, hotelPasto);

// SE PUEDE AGREGAR OTRO VIAJE

//aviatur.asignarTravel("Popayan","22/03/2017", 10, 7826, "22/03/2017", "11/04/2017", 7775, 
//        "22/03/2017","11/04/2017",  a_Dorado, a_Pasto, a_Pasto, a_Dorado, hotelPasto);

int b=0;
 System.out.println("Bienvenido");
 do{
 int c;
      System.out.println("¿Deseas conocer los viajes ofrecidos? Marca 1");
        System.out.println("");
        System.out.println("¿Deseas ver los viajes listados por duración? Marca 2");
        c =teclado.nextInt();
switch(c){
    case 1:  
aviatur.listarViajesOfrecidos();  
break;
    case 2:
aviatur.listarViajesPorDuracion();
}
b++;
     System.out.println("");
      System.out.println("");
       System.out.println("");
        System.out.println("");
}while(b!=2);
 }     
  
}

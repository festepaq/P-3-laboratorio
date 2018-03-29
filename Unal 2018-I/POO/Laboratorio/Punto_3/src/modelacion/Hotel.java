/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelacion;

import java.util.Scanner;

/**
 *
 * @author Farid Estepa
 */
public class Hotel {
private String nombre, address;

    public Hotel(String nombre, String address) {
        this.nombre = nombre;
        this.address = address;
    }

    public Hotel() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

public void crearHotel(){
Scanner teclado= new Scanner(System.in);
    System.out.println("Ingrese Nombre Hotel");
}
}

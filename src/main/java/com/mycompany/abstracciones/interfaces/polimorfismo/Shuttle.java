/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracciones.interfaces.polimorfismo;

import java.util.Scanner;

/**
 * Esta  clase es el tipo de nave lanzadera y  viene extendida del la clase abstracta SpaceShip heredando sus atributos.
 * @author efrain
 */
public class Shuttle extends SpaceShip {
    /**
     * Atributo propio de la clase
     */
    public int transportCapacity;

    /**
     *
     * @param name Es el nombre de la nave.
     * @param weight Es el peso de la nave.
     * @param push Es el epuje de la nave.
     * @param contry Es el pais donde se fabrico la nave.
     * @param yearActivity Es el año de actividad de la nave.
     * @param transportCapacity ES la capacidad en kilogramos que puede cargar la nave.
     */
    public Shuttle(String name, int weight, int push, String contry, int yearActivity, int transportCapacity) {
        super(name, weight, push, contry, yearActivity);
        this.transportCapacity = transportCapacity;
    }

    /**
     * Con este metodo hice una sobrecarga en la clase y me sirve para tener una estructura en la consola cuando muestre la nave.
     */
    public String printObject(String name, int weight, int push, String contry, int yearActivity, int transportCapacity) {
        return "Nave lanzadera{" +

                "Nombre='" + name + '\'' +
                ", Peso=" + weight +
                ", Empuje=" + push +
                ", Pais='" + contry + '\'' +
                ", Año de actividad=" + yearActivity +
                " Capacidad de transporter=" + transportCapacity +

                '}';
    }

    /**
     * Este metodo me permite crear naves de tipo lnazadera y las muestra en patalla.
     */

    @Override
    public void createSpaceShip(){
        Scanner newSpaceShip = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la nave:");
        String name = newSpaceShip.nextLine();
        System.out.println("Ingrese el peso en kg de la nave:");
        int weight = newSpaceShip.nextInt();
        System.out.println("Ingrese el valor  en kg del enpuje de la nave:");
        int push = newSpaceShip.nextInt();
        System.out.println("Ingrese el pais donde se fabricó la nave:");
        String contry = newSpaceShip.next();
        System.out.println("Ingrese el año de actividad de la nave:");
        int yearActivity = newSpaceShip.nextInt();
        System.out.println("Ingrese la capacidad en kg de la nave:");
        int transportCapacity = newSpaceShip.nextInt();


        Shuttle newSpace = new Shuttle(name,weight,push,contry,yearActivity,transportCapacity);
        System.out.println("Creaste tu nave con exito:  "+ newSpace.printObject(name,weight,push,contry,yearActivity,transportCapacity));

    }


    /**
     * Este metodo me muestra un mensaje en consola con el tipo de nave.
     */
    @Override
    public void jumpSpace() {
        System.out.println("Tu nave lanzadera esta en camino a su destino");
    }
    
}

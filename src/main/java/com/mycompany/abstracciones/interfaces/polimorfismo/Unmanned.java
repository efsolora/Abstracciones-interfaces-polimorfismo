/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracciones.interfaces.polimorfismo;

import java.util.Scanner;
/**
 * Esta  clase es el tipo de nave no tripulada y  viene extendida del la clase abstracta SpaceShip heredando sus atributos.
 * @author efrain
 */
public class Unmanned extends SpaceShip {
    /**
     * Atributo propio de la clase
     */
    public String placeStudy;
    /**
     * Es el contructor de la clase
     * @param name Es el nombre de la nave.
     * @param weight Es el peso de la nave.
     * @param push Es el epuje de la nave.
     * @param contry Es el pais donde se fabrico la nave.
     * @param yearActivity Es el año de actividad de la nave.
     * @param placeStudy Es el lugar de investigacion de la nave.
     */

    public Unmanned(String name, int weight, int push, String contry, int yearActivity, String placeStudy) {
        super(name, weight, push, contry, yearActivity);
        this.placeStudy = placeStudy;
    }

    /**
     * Con este metodo hice una sobrecarga en la clase y me sirve para tener una estructura en la consola cuando muestre la nave.
     */
    public String printObject(String name, int weight, int push, String contry, int yearActivity, String placeStudy) {
        return "Nave lanzadera{" +

                "Nombre='" + name + '\'' +
                ", Peso=" + weight +
                ", Empuje=" + push +
                ", Pais='" + contry + '\'' +
                ", Año de actividad=" + yearActivity +
                " Lugar de estudio=" + placeStudy +

                '}';
    }

    /**
     * Este metodo me permite crear naves de tipo no tripulada y las muestra en patalla.
     */

    @Override
    public void createSpaceShip() {
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
        System.out.println("Ingrese el lugar de estudio:");
        String placeStudy = newSpaceShip.next();

        Unmanned newSpace = new Unmanned(name,weight,push,contry,yearActivity,placeStudy);
        System.out.println("Creaste tu nave con exito"+ newSpace.printObject(name,weight,push,contry,yearActivity,placeStudy));
        
    }

    /**
     * Este metodo me muestra un mensaje en consola con el tipo de nave.
     */

    @Override
    public void jumpSpace() {
        System.out.println("Tu nave no tripulada esta en camino a su destino");
    }
    
}

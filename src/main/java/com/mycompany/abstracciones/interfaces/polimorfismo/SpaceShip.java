/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracciones.interfaces.polimorfismo;

/**
 *Esta es una clase abstracta con 5 atributos publicos
 * @author efrain
 */
public abstract class  SpaceShip {
    public String name ;
    public int weight;
    public int push;
    public String contry;
    public int yearActivity;

    /**
     *
     * @param name Es el nombre de la nave.
     * @param weight Es el peso de la nave.
     * @param push Es el epuje de la nave.
     * @param contry Es el pais donde se fabrico la nave.
     * @param yearActivity Es el año de actividad de la nave.
     */
    public SpaceShip(String name,int weight,int push,String contry,int yearActivity) {
       this.name = name;
       this.weight = weight;
       this.push = push;
       this.contry = contry;
       this.yearActivity = yearActivity;
    }


    /**
     * Este metodo abstracto nos permite crear naves por clase y se tranfiere a las otras clases
     */
    public abstract void createSpaceShip();

    /**
     * Este metodo abstracto nos permite mandar un mensaje por consola y se tranfiere a las otras clases.
     */
    public abstract void jumpSpace();

}

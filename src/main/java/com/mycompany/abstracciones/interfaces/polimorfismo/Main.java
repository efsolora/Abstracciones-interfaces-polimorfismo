/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstracciones.interfaces.polimorfismo;

import java.util.Scanner;

public class Main {
    /**
     * El metodo classSpaceShip me permite crear las naves por su clase,la clase se elige por un numero que se ingresa en la variable typeShip
     */
    public static void classSpaceShip(){
        System.out.println("Bienvenidos a la NASA");
        System.out.println("Ingresa el numero del tipo de Nave que quieres crear:");
        System.out.println("1.LANZADERA  2.NO TRIPULADA  3.TRIPULADA  4.COMBATE ");
        Scanner type = new Scanner(System.in);
        System.out.println("Tipo de nave:");
        int typeShip = type.nextInt();
        if(typeShip==1){
            Shuttle space = new Shuttle("",0,0,"",0,0);
            space.createSpaceShip();
            space.jumpSpace();
        } else if (typeShip==2){
            Unmanned space= (new Unmanned("",0,0,"",0,""));
            space.createSpaceShip();
        } else if(typeShip==3){
            Manned space =new Manned("",0,0,"",0,0);
            space.createSpaceShip();
        } else if(typeShip==4) {
            Combat space = new Combat("", 0, 0, "", 0, "");
            space.createSpaceShip();
        }

    }

     public static void main(String[] args) {

         Scanner infinity = new Scanner(System.in);

         int spacesShip = 1;

         /**
          * El while me permite ejecutar el metodo classSpaceShip ingresanto el numero 1 que siempre es true, haciendo una ejecucion infinita. y marcando el dos en la entrada del dato se termina el programa.
          */
         while (spacesShip==1){
             classSpaceShip();
             System.out.println("Ingresa el numero de la opcion deseada:");
             System.out.println(" 1.Crear nave  2.Salir del programa");
             spacesShip = infinity.nextInt();

         }System.out.println("Se termino el programa");


         }



}


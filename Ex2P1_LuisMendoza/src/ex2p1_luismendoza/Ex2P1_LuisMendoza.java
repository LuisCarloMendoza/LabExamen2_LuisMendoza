/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_luismendoza;

import java.util.Scanner;
import java.util.ArrayList;


public class Ex2P1_LuisMendoza {
    
    public static void Menu(){
        Scanner entrada = new Scanner(System.in);
        
        String granjaNombre = "我的Granja";
        ArrayList<Vegetales> vegetal = new ArrayList();
        ArrayList<Vacas> vaca = new ArrayList();
        ArrayList<Conejos> conejo = new ArrayList();
        int money = 500;
        
        Granja miGranja = new Granja(granjaNombre,vaca,conejo,vegetal,money);
        
        
        int n = 0;
        int tiempoCosecha = 5;
        int acuCosechar = 0;
        int dia = 1;
        boolean cosechas = false;
        boolean lol = false;
        
        int numConejos = 0;
        int gastoConejos = 0;
        
        int numVacas = 0;
        int gastoVacas = 0;
                
        System.out.println("Bienvenido al Indie Stardew Valley");
        
        
        
        do{
            System.out.println("---------- Día #" + dia + " ----------");
            
            if(tiempoCosecha == 0){
                System.out.println("Las cosechas están listas");
                
            } else {
                
                if(cosechas == true){
                    System.out.println("Faltan #" + tiempoCosecha + " para que esten listas las cosechas");
                    tiempoCosecha --;
  
                } else {
                    System.out.println("No hay cosechas");
                }
                
                    
            }
            
            
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Plantar Cosechas");
            System.out.println("2. Cosechar las cosechas");
            System.out.println("3. Conseguir Animales");
            System.out.println("4. Vender cosas");
            System.out.println("5. Dormir");
            System.out.println("6. Fin de la Partida");
            
            int opcionUsuario = entrada.nextInt();
            
            dia++;
            
            System.out.println("********************************************");
            
            
            
            switch(opcionUsuario){
                case 1:
                    if(lol == false){
                        System.out.println("¿Cuantas plantas va a cosechar?");
                        int cosechar = entrada.nextInt();
                        acuCosechar = cosechar;
                        cosechas = true;
                        lol = true;
                    
                        System.out.println("PLANTANDO COSECHAS...");
                    } else {
                        System.out.println("Ya hay cosechas plantadas");
                    }
                    
                    
                    break;
                    
                case 2:
                    
                    if (tiempoCosecha != 0 && cosechas == true) {
                        System.out.println("¡Las cosechas no están Listas!");
                    } else if (cosechas == false) {
                        System.out.println("No se han plantado cosechas");
                    } else if(tiempoCosecha == 0 && cosechas == true){
                        
                        for (int i = 0; i < acuCosechar; i++) {
                            miGranja.AddVegetales(i);
                        }

                        System.out.println("SE HAN COSECHADO #" + miGranja.vegetales.size() + " vegetales");
                        
                        lol = false;
                        
                        acuCosechar = 0;
                    }
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Cantidad de dinero actual: " + miGranja.dinero);
                    
                    System.out.println("¿Qúe animal desea?");
                    
                    System.out.println("1. Conejos -> 150 monets");
                    System.out.println("2. Vacas   -> 300 monets");
                    
                    int opcionCompra = entrada.nextInt();
                    
                    if(opcionCompra == 1){
                        while(true){
                            System.out.println("¿Cuantos conejos desea?");

                            numConejos = entrada.nextInt();

                            gastoConejos = 150 * numConejos;
                            
                            if(miGranja.dinero - gastoConejos < 0){
                               
                                System.out.println("No tiene suficiente dinero para realizar esa compra");
                                
                            } else{
                                
                                miGranja.dinero = miGranja.dinero - gastoConejos;
                                break;
                            }
                        }
                        
                        for (int i = 0; i < numConejos ; i++) {
                            miGranja.AddConejos();
                            System.out.println(miGranja.conjeos.get(i).nombre + " ahora pertenece a la granja");
                        }
                        
                        System.out.println("Tu dinero actual es: " + miGranja.dinero);
                        
                    } else if(opcionCompra == 2){
                        while(true){
                            System.out.println("¿Cuantas vacas desea?");

                            numVacas = entrada.nextInt();

                            gastoVacas = 350 * numConejos;
                            
                            if(miGranja.dinero - gastoVacas < 0){
                               
                                System.out.println("No tiene suficiente dinero para realizar esa compra");
                                
                            } else{
                                
                                miGranja.dinero = miGranja.dinero - gastoVacas;
                                break;
                            }
                        }
                        
                        for (int i = 0; i < numVacas ; i++) {
                            miGranja.AddVacas();
                            System.out.println(miGranja.vacas.get(i).nombre + " ahora pertenece a la granja!");
                        }
                        
                        System.out.println("Tu dinero actual es: " + miGranja.dinero);
                        
                    } else{
                        System.out.println("Opción no valida");
                    }
       
                    
                    break;
                    
                case 4:
                    System.out.println("--- ANÁLISIS DE GRANJA ---");
                    miGranja.ListaVegetales();
                    miGranja.ListaVacas();
                    miGranja.ListaConejos();
                    miGranja.ListaMonets();
                    
                    
                        System.out.println("-------------------------------");
                        System.out.println("Selecciona: ");
                        System.out.println("1. Vegetales");
                        System.out.println("2. Vacas");
                        System.out.println("3. Conejos");

                        int opcionVenta = entrada.nextInt();
                        
                        if(opcionVenta == 1){
                            if(miGranja.vegetales.isEmpty()){
                                System.out.println("No tiene vegetales");
                            } else{
                                System.out.println("¿Cuantos vegetales desea vender?");
                                int ventaVegetal1 = entrada.nextInt();
                                int ventaVegetal2 = ventaVegetal1 * 100;
                                
                                miGranja.dinero = miGranja.dinero + ventaVegetal2;
                                for (int i = 0; i < ventaVegetal1; i++) {
                                    miGranja.vegetales.remove(i);
                                }
                            }
                        } else if (opcionVenta == 2){
                            if(miGranja.vacas.isEmpty()){
                                System.out.println("No tiene vacas");
                            } else{
                                System.out.println("¿Cuantas vacas desea vender?");
                                int ventaVaca1 = entrada.nextInt();
                                int ventaVaca2 = entrada.nextInt() * 400;
                                miGranja.dinero += ventaVaca2;
                                
                                for (int i = 0; i < ventaVaca1; i++) {
                                    miGranja.vacas.remove(i);
                                    
                                }
                                
                               
                            }
                        } else if(opcionVenta == 3){
                            
                            if(miGranja.conjeos.isEmpty()){
                                System.out.println("No tiene conejos");
                            } else{
                                System.out.println("¿Cuantos conejos desea vender?");
                                int ventaConejo1 = entrada.nextInt();
                                int ventaConejo2 = ventaConejo1 * 170;
                                miGranja.dinero += ventaConejo2;
                                
                                for (int i = 0; i < ventaConejo1; i++) {
                                    miGranja.conjeos.remove(i);
                                    
                                }
                            }
                        }
                    
                        System.out.println("Su dinero actual: "+ miGranja.dinero);
                        
                    
                    break;
                    
                case 5:
                    
                    
                    break;
                    
                case 6:
                    
                    System.out.println("El granjero decidio irse a la ciudad un fin de semana. Fue a una "
                            + "discoteca donde conocio a una mujer muy guapa, por lo que el granjero se enamoro "
                            + "y con gran pasión y fervor decidio abandonar su granja; sin embargo, la mujer resulto no querer nada serio con el;"
                            + " consecuentemente, nuestro granjero cayo en las manos del alcohol y las drogas. Hasta el día de hoy no se sabe "
                            + "que fue de nuestro querido granjero.");
                    n++;
                    break;
                    
                default:
                    System.out.println("Opción no valida!");
                    break;
                    
               
            }
            
        } while(n!=1);
        
    }
   
    public static void main(String[] args) {
        
        Menu();
        
    }
    
}

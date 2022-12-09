/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_luismendoza;

import java.util.ArrayList;
import java.util.Scanner;


public class Granja {
    
    String nombre;
    ArrayList<Vacas> vacas;
    ArrayList<Conejos> conjeos;
    ArrayList<Vegetales> vegetales;
    int dinero;

    public Granja(String nombre, ArrayList<Vacas> vacas, ArrayList<Conejos> conjeos, ArrayList<Vegetales> vegetales, int dinero) {
        this.nombre = nombre;
        this.vacas = vacas;
        this.conjeos = conjeos;
        this.vegetales = vegetales;
        this.dinero = dinero;
    }
    
    // Métodos
    
    public void AddVacas(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la vaca: ");
        String nombreVaca = entrada.next();
        nombreVaca += entrada.nextLine();
        
        Vacas vaca = new Vacas(nombreVaca,400,350);

        this.vacas.add(vaca);
        
    }
    
    public void AddConejos(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Conejo: ");
        String nombreConejo = entrada.next();
        nombreConejo += entrada.nextLine();
        
        Conejos conejo = new Conejos(nombreConejo,170,150);

        this.conjeos.add(conejo);
        
    }
    
    public void AddVegetales(int numeroVegetales){
        
        Vegetales vegetal = new Vegetales(100);
        
        this.vegetales.add(vegetal);
        
    }
    
    public void ListaMonets(){
        System.out.println("Monets: "+ this.dinero);
    }
    
    public void ListaVegetales(){
        
        System.out.println("Vegetales: " + this.vegetales.size());
    }
    
    public void ListaVacas(){
        
        System.out.println("Vacas: "+ this.vacas.size());
    }
    
    public void ListaConejos(){
        System.out.println("Conejos: "+ this.conjeos.size());

    }
    
    public void ListaGranja(){
        System.out.println("Conejos: "+ this.conjeos.size());
    }
    
    
    // Mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vacas> getVacas() {
        return vacas;
    }

    public void setVacas(ArrayList<Vacas> vacas) {
        this.vacas = vacas;
    }

    public ArrayList<Conejos> getConjeos() {
        return conjeos;
    }

    public void setConjeos(ArrayList<Conejos> conjeos) {
        this.conjeos = conjeos;
    }

    public ArrayList<Vegetales> getVegetales() {
        return vegetales;
    }

    public void setVegetales(ArrayList<Vegetales> vegetales) {
        this.vegetales = vegetales;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
     
    
    
}

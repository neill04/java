package com.mycompany.tarea09;

public class Padre {
    private String nombre;
    private int edad;
    private float sueldo;
    
    public Padre() {
        System.out.println("Contructor Padre");
        nombre = "Anonimo";
    }
    
    public Padre(String nom, int eda, float sue) {
        System.out.println("Constructor Padre");
        this.nombre = nom;
        this.edad = eda;
        this.sueldo = sue;
    }
    
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    public void setEdad(int eda) {
        this.edad = eda;
    }
    
    public void setSueldo(float sue) {
        this.sueldo = sue;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public float getSueldo() {
        return sueldo;
    }
    
    public void verData() {
        System.out.println("\n Clase Padre: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("\t Edad: " + edad);
        System.out.println("\t Sueldo: " + sueldo);
        System.out.println();
    }
}

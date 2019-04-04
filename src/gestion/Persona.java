/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private double salario;
    private int ano;

    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public int getAño() {
        return año;
    }

    public void setSalario(double subir) {
        this.salario += subir;
    }

    public Persona(String nombre, double salario, int año) {
        this.nombre = nombre;
        this.salario = salario;
        this.ano = ano;
    }
    
    
        
}

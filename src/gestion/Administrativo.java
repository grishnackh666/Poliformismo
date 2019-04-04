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
public class Administrativo extends Persona {
    private final static float FACTOR=0.1f;
    private Jefe jefe;

    public Administrativo(Jefe jefe, String nombre, double salario, int año) {
        super(nombre, salario, año);
        this.jefe = jefe;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public double getSalario(){
        return super.getSalario()+super.getSalario()*jefe.getBonificacion()*FACTOR;
    }

    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;


public class Jefe extends Persona {
    private double bonificacion;

    public double getBonificacion() {
        return bonificacion;
    }
    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public Jefe(double bonificacion, String nombre, double salario, int ano) {
        super(nombre, salario, ano);
        this.bonificacion = bonificacion;
    }

    public String getDescripcion(){
        return "soy " + getNombre()+ " gano  " + getSalario();
    }
    
    
    public double getSalario(){
        return super.getSalario()+super.getSalario()*bonificacion;
    }
        
}

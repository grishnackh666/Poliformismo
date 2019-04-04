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
public class Pruebamain {

    
    public static void main(String[] args) {
        
        Persona[] persona = new Persona[3];
        persona[0]=new Persona("erik",150,1995);
        Jefe jefe = new Jefe(200f,"pedro",150,1995);
        persona[1]=jefe;
        persona[2]=new Administrativo(jefe," juan",150,1995);
        
        for(Persona to: persona){
            if(to instanceof Jefe){
                Jefe jefe2= (Jefe)jefe;
                jefe.setBonificacion(0.8f);
                System.out.println("bonificacion para : " + jefe.getNombre());
            }
            System.out.println(" soy "+ to.getNombre() + " y gano "+ to.getSalario());
        }
        
        
        for(Persona to: persona){
            if(to instanceof Jefe){
                Jefe jefe2=(Jefe)to;
                System.out.println("soy " + jefe2.getNombre()+ " y gano " + jefe2.getSalario());
                }else if(to instanceof Administrativo){
                    Administrativo admin = (Administrativo)to;
                    System.out.println("soy " + admin.getNombre() + " y gano " + admin.getSalario());
                }else{
                    System.out.println("soy " + to.getNombre() + " gano" + to.getSalario());
                    
                }
        }
        
        
        
        
        Persona persona1 = new Persona("erik",150,1995);
        System.out.println("Persona " +persona1.getNombre());
        
        persona1 = new Jefe(5.1,"erik",150,1995);
        
        if(persona1 instanceof Jefe){
            Jefe jefe = (Jefe)persona1;
            jefe.setBonificacion(0.7f);
            System.out.println(jefe.getNombre());
        }else{
            System.out.println("el empleado no es un jefe");
        }
        
        persona1 = new Jefe(0.5,"pedro",1000,2001); 
        Jefe jefe = (Jefe)persona1;
        jefe.setBonificacion(0.7f);
        System.out.println(jefe.getNombre());
        Jefe jefe1 = new Jefe(50,"patron",200,200);
        System.out.println("Jefe " +jefe1.getNombre());
        
        System.out.println("jefe "+ jefe1.getSalario());
        
        System.out.println(jefe1.getDescripcion());
        
        Administrativo admin = new Administrativo(jefe1,"pedro",900,2003);
        System.out.println(admin.getNombre());
        System.out.println(admin.getSalario());
    }
 
}

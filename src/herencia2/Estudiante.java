/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona{
    private double[] nota = new double[4];
    private Profesor prof;

    public Estudiante(String direcion, String telefono, String materia,double a[],String direcionp, String telefonop, String materiap) {
        super(direcion, telefono, materia);
        
        for (int i = 0; i < 4; i++) {
            nota[i] = a[i];
        }
        prof = new Profesor(direcionp,telefonop,materiap);
        
        
    }
    public double calcularPromedio(){
        double prom =0;
        for (int i = 0; i < 4; i++) {
            prom+=nota[i];
        }
        return (prom/4);
        
    }

    public Profesor getProf() {
        return prof;
    }

    public double[] getNota() {
        return nota;
    }
    
    
    
    
    
    
    
    
}

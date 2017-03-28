/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Herencia2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la direccion del estudiante");
        String d = sc.next();
        System.out.println("ingresa el telefono del estudiante");
        String t = sc.next();
        System.out.println("ingresa la materia que el estudiante cursa");
        String m = sc.next();
        System.out.println("ingresa la direccion del profesor");
        String dp = sc.next();
        System.out.println("ingresa el telefono del profesor");
        String tp = sc.next();
        double[] a = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("ingresa la nota: " + (i+1));
            a[i] = sc.nextDouble();
        }
        Estudiante e = new Estudiante(d,t,m,a,dp,tp,m);
        
        System.out.println("el estudiante 1:");
        System.out.println("Direccion: " + e.getDirecion());
        System.out.println("Telefono: " + e.getTelefono());
        System.out.println("Promedio "+e.calcularPromedio());
        System.out.println("en la materia: " + e.getMateria());
        System.out.println("con el Profesor 1: ");
        System.out.println("direccion: " + e.getProf().getDirecion());
        System.out.println("telefono: " + e.getProf().getTelefono());
        
        
    }
    
}

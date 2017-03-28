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
public class Persona {
    protected String direcion;
    protected String telefono;
    protected String materia;

    public Persona(String direcion, String telefono, String materia) {
        this.direcion = direcion;
        this.telefono = telefono;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public String getDirecion() {
        return direcion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
}

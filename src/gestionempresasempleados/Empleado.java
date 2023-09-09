/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresasempleados;

/**
 *
 * @author juan_
 */
public class Empleado {
    protected int documento;
    protected String nombre;
    protected String apellido;
    protected String categoria;
    protected Empresa empresa;
    protected double sueldo;

    public Empleado(int documento, String nombre, String apellido, String categoria, Empresa empresa, double sueldo) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.empresa = empresa;
        this.sueldo = sueldo;
    }

 

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getCategoria() {
        return categoria;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresasempleados;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author juan_
 */
public class Empresa {
    protected String razonSocial;
    protected int cuit;
    private ArrayList<Empleado> empleados;
    
    public Empresa(Empresa e){
     this.razonSocial = e.getRazonSocial();
     this.cuit = e.getCuit();
     this.empleados= e.getEmpleados();
    }
    public Empresa(String razonSocial, int cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
    }

    Empresa() {
        this.razonSocial="";
        this.cuit = 0;
        this.empleados = new ArrayList<Empleado>();
    }
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        return true;
    }

    
}

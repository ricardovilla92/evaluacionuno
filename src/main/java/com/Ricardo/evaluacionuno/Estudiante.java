package com.Ricardo.evaluacionuno;



public class Estudiante {

    String Nombre;
    String Codigo;
    String Materia;
    Double Parcial1;
    Double Parcial2;
    Double Parcial3;
    Double Promedio;

    public Estudiante(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3) {
        Nombre = nombre;
        Codigo = codigo;
        Materia = materia;
        Parcial1 = parcial1;
        Parcial2 = parcial2;
        Parcial3 = parcial3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public Double getParcial1() {
        return Parcial1;
    }

    public void setParcial1(Double parcial1) {
        Parcial1 = parcial1;
    }

    public Double getParcial2() {
        return Parcial2;
    }

    public void setParcial2(Double parcial2) {
        Parcial2 = parcial2;
    }

    public Double getParcial3() {
        return Parcial3;
    }

    public void setParcial3(Double parcial3) {
        Parcial3 = parcial3;
    }

    public Double getPromedio() {
        this.Promedio = (Parcial1*0.3) + (Parcial2 * 0.3) + (Parcial3*0.4);
        return Promedio;
    }

    public void setPromedio(Double promedio) {
        Promedio = promedio;
    }
}

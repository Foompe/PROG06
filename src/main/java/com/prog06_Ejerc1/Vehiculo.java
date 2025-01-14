package com.prog06_Ejerc1;

public class Vehiculo {
    //atributos
    String marca;
    String matricula;
    int nKm = 0;
    //fecha de matriculacion
    int dia;
    int mes;
    int ano;
    //descripcion (muestra marca, matricula y km)
    double precio;
    String nombrePropietario;
    int DNI;



    //Creamos un constructor
    public Vehiculo () {

    }


    //metodo para calcular los años que tiene el coche
    public int get_Anios () {
        return ano;
    }

    //metodo para crear la descripción
    public String Descripcion () {
        return "Coche de marca " + marca + " con matricula " + matricula + " con " + nKm + " km";
    }

    //creamos getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getnKm() {
        return nKm;
    }

    public void setnKm(int nKm) {
        this.nKm = nKm;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}

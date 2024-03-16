/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_venuslobo;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class vehiculo {

    private int anio;
    private String marca;
    private String modelo;
    private double precio;
    private int codigo;
    private Date fechaCreacion;

    public vehiculo() {
    }

    public vehiculo(int anio, String marca, String modelo, double precio, Date fechaCreacion) {
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void crearCodigo() {
        //generar el codigo 
        Random r = new Random();
        int codigo = r.nextInt(0, 10);
        String cadena = "";
        cadena += codigo;

    }

    @Override
    public String toString() {
        return modelo;
    }

}

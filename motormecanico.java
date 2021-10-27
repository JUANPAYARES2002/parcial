/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialsegundocorte;

/**
 *
 * @author Juan Payares
 */
public class motormecanico {
    private String tipo;
private double tamaño;
private String marca;
private double numerodecereal;
private  String tipodecombustible;

    public motormecanico() {
    }

    public motormecanico(String tipo, double tamaño, String marca, double numerodecereal, String tipodecombustible) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.marca = marca;
        this.numerodecereal = numerodecereal;
        this.tipodecombustible = tipodecombustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getNumerodecereal() {
        return numerodecereal;
    }

    public void setNumerodecereal(double numerodecereal) {
        this.numerodecereal = numerodecereal;
    }

    public String getTipodecombustible() {
        return tipodecombustible;
    }

    public void setTipodecombustible(String tipodecombustible) {
        this.tipodecombustible = tipodecombustible;
    }

    
    
}

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
public class motorHibrido {
   private String marca;
private String tipo;
private double tamaño;
private double consumokvxminutos;
private String tipodecombustible;

    public motorHibrido() {
    }

    public motorHibrido(String marca, String tipo, double tamaño, double consumokvxminutos, String tipodecombustible) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.consumokvxminutos = consumokvxminutos;
        this.tipodecombustible = tipodecombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public double getConsumokvxminutos() {
        return consumokvxminutos;
    }

    public void setConsumokvxminutos(double consumokvxminutos) {
        this.consumokvxminutos = consumokvxminutos;
    }

    public String getTipodecombustible() {
        return tipodecombustible;
    }

    public void setTipodecombustible(String tipodecombustible) {
        this.tipodecombustible = tipodecombustible;
    }


}

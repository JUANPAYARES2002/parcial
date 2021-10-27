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
public class motor {
    
private String tipo;
private  String tamaño;
private String precio;
private  String  modelo;       

    public motor() {
    }

    public motor(String tipo, String tamaño, String precio, String modelo) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
                  
                  
    
}

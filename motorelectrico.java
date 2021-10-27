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
public class motorelectrico {
 private String marca;
  private  String tipo;
private String tamaño;
 private double numerodecereal;
private double ConsumoKvXMinuto;
private double consumokvxhoras;

    public motorelectrico() {
    }

    public motorelectrico(String marca, String tipo, String tamaño, double numerodecereal, double ConsumoKvXMinuto, double consumokvxhoras) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.numerodecereal = numerodecereal;
        this.ConsumoKvXMinuto = ConsumoKvXMinuto;
        this.consumokvxhoras = consumokvxhoras;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getNumerodecereal() {
        return numerodecereal;
    }

    public void setNumerodecereal(double numerodecereal) {
        this.numerodecereal = numerodecereal;
    }

    public double getConsumoKvXMinuto() {
        return ConsumoKvXMinuto;
    }

    public void setConsumoKvXMinuto(double ConsumoKvXMinuto) {
        this.ConsumoKvXMinuto = ConsumoKvXMinuto;
    }

    public double getConsumokvxhoras() {
        return consumokvxhoras;
    }

    public void setConsumokvxhoras(double consumokvxhoras) {
        this.consumokvxhoras = consumokvxhoras;
    }




    
}

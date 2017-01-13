/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author jsilvero
 */
public class Terreno extends Propiedad {
    
    private String color;
    private boolean construible;
    private boolean vendible;
    private int cantCasas;
    private boolean hotel;
    private int costoCasa;
    private int costoHotel;
    private int rentaCasa2;
    private int rentaCasa3;
    private int rentaCasa4;
    private int rentaHotel;

    public Terreno(int numero, String nombre, int costoPropiedad, int valorHipoteca, int renta, String color, int costoCasa, int costoHotel, int rentaCasa2, int rentaCasa3, int rentaCasa4, int rentaHotel) {
        super(numero, nombre, costoPropiedad, valorHipoteca, renta);
        this.color = color;
        this.construible = false;
        this.vendible = false;
        this.cantCasas = 0;
        this.hotel = false;
        this.costoCasa = costoCasa;
        this.costoHotel = costoHotel;
        this.rentaCasa2 = rentaCasa2;
        this.rentaCasa3 = rentaCasa3;
        this.rentaCasa4 = rentaCasa4;
        this.rentaHotel = rentaHotel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isConstruible() {
        return construible;
    }

    public void setConstruible(boolean construible) {
        this.construible = construible;
    }

    public boolean isVendible() {
        return vendible;
    }

    public void setVendible(boolean vendible) {
        this.vendible = vendible;
    }

    public int getCantCasas() {
        return cantCasas;
    }

    public void setCantCasas(int cantCasas) {
        this.cantCasas = cantCasas;
    }

    public boolean isHotel() {
        return hotel;
    }

    public void setHotel(boolean hotel) {
        this.hotel = hotel;
    }

    public int getCostoCasa() {
        return costoCasa;
    }

    public void setCostoCasa(int costoCasa) {
        this.costoCasa = costoCasa;
    }

    public int getCostoHotel() {
        return costoHotel;
    }

    public void setCostoHotel(int costoHotel) {
        this.costoHotel = costoHotel;
    }

    public int getRentaCasa2() {
        return rentaCasa2;
    }

    public void setRentaCasa2(int rentaCasa2) {
        this.rentaCasa2 = rentaCasa2;
    }

    public int getRentaCasa3() {
        return rentaCasa3;
    }

    public void setRentaCasa3(int rentaCasa3) {
        this.rentaCasa3 = rentaCasa3;
    }

    public int getRentaCasa4() {
        return rentaCasa4;
    }

    public void setRentaCasa4(int rentaCasa4) {
        this.rentaCasa4 = rentaCasa4;
    }

    public int getRentaHotel() {
        return rentaHotel;
    }

    public void setRentaHotel(int rentaHotel) {
        this.rentaHotel = rentaHotel;
    }
    
    
    
    
    
}

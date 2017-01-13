/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jsilvero
 */
public class Player {
    
    private int id;
    private String nombre;
    private int dinero;
    private ArrayList<Propiedad> propiedades;
    private boolean inJail;
    private int dobles;
    private boolean cardHolder;
    private boolean tiradaAnteriorDobles;
    private int posicionActual;
    private int jailTime;
    public static int SUELDO = 2000;

    public Player(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public boolean isInJail() {
        return inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public int getDobles() {
        return dobles;
    }

    public void setDobles(int dobles) {
        this.dobles = dobles;
    }

    public boolean isCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(boolean cardHolder) {
        this.cardHolder = cardHolder;
    }

    public boolean isTiradaAnteriorDobles() {
        return tiradaAnteriorDobles;
    }

    public void setTiradaAnteriorDobles(boolean tiradaAnteriorDobles) {
        this.tiradaAnteriorDobles = tiradaAnteriorDobles;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getJailTime() {
        return jailTime;
    }

    public void setJailTime(int jailTime) {
        this.jailTime = jailTime;
    }
    
    
    public void comprarPropiedad(Propiedad propiedad){
        int costo = propiedad.getCosto();
        if (this.dinero < costo){
            JOptionPane.showMessageDialog(null, "No tienes dinero suficiente para comprar "+propiedad.getNombre());
            //hipotecar
        }else{
           this.dinero -= costo;
           this.propiedades.add(propiedad);
           propiedad.setDuenho(this);
        }
    }
    
    public void pagarRenta(Propiedad propiedad){
        int renta = propiedad.getRenta();
        if (this.dinero < renta){
            //hipotecar
        }else{
            this.dinero -= renta;
            propiedad.getDuenho().dinero += renta;
        }
    }
    
    public void hipotecar(Propiedad propiedad){
        if (!propiedad.isHipotecada()){
            propiedad.setHipotecada(true);
            this.dinero += propiedad.getValorHipoteca();
        }
    }
    
    public void mover(int cantidad){
        if (this.posicionActual + cantidad < 40)
            this.posicionActual += cantidad;
        else{//paso por go
            this.posicionActual += cantidad - 40;
            this.dinero += SUELDO;
        }
    }
    
    public int roll(){
        int r1 = (int) (Math.random() * 6 + 1);
        int r2 = (int) (Math.random() * 6 + 1);
        System.out.println(r1+","+r2);
        if (r1 == r2){
            this.dobles++;
            this.tiradaAnteriorDobles = true;
        }else{
            this.dobles = 0;
            this.tiradaAnteriorDobles = false;
        }
        
        return r1 + r2;
    }
    
    public void encarcelar(){
        inJail = true;
        tiradaAnteriorDobles = false;
        dobles = 0;
        posicionActual = 10;
        jailTime = 0;
    }
    
    public static void main(String[] args) {
        Player p = new Player("p1");
        p.setPosicionActual(0);
        p.setDobles(0);
        p.setTiradaAnteriorDobles(false);
        //while (p.dobles<3){
            do{
                p.roll();
            }while(p.isTiradaAnteriorDobles());
        //}
    }
    
}

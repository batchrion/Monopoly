/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

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
    
    
    
}

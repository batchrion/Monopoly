/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.Label;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author jsilvero
 */
class Propiedad {
    
    private String nombre;
    private boolean monopolio;
    private boolean hipotecada;
    private Player duenho;
    private int costo;
    private int valorHipoteca;
    private int renta;
    
    public ArrayList<Player> players;

    public Propiedad() {
        players = new ArrayList<>();
        for (int i = 1; i < 5; i++)
            players.add(new Player("player " +i));
    }
    
    public Propiedad(int costo, int valorHipoteca, int renta) {
        this.costo = costo;
        this.valorHipoteca = valorHipoteca;
        this.renta = renta;
    }

    public boolean isMonopolio() {
        return monopolio;
    }

    public void setMonopolio(boolean monopolio) {
        this.monopolio = monopolio;
    }

    public boolean isHipotecada() {
        return hipotecada;
    }

    public void setHipotecada(boolean hipotecada) {
        this.hipotecada = hipotecada;
    }

    public Player getDuenho() {
        return duenho;
    }

    public void setDuenho(Player duenho) {
        this.duenho = duenho;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getValorHipoteca() {
        return valorHipoteca;
    }

    public void setValorHipoteca(int valorHipoteca) {
        this.valorHipoteca = valorHipoteca;
    }

    public int getRenta() {
        return renta;
    }

    public void setRenta(int renta) {
        this.renta = renta;
    }
    
    public void subastar(){
        boolean vendido = false;
        int mejorOferta = 0;
        int oferta = 0;
        
        SpinnerNumberModel sModel = new SpinnerNumberModel(100, 100, 10000, 100);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new Label("¿Desea comprar " + this.nombre + "?"));
        
        JSpinner spinner = new JSpinner(sModel);
        panel.add(spinner);
        Object[] options = {"Ofertar",
                    "Rechazar"};
        while(!vendido){
            for(int i = 0;players.get(i) != players.get(players.size()-1); i++){
                sModel.setMinimum(mejorOferta);
                int seleccion = JOptionPane.showOptionDialog(null, panel, "Subasta "+ players.get(i).getNombre(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
                if (seleccion == 0)
                    oferta = (int)spinner.getValue();
                else
                    players.remove(i);
                if (oferta > mejorOferta)
                    mejorOferta = oferta;
                
                vendido = true;
            }
            
        } 
    }
    
    public static void main(String[] args){
        Propiedad p = new Propiedad();
        p.subastar();
    }
}



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
        for (int i = 1; i < 5; i++) {
            players.add(new Player("player " + i));
        }
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

    public int subastar() {
        int mejorOferta = 0;

        SpinnerNumberModel sModel = new SpinnerNumberModel(100, 100, 10000, 100);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new Label("¿Desea comprar " + this.nombre + "?"));

        JSpinner spinner = new JSpinner(sModel);
        spinner.setEditor(new JSpinner.DefaultEditor(spinner));
        panel.add(spinner);
        Object[] options = {"Ofertar",
            "Rechazar"};
        while (true) {
            for (int i = 0; i < players.size(); i++) {
                // sModel.setMaximum(players.get(i).getDinero());
                int seleccion = JOptionPane.showOptionDialog(null, panel, "Subasta " + players.get(i).getNombre(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
                if (seleccion == 0) {//el jugador hizo una oferta
                    int oferta = (int) spinner.getValue();
                    if (oferta > mejorOferta) {
                        mejorOferta = oferta;
                        sModel.setMinimum(mejorOferta);
                    }
                } else {//si no hizo una oferta hay que sacarlo de entre los oferentes
                    players.remove(i);
                    i--;
                }
                if (players.size() <= 1) {//solo queda un oferente o bien nadie realizó una oferta
                    if (players.isEmpty()) {
                        return 0;
                    }
                    if (mejorOferta != 0) {
                        this.costo = mejorOferta;
                        //players.get(0).comprarPropiedad(this);
                        JOptionPane.showMessageDialog(null, this.nombre + " vendido a " + players.get(0).getNombre()
                                + " por " + mejorOferta);
                        return mejorOferta;
                    }

                }
            }

        }
    }

    public static void main(String[] args) {
        Propiedad p = new Propiedad();
        p.subastar();
    }
}

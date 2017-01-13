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
public class Tablero {
    
    private Casilla[] tablero = new Casilla[40];

    public Tablero() {
        tablero[0] = new Casilla(0, "Go");
        tablero[1] = new Terreno(1, "Avda. Acuña de Figueroa", 0, 0, 0, "marron", 0, 0, 0, 0, 0, 0);
        tablero[2] = new Casilla(2, "Cuenta Corriente");
        tablero[3] = new Terreno(3, "Avda. Blás Garay", 0, 0, 0, "marron", 0, 0, 0, 0, 0, 0);
        tablero[4] = new Casilla(4, "I.V.A. Impuesto al Valor Agregado");
        tablero[5] = new Propiedad(5, "SETAMA", 0, 0, 0);
    }
    
    
    
}

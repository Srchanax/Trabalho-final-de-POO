package Calc;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tulpy
 */
public class IMCCalc {
    private double alt, peso;

    public IMCCalc(double alt, double peso) {
        this.alt = alt;
        this.peso = peso;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double calc(){
        return peso / (alt * alt);
    }
}

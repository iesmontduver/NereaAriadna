/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ies.montduver.laformula1;

/**
 *
 * @author nerbolcas
 */
public class Xasis {

    private String marca;
    private String modelo;
    private String color;
    private double pes;
    private double llarg;
    private double ample;

    public Xasis(String marca, String modelo, String color, double pes, double llarg, double ample) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pes = pes;
        this.llarg = llarg;
        this.ample = ample;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getPes() {
        return pes;
    }

    public double getLlarg() {
        return llarg;
    }

    public double getAmple() {
        return ample;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public void setLlarg(double llarg) {
        this.llarg = llarg;
    }

    public void setAmple(double ample) {
        this.ample = ample;
    }
    
   
    
}

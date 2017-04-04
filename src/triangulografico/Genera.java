/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;

/**
 *
 * @author SPC7Z
 */
public abstract class Genera implements IOperacion {
    
    private ObtienePunto puntoA;
    
    private ObtienePunto puntoB;
    
    private double area;
    
    private double perimetro;
    
    private double altura;
    
    public static final double PI = 3.1416;

    public Genera(ObtienePunto puntoA, ObtienePunto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    protected double hallarLado(ObtienePunto puntoAuxA, ObtienePunto puntoAuxB) {
        double auxiliarX = Math.pow(puntoAuxB.getX() - puntoAuxA.getX(), 2);
        double auxiliarY = Math.pow(puntoAuxB.getY() - puntoAuxA.getY(), 2);        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;                
    }
                

    public ObtienePunto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(ObtienePunto puntoA) {
        this.puntoA = puntoA;
    }

    public ObtienePunto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(ObtienePunto puntoB) {
        this.puntoB = puntoB;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
}

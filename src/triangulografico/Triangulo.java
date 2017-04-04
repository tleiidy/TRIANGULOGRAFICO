/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;
import java.text.DecimalFormat;

/**
 *
 * @author SPC7Z
 */
public class Triangulo extends Genera{
    private ObtienePunto puntoC;

    public Triangulo(ObtienePunto puntoA, ObtienePunto puntoB, ObtienePunto puntoC) {
        super(puntoA, puntoB);
        this.puntoC =  puntoC;
    }

 
    @Override
    public void hallarInformacion() {
        
        double lado1 = hallarLado(this.getPuntoA(), this.getPuntoB());
        double lado2 = hallarLado(this.getPuntoB(), this.puntoC);
        double lado3 = hallarLado(this.puntoC, this.getPuntoA());
        this.setPerimetro(lado1 + lado2 + lado3);
        
        double semiperimetro = (lado1 + lado2 + lado3) / 2;        
        double ladoAux1 = semiperimetro - lado1;
        double ladoAux2 = semiperimetro - lado2;
        double ladoAux3 = semiperimetro - lado3;
        
        double area =  Math.sqrt((semiperimetro * ladoAux1 * ladoAux2 * ladoAux3));
        this.setArea (area);
        double altura = (2 * area)/lado1;
        this.setAltura(altura);
    }    
    
    
    
    public ObtienePunto getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(ObtienePunto puntoC) {
        this.puntoC = puntoC;
    }            

    
    
}

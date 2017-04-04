/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author Angie Castañeda
 */
public class PanelTriangulo extends JPanel{
   
    public Color colorLinea;
    public Color colorFondo;
    public ObtienePunto puntoA;
    public ObtienePunto puntoB;
    public ObtienePunto puntoC;

    private Principal principal;
    private Botones botones;
    
    public PanelTriangulo(Principal principal) {
        this.principal =principal;
        setBackground(Color.LIGHT_GRAY);
        
        
    }
    
    
      
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.botones = botones;
        g.setColor(Color.BLACK);
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
 
        
        Graphics2D grafico = (Graphics2D) g;
        Polygon polygon = new Polygon();
        if(puntoA != null){
        polygon.addPoint((this.getWidth()/2)+(int) puntoA.getX(),(this.getHeight()/2)-(int) puntoA.getY());
        polygon.addPoint((this.getWidth()/2)+(int) puntoB.getX(),(this.getHeight()/2)-(int) puntoB.getY());
        polygon.addPoint((this.getWidth()/2)+(int) puntoC.getX(),(this.getHeight()/2)-(int) puntoC.getY());
        

        grafico.setColor(colorFondo);
        grafico.fill(polygon);
        }
        grafico.setColor(colorFondo);
        grafico.fill(polygon);
        grafico.setColor(colorLinea);
        grafico.draw(polygon);
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
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

    public ObtienePunto getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(ObtienePunto puntoC) {
        this.puntoC = puntoC;
    }
  

  
}

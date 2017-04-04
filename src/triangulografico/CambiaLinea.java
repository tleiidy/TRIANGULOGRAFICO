/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
/**
 *
 * @author SPC7Z
 */
public class CambiaLinea extends JDialog{
    
    public CambiaLinea(){
        
        setTitle("CAMBIAR LINEA DEL TRIANGULO");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
       
        setBackground(Color.WHITE);
        setLayout(new GridLayout(6, 1));
    }
    
        protected void paintComponent(Graphics g){
        super.paintComponents(g);
        
        Polygon polygon = new Polygon();
        polygon.addPoint(0,0);
        polygon.addPoint(0,50);
        polygon.addPoint(50,50);
        
        //g.setColor(Color.BLUE);
        g.drawPolygon(polygon);
    }
    
}

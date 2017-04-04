/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.DecimalFormat;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Angie Castañeda
 */
public class Botones extends JPanel implements ActionListener{
    
    String x1, x2, x3, y1, y2, y3;
    double a1, a2, a3, b1, b2, b3;
    Triangulo triangulo;
    public JButton btnColorFondo;
    private JButton btnPunto;
    private JButton btnColorLinea;
    private JLabel LArea;
    private JLabel LPerimetro;
    private JLabel LAltura;
    
    public static final String BTN_COLOR_FONDO = "COLORFONDO";
    private static final String BTN_COLOR_LINEA = "COLORLINEA";
    private static final String BTN_PUNTO = "PUNTO";
    
    private Principal principal;
    private Genera genera;

    
    public Botones(Principal principal){
        this.principal=principal;
        setBackground(Color.WHITE);
        setLayout(new GridLayout(6, 1));
        
        btnColorFondo = new JButton ("Cambiar fondo");
        btnColorFondo.addActionListener((ActionListener) this);
        btnColorFondo.setActionCommand(BTN_COLOR_FONDO);
        add(btnColorFondo, BorderLayout.WEST);

        
        btnColorLinea = new JButton ("Cambiar linea");
        btnColorLinea.addActionListener((ActionListener) this);
        btnColorLinea.setActionCommand(BTN_COLOR_LINEA);
        add(btnColorLinea);
        
        btnPunto = new JButton ("Cambiar punto");
        btnPunto.addActionListener((ActionListener) this);
        btnPunto.setActionCommand(BTN_PUNTO);
        add(btnPunto);
       
        ObtienePunto puntoA = new ObtienePunto(0, 0);
        ObtienePunto puntoB = new ObtienePunto(4, 0);
        ObtienePunto puntoC = new ObtienePunto(4, 4);
               
        puntoA = new ObtienePunto(0, 0);
        puntoB = new ObtienePunto(4, 0);
        puntoC = new ObtienePunto(2, 2);
        genera = new Triangulo(puntoA, puntoB, puntoC);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.0000");
        
        LArea = new JLabel("Area:" + numero.format(genera.getArea()));
        add(LArea);
        
        LPerimetro = new JLabel("Perimetro:" + numero.format(genera.getPerimetro()));
        add(LPerimetro);
        
        LAltura = new JLabel("Altura:" + numero.format(genera.getAltura()));
        add(LAltura);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           if(BTN_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelTriangulo().setColorFondo(cl);
                this.principal.getPanelTriangulo().repaint();
            }
           else if (BTN_COLOR_LINEA.equals(e.getActionCommand())){
                JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelTriangulo().setColorLinea(cl);
                this.principal.getPanelTriangulo().repaint();
                
        }
        else if (BTN_PUNTO.equals(e.getActionCommand())){
            pidePuntos();
            
        }
    }
    
    public void pidePuntos(){
        x1 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x1");
        a1 = Double.parseDouble(x1);
        y1 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y1");
        b1 = Double.parseDouble(y1);
        x2 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x2");
        a2 = Double.parseDouble(x2);
        y2 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y2");
        b2 = Double.parseDouble(y2);
        x3 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada x3");
        a3 = Double.parseDouble(x3);
        y3 = JOptionPane.showInputDialog(btnPunto,"Digite coordenada y3");
        b3 = Double.parseDouble(y3);
        
        ObtienePunto puntoA = new ObtienePunto(a1, b1);
        ObtienePunto puntoB = new ObtienePunto(a2, b2);
        ObtienePunto puntoC = new ObtienePunto(a3, b3);
        genera = new Triangulo(puntoA, puntoB, puntoC);
        genera.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.000");

        
        LArea.setText("Area:" + numero.format(genera.getArea()));
        LPerimetro.setText("Perimetro:" + numero.format(genera.getPerimetro()));
        LAltura.setText("Altura:" + numero.format(genera.getAltura()));
        
        this.principal.getPanelTriangulo().setPuntoA(puntoA);
        this.principal.getPanelTriangulo().setPuntoB(puntoB);
        this.principal.getPanelTriangulo().setPuntoC(puntoC);
        this.principal.getPanelTriangulo().repaint();

    }


}

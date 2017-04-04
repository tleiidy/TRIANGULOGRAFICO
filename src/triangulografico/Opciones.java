/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


/**
 *
 * @author SPC7Z
 */
public class Opciones extends JPanel implements ActionListener{
    private JButton btnOpcion1;
    private JButton btnOpcion2;
    
    private static final String OPCION_1 = "OPCION 1";
    private static final String OPCION_2 = "OPCION 2";
    
    public Opciones(){
        
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1,2));
        
        btnOpcion1 = new JButton("OPCION 1");
        btnOpcion1.addActionListener(this);
        btnOpcion1.setActionCommand(OPCION_1);
        add(btnOpcion1);
        
        btnOpcion2 = new JButton("OPCION 2");
        btnOpcion2.addActionListener(this);
        btnOpcion2.setActionCommand(OPCION_2);
        add(btnOpcion2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(OPCION_1.equals(e.getActionCommand())){
            System.out.println("Boton 1");
        }
        else if (OPCION_2.equals(e.getActionCommand())){
            System.out.println("Boton 2");
        }
    }
}

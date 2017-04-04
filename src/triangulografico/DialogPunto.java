/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulografico;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Angie Castañeda
 */
public class DialogPunto extends JDialog {
    
        private final JPanel contentPanel = new JPanel();
      
    public DialogPunto(){
        
        getContentPane().setLayout(null);
        setTitle("CAMBIA PUNTOS");
        setSize(300, 200);
        setBounds(100, 100, 450, 229);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        
        
    }
    
}

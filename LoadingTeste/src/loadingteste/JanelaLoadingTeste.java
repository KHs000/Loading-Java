

package loadingteste;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

/**
 *
 * @author Felipe Rabelo
 */
public class JanelaLoadingTeste extends JFrame{
    private JProgressBar barra;
    private JButton botao;
    
    public JanelaLoadingTeste () {
        super ("Teste de barra de loading - Barra de HP XD");
        setLayout (new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints ();
        
        barra = new JProgressBar ();
        botao = new JButton ("Definir valor da barra");
        barra.setSize(4, 100);
        barra.setMaximum(500);
        barra.setValue(500);
        barra.setString(barra.getValue() + " / " + barra.getMaximum());
        barra.setValue(barra.getMaximum());
        barra.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        barra.setStringPainted(true);
        
        c.gridy = 0;
        c.gridx = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(barra, c);
        
        c.gridy = 1;
        c.gridx = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(botao, c);
        
        Event e = new Event ();
        botao.addActionListener(e);
    }
    
    private class Event implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botao) {
//                int value = Integer.parseInt(JOptionPane.showInputDialog
//                                                            ("Valor da barra"));
                for (int i = 500 ; i >= 200 ; i--) {
                    barra.setValue(barra.getValue() - 1);
                    barra.setBackground(Color.GREEN);
                    
                }
            }
        }
    }
}

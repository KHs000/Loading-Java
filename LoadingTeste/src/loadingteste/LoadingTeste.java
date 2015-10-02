

package loadingteste;

import javax.swing.JFrame;

/**
 *
 * @author Felipe Rabelo
 */
public class LoadingTeste {

    public static void main(String[] args) {
        JanelaLoadingTeste obj = new JanelaLoadingTeste ();
        
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(200, 200);
        obj.setLocation(170, 340);
        obj.setVisible(true);
    }
    
}

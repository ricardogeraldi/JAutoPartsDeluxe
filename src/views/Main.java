package views;

import daos.Banco;
import javax.persistence.EntityManager;
import javax.swing.JFrame;
import util.SplashR;

/**
 *
 * @author Ricardo
 */
public class Main {
    
    public static void main(String[] args) {
        
        SplashR.getInstance().openSplash();
        
        EntityManager em = Banco.getInstancia().getEm();
        
        ViewLogin telaLogin = new ViewLogin();
        telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaLogin.setVisible(true);
        SplashR.getInstance().finish();       
    }
}

package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends JFrame {

    Splash(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash/Splash.jpg"));
        Image image1 = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image1);

        JLabel image = new JLabel(imageIcon1);
        add(image);

        setSize(600, 400);
        setLocation(400, 200);
        setVisible(true);

        try{

            Thread.sleep(3000);
            setVisible(false);

            new Login();

        } catch (Exception e) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, "Splash screen interrupted", e);

        }
    }
    public static void main(String[] args) {
        new Splash();
    }

}

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

public Main() {
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setPreferredSize(new Dimension(300,350);
   setVisible(true);
}

public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
         new Main();
    });
}

}

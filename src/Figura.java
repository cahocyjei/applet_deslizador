import javax.swing.*;
import java.awt.*;

public class Figura extends JPanel {
    protected static int r=0;
    protected static int g=0;
    protected static int b=0;
    protected static JPanel panel;
    public Figura(){
        setLayout(null);
        panel= new JPanel();
        Color color= new Color(r,g,b);
        panel.setBackground(color);
        panel.setBounds(20,20,450,450);
        add(panel);

    }
}

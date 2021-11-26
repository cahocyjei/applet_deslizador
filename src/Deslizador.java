import sun.management.jdp.JdpJmxPacket;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Deslizador extends JMenuBar {

    private JSlider red;
    private JSlider greend;
    private JSlider blue;

    public Deslizador(){
        setLayout(null);
        //
        JLabel labelR= new JLabel("RED");
        labelR.setBounds(110,50,100,10);
        add(labelR);
        red= new JSlider(1,0,255,0);
        red.setMajorTickSpacing(25);
        red.setMinorTickSpacing(5);
        red.setPaintLabels(true);
        red.setBounds(100,100,50,300);
        add(red);
        red.addChangeListener(new EventoSlider());
        //
        JLabel labelG= new JLabel("GREEND");
        labelG.setBounds(210,50,100,10);
        add(labelG);
        greend= new JSlider(1,0,255,0);
        greend.setMajorTickSpacing(25);
        greend.setMinorTickSpacing(5);
        greend.setPaintLabels(true);
        greend.setBounds(200,100,50,300);
        add(greend);
        greend.addChangeListener(new EventoSlider());
        //
        JLabel labelB= new JLabel("BLUE");
        labelB.setBounds(310,50,100,10);
        add(labelB);
        blue= new JSlider(1,0,255,0);
        blue.setMajorTickSpacing(25);
        blue.setMinorTickSpacing(5);
        blue.setPaintLabels(true);
        blue.setBounds(300,100,50,300);
        add(blue);
        blue.addChangeListener(new EventoSlider());
    }

    private class EventoSlider implements ChangeListener {

        private int contador;
        @Override
        public void stateChanged(ChangeEvent e) {
            Object slide= e.getSource();
            if (red.equals(slide)) {
                Figura.r=red.getValue();
                Figura.panel.setBackground(new Color(Figura.r,Figura.g,Figura.b));
            }if (greend.equals(slide)){
                Figura.g= greend.getValue();
                Figura.panel.setBackground(new Color(Figura.r,Figura.g,Figura.b));
            }else if (blue.equals(slide)){
                Figura.b= blue.getValue();
                Figura.panel.setBackground(new Color(Figura.r,Figura.g,Figura.b));
            }
        }
    }

}

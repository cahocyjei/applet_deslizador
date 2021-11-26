
import java.applet.Applet;

public class AppletDes extends Applet {

    public void init(){
        setLayout(null);
        setSize(1200,600);
        Deslizador deslizador= new Deslizador();
        deslizador.setBounds(0,0,700,500);
        add(deslizador);
        Figura figura= new Figura();
        figura.setBounds(710,5,500,500);
        add(figura);


    }
}

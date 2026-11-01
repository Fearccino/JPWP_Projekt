import javax.swing.*;
import java.awt.*;
public class Okno extends JFrame {
    private ZarzadcaGry zarzadca;
    private JLabel tasmociag;
    private JLabel status;

    public Okno(){
        zarzadca=new ZarzadcaGry();
        setTitle("Gra - sortuj smieci");
        setSize(800,400);
        setLayout(new BorderLayout());

        JPanel panelGorny = new JPanel();
        tasmociag = new JLabel("",SwingConstants.CENTER);
        tasmociag.setFont(new Font("JetBrainsMono",Font.BOLD,18));
        panelGorny.add(tasmociag);
        add(panelGorny,BorderLayout.NORTH);

        JPanel panelKoszy = new JPanel(new GridLayout(1,5,10,10));
        String[] etykietyKoszy = {"PLASTIK","PAPIER","SZKŁO","BIO","ZMIESZANE"};

        for (int i = 0; i < 5; i++){
            int numerKosza = i;
            JButton przycisk = new JButton(etykietyKoszy[i]);


        }
    }
}

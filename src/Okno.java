import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame {
    private ZarzadcaGry zarzadca;
    private JLabel tasmociag;
    private JLabel status;

    public Okno() {
        zarzadca = new ZarzadcaGry();
        setTitle("Gra - sortuj smieci");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panelGorny = new JPanel();
        tasmociag = new JLabel("", SwingConstants.CENTER);
        tasmociag.setFont(new Font("JetBrainsMono", Font.BOLD, 18));
        panelGorny.add(tasmociag);

        JButton przyciskRozdziel = new JButton("Rozłóż na części");
        przyciskRozdziel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zarzadca.rozdzielAktualnySmiec();
                odswiezWidok();
            }
        });
        panelGorny.add(przyciskRozdziel);
        add(panelGorny, BorderLayout.NORTH);

        JPanel panelKoszy = new JPanel(new GridLayout(1, 5, 10, 10));
        String[] etykietyKoszy = {"PLASTIK", "PAPIER", "SZKŁO", "BIO", "ZMIESZANE"};

        for (int i = 0; i < 5; i++) {
            final int numerKosza = i;
            JButton przycisk = new JButton(etykietyKoszy[i]);
            przycisk.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zarzadca.sortowanieSmieci(numerKosza);
                    odswiezWidok();
                }
            });
            panelKoszy.add(przycisk);
        }
        add(panelKoszy, BorderLayout.CENTER);

        JPanel panelDolny = new JPanel();
        status = new JLabel("Stan gry: Rozpoczęto rozgrywkę");
        panelDolny.add(status);
        add(panelDolny, BorderLayout.SOUTH);

        odswiezWidok();
        setVisible(true);
    }

    private void odswiezWidok() {
        if (!zarzadca.tasmociag.isEmpty()) {
            Smiec aktualny = zarzadca.tasmociag.get(0);
            tasmociag.setText("Aktualny odpad: " + aktualny.nazwa +
                    " | Czy brudny: " + (aktualny.czyBrudny ? "TAK" : "NIE") +
                    " | Czy złożony: " + (aktualny.czyZlozony ? "TAK" : "NIE"));
        } else {
            tasmociag.setText("Wszystkie śmieci zostały posortowane.");
        }
    }

    public static void main(String[] args) {
        new Okno();
    }
}
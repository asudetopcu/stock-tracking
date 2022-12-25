package ui;

import test.initCagir;

import javax.swing.*;
import java.awt.*;

public class KayitYapGui extends JDialog implements initCagir {

    public KayitYapGui (){
        initPencere();
    }

    @Override
    public void initPencere() {
        JPanel panel = initPanel();

        add(panel);
        setTitle("Kayıt Yap");
        pack();
        setLocationRelativeTo(null);
        setModalityType(DEFAULT_MODALITY_TYPE);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        JPanel panel = new JPanel(new GridLayout(5,2));

        JLabel urunIdJLabel = new JLabel("Ürün ID: ",JLabel.RIGHT);
        panel.add(urunIdJLabel);
        JTextField urunIdField = new JTextField(15);
        panel.add(urunIdField);

        JLabel urunAdiJLabel = new JLabel("Ürün Adı: ",JLabel.RIGHT);
        panel.add(urunAdiJLabel);
        JTextField urunAdiField = new JTextField(15);
        panel.add(urunAdiField);

        JLabel cinsiJLabel = new JLabel("Cinsi: ",JLabel.RIGHT);
        panel.add(cinsiJLabel);
        JTextField cinsiTextField = new JTextField(15);
        panel.add(cinsiTextField);

        JLabel adetJLabel = new JLabel("Adet: ",JLabel.RIGHT);
        panel.add(adetJLabel);
        JTextField adetTextField = new JTextField(15);
        panel.add(adetTextField);

        JButton kaydetButton = new JButton("Kaydet");
        panel.add(kaydetButton);

        JButton iptalButton = new JButton("İptal");
        panel.add(iptalButton);

        return panel;
    }

    @Override
    public JMenuBar initBar() {
        return null;
    }
}

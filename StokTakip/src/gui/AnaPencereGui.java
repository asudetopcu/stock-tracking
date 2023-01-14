package gui;

import test.initCagir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaPencereGui extends JFrame implements initCagir {

    public AnaPencereGui(){
        initPencere();
    }

    public void initPencere(){
        JPanel panel = initPanel();
        JMenuBar bar = initBar();

        add(panel);
        setJMenuBar(bar);
        setTitle("Stok Takip ");
        setSize(350,500);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel initPanel(){
        JPanel panel = new JPanel(new BorderLayout());
        JPanel bulPanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(1,1));

        JTextField araField = new JTextField(25);
        bulPanel.add(araField);
        JButton bulButton = new JButton("Bul");
        buttonPanel.add(bulButton);
        JButton silButton = new JButton("Sil");
        buttonPanel.add(silButton);
        JButton duzenleButton = new JButton("Düzenle");
        buttonPanel.add(duzenleButton);


        JList urunlerList = new JList();
        JScrollPane pane = new JScrollPane(urunlerList);

        panel.add(pane, BorderLayout.CENTER);
        panel.add(bulPanel,BorderLayout.NORTH);
        panel.add(buttonPanel,BorderLayout.SOUTH);
        return panel;
    }

    public JMenuBar initBar(){
        JMenuBar bar = new JMenuBar();
        JMenu dosyaJMenu = new JMenu("Dosya");
        bar.add(dosyaJMenu);

        JMenuItem kayitYapItem = new JMenuItem("Kayıt Yap");

        dosyaJMenu.add(kayitYapItem);
        kayitYapItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new KayitYapGui();
            }
        });
        return bar;
    }



}

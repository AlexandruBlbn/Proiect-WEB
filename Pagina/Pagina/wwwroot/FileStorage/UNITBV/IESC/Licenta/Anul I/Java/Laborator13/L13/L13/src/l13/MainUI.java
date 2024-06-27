package l13;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MainUI extends JFrame {

    JPanel continut_panel; // container

    JLabel nume_label = new JLabel();
    JLabel specializare_label= new JLabel();

    JTextField nume = new JTextField();
    JTextField specializare  = new JTextField();

    JButton adauga_btn = new JButton();

    JTextArea continut = new JTextArea();

    String linie = "";

    public MainUI(){
        setTitle("Studenti IESC");
        setSize(550,450);

        continut_panel = (JPanel) getContentPane();
        continut_panel.setLayout(null);

        nume_label.setText("Numele si prenumele: ");
        nume_label.setBounds(40,50,200,30);
        nume_label.setFont(new Font("TimesNewRoman",Font.BOLD,14));

        specializare_label.setText("Specializarea: ");
        specializare_label.setBounds(40,100,200,30);
        specializare_label.setFont(new Font("TimesNewRoman",Font.BOLD,14));


        nume.setBounds(250,50,200,30);
        nume.setFont(new Font("SansSerif",Font.ITALIC,14));
        nume.setBackground(Color.gray);
        nume.setForeground(Color.white);

        specializare.setBounds(250,100,200,30);
        specializare.setFont(new Font("SansSerif",Font.ITALIC,14));
        specializare.setBackground(Color.gray);
        specializare.setForeground(Color.white);


        continut.setForeground(Color.blue);
        continut.setFont(new Font("SansSerif", Font.ITALIC, 16));
        continut.setBounds(200, 150, 310, 250);


        adauga_btn.setText("Adauga student");
        adauga_btn.setBounds(30,250,150,40);
        adauga_btn.addActionListener(
                new java.awt.event.ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        int result = JOptionPane.showConfirmDialog(null,
                                "Sunteti sigur de corectitudinea datelor?",
                                "Adaugare Student",
                                JOptionPane.YES_NO_OPTION);
                        if(result == 0) {
                            linie = linie + nume.getText() + ", " + specializare.getText() + "\n";
                            continut.setText(linie);
                        }
                    }
                });

        continut_panel.add(nume_label);
        continut_panel.add(specializare_label);
        continut_panel.add(continut);
        continut_panel.add(nume);
        continut_panel.add(specializare);
        continut_panel.add(adauga_btn);
    }
}

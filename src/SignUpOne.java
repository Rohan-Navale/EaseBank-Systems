import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpOne extends JFrame {

    SignUpOne(){

        setLayout(null);/// VVImp otherwise the text will be at the center

        JLabel a = new JLabel("Personal Details:");
        a.setForeground(Color.white);
        a.setFont(new Font("Roboto",Font.BOLD,28));
        a.setBounds(44,48,239,35);
        add(a);

        JLabel f = new JLabel("Name");
        f.setForeground(Color.white);
        f.setFont(new Font("Roboto",Font.PLAIN,24));
        f.setBounds(44,120,320,33);
        add(f);

        JLabel r = new JLabel("Father's Name");
        r.setForeground(Color.white);
        r.setFont(new Font("Roboto",Font.PLAIN,24));
        r.setBounds(44,183,320,33);
        add(r);

        JLabel c = new JLabel("Date of Birth");
        c.setForeground(Color.white);
        c.setFont(new Font("Roboto",Font.PLAIN,24));
        c.setBounds(44,246,320,33);
        add(c);

        JLabel i = new JLabel("Email Address");
        i.setForeground(Color.white);
        i.setFont(new Font("Roboto",Font.PLAIN,24));
        i.setBounds(44,309,320,33);
        add(i);

        JLabel e = new JLabel("Marital Occupation");
        e.setForeground(Color.white);
        e.setFont(new Font("Roboto",Font.PLAIN,24));
        e.setBounds(44,372,320,33);
        add(e);

        JLabel o = new JLabel("Address");
        o.setForeground(Color.white);
        o.setFont(new Font("Roboto",Font.PLAIN,24));
        o.setBounds(44,435,320,33);
        add(o);

        JLabel p = new JLabel("City");
        p.setForeground(Color.white);
        p.setFont(new Font("Roboto",Font.PLAIN,24));
        p.setBounds(44,498,320,33);
        add(p);

        JLabel aa = new JLabel("PIN Code");
        aa.setForeground(Color.white);
        aa.setFont(new Font("Roboto",Font.PLAIN,24));
        aa.setBounds(44,561,320,33);
        add(aa);

//        JLabel s = new JLabel("Senior Citizen");
//        s.setForeground(Color.white);
//        s.setFont(new Font("Roboto",Font.PLAIN,24));
//        s.setBounds(44,624,320,33);
//        add(s);
//
//        JLabel ee = new JLabel("Existing Account");
//        ee.setForeground(Color.white);
//        ee.setFont(new Font("Roboto",Font.PLAIN,24));
//        ee.setBounds(44,687,320,33);
//        add(ee);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.gray);

    }

    public static void main(String[] args){
        new SignUpOne();
    }
}
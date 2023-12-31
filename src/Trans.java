import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Trans extends JFrame implements ActionListener {
    JButton withdraw,mini,balance,exit,dep,cash,change;
    JButton one,four,seven,star,two,five,eight,zero,three,six,nine,hashtag,cancel,clear,enter,back;
    String pin;
    Trans(String pinNumber){
        pin = pinNumber;
        setLayout(null);
        setLayout(null);
        setUndecorated(false);
        setVisible(true);
        setSize(900,850);
        setLocation(300,0);
        setTitle("ATM Interface");
        getContentPane().setBackground(new Color(12,19,79));

        ImageIcon originalIcon = new ImageIcon(ClassLoader.getSystemResource("icons/EASE Bank LOGO.png"));
        Image originalImage = originalIcon.getImage();
        int width = 162;
        int height = 44;
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(352, 12, width, height);
        add(label);

        String time = null;
        LocalTime currtime = LocalTime.now();

        if (currtime.isAfter(LocalTime.of(00, 00)) && currtime.isBefore(LocalTime.of(12, 00))) {
            time = "Morning";
        } else if (currtime.isAfter(LocalTime.of(12, 00)) && currtime.isBefore(LocalTime.of(16, 00))) {
            time = "Afternoon";
        } else if (currtime.isAfter(LocalTime.of(16, 00)) && currtime.isBefore(LocalTime.of(23, 59))) {
            time = "Evening";
        }


//        Conn conn = new Conn();
//        String query1 = "SELECT * FROM logIn WHERE cardNo = '"+cardNumber+"' AND pinNo = '"+pinNumber+"'";
//        String query0 = "SELECT name FROM signup s JOIN logIn l WHERE l.cardNo'"+cardNumber+"' = "

        JLabel Text1 = new JLabel("Good "+time);
        Text1.setBounds(150,65,190,33);
        Text1.setFont(new Font("Raleway", Font.BOLD,24));
        Text1.setForeground(Color.WHITE);
        add(Text1);

        JLabel Text2 = new JLabel("Please select your transaction");
        Text2.setBounds(250,100,500,33);
        Text2.setFont(new Font("Raleway", Font.BOLD,28));
        Text2.setForeground(Color.WHITE);
        add(Text2);

        withdraw = new JButton("Cash Withdrawl");
        withdraw.setBounds(554,169,300,60);
        withdraw.setBackground(new Color(19,105,245));
        withdraw.setFont(new Font("Raleway",Font.BOLD,22));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        add(withdraw);

        mini = new JButton("Mini Statement");
        mini.setBounds(554,249,300,60);
        mini.setBackground(new Color(19,105,245));
        mini.setFont(new Font("Raleway",Font.BOLD,22));
        mini.setForeground(Color.WHITE);
        mini.addActionListener(this);
        add(mini);

        balance = new JButton("Balance Enquiry");
        balance.setBounds(554,329,300,60);
        balance.setBackground(new Color(19,105,245));
        balance.setFont(new Font("Raleway",Font.BOLD,22));
        balance.setForeground(Color.WHITE);
        balance.addActionListener(this);
        add(balance);

        exit = new JButton("Exit");
        exit.setBounds(554,409,300,60);
        exit.setBackground(new Color(19,105,245));
        exit.setFont(new Font("Raleway",Font.BOLD,22));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        dep = new JButton("Deposit");
        dep.setBounds(30,169,300,60);
        dep.setBackground(new Color(19,105,245));
        dep.setFont(new Font("Raleway",Font.BOLD,22));
        dep.setForeground(Color.WHITE);
        dep.addActionListener(this);
        add(dep);

        cash = new JButton("Fast Cash");
        cash.setBounds(30,249,300,60);
        cash.setBackground(new Color(19,105,245));
        cash.setFont(new Font("Raleway",Font.BOLD,22));
        cash.setForeground(Color.WHITE);
        cash.addActionListener(this);
        add(cash);

        change = new JButton("PIN Change");
        change.setBounds(30,329,300,60);
        change.setBackground(new Color(19,105,245));
        change.setFont(new Font("Raleway",Font.BOLD,22));
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        add(change);

        one = new JButton("1");
        one.setForeground(Color.BLACK);
        one.setFont(new Font("Raleway", Font.BOLD,20));
        one.setBackground(Color.white);
        one.setBounds(242,505,88,60);
        one.addActionListener(this);
        add(one);

        four = new JButton("4");
        four.setForeground(Color.BLACK);
        four.setFont(new Font("Raleway", Font.BOLD,20));
        four.setBackground(Color.white);
        four.setBounds(242,575,88,60);
        four.addActionListener(this);
        add(four);

        seven = new JButton("7");
        seven.setForeground(Color.BLACK);
        seven.setFont(new Font("Raleway", Font.BOLD,20));
        seven.setBackground(Color.white);
        seven.setBounds(242,645,88,60);
        seven.addActionListener(this);
        add(seven);

        two = new JButton("2");
        two.setForeground(Color.BLACK);
        two.setFont(new Font("Raleway", Font.BOLD,20));
        two.setBackground(Color.white);
        two.setBounds(340,505,88,60);
        two.addActionListener(this);
        add(two);

        five = new JButton("5");
        five.setForeground(Color.BLACK);
        five.setFont(new Font("Raleway", Font.BOLD,20));
        five.setBackground(Color.white);
        five.setBounds(340,575,88,60);
        five.addActionListener(this);
        add(five);

        eight = new JButton("8");
        eight.setForeground(Color.BLACK);
        eight.setFont(new Font("Raleway", Font.BOLD,20));
        eight.setBackground(Color.white);
        eight.setBounds(340,645,88,60);
        eight.addActionListener(this);
        add(eight);

        zero = new JButton("0");
        zero.setForeground(Color.BLACK);
        zero.setFont(new Font("Raleway", Font.BOLD,20));
        zero.setBackground(Color.white);
        zero.setBounds(340,715,88,60);
        zero.addActionListener(this);
        add(zero);

        three = new JButton("3");
        three.setForeground(Color.BLACK);
        three.setFont(new Font("Raleway", Font.BOLD,20));
        three.setBackground(Color.white);
        three.setBounds(440,505,88,60);
        three.addActionListener(this);
        add(three);

        six = new JButton("6");
        six.setForeground(Color.BLACK);
        six.setFont(new Font("Raleway", Font.BOLD,20));
        six.setBackground(Color.white);
        six.setBounds(440,575,88,60);
        six.addActionListener(this);
        add(six);

        nine = new JButton("9");
        nine.setForeground(Color.BLACK);
        nine.setFont(new Font("Raleway", Font.BOLD,20));
        nine.setBackground(Color.white);
        nine.setBounds(440,645,88,60);
        nine.addActionListener(this);
        add(nine);

        cancel = new RoundedButton("Cancel",new Color(255,87,0),Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD,20));
        cancel.addActionListener(this);
        cancel.setBounds(540,505,120,60);
        add(cancel);

        clear = new RoundedButton("Clear", new Color(151,71,255), Color.WHITE);
        clear.setFont(new Font("Raleway", Font.BOLD,20));
        clear.addActionListener(this);
        clear.setBounds(540,575,120,60);
        add(clear);

        enter = new RoundedButton("Enter", new Color(133,193,13),Color.WHITE );
        enter.setFont(new Font("Raleway", Font.BOLD,20));
        enter.setBounds(540,645,120,60);
        enter.addActionListener(this);
        add(enter);

        JPanel rectangle = new JPanel();
        rectangle.setBounds(10,10,867,483);
        rectangle.setBackground(new Color(11,58,151));
        add(rectangle);

    }
    public static void main(String[] args){
        new Trans("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit || ae.getSource()==cancel){
            JOptionPane.showMessageDialog(null,"You have been logged out successfully");
            System.exit(0);
        }
        if(ae.getSource()==dep){
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }
        if(ae.getSource()==withdraw){
            setVisible(false);
            new withdraw(pin).setVisible(true);
        }
        if(ae.getSource()==cash){
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }
        if(ae.getSource()==change){
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }
        if (ae.getSource()==balance){
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        if(ae.getSource()==mini){
            new MiniStatement(pin).setVisible(true);
        }
    }

}







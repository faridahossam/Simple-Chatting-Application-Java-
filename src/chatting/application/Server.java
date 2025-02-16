package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

/**
 *
 * @author TAC
 */
public class Server extends JFrame implements ActionListener{
    JTextField t1;
    JPanel p2;
    Box vertical = Box.createVerticalBox();
    Server(){
        
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setLayout(null);
        p1.setBounds(0,0,450,70);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        JLabel back = new JLabel(new ImageIcon(i2));
        back.setBounds(5,20,25,25);
        p1.add(back);
        
        back.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae){
               System.exit(0);
            }
        });
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i4 = i3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        JLabel profile = new JLabel(new ImageIcon(i4));
        profile.setBounds(40,10,50,50);
        p1.add(profile);
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i6 = i5.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        JLabel video = new JLabel(new ImageIcon(i6));
        video.setBounds(300,20,30,30);
        p1.add(video);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i8 = i7.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        JLabel phone = new JLabel(new ImageIcon(i8));
        phone.setBounds(360,20,35,30);
        p1.add(phone);
        
        ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i10 = i9.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        JLabel morevert = new JLabel(new ImageIcon(i10));
        morevert.setBounds(420,20,10,25);
        p1.add(morevert);
        
        JLabel name = new JLabel("Ahmed");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF" , Font.BOLD , 18));
        p1.add(name);
        
        JLabel status = new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF" , Font.BOLD , 14));
        p1.add(status);
        
        p2 = new JPanel();
        p2.setBounds(5 , 75, 440, 570);
        add(p2);
        
        t1 = new JTextField();
        t1.setBounds(5 , 655 , 310,40);
        t1.setFont(new Font("SAN_SERIF" , Font.PLAIN,16));
        add(t1);
        
        JButton send =  new JButton("Send");
        send.setBounds(320,655,123,40);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF" , Font.PLAIN,16));
        add(send);
        
        setSize(450 , 700);
        setLocation(200,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String out = t1.getText();
   
        JPanel p3 =  formatLabel(out);
        
        p2.setLayout(new BorderLayout());
        
        JPanel right = new JPanel(new BorderLayout());
        right.add(p3,BorderLayout.LINE_END);
        vertical.add(right);
        vertical.add(Box.createVerticalStrut(15));
        
        p2.add(vertical,BorderLayout.PAGE_START);
        
        repaint();
        invalidate();
        validate();
    }
    
    public static JPanel formatLabel(String out){
        JPanel panel =  new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JLabel message = new JLabel("<html><p style=\"width: 150px\">"+out+"</p></html>");
        message.setFont(new Font("Tahoma",Font.PLAIN,16));
        message.setBackground(new Color(37,211,102));
        message.setOpaque(true);
        message.setBorder(new EmptyBorder(15,15,15,50));
        
        panel.add(message);
        return panel;
    }
    
    public static void main(String[] args){
        new Server();
    }
}

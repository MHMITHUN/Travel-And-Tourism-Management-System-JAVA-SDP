package travel.and.tourism.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame{
    
    Login(){
        setSize(900,500);
        setLocation(320,150);
        
        setLayout(null);
        
        getContentPane().setBackground(Color.white);
        
        JPanel pl = new JPanel();
        pl.setBackground(new Color(131,193,233));
             
        pl.setBounds(0,0,400,500);
        pl.setLayout(null);
        add(pl);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);
        pl.add(image);
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(211,211,211));
        p2.setLayout(null);
        p2.setBounds(400,20,450,420);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133, 193, 233)));

        p2.add(login);
        
        JButton signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));

        p2.add(signup);
        
        JButton pass = new JButton("Forget Password");
        pass.setBounds(130, 250, 130, 30);
        pass.setBackground(new Color(133, 193, 233));
        pass.setForeground(Color.WHITE);
        pass.setBorder(new LineBorder(new Color(133, 193, 233)));

        p2.add(pass);
        
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300, 255, 150, 20);
        text.setForeground(Color.RED);
        p2.add(text);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
         new Login();
        }
    
}

package travel.and.tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/splashscreen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        add(image);

        setUndecorated(true);
        setVisible(true);

        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            Thread.sleep(3000);
            setVisible(false);
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();
        
        int maxWidth = 1200;
        int maxHeight = 600;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int x = 7;

        for (int i = 2; i <= maxHeight; i += 10, x += 7) {
            int currentWidth = i + x;
            int currentHeight = i;

            if (currentWidth >= maxWidth && currentHeight >= maxHeight) {
                break;
            }

            int xPos = (screenWidth - currentWidth) / 2;
            int yPos = (screenHeight - currentHeight) / 2;
            frame.setLocation(xPos, yPos);
            frame.setSize(currentWidth, currentHeight);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

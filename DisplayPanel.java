import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.Random;

import javax.swing.*;

public class DisplayPanel extends JPanel {
    JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
    JButton[] slots = new JButton[3];
    Image question;
    Image triangle;
    Image bar;
    Image star;
    Image donut;
    Image lemon;
    Image cherry;
    Image[] images = new Image[6];
    boolean running = false;

    private Timer timer;

    DisplayPanel() {
        question = getImage("mystery.gif");
        triangle = getImage("triangle.gif");
        bar = getImage("bar.jpg");
        star = getImage("star.gif");
        donut = getImage("donut.jpg");
        lemon = getImage("lemon.jpg");
        cherry = getImage("cherry.jpg");

        images[0] = triangle;
        images[1] = bar;
        images[2] = star;
        images[3] = donut;
        images[4] = lemon;
        images[5] = cherry;
        for (int i = 0; i < 3; i++) {
            slots[i] = new JButton(new ImageIcon(question));
        }
        add(buttonPanel, BorderLayout.CENTER);

        for (int i = 0; i < 3; i++) {
            // slots[i].setEnabled(false);
            buttonPanel.add(slots[i]);
        }
        
        timer = new Timer    ( 100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (running) changeImages('G');
                
                repaint();
            }
        });
        timer.setInitialDelay( 100 );
        timer.start();

    }

    void changeImages(char ident) {
        if (ident == 'G') {
            running=true;
            Random rand = new Random();
            int num = 0;
            if (running) {
                num = rand.nextInt(6);
                slots[0].setIcon(new ImageIcon(images[num]));
                num = rand.nextInt(6);
                slots[1].setIcon(new ImageIcon(images[num]));
                num = rand.nextInt(6);
                slots[2].setIcon(new ImageIcon(images[num]));
            }
            buttonPanel.repaint();
        }
        if (ident == 'S') {
            running=false;
        }

    }

    private Image getImage(String filename) {
        URL url = getClass().getResource(filename);
        ImageIcon icon = new ImageIcon(url);
        return icon.getImage();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public String chooseImage(String[] submitted){
        if (submitted==null) return null;
        int length=submitted.length;
        if (length==0){
            return null;
        }
        else if (length>=3){
            return submitted[length-1];
        }
        else{
            return submitted[0];
        }
    }

}

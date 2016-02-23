import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Created by Rahul Soni on 23/02/2016.
 */


public class CW2 {


    public static void addComponents (Container pane)
    {
        pane.setLayout(new GridBagLayout());

        GridBagConstraints gBC = new GridBagConstraints();
        gBC.fill = GridBagConstraints.HORIZONTAL;

        ColorLabel label1 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 0;
        gBC.gridy = 0;

        pane.add(label1, gBC);

        ColorLabel label2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 1;

        pane.add(label2, gBC);

        ColorLabel label3 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 2;

        pane.add(label3, gBC);

        ColorLabel label4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 3;

        pane.add(label4, gBC);

        ColorLabel label5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 4;

        pane.add(label5, gBC);

        ColorLabel label6 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 5;

        pane.add(label6, gBC);

        ColorLabel label7 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.LIGHT_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 6;

        pane.add(label7, gBC);

        ColorLabel elabel1 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 1;
        gBC.gridy = 0;

        pane.add(elabel1, gBC);

        ColorLabel elabel2 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 1;

        pane.add(elabel2, gBC);

        ColorLabel elabel3 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 2;

        pane.add(elabel3, gBC);

        ColorLabel elabel4 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 3;

        pane.add(elabel4, gBC);

        ColorLabel elabel5 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 4;

        pane.add(elabel5, gBC);

        ColorLabel elabel6 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 5;

        pane.add(elabel6, gBC);

        ColorLabel elabel7 = (new ColorLabel(10, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 6;

        pane.add(elabel7, gBC);

        ColorLabel blabel1 = (new ColorLabel(100, 100,Color.PINK, 1, Color.LIGHT_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 2;
        gBC.gridy = 0;

        pane.add(blabel1, gBC);

        ColorLabel blabel2 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 1;

        pane.add(blabel2, gBC);

        ColorLabel blabel3 = (new ColorLabel(100, 100,Color.ORANGE, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 2;

        pane.add(blabel3, gBC);

        ColorLabel blabel4 = (new ColorLabel(100, 100,Color.BLACK, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 3;

        pane.add(blabel4, gBC);

        ColorLabel blabel5 = (new ColorLabel(100, 100,Color.RED, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 4;

        pane.add(blabel5, gBC);

        ColorLabel blabel6 = (new ColorLabel(100, 100,Color.RED, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 5;

        pane.add(blabel6, gBC);

        ColorLabel blabel7 = (new ColorLabel(100, 100,Color.RED, 1, Color.LIGHT_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 6;

        pane.add(blabel7, gBC);











    }

    public static void createGUI()
    {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Rahul Soni");
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        addComponents(frame.getContentPane());
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        frame.pack();
        frame.setVisible(true);


    }

    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}

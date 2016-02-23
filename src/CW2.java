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
        gBC.fill = GridBagConstraints.BOTH;

        ColorLabel label1 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 0;
        gBC.gridy = 0;

        pane.add(label1, gBC);

        ColorLabel label2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 1;

        pane.add(label2, gBC);

        ColorLabel label3 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 2;

        pane.add(label3, gBC);

        ColorLabel label4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 3;

        pane.add(label4, gBC);

        ColorLabel label5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 4;

        pane.add(label5, gBC);

        ColorLabel label6 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.DARK_GRAY));
        gBC.gridx = 0;
        gBC.gridy = 5;

        pane.add(label6, gBC);




        ColorLabel elabel1 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 1;
        gBC.gridy = 0;

        pane.add(elabel1, gBC);

        ColorLabel elabel2 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 1;

        pane.add(elabel2, gBC);

        ColorLabel elabel3 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 2;

        pane.add(elabel3, gBC);

        ColorLabel elabel4 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 3;

        pane.add(elabel4, gBC);

        ColorLabel elabel5 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 4;

        pane.add(elabel5, gBC);

        ColorLabel elabel6 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 1;
        gBC.gridy = 5;

        pane.add(elabel6, gBC);


        ColorLabel blabel1 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.DARK_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 2;
        gBC.gridy = 0;

        pane.add(blabel1, gBC);

        ColorLabel blabel2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 1;

        pane.add(blabel2, gBC);

        ColorLabel blabel3 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 2;

        pane.add(blabel3, gBC);

        ColorLabel blabel4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 3;

        pane.add(blabel4, gBC);

        ColorLabel blabel5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 4;

        pane.add(blabel5, gBC);

        ColorLabel blabel6 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 2;
        gBC.gridy = 5;

        pane.add(blabel6, gBC);



        ColorLabel e2label1 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 3;
        gBC.gridy = 0;

        pane.add(e2label1, gBC);

        ColorLabel e2label2 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 3;
        gBC.gridy = 1;

        pane.add(e2label2, gBC);

        ColorLabel e2label3 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 3;
        gBC.gridy = 2;

        pane.add(e2label3, gBC);

        ColorLabel e2label4 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 3;
        gBC.gridy = 3;

        pane.add(e2label4, gBC);

        ColorLabel e2label5 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 3;
        gBC.gridy = 4;

        pane.add(e2label5, gBC);

        ColorLabel e2label6 = (new ColorLabel(20, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 3;
        gBC.gridy = 5;

        pane.add(e2label6, gBC);



        ColorLabel clabel1 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.DARK_GRAY));
        gBC.weightx = 0.5;
        gBC.gridx = 4;
        gBC.gridy = 0;

        pane.add(clabel1, gBC);

        ColorLabel clabel2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 4;
        gBC.gridy = 1;

        pane.add(clabel2, gBC);

        ColorLabel clabel3 = (new ColorLabel(100, 100,Color.LIGHT_GRAY, 1, Color.lightGray));
        gBC.gridx = 4;
        gBC.gridy = 2;

        pane.add(clabel3, gBC);

        ColorLabel clabel4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 4;
        gBC.gridy = 3;

        pane.add(clabel4, gBC);

        ColorLabel clabel5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 4;
        gBC.gridy = 4;

        pane.add(clabel5, gBC);

        ColorLabel clabel6 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.DARK_GRAY));
        gBC.gridx = 4;
        gBC.gridy = 5;

        pane.add(clabel6, gBC);


        ColorLabel dlabel1 = (new ColorLabel(100, 100,Color.YELLOW, 1, Color.DARK_GRAY));
        
        gBC.gridx = 5;
        gBC.gridy = 0;

        pane.add(dlabel1, gBC);

        ColorLabel dlabel2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 5;
        gBC.gridy = 1;

        pane.add(dlabel2, gBC);

        ColorLabel dlabel3 = (new ColorLabel(100, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 5;
        gBC.gridy = 2;

        pane.add(dlabel3, gBC);

        ColorLabel dlabel4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 5;
        gBC.gridy = 3;

        pane.add(dlabel4, gBC);

        ColorLabel dlabel5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 5;
        gBC.gridy = 4;

        pane.add(dlabel5, gBC);

        ColorLabel dlabel6 = (new ColorLabel(100, 100,Color.lightGray, 1, Color.LIGHT_GRAY));
        gBC.gridx = 5;
        gBC.gridy = 5;

        pane.add(dlabel6, gBC);



        ColorLabel xlabel1 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 0;

        pane.add(xlabel1, gBC);

        ColorLabel xlabel2 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 1;

        pane.add(xlabel2, gBC);

        ColorLabel xlabel3 = (new ColorLabel(100, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 2;

        pane.add(xlabel3, gBC);

        ColorLabel xlabel4 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 3;

        pane.add(xlabel4, gBC);

        ColorLabel xlabel5 = (new ColorLabel(100, 100,Color.GREEN, 1, Color.DARK_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 4;

        pane.add(xlabel5, gBC);

        ColorLabel xlabel6 = (new ColorLabel(100, 100,Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
        gBC.gridx = 6;
        gBC.gridy = 5;

        pane.add(xlabel6, gBC);













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

        //ASK ABOUT THIS
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());

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

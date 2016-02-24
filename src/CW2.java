import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.*;
import java.util.List;

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

        List<ColorLabel> list = new ArrayList<>();

        for (int i = 0; i < 7; ++i) // x value
        {
            gBC.gridx = i;
            list.clear();
            for (int b = 0; b < 6; ++b)  // y value
            {
                gBC.gridy = b;

                if ((gBC.gridy == 5 && gBC.gridx == 0 )||
                        (gBC.gridx == 2 && gBC.gridy == 0 ) ||
                        (gBC.gridx == 4 && gBC.gridy == 0) ||
                        (gBC.gridx == 4 && gBC.gridy == 5) ||
                        (gBC.gridx == 5 && gBC.gridy == 0))

                {
                    list.add(new ColorLabel(100, 100, Color.YELLOW, 1, Color.DARK_GRAY));
                    pane.add(list.get(b), gBC);
                }

                else if (gBC.gridx == 1 || gBC.gridx == 3)
                {
                    list.add(new ColorLabel(20, 100, Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
                    pane.add(list.get(b), gBC);
                }


                else if (
                        (gBC.gridx == 4 && gBC.gridy == 2)||
                        (gBC.gridx == 5 && gBC.gridy == 2)||
                        (gBC.gridx == 6 && gBC.gridy == 2)||
                        (gBC.gridx == 6 && gBC.gridy == 5)||
                        (gBC.gridx == 5 && gBC.gridy == 5)
                        )
                {
                    list.add(new ColorLabel(100, 100, Color.LIGHT_GRAY, 1, Color.LIGHT_GRAY));
                    pane.add(list.get(b), gBC);
                }

                else
                {
                    list.add(new ColorLabel(100, 100, Color.GREEN, 1, Color.DARK_GRAY));

                    pane.add(list.get(b), gBC);
                }


                System.out.println(pane.getComponents());


            }
        }









    }

    public static void createGUI()
    {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Rahul Soni - 4255222 ");
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        addComponents(frame.getContentPane());
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        frame.pack();
        frame.setVisible(true);

        //ASK ABOUT THIS
        //frame.setResizable(false);
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

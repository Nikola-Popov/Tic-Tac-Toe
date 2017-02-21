package game;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                final JFrame frame = new JFrame("Tic Tac Toe");
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                        | UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600, 600);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                final StatusBar statusBar = new StatusBar();
                frame.add(statusBar, BorderLayout.SOUTH);
                frame.setJMenuBar(Menu.createJmenu());
                frame.add(new Layout());
                frame.setVisible(true);
                Layout.play();

            }

        });

    }
}

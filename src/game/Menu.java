package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends JPanel implements Serializable {
    private static final long serialVersionUID = -97801427060644168L;

    public static JMenuBar createJmenu() {
        JMenuBar menuBar;
        final JMenu fileMenu;
        final JMenu helpMenu;
        final JMenu settingsMenu;
        JMenuItem exitFileSubMenuItem;
        JMenuItem restartFileSubMenuItem;
        JMenuItem aboutHelpSubMenuItem;
        JMenuItem rulesHelpSubMenuItem;
        JMenuItem openFileSubmMenuItem;
        JMenuItem saveFileSubmMenuItem;
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        exitFileSubMenuItem = new JMenuItem("Exit");
        aboutHelpSubMenuItem = new JMenuItem("About");
        rulesHelpSubMenuItem = new JMenuItem("Rules");
        restartFileSubMenuItem = new JMenuItem("Restart");

        fileMenu.add(restartFileSubMenuItem);
        fileMenu.add(exitFileSubMenuItem);
        helpMenu.add(rulesHelpSubMenuItem);
        helpMenu.add(aboutHelpSubMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        restartFileSubMenuItem.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Layout.resetButtonsState();
                StatusBar.resetTimer();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        exitFileSubMenuItem.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        aboutHelpSubMenuItem.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "about menu", "About", JOptionPane.INFORMATION_MESSAGE, null);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });
        rulesHelpSubMenuItem.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent arg0) {
                String message = "X always goes first.Players alternate placing Xs and Os on the board until either:\n(a) one player has three in a row, horizontally, vertically or diagonally;\n(b) all nine squares are filled.\nIf a player is able to draw three Xs or three Os in a row, that player wins.\nIf all nine squares are filled and neither player has three in a row, the game is a draw.";
                JOptionPane.showMessageDialog(null, message, "Rules", JOptionPane.INFORMATION_MESSAGE, null);

            }

            @Override
            public void mouseExited(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseClicked(MouseEvent arg0) {
                // TODO Auto-generated method stub

            }
        });

        return menuBar;
    }
}
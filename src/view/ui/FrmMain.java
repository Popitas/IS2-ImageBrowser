package view.ui;

import control.LoadImageCommand;
import control.PrevImageCommand;
import control.NextImageCommand;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FrmMain extends JFrame {

    private PanelImage imagePanel;

    public FrmMain() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setTitle("Image Viewer");
        setLayout(new BorderLayout());
        createComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createComponents() {
        getContentPane().add(createImagePanel(), CENTER);
        getContentPane().add(createMenuPanel(), NORTH);
        getContentPane().add(createImageBrowsingMenu(), SOUTH);
    }

    private PanelImage createImagePanel() {
        imagePanel = new PanelImage();
        return imagePanel;
    }

    private PanelOpenMenu createMenuPanel() {
        PanelOpenMenu openMenu = new PanelOpenMenu(createLoadImageCommand());
        return openMenu;
    }

    private PanelBrowsing createImageBrowsingMenu() {
        PanelBrowsing browsingPanel = new PanelBrowsing(createButtonsCommands());
        return browsingPanel;
    }

    private ActionListener[] createButtonsCommands() {
        return new ActionListener[]{
            new PrevImageCommand(imagePanel),
            new NextImageCommand(imagePanel)
        };
    }

    private ActionListener[] createLoadImageCommand() {
        return new ActionListener[]{
            new LoadImageCommand(imagePanel)
        };
    }
}

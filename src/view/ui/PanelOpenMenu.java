package view.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelOpenMenu extends JPanel {

    private final ActionListener[] commands;

    public PanelOpenMenu(ActionListener[] commands) {
        this.commands = commands;

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        createComponents();
    }

    private void createComponents() {
        add(createOpenItem());
    }

    private JButton createOpenItem() {
        JButton butOpen = new JButton();

        butOpen.setText("Open...");
        butOpen.setForeground(new java.awt.Color(255, 255, 255));
        butOpen.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        butOpen.setBorderPainted(false);

        butOpen.addActionListener(commands[0]);

        return butOpen;
    }

}

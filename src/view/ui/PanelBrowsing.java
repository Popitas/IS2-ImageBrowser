package view.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBrowsing extends JPanel {

    private int index = 0;
    private final ActionListener[] commands;

    public PanelBrowsing(ActionListener[] commands) {
        this.commands = commands;

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.GridBagLayout());

        createComponents();
    }

    private void createComponents() {
        add(createButton("<"));
        add(createButton(">"));
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);

        button.setFont(new java.awt.Font("Arial", 1, 18));
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 10));
        button.setBorderPainted(false);

        button.addActionListener(commands[index++]);

        return button;
    }
}

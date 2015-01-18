package view.ui;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

public class DiagDirectoryChooser extends JDialog {

    private JFileChooser directoryChooser;
    private File directory;
    
    public DiagDirectoryChooser() {
        createComponents();        
        setModal(true);
        setSize(600, 400);
        setResizable(false);        
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createComponents() {
        add(createDirectoryChooser());
        pack();
    }

    private JFileChooser createDirectoryChooser() {
        directoryChooser = new JFileChooser();
        directoryChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        directoryChooser.addActionListener((ActionEvent e) -> {
            directory = directoryChooser.getSelectedFile();
            DiagDirectoryChooser.this.dispose();
        });
        return directoryChooser;
        
    }

    public File getDirectory() {
        return directory;
    }

}

package control;

import java.awt.event.ActionEvent;
import java.io.File;
import view.ui.DiagDirectoryChooser;
import view.ui.PanelImage;

public class LoadImageCommand implements Command {

    private final PanelImage imagePanel;

    public LoadImageCommand(PanelImage imagePanel) {
        this.imagePanel = imagePanel;
    }

    @Override
    public void execute() {
        imagePanel.load(getDirectory());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        execute();
    }

    private File getDirectory() {
        return new DiagDirectoryChooser().getDirectory();
    }

}

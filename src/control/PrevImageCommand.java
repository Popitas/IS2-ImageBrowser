package control;

import java.awt.event.ActionEvent;
import view.ui.PanelImage;

public class PrevImageCommand implements Command {

    private final PanelImage imagePanel;

    public PrevImageCommand(PanelImage imagePanel) {
        this.imagePanel = imagePanel;
    }

    @Override
    public void execute() {
        imagePanel.setImage(imagePanel.getImage().getPrev());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        execute();
    }
}

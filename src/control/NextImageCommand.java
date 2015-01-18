package control;

import java.awt.event.ActionEvent;
import view.ui.PanelImage;

public class NextImageCommand implements Command {

    private final PanelImage imagePanel;

    public NextImageCommand(PanelImage imagePanel) {
        this.imagePanel = imagePanel;
    }

    @Override
    public void execute() {
        imagePanel.setImage(imagePanel.getImage().getNext());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        execute();
    }
}

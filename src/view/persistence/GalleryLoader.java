package view.persistence;

import model.Image;
import java.io.File;

public class GalleryLoader {

    private final File[] listFiles;
    private Image first;

    public GalleryLoader(File[] listFiles) {
        this.listFiles = listFiles;
    }

    public Image load() {
        createGallery();
        return first;
    }

    private void createGallery() {
        if (listFiles == null) {
            return;
        }
        if (listFiles.length == 0) {
            return;
        }
        Image prev, current;
        first = prev = current = new Image(listFiles[0].getAbsolutePath());

        for (int i = 1; i < listFiles.length; i++) {
            current = new Image(listFiles[i].getAbsolutePath());
            current.setPrev(prev);
            prev.setNext(current);
            prev = current;
        }
        current.setNext(first);
        first.setPrev(current);
    }
}

package view.persistence;

import java.io.File;
import java.io.FilenameFilter;

public class ImageFilter implements FilenameFilter {

    String[] acceptedExtensions = {".jpg", ".jpeg", ".png", ".bmp", ".gif"};

    @Override
    public boolean accept(File dir, String name) {
        for (String acceptedExtension : acceptedExtensions) {
            if (name.toLowerCase().endsWith(acceptedExtension)) {
                return true;
            }
        }
        return false;
    }

}

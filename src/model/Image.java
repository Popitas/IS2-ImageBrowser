package model;

public class Image {

    private final String path;
    private Image prev;
    private Image next;

    public Image(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public Image getPrev() {
        return prev;
    }

    public Image getNext() {
        return next;
    }

    public void setPrev(Image prev) {
        this.prev = prev;
    }

    public void setNext(Image next) {
        this.next = next;
    }

}

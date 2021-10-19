package filesystem;

public interface Composant {
    String getName();
    Owner getOwner();
    void setOwner(Owner owner, boolean recursive);
    Integer getSize();
    String getContent();
    void appendContent(String name);
    boolean isComposite();
}

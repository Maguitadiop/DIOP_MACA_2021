package filesystem;

public class Fichier extends ComposantImpl implements Composant{

    public Fichier(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Owner getOwner() {
        return null;
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) {

    }

    @Override
    public Integer getSize() {
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void appendContent(String name) {

    }

    @Override
    public boolean isComposite() {
        return false;
    }
    @Override
    public String toString(){
        return "";
    }
}

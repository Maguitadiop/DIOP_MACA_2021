package filesystem;

import java.util.List;

public class Repertoire extends ComposantImpl implements Composant, Composite<Composant>{
    private List<Composant> children =new Composant<Composant>;
    public Repertoire(String name, Owner owner) {
        super(name, owner);
    }
    public Integer getSize(){

    }
    public String getContent(){

    }
    public void appendContent(String name){
        throw new UnsupportedOperationException("cannot app")
    }
    public boolean isComposite(){

    }

    @Override
    public List<Composant> getChildren() {
        return this.children;
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        r
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return false;
    }
}

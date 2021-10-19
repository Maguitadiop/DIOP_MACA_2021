package filesystem;

public abstract class ComposantImpl implements Composant{
    private final String name;

    private Owner owner;

    public ComposantImpl(String name,Owner owner) {
        this.name = name;
        this.owner = owner;
    }
    public String getName(){
        return this.name;
    }
    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner, boolean recursive){
        this.owner = owner;
        if(recursive){
            for(Composant c:getChildren()){
                c.setOwner(owner);
            }
        }
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

    public boolean equals(Object o){
        return false;
    }
    public int hashCode(){
        return 0;
    }

}

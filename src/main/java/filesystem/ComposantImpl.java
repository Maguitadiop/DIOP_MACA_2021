package filesystem;

public class ComposantImpl {
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
    
}

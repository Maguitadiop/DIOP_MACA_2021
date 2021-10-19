package filesystem;

public class Owner {
    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    public boolean equals(Object o){
        return true;
    }

    public int hashCode(){
        return 0;
    }
}

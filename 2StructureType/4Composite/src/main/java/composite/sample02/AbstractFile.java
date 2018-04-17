package composite.sample02;

// Component
public abstract class AbstractFile {

    protected String name;

    public AbstractFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract void display();

}

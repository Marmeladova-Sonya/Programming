package abstract_;

public abstract class Character {
    protected String name;

    public Character() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getName();
    }
}

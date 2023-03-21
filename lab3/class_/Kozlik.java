package class_;

import abstract_.Character;
import interface_.Action;

public class Kozlik extends Character implements Action {
    public Kozlik() {
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public String watched() {
        return "наблюдали";
    }

    @Override
    public String fill() {
        return null;
    }

    @Override
    public String checked() {
        return null;
    }

    @Override
    public String pull() {
        return null;
    }
}

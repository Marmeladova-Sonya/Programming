package class_;

import abstract_.Character;
import interface_.Action;

public class Conductor extends Character implements Action {
    public Conductor() {
    }

    @Override
    public String checked() {
        return "проверил";
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public String watched() {
        return null;
    }

    @Override
    public String fill() {
        return null;
    }

    @Override
    public String pull() {
        return null;
    }
}

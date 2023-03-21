package class_;

import abstract_.Character;
import interface_.Action;

public class Van extends Character implements Action {
    public Van() {
    }

    @Override
    public String checked() {
        return null;
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
        return "наполнялся";
    }

    @Override
    public String pull() {
        return null;
    }
}

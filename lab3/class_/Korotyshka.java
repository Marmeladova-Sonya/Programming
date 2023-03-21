package class_;

import abstract_.Character;
import interface_.Action;
import interface_.movable;

public class Korotyshka extends Character implements Action, movable {
    public Korotyshka() {
    }

    @Override
    public String checked() {
        return null;
    }

    @Override
    public String read() {
        return "читал";
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
        return "вытащил";
    }

    @Override
    public String zashli() {
        return null;
    }

    @Override
    public String zashel() {
        return "зашёл";
    }
}

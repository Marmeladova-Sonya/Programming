package class_;

import abstract_.Character;
import interface_.movable;

public class Neznayka extends Character implements movable {
    public Neznayka() {
    }

    @Override
    public String zashli() {
        return "зашли";
    }

    @Override
    public String zashel() {
        return null;
    }
}
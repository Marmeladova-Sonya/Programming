package class_;

import abstract_.Character;
import interface_.Action;

import java.awt.*;

public class Heads extends Character implements Action {
    public Heads() {
    }

    @Override
    public String was() {
        return "были";
    }

    @Override
    public String turn() {
        return "повёрнуты к стене";
    }
}

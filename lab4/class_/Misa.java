package class_;

import abstract_.Character;
import interface_.For_misa;

public class Misa extends Character implements For_misa {
    public Misa() {
    }

    public String horror() {
        try {
            if (Math.random() <= 0.5)
                return "в ужасе";
            else
                throw new NullPointerException();
        } catch (NullPointerException e) {
            return "испытав страх";
        }
    }

    @Override
    public String combed() {
        return "расчёсывались";
    }

    @Override
    public String stomped() {
        return "топнула ногой";
    }

    @Override
    public String walking() {
        return "шла";
    }

    @Override
    public String frozen() {
        return "застыла";
    }

    @Override
    public String get() {
        return "попала в комнату";
    }

    @Override
    public String fear() {
        return "испугалась";
    }

    @Override
    public String afraid() {
        return "боялась шевельнуться";
    }

    @Override
    public String see() {
        return "смотрела на";
    }
}
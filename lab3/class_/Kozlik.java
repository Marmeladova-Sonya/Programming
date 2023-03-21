package class_;

import abstract_.Character;
import interface_.Nablyudali;
import interface_.Zashli;

public class Kozlik extends Character implements Zashli, Nablyudali {
    public Kozlik() {
    }

    public String zashli() {
        return "зашли";
    }

    public String nablyudali() {
        return "наблюдали";
    }
}

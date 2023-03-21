package class_;

import abstract_.Character;
import interface_.Napolnyalsya;

public class Vagon extends Character implements Napolnyalsya {
    public Vagon() {
    }

    public String napolnyalsya() {
        return "наполнялся";
    }
}

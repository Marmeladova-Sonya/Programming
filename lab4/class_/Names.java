package class_;

import abstract_.Character;

public class Names extends Character {
    Names_ name;
    public Names() {
    }

    public String description(int i) {
        if (i == 1) {
            this.name = Names_.MISA;
            return "Миса";
        } else if (i == 2) {
            this.name = Names_.MYUMLA;
            return "Мюмла";
        } else {
            this.name = Names_.SNORK;
            return "Снорк";
        }
    }
}

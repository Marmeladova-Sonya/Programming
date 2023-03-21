package class_;

import abstract_.Character;

public class Newspaper extends Character {
    Characteristics charac;
    public Newspaper() {
    }

    public String description(int i) {
        if (i == 1) {
            this.charac = Characteristics.SMEKALKA;
            return "Деловая смекалка";
        } else if (i == 2) {
            this.charac = Characteristics.YUMORESKI;
            return "Давилонские юморески";
        } else if (i == 3) {
            this.charac = Characteristics.DLYA_TOLSTENKIH;
            return "Газета для толстеньких";
        } else if (i == 4) {
            this.charac = Characteristics.DLYA_TONENKIH;
            return "Газета для тоненьких";
        } else if (i == 5) {
            this.charac = Characteristics.DLYA_GLUPIH;
            return "Газета для дураков";
        } else {
            this.charac = Characteristics.DLYA_UMNIH;
            return "Газета для умных";
        }
    }
}

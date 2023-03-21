package class_;

import abstract_.Character;
import interface_.Zashel;
import interface_.Vitashil;
import interface_.Chital;

public class Korotyshka extends Character implements Zashel, Vitashil, Chital {
    public Korotyshka() {
    }

    public String zashel() {
        return "зашёл";
    }

    public String vitashil() {
        return "вытащил";
    }

    public String chital() {
        return "читал";
    }
}

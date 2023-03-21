package class_;

import abstract_.Character;
import interface_.Proveril;

public class Provodnik extends Character implements Proveril {
    public Provodnik() {
    }

    public String proveril() {
        return "проверил";
    }
}

package class_;

import abstract_.Character;

public class Neck extends Character {
    Characteristics characteristic;
    public Neck() {
    }

    public String description(int i) {
        if (i == 1) {
            this.characteristic = Characteristics.TERRIBLE;
            return "ужасных";
        } else if (i == 2) {
            this.characteristic = Characteristics.LONG;
            return "длинных";
        } else {
            this.characteristic = Characteristics.THIN;
            return "худых";
        }
    }
}

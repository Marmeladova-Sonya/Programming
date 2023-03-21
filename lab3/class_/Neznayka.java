package class_;

import abstract_.Character;
import interface_.Zashli;
import interface_.Nablyudali;
import interface_.smth;

public class Neznayka extends Character implements smth {
//    public Neznayka() {
//    }

//    public String zashli() {
//        return "зашли";
//    }

//    public String nablyudali() {
//        return "наблюдали";
//    }
//    public static void neznayka(String[] args){
//        Neznayka neznayka = new Neznayka();
//        neznayka.nablyudali();
//        neznayka.zashli();
//    }

    @Override
    public String nablyudali() {
        return "наблюдали";
    }

    @Override
    public String zashli() {
        return "зашли";
    }
}

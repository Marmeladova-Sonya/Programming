import Exceptions.IsNotEndException;
import class_.*;
import interface_.SnorkShake;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Misa misa = new Misa();
        misa.setName("Миса");
        Names names = new Names();
        Heads heads = new Heads();
        heads.setName("головы");
        Neck neck = new Neck();
        neck.setName("шеях");
        Hair hair = new Hair();
        Snork snork = new Snork();
        snork.setName("Снорк");
        Snork.Out out_ = new Snork.Out();
        Snork.Take take_ = snork.toTake();
        SnorkShake shake_ = new SnorkShake() {
            @Override
            public String shake() {
                return "покачала головой";
            }
        };
        story(misa, names, heads, neck, hair, snork, out_, take_, shake_);
    }

    private static void story(Misa misa, Names names, Heads heads, Neck neck, Hair hair, Snork snork, Snork.Out out_, Snork.Take take_, SnorkShake shake_) {
        System.out.println(names.description(1) + ", " + names.description(2) + " и " + names.description(3) + " " + misa.combed());
        System.out.println(misa + " " + misa.stomped());
        System.out.println(misa + " " + misa.walking() + " и " + misa.frozen() + " " + misa.horror());
        System.out.println(misa + " " + misa.get());
        System.out.println(heads + " " + heads.was() + " на " + neck.description(1) + ", " + neck.description(2) + ", " + neck.description(3) + " " + neck);
        System.out.println(heads + " " + heads.turn());
        System.out.println(misa + " " + misa.fear() + ", " + misa.afraid() + " и " + misa.see() + " " + hair.description(1) + ", " + hair.description(2) + " и " + hair.description(3));
        System.out.println(snork + " " + snork.suffered());
        System.out.println(snork + " " + shake_.shake());
        System.out.println(snork + " " + take_.take() + " и " + out_.out()); // snork.take() +
        snork.setEnd(true);
        try {
            if (endStory(snork)) {
                System.out.println("The end");
            }
        } catch (IsNotEndException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean endStory(Snork snork) throws IsNotEndException {
        if (snork.isEnd()) {
            return true;
        } else {
            throw new IsNotEndException();
        }
    }
}

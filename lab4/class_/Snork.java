package class_;

import abstract_.Character;
import interface_.For_snork;

public class Snork extends Character implements For_snork {
    private boolean isEnd;

    public Snork() {
        isEnd = false;
    }

    @Override
    public String suffered() {
        return "мучалась в гостиной";
    }

    public interface Take {
        String take();
    }

    public Take toTake() {
        class SnorkTake implements Take {
            final String take_ = "взяла фонарик";
            @Override
            public String take() {
                return this.take_;
            }
        }
        return new SnorkTake();
    }

    public static class Out {
        public String out() {
            return "вышла в коридор";
        }
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}

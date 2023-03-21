package class_;

public class Hair {
    Hair_ hair;
    public Hair() {
    }

    public String description(int i) {
        if (i == 1) {
            this.hair = Hair_.CURLS;
            return "золотистые кудри";
        } else if (i == 2) {
            this.hair = Hair_.RINGLET;
            return "чёрные локоны";
        } else {
            this.hair = Hair_.CURLICUES;
            return "рыжие завитушки";
        }
    }
}

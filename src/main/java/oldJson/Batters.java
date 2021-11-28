package oldJson;

import java.util.List;

public class Batters {
    private List<Addition> batter;

    public List<Addition> getBatter() {
        return batter;
    }

    public void setBatter(List<Addition> batter) {
        this.batter = batter;
    }

    @Override
    public String toString() {
        return "oldJson.Batters{" +
                "batter=" + batter +
                '}';
    }
}

import java.util.List;

public class Colors {
    private List<Col> colors;

    public List<Col> getColors() {
        return colors;
    }

    public void setColors(List<Col> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "col=" + colors +
                '}';
    }
}

package SummarySession._2023_02_10;

public class Box {
    private Double with;
    private Double height;
    private Double depth;

public Box(double with, double height, double depth) {
    if (with <= 0 || height <= 0 || depth <= 0) {
        throw new IllegalArgumentException("Box dimensions must be positive");
    }
        this.with = with;
        this.height = height;
        this.depth = depth;
    }

    public Double getWith() {
    if (with <= 0) {
        throw new IllegalArgumentException("Box dimensions must be positive");
    }
        return with;
    }

    public void setWith(Double with) {
        this.with = with;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "with=" + with +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}

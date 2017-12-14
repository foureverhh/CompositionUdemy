package Udemy;

public class Dimension {
    private int weight;
    private int height;
    private int depth;

    public Dimension(int weight, int height, int depth) {
        this.weight = weight;
        this.height = height;
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}

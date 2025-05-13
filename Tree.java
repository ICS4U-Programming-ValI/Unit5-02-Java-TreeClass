

public class Tree {
    // fields
    public int feetTall;
    public int leaves;
    public String type;

    // constructor
    public Tree(String type, int feetTall, int leaves) {
        this.type = type;
        this.feetTall = feetTall;
        this.leaves = leaves;
    }

    // methods
    // Grow Methods (method overloading)
    public void grow() {
        this.feetTall += 3;
        this.leaves += 300;
    }
    public void grow(int feet) {
        this.feetTall += feet;
    }

    public void grow(int feet, int leaves) {
        this.feetTall += feet;
        this.leaves += leaves;
    }

    // Lose Methods (method overloading)
    public void loseLeaves() {
        this.leaves = 0;
    }
    public void loseLeaves(int leaves) {
        this.leaves -= leaves;
    }

}

/**
 * This is the Main for TreeClass.java
 *
 * The TreeClass program
 * The program uses Object Oriented Programming.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @author Val Ijaola
 * @version 1.0
 * @since 2025-05-07
 */

public class Main {
    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Create a new tree object
        Tree oakTree = new Tree("Oak", 10, 100);
        Tree pineTree = new Tree("Pine", 20, 200);
        // Print the initial state of both trees
        System.out.println();
        System.out.println("Initial states:");
        System.out.println();
        System.out.println("Type: " + oakTree.type + " tree");
        System.out.println("Height: " + oakTree.feetTall + " feet");
        System.out.println("Leaves: " + oakTree.leaves);


        System.out.println();
        System.out.println("Type: " + pineTree.type + " tree");
        System.out.println("Height: " + pineTree.feetTall + " feet");
        System.out.println("Leaves: " + pineTree.leaves);

        // Grow the trees

        oakTree.grow();
        pineTree.grow(5, 50);


        // Print the state of the tree after growing
        System.out.println();
        System.out.println("After growing:");
        System.out.println("Oak Tree:");
        System.out.println("Height: " + oakTree.feetTall + " feet");
        System.out.println("Leaves: " + oakTree.leaves);
        System.out.println();
        System.out.println("Pine Tree:");
        System.out.println("Height: " + pineTree.feetTall + " feet");
        System.out.println("Leaves: " + pineTree.leaves);

        // Lose leaves from the trees
        oakTree.loseLeaves();
        pineTree.loseLeaves(100);

        // Print the state of the tree after losing leaves
        System.out.println();
        System.out.println("After losing leaves:");
        System.out.println("Oak Tree:");
        System.out.println("Height: " + oakTree.feetTall + " feet");
        System.out.println("Leaves: " + oakTree.leaves);
        System.out.println();
        System.out.println("Pine Tree:");
        System.out.println("Height: " + pineTree.feetTall + " feet");
        System.out.println("Leaves: " + pineTree.leaves);
    }
}

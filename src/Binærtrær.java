public class Binærtrær {

    // Method to find the parent of a node
    public static int parent(int id) {
        return id / 2;  // Parent of node at id is at id/2
    }

    // Method to find the sibling of a node
    public static int sibling(int id) {
        if (id % 2 == 0) {
            return id + 1;  // If id is even, sibling is id + 1
        } else {
            return id - 1;  // If id is odd, sibling is id - 1
        }
    }



    // Main method to demonstrate parent and sibling relationships
    public static void main(String[] args) {
        int[] nodes = {5, 10, 11, 20, 21, 22, 23};  // Example node ids

        for (int id : nodes) {
            System.out.println("Node ID: " + id);
            System.out.println("Parent: " + parent(id));
            System.out.println("Sibling: " + sibling(id));
            System.out.println();
        }
    }
}

class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    void Inorder()    {     printInorder(root);   }
}

public class MergeTree {

    Node traverse(Node first, Node second) {
        if(first == null && second == null) {
            return null;
        }
        Node outputNode = new Node( (first != null ? first.key : 0) + (second != null ? second.key : 0));
        outputNode.left = traverse(first != null ? first.left : null, second != null ? second.left : null);
        outputNode.right = traverse(first != null ? first.right : null, second != null ? second.right : null);
        return outputNode;
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);

        BinaryTree output = new BinaryTree();
        MergeTree MT = new MergeTree();
        output.root = MT.traverse(tree1.root,tree2.root);
        tree1.Inorder();
        System.out.println("\n");
        tree2.Inorder();
        System.out.println("\n");

        output.Inorder();
    }
}

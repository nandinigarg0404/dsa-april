
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;

    }
}

class tree {

    Node root;

    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;

    }

    public static void print(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);

    }

    public static void main(String[] args) {

        bst tree = new bst();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 69);
        tree.root = tree.insert(tree.root, 10);
        print(tree.root);
    }
}

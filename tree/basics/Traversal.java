package tree.basics;

public class Traversal {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static class BinaryTree {
        static int index = -1;

        // recursive function to build tree
        public static Node buildTree(int nodes[]) { // it will return root node
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // O(n) tc, O(h) sc where h is height of tree
        // preorder traversal - root, left, right
        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // inorder traversal - left, root, right
        public static void inOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // postorder traversal - right, root, left
        public static void postOrder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            postOrder(root.right);
            System.out.print(root.data + " ");
            postOrder(root.left);
        }

        // level order traversal - level by level traversal
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data); // 1
        BinaryTree.preOrder(root);
        BinaryTree.inOrder(root);
        BinaryTree.postOrder(root);
    }
}

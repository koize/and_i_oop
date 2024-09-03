public class Main4 {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.append(35);
        bst.append(67);
        bst.append(12);
        bst.append(25);
        bst.append(19);
        bst.append(29);
        bst.append(41);
        bst.append(7);
        bst.append(14);
        bst.append(32);
        bst.append(21);
        System.out.println("pre");
        bst.preOrderTraversal();
        System.out.println("post");
        bst.postOrderTraversal();
    }
}

class BST {
    NodeBST root = null;

    void append(int x){
        NodeBST newNode = new NodeBST (x);
        if (root == null) {
            root = newNode;
        } else {
                if (newNode.data < root.data){
                    root.left = newNode;
                }
                else if (newNode.data > root.data){
                    root.right = newNode;
                }
            }

        }

        void preOrderTraversal() {
            if (root != null){
                System.out.println(root.data);
                if (root.left != null){
                    System.out.println(root.left.data);
                }
                if (root.right != null){
                    System.out.println(root.right.data);
                }

            }
        }

    void postOrderTraversal() {
        if (root != null){
            if (root.left != null){
                System.out.println(root.left.data);
            }
            if (root.right != null){
                System.out.println(root.right.data);
            }
            System.out.println(root.data);

        }
    }

}

class NodeBST {
    int data;
    long b = (int)(4*2.2);
    NodeBST left = null;
    NodeBST right = null;
    NodeBST( int data) {
        this.data = data;
    }
}



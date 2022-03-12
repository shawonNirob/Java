package dataStructure.tree;

public class MainFunc {
    public static void main(String[] args) {
        Tree root;
        FuncTree tree = new FuncTree();
        root = tree.createTree();

        PrintTree call = new PrintTree();
        call.preOrder(root);
        System.out.println();
        call.postOrder(root);
        System.out.println();
        call.inOrder(root);
    }

}
